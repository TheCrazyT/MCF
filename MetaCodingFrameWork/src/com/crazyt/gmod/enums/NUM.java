package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum NUM implements MetaVar {
NUM_AI_CLASSES("NUM_AI_CLASSES"),
NUM_HULLS("NUM_HULLS"),
;
	private String name;
	private NUM(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
