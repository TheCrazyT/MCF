package com.crazyt.mcf;
@Implementation(MetaVarIntImpl.class)
public interface MetaVarInt extends MetaVar {
	@ValueSetter
	public void setValue(int value);
}
