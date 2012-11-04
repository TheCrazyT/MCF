package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum WEAPON implements MetaVar {
WEAPON_PROFICIENCY_AVERAGE("WEAPON_PROFICIENCY_AVERAGE"),
WEAPON_PROFICIENCY_GOOD("WEAPON_PROFICIENCY_GOOD"),
WEAPON_PROFICIENCY_PERFECT("WEAPON_PROFICIENCY_PERFECT"),
WEAPON_PROFICIENCY_POOR("WEAPON_PROFICIENCY_POOR"),
WEAPON_PROFICIENCY_VERY_GOOD("WEAPON_PROFICIENCY_VERY_GOOD"),
;
	private String name;
	private WEAPON(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
