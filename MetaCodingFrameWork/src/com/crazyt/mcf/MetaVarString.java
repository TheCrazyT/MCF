package com.crazyt.mcf;

@Implementation(MetaVarStringImpl.class)
public interface MetaVarString extends MetaVar {
	@ValueSetter
	void setValue(String value);

}
