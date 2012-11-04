package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum MATERIAL_CULLMODE implements MetaVar {
MATERIAL_CULLMODE_CCW("MATERIAL_CULLMODE_CCW"),
MATERIAL_CULLMODE_CW("MATERIAL_CULLMODE_CW"),
;
	private String name;
	private MATERIAL_CULLMODE(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
