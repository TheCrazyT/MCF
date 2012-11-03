//package com.crazyt.mcf;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//
//import org.aspectj.lang.reflect.MethodSignature;
//
//public class DebugBuilder<T> implements MetaCommandInitiator<T>,MetaCommand<T>,Cloneable{
//	private static DebugBuilder instance = null;
//	private String commandName = null;
//	
//	public static DebugBuilder getInstance(){
//		if(instance==null){
//			instance=new DebugBuilder();
//		}
//		return instance;
//	}
//	public static void main(String args[]) throws Exception{
//		System.out.println("Building ...");
//		
//		for(String s:args){
//			try {
//				try {
//					Class<?> clazz = Class.forName(s);
//					Constructor<?> dbconstr = DebugBuilder.class.getConstructor((Class<?>[])null);
//					DebugBuilder<?> instance = (DebugBuilder<?>) dbconstr.newInstance((Object[])null);
//					Constructor<?> constr = clazz.getConstructor((Class<?>[])null);
//					
//					Builder builder = (Builder)constr.newInstance((Object[])null);
//
//					for(Field f:clazz.getDeclaredFields()){
//						if(f.isAnnotationPresent(BuildClass.class)){
//							f.set(builder, instance);
//						}
//					}
//					
//					instance.init(builder);
//					builder.build();
//
//				} catch (NoSuchMethodException e) {
//					throw new Exception(e);
//				} catch (SecurityException e) {
//					throw new Exception(e);
//				}
//			} catch (ClassNotFoundException e) {
//				throw new Exception(e);
//			}
//		}
//	}
//
//	public MetaCommand<T> var(MetaVar v) {
//		System.out.println("var");
//		return this;
//	}
//
//	public MetaCommand<T> forCmd(MetaVarInt v, MetaVarInt from, MetaVarInt to) {
//		System.out.println("forCmd");
//		return this;
//	}
//
//	public MetaCommand<T> end() {
//		System.out.println("end");
//		return this;
//	}
//
//	public MetaCommand<T> cond(MetaVarInt v1, MetaVarInt v2, MetaCondMode mode) {
//		System.out.println("cond");
//		return this;
//	}
//
//	public MetaCommand<T> cond(MetaVarString v1, MetaVarString v2,
//			MetaCondMode mode) {
//		System.out.println("cond");
//		return this;
//	}
//
//	public MetaCommand<T> cond(MetaVarString v1, String v2, MetaCondMode mode) {
//		System.out.println("cond");
//		return this;
//	}
//
//	public MetaCommand<T> add(MetaVarInt v1, MetaVarInt v2) {
//		System.out.println("add");
//		return this;
//	}
//
//	public MetaCommand<T> sub(MetaVarInt v1, MetaVarInt v2) {
// 		System.out.println("sub");
//		return this;
//	}
//
//	public MetaCommand<T> var(MetaVarString v, String s) {
//		System.out.println("var");
//		return this;
//	}
//
//	public MetaCommand<T> set(MetaVarString v, String s) {
//		System.out.println("set");
//		return this;
//	}
//
//	public MetaCommand<T> set(MetaVarInt v, int i) {
//		System.out.println("set");
//		return this;
//	}
//	public MetaCommand<T> var(MetaVarInt v, int i) {
//		System.out.println("var");
//		return this;
//	}
////	public T cmd() {
////		return (T)mainProxy;
////	}
//	public void init(Object instance) {
//		return;
//	}
//
////	public Object invoke(Object proxy, Method method, Object[] args)
////			throws Throwable {
////		System.out.println("invoke custom function:"+method.getName());
////		DebugBuilder<T> myClone = (DebugBuilder<T>)this.clone();
////		myClone.setName(method.getName());
////		method.invoke(main, args);
////		return myClone;
////	}
//	public MetaCommand<T> print(MetaVar v) {
//		System.out.println("print("+v.getName()+")");
//		return this;
//	}
//	
//	public String getName() {
//		return commandName;
//	}
//
//	public void setName(String name) {
//		commandName = name;
//	}
//	
//	private String getVarName(Object o){
//		if(o instanceof String){
//			return (String)o;
//		}
//		if(o instanceof MetaVar){
//			return ((MetaVar)o).getName();
//		}
//		return "";
//	}
//	
//	@Override
//	public void _addFunctionCall(MethodSignature sig,String functionName,Object[] args) {
//		System.out.println("afc:"+functionName);
//		int lio = functionName.lastIndexOf('.');
//		setName(functionName.substring(lio+1)+"()");
//		for(Object o:args){
//			System.out.println("\tArg:"+o.getClass().getCanonicalName()+":"+getVarName(o));
//		}
//		
//	}
//	@Override
//	public MetaCommand<T> call(MetaCommand<T> mc) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public void _addExternalFunctionCall(MethodSignature sig,
//			String functionName, Object[] args) {
//		// TODO Auto-generated method stub
//		
//	}
//}
