package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum MATERIAL_RT_DEPTH implements MetaVar {
MATERIAL_RT_DEPTH_NONE("MATERIAL_RT_DEPTH_NONE"),
MATERIAL_RT_DEPTH_ONLY("MATERIAL_RT_DEPTH_ONLY"),
MATERIAL_RT_DEPTH_SEPARATE("MATERIAL_RT_DEPTH_SEPARATE"),
MATERIAL_RT_DEPTH_SHARED("MATERIAL_RT_DEPTH_SHARED"),
;
	private String name;
	private MATERIAL_RT_DEPTH(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
