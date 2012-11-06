package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum SURF implements MetaVar {
SURF_BUMPLIGHT("SURF_BUMPLIGHT"),
SURF_HINT("SURF_HINT"),
SURF_HITBOX("SURF_HITBOX"),
SURF_LIGHT("SURF_LIGHT"),
SURF_NOCHOP("SURF_NOCHOP"),
SURF_NODECALS("SURF_NODECALS"),
SURF_NODRAW("SURF_NODRAW"),
SURF_NOLIGHT("SURF_NOLIGHT"),
SURF_NOPORTAL("SURF_NOPORTAL"),
SURF_NOSHADOWS("SURF_NOSHADOWS"),
SURF_SKIP("SURF_SKIP"),
SURF_SKY("SURF_SKY"),
SURF_TRANS("SURF_TRANS"),
SURF_TRIGGER("SURF_TRIGGER"),
SURF_WARP("SURF_WARP"),
;
	private String name;
	private SURF(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
