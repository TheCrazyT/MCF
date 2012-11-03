package com.crazyt.mcf;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.crazyt.mcf.SimpleName;

import org.aspectj.lang.reflect.MethodSignature;

public class LuaBuilder implements MetaCommandInitiator,MetaCommand,Cloneable{

	private String commandName = null;
	private String tab = "";
	private PrintStream outputStream;
	private Set<Method> methodRecorder = new HashSet<Method>(); 
	
	public LuaBuilder(PrintStream out){
		outputStream = out;
	}

	public static void main(String args[]) throws Exception{
		if(args.length==0){
			return;
		}
		
		String clazzName = args[0];
		try {
			try {
				Class<?> clazz = Class.forName(clazzName);
				String fileName = clazz.getName() + ".lua";
				if(clazz.isAnnotationPresent(SimpleName.class)){
					fileName = clazz.getAnnotation(SimpleName.class).value() + ".lua";
				}
				Constructor<?> dbconstr = LuaBuilder.class.getConstructor(new Class<?>[]{PrintStream.class});
				LuaBuilder instance=null;
				PrintStream outStream = null;
				if (System.getenv().get("DEBUG") != null
						&& System.getenv().get("DEBUG").equals("1")) {
					outStream = System.out; 
				} else {
					File out = new File("build/out/lua/"+fileName);
					out.getParentFile().mkdirs();
					out.createNewFile();
					outStream = new PrintStream(out);
				}
				instance = (LuaBuilder) dbconstr
						.newInstance(new Object[]{ outStream});
				Constructor<?> constr = clazz.getConstructor((Class<?>[])null);
				
				Builder builder = (Builder)constr.newInstance((Object[])null);

				for(Field f:clazz.getDeclaredFields()){
					if(f.isAnnotationPresent(BuildClass.class)){
						f.set(builder, instance);
					}
				}
				
				instance.init(builder);
				builder.build();
				
				for(Method m:instance.getMethodRecorder()){
					outStream.print("function "+m.getName()+"(");
					List<Object> mArgs = new ArrayList<Object>();
					int i=0;
					int last = m.getParameterTypes().length-1;
					for(Class<?> t:m.getParameterTypes()){
						if(MetaVarImpl.class.isAssignableFrom(t)){
							try {
								Constructor<?> cons = t.getConstructor(String.class);
								mArgs.add(cons.newInstance("arg"+i));
							} catch (NoSuchMethodException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (SecurityException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (InstantiationException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IllegalAccessException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IllegalArgumentException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (InvocationTargetException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						outStream.print("arg"+i+(i==last?"":","));
						i++;
					}
					outStream.println(") {");
					Object[] mArgs2 = new Object[mArgs.size()];
					i=0;
					for(Object o:mArgs){
						mArgs2[i++]=o;
					}
					instance.increaseTab();
					MethodInvocationAspect.executeMode = true;
					m.invoke(builder, mArgs2);
					instance.decreaseTab();
					outStream.println("}");
				}

			} catch (NoSuchMethodException e) {
				throw new Exception(e);
			} catch (SecurityException e) {
				throw new Exception(e);
			}
		} catch (ClassNotFoundException e) {
			throw new Exception(e);
		}
	}

	public MetaCommand forCmd(MetaVarInt v, MetaVarInt from, MetaVarInt to) {
		println("for "+v.getName()+"="+from.getName()+","+to.getName()+",1 do");
		increaseTab();
		return this;
	}

	public MetaCommand end() {
		decreaseTab();
		println("end");
		return this;
	}


	public MetaCommand cond(MetaVarInt v1, MetaVarInt v2, MetaCondMode mode) {
		String c="";
		switch(mode){
			case BIGGER:
				c=">";
				break;
			case EQUALS:
				c="=";
				break;
			case LOWER:
				c="<";
				break;
			default:
				break;
		}
		println("if "+v1.getName()+c+v2.getName()+" then");
		increaseTab();
		return this;
	}

	public MetaCommand cond(MetaVarString v1, MetaVarString v2,
			MetaCondMode mode) {
		println("cond");
		return this;
	}

	public MetaCommand cond(MetaVarString v1, String v2, MetaCondMode mode) {
		println("cond");
		return this;
	}

	public MetaCommand add(MetaVarInt v1, MetaVarInt v2) {
		println(v1.getName()+"="+v1.getName()+"+"+v2.getName());
		return this;
	}

	public MetaCommand sub(MetaVarInt v1, MetaVarInt v2) {
		println(v1.getName()+"="+v1.getName()+"-"+v2.getName());
		return this;
	}

	public MetaCommand var(MetaVarString v, String s) {
		println(v.getName()+" = \""+s+"\"");
		return this;
	}

	public MetaCommand set(MetaVarString v, String s) {
		println(v.getName()+" = \""+s+"\"");
		return this;
	}

	public MetaCommand set(MetaVarInt v, int i) {
		println(v.getName()+" = "+i);
		return this;
	}
	public MetaCommand var(MetaVarInt v, int i) {
		println(v.getName()+" = "+i);
		return this;
	}

	public void init(Object instance) {
		return;
	}

	public MetaCommand print(MetaVar v) {
		println("print("+v.getName()+")");
		return this;
	}
	
	public String getName() {
		return commandName;
	}

	public void setName(String name) {
		commandName = name;
	}
	
	private String getVarName(Object o){
		if(o instanceof String){
			return (String)o;
		}
		if(o instanceof MetaVar){
			return ((MetaVar)o).getName();
		}
		return "";
	}
	
	@Override
	public void _addFunctionCall(MethodSignature sig,String functionName, Object[] args) {
		int lio = functionName.lastIndexOf('.');
		String name = "";
		name += functionName.substring(lio + 1) + "(";
		for (Object o : args) {
			// println("\tArg:"+o.getClass().getCanonicalName()+":"+getVarName(o));
			name += getVarName(o) + ",";
		}
		if(args.length>0){
			name = name.substring(0, name.length() - 1);
		}
		name += ")";
		setName(name);
		
		Method m = sig.getMethod();
		methodRecorder.add(m);
	}

	@Override
	public MetaCommand call(MetaVar mc) {
		println(mc.getName());
		return this;
	}

	public Set<Method> getMethodRecorder() {
		return methodRecorder;
	}
	public void increaseTab(){
		tab += "\t";
	}
	public void decreaseTab(){
		if(tab.length()>0){
			tab = tab.substring(1);
		}
	}
	private void println(String str){
		outputStream.println(tab + str);
	}

	@Override
	public void _addExternalFunctionCall(MethodSignature sig,
			String functionName, Object[] args) {
		int lio = functionName.lastIndexOf('.');
		String name = "";
		name += functionName.substring(lio + 1) + "(";
		for (Object o : args) {
			// println("\tArg:"+o.getClass().getCanonicalName()+":"+getVarName(o));
			name += getVarName(o) + ",";
		}
		if(args.length>0){
			name = name.substring(0, name.length() - 1);
		}
		name += ")";
		setName(name);
	}
}
