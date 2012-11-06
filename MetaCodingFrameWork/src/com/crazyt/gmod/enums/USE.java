package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum USE implements MetaVar {
USE_OFF("USE_OFF"),
USE_ON("USE_ON"),
USE_SET("USE_SET"),
USE_TOGGLE("USE_TOGGLE"),
;
	private String name;
	private USE(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
