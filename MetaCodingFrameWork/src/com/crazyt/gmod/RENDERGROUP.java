package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum RENDERGROUP implements MetaVar {
RENDERGROUP_BOTH("RENDERGROUP_BOTH"),
RENDERGROUP_OPAQUE("RENDERGROUP_OPAQUE"),
RENDERGROUP_OPAQUE_BRUSH("RENDERGROUP_OPAQUE_BRUSH"),
RENDERGROUP_OPAQUE_HUGE("RENDERGROUP_OPAQUE_HUGE"),
RENDERGROUP_TRANSLUCENT("RENDERGROUP_TRANSLUCENT"),
RENDERGROUP_VIEWMODEL("RENDERGROUP_VIEWMODEL"),
RENDERGROUP_VIEWMODEL_TRANSLUCENT("RENDERGROUP_VIEWMODEL_TRANSLUCENT"),
;
	private String name;
	private RENDERGROUP(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
