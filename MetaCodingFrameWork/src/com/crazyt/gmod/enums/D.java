package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum D implements MetaVar {
D_ER("D_ER"),
D_FR("D_FR"),
D_HT("D_HT"),
D_LI("D_LI"),
D_NU("D_NU"),
;
	private String name;
	private D(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
