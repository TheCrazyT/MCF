package com.crazyt.mcf;

import org.aspectj.lang.reflect.MethodSignature;

public abstract class BasicFunctions implements MetaCommand{

	protected abstract MetaCommand getMetaCommand();
	
	public String _getName() {
		return getMetaCommand()._getName();
	}

	public void _setName(String name) {
		getMetaCommand()._setName(name);
	}

	public MetaCommand forCmd(MetaVarInt v, MetaVarInt from, MetaVarInt to) {
		return getMetaCommand().forCmd(v, from, to);
	}

	public MetaCommand forPair(MetaVar v1,MetaVar v2,MetaVarTable table) {
		return getMetaCommand().forPair(v1,v2,table);
	}

	public MetaCommand end() {
		return getMetaCommand().end();
	}

	public MetaConditionLogic cond(MetaVarBoolean v1, MetaVarBoolean v2) {
		return getMetaCommand().cond(v1, v2);
	}

	public MetaCondition cond(MetaVarInt v1, MetaVarInt v2) {
		return getMetaCommand().cond(v1, v2);
	}

	public MetaCondition cond(MetaVarString v1, MetaVarString v2) {
		return getMetaCommand().cond(v1, v2);
	}

	public MetaCondition cond(MetaVarString v1, String v2) {
		return getMetaCommand().cond(v1, v2);
	}

	public MetaCommand add(MetaVarInt v1, MetaVarInt v2) {
		return getMetaCommand().add(v1, v2);
	}

	public MetaCommand sub(MetaVarInt v1, MetaVarInt v2) {
		return getMetaCommand().sub(v1, v2);
	}

	public MetaCommand var(MetaVarString v, String s) {
		return getMetaCommand().var(v, s);
	}

	public MetaCommand var(MetaVarInt v, int i) {
		return getMetaCommand().var(v, i);
	}

	public MetaCommand set(MetaVarString v, String s) {
		return getMetaCommand().set(v, s);
	}

	public MetaCommand set(MetaVarInt v, int i) {
		return getMetaCommand().set(v, i);
	}

	public MetaCommand print(MetaVar v) {
		return getMetaCommand().print(v);
	}

	public MetaCommand call(MetaVar mc) {
		return getMetaCommand().call(mc);
	}

	public void _addFunctionCall(MethodSignature sig, String functionName,
			Object[] args) {
		getMetaCommand()._addFunctionCall(sig, functionName, args);
	}

	public void _addExternalFunctionCall(MethodSignature sig,
			String functionName, Object[] args) {
		getMetaCommand()._addExternalFunctionCall(sig, functionName, args);
	}
	
	public void finalizeConditionStatements(){
		getMetaCommand().finalizeConditionStatements();
	}
	

}
