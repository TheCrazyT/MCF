package com.crazyt.mcf;


public interface MetaCommand extends MetaVar,MetaConditionCommands,MetaLoops{

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
	
	public abstract MetaVarString concat(MetaVarString v1,MetaVarString v2);
	
	public abstract MetaVarInt NUM(int v);
	
	public abstract MetaVarBoolean BOOL(boolean v);

}