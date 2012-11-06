package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum BUTTON implements MetaVar {
BUTTON_CODE_COUNT("BUTTON_CODE_COUNT"),
BUTTON_CODE_INVALID("BUTTON_CODE_INVALID"),
BUTTON_CODE_LAST("BUTTON_CODE_LAST"),
BUTTON_CODE_NONE("BUTTON_CODE_NONE"),
;
	private String name;
	private BUTTON(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
