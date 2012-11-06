package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum CT implements MetaVar {
CT_DEFAULT("CT_DEFAULT"),
CT_DOWNTRODDEN("CT_DOWNTRODDEN"),
CT_REBEL("CT_REBEL"),
CT_REFUGEE("CT_REFUGEE"),
CT_UNIQUE("CT_UNIQUE"),
;
	private String name;
	private CT(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
