package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum CREATERENDERTARGETFLAGS implements MetaVar {
CREATERENDERTARGETFLAGS_AUTOMIPMAP("CREATERENDERTARGETFLAGS_AUTOMIPMAP"),
CREATERENDERTARGETFLAGS_HDR("CREATERENDERTARGETFLAGS_HDR"),
CREATERENDERTARGETFLAGS_UNFILTERABLE_OK("CREATERENDERTARGETFLAGS_UNFILTERABLE_OK"),
;
	private String name;
	private CREATERENDERTARGETFLAGS(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
