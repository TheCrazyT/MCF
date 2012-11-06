package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum PATTACH implements MetaVar {
PATTACH_ABSORIGIN("PATTACH_ABSORIGIN"),
PATTACH_ABSORIGIN_FOLLOW("PATTACH_ABSORIGIN_FOLLOW"),
PATTACH_CUSTOMORIGIN("PATTACH_CUSTOMORIGIN"),
PATTACH_POINT("PATTACH_POINT"),
PATTACH_POINT_FOLLOW("PATTACH_POINT_FOLLOW"),
PATTACH_WORLDORIGIN("PATTACH_WORLDORIGIN"),
;
	private String name;
	private PATTACH(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
