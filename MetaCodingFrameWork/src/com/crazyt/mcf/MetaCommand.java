package com.crazyt.mcf;

import java.lang.reflect.Method;

import org.aspectj.lang.reflect.MethodSignature;

import com.crazyt.mcf.MetaVarBoolean;
import com.crazyt.mcf.MetaVarBooleanImpl;
import com.crazyt.mcf.MetaVarInt;
import com.crazyt.mcf.MetaVarIntImpl;
import com.crazyt.mcf.MetaVarString;
import com.crazyt.mcf.MetaVarStringImpl;

public interface MetaCommand extends MetaVar,MetaConditionCommands{

	public abstract MetaCommand  forCmd(MetaVarInt v, MetaVarInt from,
			MetaVarInt to);
	
	public abstract MetaCommand  forCmd(MetaVarInt v, Integer from,
			Integer to);

	public abstract MetaCommand forPair(MetaVar v1,MetaVar v2,MetaVarTable table);

	public abstract MetaCommand  end();

	public abstract MetaCommand  add(MetaVarInt v1, MetaVarInt v2);

	public abstract MetaCommand  sub(MetaVarInt v1, MetaVarInt v2);

	public abstract MetaCommand  set(MetaVarString v, String s);
	
	public abstract MetaCommand  set(MetaVar v, MetaVar v2);
	
	public abstract MetaCommand  set(MetaVarInt v, int i);
	
	public abstract MetaCommand  set(MetaVarBoolean v, boolean i);
	
	public abstract MetaCommand  print(MetaVar v);
	
	public abstract MetaCommand  print(String v);

	public abstract MetaCommand  call(MetaVar mc);
	
	public abstract MetaVarString TEXT(String v);
	
	public abstract MetaVarInt NUM(int v);
	
	public abstract MetaVarBoolean BOOL(boolean v);

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