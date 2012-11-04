package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum MOVETYPE implements MetaVar {
MOVETYPE_CUSTOM("MOVETYPE_CUSTOM"),
MOVETYPE_FLY("MOVETYPE_FLY"),
MOVETYPE_FLYGRAVITY("MOVETYPE_FLYGRAVITY"),
MOVETYPE_ISOMETRIC("MOVETYPE_ISOMETRIC"),
MOVETYPE_LADDER("MOVETYPE_LADDER"),
MOVETYPE_NOCLIP("MOVETYPE_NOCLIP"),
MOVETYPE_NONE("MOVETYPE_NONE"),
MOVETYPE_OBSERVER("MOVETYPE_OBSERVER"),
MOVETYPE_PUSH("MOVETYPE_PUSH"),
MOVETYPE_STEP("MOVETYPE_STEP"),
MOVETYPE_VPHYSICS("MOVETYPE_VPHYSICS"),
MOVETYPE_WALK("MOVETYPE_WALK"),
;
	private String name;
	private MOVETYPE(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
