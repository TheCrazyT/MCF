package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum RT_SIZE implements MetaVar {
RT_SIZE_DEFAULT("RT_SIZE_DEFAULT"),
RT_SIZE_FULL_FRAME_BUFFER("RT_SIZE_FULL_FRAME_BUFFER"),
RT_SIZE_FULL_FRAME_BUFFER_ROUNDED_UP("RT_SIZE_FULL_FRAME_BUFFER_ROUNDED_UP"),
RT_SIZE_HDR("RT_SIZE_HDR"),
RT_SIZE_NO_CHANGE("RT_SIZE_NO_CHANGE"),
RT_SIZE_OFFSCREEN("RT_SIZE_OFFSCREEN"),
RT_SIZE_PICMIP("RT_SIZE_PICMIP"),
;
	private String name;
	private RT_SIZE(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
