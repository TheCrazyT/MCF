package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum TEAM implements MetaVar {
TEAM_CONNECTING("TEAM_CONNECTING"),
TEAM_SPECTATOR("TEAM_SPECTATOR"),
TEAM_UNASSIGNED("TEAM_UNASSIGNED"),
;
	private String name;
	private TEAM(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
