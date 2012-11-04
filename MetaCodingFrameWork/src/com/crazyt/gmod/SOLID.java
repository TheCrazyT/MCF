package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum SOLID implements MetaVar {
SOLID_BBOX("SOLID_BBOX"),
SOLID_BSP("SOLID_BSP"),
SOLID_CUSTOM("SOLID_CUSTOM"),
SOLID_NONE("SOLID_NONE"),
SOLID_OBB("SOLID_OBB"),
SOLID_OBB_YAW("SOLID_OBB_YAW"),
SOLID_VPHYSICS("SOLID_VPHYSICS"),
;
	private String name;
	private SOLID(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
