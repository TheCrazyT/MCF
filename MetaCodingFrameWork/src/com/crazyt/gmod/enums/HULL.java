package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum HULL implements MetaVar {
HULL_HUMAN("HULL_HUMAN"),
HULL_LARGE("HULL_LARGE"),
HULL_LARGE_CENTERED("HULL_LARGE_CENTERED"),
HULL_MEDIUM("HULL_MEDIUM"),
HULL_MEDIUM_TALL("HULL_MEDIUM_TALL"),
HULL_SMALL_CENTERED("HULL_SMALL_CENTERED"),
HULL_TINY("HULL_TINY"),
HULL_TINY_CENTERED("HULL_TINY_CENTERED"),
HULL_WIDE_HUMAN("HULL_WIDE_HUMAN"),
HULL_WIDE_SHORT("HULL_WIDE_SHORT"),
;
	private String name;
	private HULL(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
