package com.crazyt.mcf;

public interface MetaConditionCommands {
	public abstract MetaConditionLogic  cond(MetaVarBoolean v1, MetaVarBoolean v2);
	
	public abstract MetaCondition  cond(MetaVarInt v1, MetaVarInt v2);

	public abstract MetaCondition  cond(MetaVarString v1, MetaVarString v2);

	public abstract MetaCondition  cond(MetaVarString v1, String v2);
	
	public abstract void finalizeConditionStatements();
}
