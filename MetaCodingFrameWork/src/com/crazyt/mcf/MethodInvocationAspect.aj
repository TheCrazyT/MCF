package com.crazyt.mcf;

import java.lang.reflect.*;

import org.aspectj.lang.reflect.MethodSignature;

import com.crazyt.gmod.SourceInfo;


public aspect MethodInvocationAspect {
public static boolean executeMode = false;
	private MetaCommand getCommandProcessor(Object o){
		Class<?> clazz = o.getClass();
		for(Field f:clazz.getDeclaredFields()){
			if(f.isAnnotationPresent(BuildClass.class)){
				try {
					return (MetaCommand)f.get(o);
				} catch (IllegalArgumentException e) {
					return null;
				} catch (IllegalAccessException e) {
					return null;
				}
			}
		}
		return null;
	}

//	@Around("(call(* * ())) && @target(com.crazyt.mcf.CustomMetaCommand) && !within(com.crazyt.mcf..*)")
//	@Around("(call(* * ())) && !within(com.crazyt.mcf..*)")
    pointcut mcfCommands(): 
	execution(@CustomMetaCommand * * (..)) && !within(com.crazyt.mcf..*);

    
    Object around():mcfCommands() {
    	if(executeMode){
    		executeMode = false;
    		return proceed();
    	}
    	Class<?> returnType = null;
    	MetaCommand cp = null;
		Object result = null;
		try {
			cp = getCommandProcessor(thisJoinPoint.getThis());
//	    	System.out.println("command:" + thisJoinPoint.getThis().getClass().getCanonicalName()+"."+thisJoinPoint.getSignature().getName());
			MethodSignature ms = (MethodSignature)thisJoinPoint.getSignature();
			cp._addFunctionCall(ms,thisJoinPoint.getThis().getClass().getCanonicalName()+"."+thisJoinPoint.getSignature().getName(),thisJoinPoint.getArgs());
//	    	System.out.println("end command:" + thisJoinPoint.getThis().getClass().getCanonicalName()+"."+thisJoinPoint.getSignature().getName());
			returnType = ms.getReturnType();
			result = cp;
		} catch (Throwable t) {
			throw new RuntimeException(t);
		}
		try {
			if(returnType.equals(MetaVar.class)){
				returnType = MetaVarImpl.class;
			}
			Constructor<?> cons = returnType.getConstructor(String.class);
			return cons.newInstance(cp._getName());
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
    	
		return null;
	}

    pointcut externalCommands(): 
    execution( @External * * (..)) && within(@External *);
    
    pointcut libraryAccess(): 
    execution( @Library * * (..)) && within(@External *);
    
    Object around():libraryAccess() {
    	Class<?> returnType = null;
    	MetaCommand cp = null;
		try {
			cp = getCommandProcessor(thisJoinPoint.getThis());
			if(cp==null){
				throw new RuntimeException("command processor not found!");
			}
	    	MethodSignature ms = (MethodSignature)thisJoinPoint.getSignature();
	    	returnType = ms.getReturnType();
		} catch (Throwable t) {
			System.out.println("some aspect error happened");
			throw new RuntimeException(t);
		}
    	
		try {
			Constructor<?> cons = returnType.getConstructor(MetaCommand.class);
			return cons.newInstance(cp);
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
    	
		return null;
    }
    
    Object around():externalCommands() {
    	if(executeMode){
    		executeMode = false;
    		return proceed();
    	}
    	Class<?> returnType = null;
    	MetaCommand cp = null;
		try {
			cp = getCommandProcessor(thisJoinPoint.getThis());
			if(cp==null){
				throw new RuntimeException("command processor not found!");
			}
//	    	System.out.println("ext command:" + thisJoinPoint.getThis().getClass().getCanonicalName()+"."+thisJoinPoint.getSignature().getName());
	    	MethodSignature ms = (MethodSignature)thisJoinPoint.getSignature();
	    	String name = thisJoinPoint.getSignature().getName();
	    	if(thisJoinPoint.getThis().getClass().isAnnotationPresent(Library.class)){
				name = thisJoinPoint.getThis().getClass().getAnnotation(Library.class)
						.value()
						+ "." + name;
//				System.out.println("Found library call:"+name);
	    	}
	    	
			cp._addExternalFunctionCall(ms,name,thisJoinPoint.getArgs());
	    	returnType = ms.getReturnType();
		} catch (Throwable t) {
			System.out.println("some aspect error happened");
			throw new RuntimeException(t);
		}
//    	System.out.println("end ext command:" + thisJoinPoint.getThis().getClass().getCanonicalName()+"."+thisJoinPoint.getSignature().getName());
    	
		try {
			if(returnType.equals(MetaVar.class)){
				returnType = MetaVarImpl.class;
			}
			Constructor<?> cons = returnType.getConstructor(String.class);
			return cons.newInstance(cp._getName());
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
    	
		return null;
    }

//    pointcut test():
//    	within(@SourceInfo *);
//    
//    Object around():test(){
//		return null;
//    }
    
//    pointcut dbgMain(): 
//	execution(void com.crazyt.mcf.DebugBuilder.main (*));
//    void around(): dbgMain() {
//		System.out.println("test");
//		try {
//			proceed();
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
