package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum MATERIAL_FOG implements MetaVar {
MATERIAL_FOG_LINEAR("MATERIAL_FOG_LINEAR"),
MATERIAL_FOG_LINEAR_BELOW_FOG_Z("MATERIAL_FOG_LINEAR_BELOW_FOG_Z"),
MATERIAL_FOG_NONE("MATERIAL_FOG_NONE"),
;
	private String name;
	private MATERIAL_FOG(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
