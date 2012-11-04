package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum STEPSOUNDTIME implements MetaVar {
STEPSOUNDTIME_NORMAL("STEPSOUNDTIME_NORMAL"),
STEPSOUNDTIME_ON_LADDER("STEPSOUNDTIME_ON_LADDER"),
STEPSOUNDTIME_WATER_FOOT("STEPSOUNDTIME_WATER_FOOT"),
STEPSOUNDTIME_WATER_KNEE("STEPSOUNDTIME_WATER_KNEE"),
;
	private String name;
	private STEPSOUNDTIME(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
