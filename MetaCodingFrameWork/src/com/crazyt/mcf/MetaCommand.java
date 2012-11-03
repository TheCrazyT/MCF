package com.crazyt.mcf;

import org.aspectj.lang.reflect.MethodSignature;

public interface MetaCommand extends MetaVar{

	public abstract MetaCommand  forCmd(MetaVarInt v, MetaVarInt from,
			MetaVarInt to);

	public abstract MetaCommand  end();

	public abstract MetaCommand  cond(MetaVarInt v1, MetaVarInt v2,
			MetaCondMode mode);

	public abstract MetaCommand  cond(MetaVarString v1, MetaVarString v2,
			MetaCondMode mode);

	public abstract MetaCommand  cond(MetaVarString v1, String v2,
			MetaCondMode mode);

	public abstract MetaCommand  add(MetaVarInt v1, MetaVarInt v2);

	public abstract MetaCommand  sub(MetaVarInt v1, MetaVarInt v2);

	public abstract MetaCommand  var(MetaVarString v, String s);

	public abstract MetaCommand  var(MetaVarInt v, int i);

	public abstract MetaCommand  set(MetaVarString v, String s);
	
	public abstract MetaCommand  set(MetaVarInt v, int i);
	
	public abstract MetaCommand  print(MetaVar v);
	
	public abstract MetaCommand  call(MetaVar mc);
	
	/**
	 * Don't use this, its only used internal.
	 */
	public abstract void _addFunctionCall(MethodSignature sig,String functionName,Object[] args);

	/**
	 * Don't use this, its only used internal.
	 */
	public abstract void _addExternalFunctionCall(MethodSignature sig,String functionName,Object[] args);

//	public abstract T cmd();
}