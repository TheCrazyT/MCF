package com.crazyt.mcf;

@Implementation(MetaVarImpl.class)
public interface MetaVar {

	public abstract String _getName();

	public abstract void _setName(String name);

}