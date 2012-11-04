package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum SIM implements MetaVar {
SIM_GLOBAL_ACCELERATION("SIM_GLOBAL_ACCELERATION"),
SIM_GLOBAL_FORCE("SIM_GLOBAL_FORCE"),
SIM_LOCAL_ACCELERATION("SIM_LOCAL_ACCELERATION"),
SIM_LOCAL_FORCE("SIM_LOCAL_FORCE"),
SIM_NOTHING("SIM_NOTHING"),
;
	private String name;
	private SIM(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
