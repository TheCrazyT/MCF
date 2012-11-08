package com.crazyt.mcf;

import java.lang.reflect.Method;

import org.aspectj.lang.reflect.MethodSignature;

public abstract class BasicFunctions implements MetaCommand{

	protected abstract MetaCommand getMetaCommand();
	
	@Override
	public String _getName() {
		return getMetaCommand()._getName();
	}

	@Override
	public void _setName(String name) {
		getMetaCommand()._setName(name);
	}

	@Override
	public MetaCommand forCmd(MetaVarInt v, MetaVarInt from, MetaVarInt to) {
		return getMetaCommand().forCmd(v, from, to);
	}

	@Override
	public MetaCommand forCmd(MetaVarInt v, Integer from, Integer to) {
		return getMetaCommand().forCmd(v, from, to);
	}

	@Override
	public MetaCommand forPair(MetaVar v1,MetaVar v2,MetaVarTable table) {
		return getMetaCommand().forPair(v1,v2,table);
	}

	@Override
	public MetaCommand end() {
		return getMetaCommand().end();
	}

	@Override
	public MetaConditionLogic cond(MetaVarBoolean v1, MetaVarBoolean v2) {
		return getMetaCommand().cond(v1, v2);
	}

	@Override
	public MetaCondition cond(MetaVarInt v1, MetaVarInt v2) {
		return getMetaCommand().cond(v1, v2);
	}

	@Override
	public MetaCondition cond(MetaVarString v1, MetaVarString v2) {
		return getMetaCommand().cond(v1, v2);
	}

	@Override
	public MetaCondition cond(MetaVarString v1, String v2) {
		return getMetaCommand().cond(v1, v2);
	}

	@Override
	public MetaCommand add(MetaVarInt v1, MetaVarInt v2) {
		return getMetaCommand().add(v1, v2);
	}

	@Override
	public MetaCommand sub(MetaVarInt v1, MetaVarInt v2) {
		return getMetaCommand().sub(v1, v2);
	}

	@Override
	public MetaCommand set(MetaVar v1, MetaVar v2) {
		return getMetaCommand().set(v1, v2);
	}
	
	@Override
	public MetaCommand set(MetaVarString v, String s) {
		return getMetaCommand().set(v, s);
	}

	@Override
	public MetaCommand set(MetaVarInt v, int i) {
		return getMetaCommand().set(v, i);
	}

	@Override
	public MetaCommand set(MetaVarBoolean v1,boolean v2){
		return getMetaCommand().set(v1,v1);
	}

	@Override
	public MetaCommand print(MetaVar v) {
		return getMetaCommand().print(v);
	}


	@Override
	public MetaCommand print(String v) {
		return getMetaCommand().print(v);
	}

	@Override
	public MetaCommand call(MetaVar mc) {
		return getMetaCommand().call(mc);
	}

	@Override
	public void _addFunctionCall(MethodSignature sig, String functionName,
			Object[] args) {
		getMetaCommand()._addFunctionCall(sig, functionName, args);
	}

	@Override
	public void _addExternalFunctionCall(MethodSignature sig,
			String functionName, Object[] args) {
		getMetaCommand()._addExternalFunctionCall(sig, functionName, args);
	}

	@Override
	public void _addHook(String hook,
			Method method, Object object) {
		getMetaCommand()._addHook(hook,method,object);
	}
	
	@Override
	public MetaVarString TEXT(String v){
		return getMetaCommand().TEXT(v);
	}
	
	@Override
	public MetaVarInt NUM(int v){
		return getMetaCommand().NUM(v);
	}
	
	@Override
	public MetaVarBoolean BOOL(boolean v){
		return getMetaCommand().BOOL(v);
	}

}
