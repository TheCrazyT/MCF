package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum TEXT implements MetaVar {
TEXT_ALIGN_BOTTOM("TEXT_ALIGN_BOTTOM"),
TEXT_ALIGN_CENTER("TEXT_ALIGN_CENTER"),
TEXT_ALIGN_LEFT("TEXT_ALIGN_LEFT"),
TEXT_ALIGN_RIGHT("TEXT_ALIGN_RIGHT"),
TEXT_ALIGN_TOP("TEXT_ALIGN_TOP"),
;
	private String name;
	private TEXT(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
