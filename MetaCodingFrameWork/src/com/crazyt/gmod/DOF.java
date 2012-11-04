package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum DOF implements MetaVar {
DOF_OFFSET("DOF_OFFSET"),
DOF_SPACING("DOF_SPACING"),
;
	private String name;
	private DOF(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
