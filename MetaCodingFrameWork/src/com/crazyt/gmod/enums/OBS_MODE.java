package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum OBS_MODE implements MetaVar {
OBS_MODE_CHASE("OBS_MODE_CHASE"),
OBS_MODE_DEATHCAM("OBS_MODE_DEATHCAM"),
OBS_MODE_FIXED("OBS_MODE_FIXED"),
OBS_MODE_FREEZECAM("OBS_MODE_FREEZECAM"),
OBS_MODE_IN_EYE("OBS_MODE_IN_EYE"),
OBS_MODE_NONE("OBS_MODE_NONE"),
OBS_MODE_ROAMING("OBS_MODE_ROAMING"),
;
	private String name;
	private OBS_MODE(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
