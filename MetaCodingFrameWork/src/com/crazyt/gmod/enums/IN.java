package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum IN implements MetaVar {
IN_ALT1("IN_ALT1"),
IN_ALT2("IN_ALT2"),
IN_ATTACK("IN_ATTACK"),
IN_ATTACK2("IN_ATTACK2"),
IN_BACK("IN_BACK"),
IN_BULLRUSH("IN_BULLRUSH"),
IN_CANCEL("IN_CANCEL"),
IN_DUCK("IN_DUCK"),
IN_FORWARD("IN_FORWARD"),
IN_GRENADE1("IN_GRENADE1"),
IN_GRENADE2("IN_GRENADE2"),
IN_JUMP("IN_JUMP"),
IN_LEFT("IN_LEFT"),
IN_MOVELEFT("IN_MOVELEFT"),
IN_MOVERIGHT("IN_MOVERIGHT"),
IN_RELOAD("IN_RELOAD"),
IN_RIGHT("IN_RIGHT"),
IN_RUN("IN_RUN"),
IN_SCORE("IN_SCORE"),
IN_SPEED("IN_SPEED"),
IN_USE("IN_USE"),
IN_WALK("IN_WALK"),
IN_WEAPON1("IN_WEAPON1"),
IN_WEAPON2("IN_WEAPON2"),
IN_ZOOM("IN_ZOOM"),
;
	private String name;
	private IN(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
