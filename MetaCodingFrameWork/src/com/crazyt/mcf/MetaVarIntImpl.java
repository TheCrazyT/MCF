package com.crazyt.mcf;

public class MetaVarIntImpl extends MetaVarImpl implements MetaVarInt{

	public MetaVarIntImpl(String n) {
		super(n);
	}
	
	@ValueSetter
	public void setValue(int value){}
}
