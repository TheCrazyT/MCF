package com.crazyt.mcf;

import java.io.File;
import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.aspectj.lang.reflect.MethodSignature;


public class LuaBuilder implements MetaScriptBuilder{

	private String commandName = null;
	private PrintStream outputStream;
	private Set<Method> methodRecorder = new HashSet<Method>();
	private Set<NMO> hookRecorder = new HashSet<NMO>();
	private MetaVar condVar1 = null;
	private MetaVar condVar2 = null;

	private static Class<?> getImplementationIfExist(Class<?> clazz){
		if(clazz.isAnnotationPresent(Implementation.class)){
			return clazz.getAnnotation(Implementation.class).value();
		}
		return clazz;
	}
	
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
				if(!clazz.isAnnotationPresent(SourceInfo.class)){
					throw new RuntimeException("Annotation SourceInfo not found!");
				}
				if(clazz.isAnnotationPresent(SimpleName.class)){
					fileName = clazz.getAnnotation(SimpleName.class).value() + ".lua";
				}
				if(clazz.isAnnotationPresent(SourceInfo.class)){
					fileName = clazz.getAnnotation(SourceInfo.class)
							.addonFolder()
							+ "\\"
							+ clazz.getAnnotation(SourceInfo.class).subFolder()
							+ "\\" + fileName;
				}
				Constructor<?> dbconstr = LuaBuilder.class.getConstructor(new Class<?>[]{PrintStream.class});
				LuaBuilder instance=null;
				PrintStream outStream = null;
				if (System.getenv().get("DEBUG") != null
						&& System.getenv().get("DEBUG").equals("1")) {
					outStream = System.out; 
				} else {
					if(clazz.isAnnotationPresent(SourceInfo.class)){
						String info = clazz.getAnnotation(SourceInfo.class).info();
						String addonFolder = clazz.getAnnotation(SourceInfo.class).addonFolder();
						if(info != null){
							File i = new File("build/"+info);
							File i2 = new File("build/out/lua/" + addonFolder
									+ "/" + info);
							i2.getParentFile().mkdirs();
							i.renameTo(i2);
						}
					}
					File out = new File("build/out/lua/"+fileName);
					out.getParentFile().mkdirs();
					out.createNewFile();
					outStream = new PrintStream(out);
				}
				instance = (LuaBuilder) dbconstr
						.newInstance(new Object[]{ outStream});
				
				MethodInvocationAspect.metaCommand = instance;

				Constructor<?> constr = clazz.getConstructor((Class<?>[])null);
				
				Builder builder = (Builder)constr.newInstance((Object[])null);

				Boolean nonefound = true;
				for(Field f:clazz.getDeclaredFields()){
					if(f.isAnnotationPresent(BuildClass.class)){
						f.set(builder, instance);
						nonefound = false;
					}
				}
				if(nonefound){
					throw new RuntimeException("Unable to build, no @BuildClass annotation found!");
				}
				
				instance.init(builder);
				builder.build();
				
