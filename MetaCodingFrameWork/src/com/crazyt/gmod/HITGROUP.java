package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum HITGROUP implements MetaVar {
HITGROUP_CHEST("HITGROUP_CHEST"),
HITGROUP_GEAR("HITGROUP_GEAR"),
HITGROUP_GENERIC("HITGROUP_GENERIC"),
HITGROUP_HEAD("HITGROUP_HEAD"),
HITGROUP_LEFTARM("HITGROUP_LEFTARM"),
HITGROUP_LEFTLEG("HITGROUP_LEFTLEG"),
HITGROUP_RIGHTARM("HITGROUP_RIGHTARM"),
HITGROUP_RIGHTLEG("HITGROUP_RIGHTLEG"),
HITGROUP_STOMACH("HITGROUP_STOMACH"),
;
	private String name;
	private HITGROUP(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
