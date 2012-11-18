package com.crazyt.mcf;


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
	public MetaLoopDo forCmd(MetaVarInt v, MetaVarInt from, MetaVarInt to) {
		return getMetaCommand().forCmd(v, from, to);
	}

	@Override
	public MetaLoopDo forCmd(MetaVarInt v, Integer from, Integer to) {
		return getMetaCommand().forCmd(v, from, to);
	}

	@Override
	public MetaLoopDo forPair(MetaVar v1,MetaVar v2,MetaVarTable table) {
		return getMetaCommand().forPair(v1,v2,table);
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

	@Override
	public MetaVarString concat(MetaVarString v1, MetaVarString v2) {
		return getMetaCommand().concat(v1, v2);
	}
}
