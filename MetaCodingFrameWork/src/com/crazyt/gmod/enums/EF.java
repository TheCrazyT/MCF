package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum EF implements MetaVar {
EF_BONEMERGE("EF_BONEMERGE"),
EF_BONEMERGE_FASTCULL("EF_BONEMERGE_FASTCULL"),
EF_BRIGHTLIGHT("EF_BRIGHTLIGHT"),
EF_DIMLIGHT("EF_DIMLIGHT"),
EF_ITEM_BLINK("EF_ITEM_BLINK"),
EF_NODRAW("EF_NODRAW"),
EF_NOINTERP("EF_NOINTERP"),
EF_NORECEIVESHADOW("EF_NORECEIVESHADOW"),
EF_NOSHADOW("EF_NOSHADOW"),
EF_PARENT_ANIMATES("EF_PARENT_ANIMATES"),
;
	private String name;
	private EF(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
