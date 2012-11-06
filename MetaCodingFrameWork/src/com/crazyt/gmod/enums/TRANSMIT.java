package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum TRANSMIT implements MetaVar {
TRANSMIT_ALWAYS("TRANSMIT_ALWAYS"),
TRANSMIT_NEVER("TRANSMIT_NEVER"),
TRANSMIT_PVS("TRANSMIT_PVS"),
;
	private String name;
	private TRANSMIT(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
