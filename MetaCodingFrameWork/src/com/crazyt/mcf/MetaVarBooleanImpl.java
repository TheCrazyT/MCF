package com.crazyt.mcf;

public class MetaVarBooleanImpl extends MetaVarImpl implements MetaVarBoolean {

	public MetaVarBooleanImpl(String n) {
		super(n);
	}
	
	@ValueSetter
	public void setValue(boolean value){}

}
