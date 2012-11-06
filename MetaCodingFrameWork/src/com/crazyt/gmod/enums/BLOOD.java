package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum BLOOD implements MetaVar {
BLOOD_COLOR_ANTLION("BLOOD_COLOR_ANTLION"),
BLOOD_COLOR_ANTLION_WORKER("BLOOD_COLOR_ANTLION_WORKER"),
BLOOD_COLOR_GREEN("BLOOD_COLOR_GREEN"),
BLOOD_COLOR_MECH("BLOOD_COLOR_MECH"),
BLOOD_COLOR_RED("BLOOD_COLOR_RED"),
BLOOD_COLOR_YELLOW("BLOOD_COLOR_YELLOW"),
BLOOD_COLOR_ZOMBIE("BLOOD_COLOR_ZOMBIE"),
;
	private String name;
	private BLOOD(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
