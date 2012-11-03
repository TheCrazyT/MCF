//package com.crazyt.mcf;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//import java.util.Stack;
//
//import org.aspectj.lang.reflect.MethodSignature;
//
//public class JavaBuilder<T> implements MetaCommandInitiator<T>,MetaCommand<T>,Cloneable {
//	
//	private Stack<String> commandName = new Stack<String>();
//	
//	public static void main(String args[]) throws Exception{
//		System.out.println("Building ...");
//		
//		for(String s:args){
//			try {
//				try {
//					Class<?> clazz = Class.forName(s);
//					Constructor<?> jbconstr = JavaBuilder.class.getConstructor((Class<?>[])null);
//					JavaBuilder<?> instance = (JavaBuilder<?>) jbconstr.newInstance((Object[])null);
//					Constructor<?> constr = clazz.getConstructor((Class<?>[])null);
//					
//					Builder builder = (Builder)constr.newInstance((Object[])null);
//
//					for(Field f:clazz.getDeclaredFields()){
//						if(f.isAnnotationPresent(BuildClass.class)){
//							f.set(builder, instance);
//						}
//					}
//					instance.init(builder);
//					builder.build();
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
//		return this;
//	}
//
//	public MetaCommand<T> forCmd(MetaVarInt v, MetaVarInt from, MetaVarInt to) {
//		return this;
//	}
//
//	public MetaCommand<T> end() {
//		return this;
//	}
//
//	public MetaCommand<T> cond(MetaVarInt v1, MetaVarInt v2, MetaCondMode mode) {
//		return this;
//	}
//
//	public MetaCommand<T> cond(MetaVarString v1, MetaVarString v2,
//			MetaCondMode mode) {
//		return this;
//	}
//
//	public MetaCommand<T> cond(MetaVarString v1, String v2, MetaCondMode mode) {
//		return this;
//	}
//
//	public MetaCommand<T> add(MetaVarInt v1, MetaVarInt v2) {
//		return this;
//	}
//
//	public MetaCommand<T> sub(MetaVarInt v1, MetaVarInt v2) {
//		return this;
//	}
//
//	public MetaCommand<T> var(MetaVarString v, String s) {
//		return this;
//	}
//
//	public MetaCommand<T> set(MetaVarString v, String s) {
//		return this;
//	}
//
//	public MetaCommand<T> set(MetaVarInt v, int i) {
//		return this;
//	}
//	public MetaCommand<T> var(MetaVarInt v, int i) {
//		return this;
//	}
////	public T cmd() {
////		return (T)mainProxy;
////	}
//	public void init(Object instance) {
//		return;
//	}
//
//	public MetaCommand<T> print(MetaVar v) {
//		return this;
//	}
//
//	public String getName() {
//		return commandName.pop();
//	}
//
//	public void setName(String name) {
//		commandName.push(name);
//	}
//
//	@Override
//	public void _addFunctionCall(MethodSignature sig,String functionName,Object[] args) {
//		System.out.println("afc:"+functionName);
//	}
//
//	@Override
//	public MetaCommand<T> call(MetaCommand<T> mc) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void _addExternalFunctionCall(MethodSignature sig,
//			String functionName, Object[] args) {
//		// TODO Auto-generated method stub
//		
//	}
//}
