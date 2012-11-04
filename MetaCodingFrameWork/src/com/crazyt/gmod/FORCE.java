package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum FORCE implements MetaVar {
FORCE_BOOL("FORCE_BOOL"),
FORCE_NUMBER("FORCE_NUMBER"),
FORCE_STRING("FORCE_STRING"),
;
	private String name;
	private FORCE(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
