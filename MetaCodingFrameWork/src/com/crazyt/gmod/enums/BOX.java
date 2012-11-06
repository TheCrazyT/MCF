package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum BOX implements MetaVar {
BOX_BACK("BOX_BACK"),
BOX_BOTTOM("BOX_BOTTOM"),
BOX_FRONT("BOX_FRONT"),
BOX_LEFT("BOX_LEFT"),
BOX_RIGHT("BOX_RIGHT"),
BOX_TOP("BOX_TOP"),
;
	private String name;
	private BOX(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
