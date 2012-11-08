package com.crazyt.mcf;

public class MetaVarStringImpl extends MetaVarImpl implements MetaVarString {
	public MetaVarStringImpl(String n) {
		super(n);
	}
	
	@Override
	@ValueSetter
	public void setValue(String value){
	}
}
