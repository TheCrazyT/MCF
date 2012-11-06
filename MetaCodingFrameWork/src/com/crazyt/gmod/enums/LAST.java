package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum LAST implements MetaVar {
LAST_SHARED_ACTIVITY("LAST_SHARED_ACTIVITY"),
LAST_SHARED_COLLISION_GROUP("LAST_SHARED_COLLISION_GROUP"),
LAST_SHARED_SCHEDULE("LAST_SHARED_SCHEDULE"),
LAST_VISIBLE_CONTENTS("LAST_VISIBLE_CONTENTS"),
;
	private String name;
	private LAST(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
