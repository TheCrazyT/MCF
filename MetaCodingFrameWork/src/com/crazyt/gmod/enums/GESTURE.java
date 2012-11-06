package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum GESTURE implements MetaVar {
GESTURE_SLOT_ATTACK_AND_RELOAD("GESTURE_SLOT_ATTACK_AND_RELOAD"),
GESTURE_SLOT_CUSTOM("GESTURE_SLOT_CUSTOM"),
GESTURE_SLOT_FLINCH("GESTURE_SLOT_FLINCH"),
GESTURE_SLOT_GRENADE("GESTURE_SLOT_GRENADE"),
GESTURE_SLOT_JUMP("GESTURE_SLOT_JUMP"),
GESTURE_SLOT_SWIM("GESTURE_SLOT_SWIM"),
GESTURE_SLOT_VCD("GESTURE_SLOT_VCD"),
;
	private String name;
	private GESTURE(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
