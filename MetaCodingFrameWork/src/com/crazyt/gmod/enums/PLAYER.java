package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum PLAYER implements MetaVar {
PLAYER_ATTACK1("PLAYER_ATTACK1"),
PLAYER_DIE("PLAYER_DIE"),
PLAYER_IDLE("PLAYER_IDLE"),
PLAYER_IN_VEHICLE("PLAYER_IN_VEHICLE"),
PLAYER_JUMP("PLAYER_JUMP"),
PLAYER_LEAVE_AIMING("PLAYER_LEAVE_AIMING"),
PLAYER_RELOAD("PLAYER_RELOAD"),
PLAYER_START_AIMING("PLAYER_START_AIMING"),
PLAYER_SUPERJUMP("PLAYER_SUPERJUMP"),
PLAYER_WALK("PLAYER_WALK"),
;
	private String name;
	private PLAYER(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
