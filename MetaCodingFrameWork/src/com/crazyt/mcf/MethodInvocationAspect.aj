package com.crazyt.mcf;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

import org.aspectj.lang.reflect.MethodSignature;

import com.crazyt.mcf.SourceInfo;


public aspect MethodInvocationAspect {
	public static boolean executeMode = false;
	public static MetaScriptBuilder metaCommand = null;

    pointcut mcfCommands(): 
	execution(@CustomMetaCommand * * (..)) && !within(com.crazyt.mcf..*);

    pointcut externalCommands(): 
    execution(@External * * (..)) && within(@External *);
    
    pointcut libraryAccess(): 
    execution(@Library * * (..)) && within(@External *);

    pointcut hooks(): 
    execution(public new(String)) && within(@Hook *);

    pointcut valueSetters(): 
    execution(@ValueSetter void * (int)) ||
    execution(@ValueSetter void * (String)) ||
    execution(@ValueSetter void * (boolean));

    private static Class<?> getImplementationIfExist(Class<?> clazz){
		if(clazz.isAnnotationPresent(Implementation.class)){
			return clazz.getAnnotation(Implementation.class).value();
		}
		return clazz;
	}

	private MetaScriptBuilder getCommandProcessor(Object o){
		if(metaCommand == null){
			Class<?> clazz = o.getClass();
			for(Field f:clazz.getDeclaredFields()){
				if(f.isAnnotationPresent(BuildClass.class)){
					try {
						metaCommand =(MetaScriptBuilder)f.get(o);
					} catch (IllegalArgumentException e) {
					} catch (IllegalAccessException e) {
					}
				}
			}
			}
		return metaCommand;
	}

    Object around():mcfCommands() {
    	if(executeMode){
    		executeMode = false;
    		return proceed();
    	}
    	Class<?> returnType = null;
    	MetaScriptBuilder cp = null;
		Object result = null;
		try {
			cp = getCommandProcessor(thisJoinPoint.getThis());
//	    	System.out.println("command:" + thisJoinPoint.getThis().getClass().getCanonicalName()+"."+thisJoinPoint.getSignature().getName());
			MethodSignature ms = (MethodSignature)thisJoinPoint.getSignature();
//			cp._addFunctionCall(ms,thisJoinPoint.getThis().getClass().getCanonicalName()+"."+thisJoinPoint.getSignature().getName(),thisJoinPoint.getArgs());
//	    	System.out.println("end command:" + thisJoinPoint.getThis().getClass().getCanonicalName()+"."+thisJoinPoint.getSignature().getName());
			cp._addFunctionCall(ms,thisJoinPoint.getSignature().getName(),thisJoinPoint.getArgs());
			returnType = ms.getReturnType();
			result = cp;
		} catch (Throwable t) {
			throw new RuntimeException(t);
		}
		try {
			if(returnType.equals(MetaVar.class)){
				returnType = MetaVarImpl.class;
			}
			returnType = getImplementationIfExist(returnType);
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

    Object around():libraryAccess() {
    	executeMode = false;
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
			Constructor<?> cons = returnType.getConstructor();
			return cons.newInstance();
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
    	MetaScriptBuilder cp = null;
		try {
			cp = getCommandProcessor(thisJoinPoint.getThis());
			if(cp==null){
				throw new RuntimeException("command processor not found for class:"+thisJoinPoint.getThis().getClass().getCanonicalName()+"!");
			}
//	    	System.out.println("ext command:" + thisJoinPoint.getThis().getClass().getCanonicalName()+"."+thisJoinPoint.getSignature().getName());
	    	MethodSignature ms = (MethodSignature)thisJoinPoint.getSignature();
	    	String name = thisJoinPoint.getSignature().getName();
			if (thisJoinPoint.getThis().getClass()
					.isAnnotationPresent(Library.class)) {
				name = thisJoinPoint.getThis().getClass()
						.getAnnotation(Library.class).value()
						+ "." + name;
				// System.out.println("Found library call:"+name);
			} else {
				if (!thisJoinPoint.getThis()
						.getClass().isAnnotationPresent(SourceInfo.class) && MetaVar.class.isAssignableFrom(thisJoinPoint.getThis()
						.getClass())) {
					name = ((MetaVar) thisJoinPoint.getThis())._getName() + ":"
							+ name;
				}
			}
	    	
			cp._addExternalFunctionCall(ms,name,thisJoinPoint.getArgs());
	    	returnType = ms.getReturnType();
	    	returnType = getImplementationIfExist(returnType);
		} catch (Throwable t) {
			System.out.println("some aspect error happened");
			throw new RuntimeException(t);
		}
//    	System.out.println("end ext command:" + thisJoinPoint.getThis().getClass().getCanonicalName()+"."+thisJoinPoint.getSignature().getName());
    	
		try {
			Constructor<?> cons = returnType.getConstructor(String.class);
			if(cp._getName()==null){
				throw new RuntimeException("unexpected error!");
			}
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
    	throw new RuntimeException("unexpected error!");
    }
    
    after() returning:hooks(){
		executeMode = false;

		MetaScriptBuilder cp = null;
		try {
			cp = getCommandProcessor(thisJoinPoint.getThis());
			if (cp == null) {
				throw new RuntimeException(
						"command processor not found for class:"
								+ thisJoinPoint.getSignature().getDeclaringType().getCanonicalName() + "!");
			}
		} catch (Throwable t) {
			System.out.println("some aspect error happened");
			throw new RuntimeException(t);
		}

		String name = (String) thisJoinPoint.getArgs()[0];
		Method method = null;
		Hook hookAnnotation = (Hook)thisJoinPoint.getSignature().getDeclaringType()
				.getAnnotation(Hook.class);
		if (hookAnnotation == null) {
			throw new RuntimeException("Hook annotation for class:"
					+ thisJoinPoint.getSignature().getDeclaringType().getCanonicalName()
					+ " not found!");
		}
		String methodName = hookAnnotation.value();
		for (Method m : thisJoinPoint.getSignature().getDeclaringType().getMethods()) {
			if (m.getName().equals(methodName)) {
				method = m;
			}
		}
		if (method == null) {
			throw new RuntimeException("Method not \"" + methodName
					+ "\"found!");
		}
		cp._addHook(name, method, thisJoinPoint.getThis());
		
    }

    void around():valueSetters(){
		MetaCommand cp = null;
		try {
			cp = getCommandProcessor(thisJoinPoint.getThis());
			if (cp == null) {
				throw new RuntimeException(
						"command processor not found for class:"
								+ thisJoinPoint.getSignature().getDeclaringType().getCanonicalName() + "!");
			}
		} catch (Throwable t) {
			System.out.println("some aspect error happened");
			throw new RuntimeException(t);
		}

		
		Object args[] = thisJoinPoint.getArgs();
		if(args.length!=1){
			throw new RuntimeException("unexpected number of arguments!("+args.length+")");
		}
		
		if (thisJoinPoint.getThis() instanceof MetaVarString && args[0] instanceof String) {
			cp.set((MetaVarString) thisJoinPoint.getThis(), (String) args[0]);
		} else if (thisJoinPoint.getThis() instanceof MetaVarInt && args[0] instanceof Integer) {
			cp.set((MetaVarInt) thisJoinPoint.getThis(), (Integer) args[0]);
		} else if (thisJoinPoint.getThis() instanceof MetaVar && args[0] instanceof MetaVar) {
			cp.set((MetaVar) thisJoinPoint.getThis(), (MetaVar) args[0]);
		} else if (thisJoinPoint.getThis() instanceof MetaVarBoolean && args[0] instanceof Boolean) {
			cp.set((MetaVarBoolean) thisJoinPoint.getThis(), (Boolean) args[0]);
		} else {
			throw new RuntimeException("unexpected number of argument types!");
		}
		
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
