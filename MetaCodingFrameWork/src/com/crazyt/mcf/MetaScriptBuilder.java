package com.crazyt.mcf;

import java.lang.reflect.Method;

import org.aspectj.lang.reflect.MethodSignature;

public interface MetaScriptBuilder extends Cloneable,MetaLoops,MetaLoopDo,MetaConditionLogic,MetaConditionResult,MetaCommandInitiator,MetaCommand,MetaCondition{
	/**
	 * Don't use this, its only used internal.
	 */
	public abstract void _addFunctionCall(MethodSignature sig,String functionName,Object[] args);

	/**
	 * Don't use this, its only used internal.
	 */
	public abstract void _addExternalFunctionCall(MethodSignature sig,String functionName,Object[] args);

	/**
	 * Don't use this, its only used internal.
	 */
	public abstract void _addHook(String hookName,Method method,Object obj);
}
