package com.crazyt.mcf;
@Implementation(MetaVarBooleanImpl.class)
public interface MetaVarBoolean extends MetaVar {
	@ValueSetter
	public void setValue(boolean value);
}