				for(Method m:instance.getMethodRecorder()){
					outStream.print("function "+m.getName()+"(");
					List<Object> mArgs = new ArrayList<Object>();
					int i=0;
					int last = m.getParameterTypes().length-1;
					for(Class<?> t:m.getParameterTypes()){
						t = getImplementationIfExist(t);
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
					outStream.println(")");
					Object[] mArgs2 = new Object[mArgs.size()];
					i=0;
					for(Object o:mArgs){
						mArgs2[i++]=o;
					}
					instance.increaseTab();
					MethodInvocationAspect.executeMode = true;
					m.invoke(builder, mArgs2);
					instance.decreaseTab();
					outStream.println("end");
				}
				
				for (NMO nmo : instance.getHookRecorder()) {
					outStream.print("function " + nmo.getName() + "(");
					Method m = nmo.getMethod();
					List<Object> mArgs = new ArrayList<Object>();
					int i = 0;
					int last = m.getParameterTypes().length - 1;
					for (Class<?> t : m.getParameterTypes()) {
						String name = "arg" + i;
						for(Annotation a:m.getParameterAnnotations()[i]){
							if(a.annotationType().equals(SimpleName.class)){
								name = ((SimpleName)a).value();
								break;
							}
						}
						if(name == null){
							throw new RuntimeException("name should not be null!");
						}
						t = getImplementationIfExist(t);
						if (MetaVarImpl.class.isAssignableFrom(t)) {
							try {
								Constructor<?> cons = t
										.getConstructor(String.class);
								mArgs.add(cons.newInstance(name));
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
						} else {
							throw new RuntimeException("invalid argument type!("+t.getCanonicalName()+")");
						}
						outStream.print(name + (i == last ? "" : ","));
						i++;
					}
					outStream.println(")");
					Object[] mArgs2 = new Object[mArgs.size()];
					i = 0;
					for (Object o : mArgs) {
						mArgs2[i++] = o;
					}
					instance.increaseTab();
					MethodInvocationAspect.executeMode = true;
					m.invoke(nmo.getObject(), mArgs2);
					instance.decreaseTab();
					outStream.println("end");
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
	public MetaCommand forPair(MetaVar v1,MetaVar v2,MetaVarTable table){
		finalizeConditionStatements();

		println("for " + v1._getName() + "," + v2._getName() + " in pairs("
				+ table._getName() + ") do");
		increaseTab();
		return this;
	}
	public MetaCommand forCmd(MetaVarInt v, MetaVarInt from, MetaVarInt to) {
		finalizeConditionStatements();
		
		println("for " + v._getName() + "=" + from._getName() + ","
				+ to._getName() + ",1 do");
		increaseTab();
		return this;
	}

	public MetaCommand forCmd(MetaVarInt v, Integer from, Integer to) {
		finalizeConditionStatements();
		
		println("for " + v._getName() + "=" + from + "," + to + ",1 do");
		increaseTab();
		return this;
	}

	public MetaCommand end() {
		finalizeConditionStatements();
		
		decreaseTab();
		println("end");
		return this;
	}


	public MetaCommand add(MetaVarInt v1, MetaVarInt v2) {
		finalizeConditionStatements();

		println(v1._getName()+"="+v1._getName()+"+"+v2._getName());
		return this;
	}

	public MetaCommand sub(MetaVarInt v1, MetaVarInt v2) {
		finalizeConditionStatements();

		println(v1._getName()+"="+v1._getName()+"-"+v2._getName());
		return this;
	}

	public MetaCommand set(MetaVarString v, String s) {
		finalizeConditionStatements();

		println(v._getName()+" = \""+s+"\"");
		return this;
	}

	public MetaCommand set(MetaVarInt v, int i) {
		finalizeConditionStatements();

		println(v._getName()+" = "+i);
		return this;
	}

	public void init(Object instance) {
		return;
	}

	public MetaCommand print(MetaVar v) {
		finalizeConditionStatements();

		println("print("+v._getName()+")");
		return this;
	}
	
	public MetaCommand print(String v) {
		finalizeConditionStatements();

		println("print(\""+v+"\")");
		return this;
	}
	
	public String _getName() {
		return commandName;
	}

	public void _setName(String name) {
		commandName = name;
	}
	
	private String getVarName(Object o){
		if(o instanceof String){
			return (String)o;
		}
		if(o instanceof MetaVar){
			return ((MetaVar)o)._getName();
		}
		return "";
	}
	
	@Override
	public void _addHook(String hook,Method method, Object object) {
		hookRecorder.add(new NMO(hook,method,object));
	}
	
	@Override
	public void _addFunctionCall(MethodSignature sig,String functionName, Object[] args) {
		finalizeConditionStatements();

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
		_setName(name);
		
		Method m = sig.getMethod();
		methodRecorder.add(m);
	}

	@Override
	public MetaCommand call(MetaVar mc) {
		finalizeConditionStatements();
		
		println(mc._getName());
		return this;
	}

	public Set<NMO> getHookRecorder() {
		return hookRecorder;
	}
	public Set<Method> getMethodRecorder() {
		return methodRecorder;
	}
	public void increaseTab(){
		GlobalBuilderInfo.tab += "\t";
	}
	public void decreaseTab(){
		if(GlobalBuilderInfo.tab.length()>0){
			GlobalBuilderInfo.tab = GlobalBuilderInfo.tab.substring(1);
		}
	}
	private void println(String str){
		outputStream.println(GlobalBuilderInfo.tab + str);
	}

	@Override
	public void _addExternalFunctionCall(MethodSignature sig,
			String functionName, Object[] args) {
		finalizeConditionStatements();

		String name = functionName + "(";
		for (Object o : args) {
			// println("\tArg:"+o.getClass().getCanonicalName()+":"+getVarName(o));
			name += getVarName(o) + ",";
		}
		if(args.length>0){
			name = name.substring(0, name.length() - 1);
		}
		name += ")";
		_setName(name);
	}

	
	@Override
	public MetaConditionResult g() {
		_setName(condVar1._getName() + ">" + condVar2._getName());
		GlobalBuilderInfo.lastConditionStatement = "if(" + _getName() + ") then";
		return (MetaConditionResult)cloneIt();
	}

	@Override
	public MetaConditionResult s() {
		_setName(condVar1._getName() + "<" + condVar2._getName());
		GlobalBuilderInfo.lastConditionStatement = "if(" + _getName() + ") then";
		return (MetaConditionResult)cloneIt();
	}

	@Override
	public MetaConditionResult e() {
		_setName(condVar1._getName() + "==" + condVar2._getName());
		GlobalBuilderInfo.lastConditionStatement = "if(" + _getName() + ") then";
		return (MetaConditionResult)cloneIt();
	}

	@Override
	public MetaConditionResult ge() {
		_setName(condVar1._getName() + ">=" + condVar2._getName());
		GlobalBuilderInfo.lastConditionStatement = "if(" + _getName() + ") then";
		return (MetaConditionResult)cloneIt();
	}

	@Override
	public MetaConditionResult se() {
		_setName(condVar1._getName() + "<" + condVar2._getName());
		GlobalBuilderInfo.lastConditionStatement = "if(" + _getName() + ") then";
		return (MetaConditionResult)cloneIt();
	}

	@Override
	public MetaCondition cond(MetaVarInt v1, MetaVarInt v2) {
		condVar1 = v1;
		condVar2 = v2;
		return (MetaCondition)cloneIt();
	}
	
	@Override
	public MetaCondition cond(MetaVarString v1, MetaVarString v2) {
		condVar1 = v1;
		condVar2 = v2;
		return (MetaCondition)cloneIt();
	}

	@Override
	public MetaCondition cond(MetaVarString v1, String v2) {
		condVar1 = v1;
		condVar2 = new MetaVarImpl("\""+v2+"\"");
		return (MetaCondition)cloneIt();
	}

	@Override
	public MetaConditionLogic cond(MetaVarBoolean v1, MetaVarBoolean v2) {
		condVar1 = v1;
		condVar2 = v2;
		return (MetaConditionLogic)cloneIt();
	}

	@Override
	public MetaCommand and() {
		GlobalBuilderInfo.lastConditionStatement = null;
		println("if((" + condVar1._getName() + ") && ("
				+ condVar2._getName() + ")) then");
		increaseTab();
		return (MetaCommand)cloneIt();
	}

	@Override
	public MetaCommand or() {
		GlobalBuilderInfo.lastConditionStatement = null;
		println("if((" + condVar1._getName() + ") || ("
				+ condVar2._getName() + ")) then");
		increaseTab();
		return (MetaCommand)cloneIt();
	}

	@Override
	public void finalizeConditionStatements() {
		if(GlobalBuilderInfo.lastConditionStatement!=null){
			println(GlobalBuilderInfo.lastConditionStatement);
			increaseTab();
		}
		GlobalBuilderInfo.lastConditionStatement = null;
	}

	private Object cloneIt(){
		try {
			return clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
