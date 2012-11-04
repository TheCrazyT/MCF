package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum JOYSTICK implements MetaVar {
JOYSTICK_FIRST("JOYSTICK_FIRST"),
JOYSTICK_FIRST_AXIS_BUTTON("JOYSTICK_FIRST_AXIS_BUTTON"),
JOYSTICK_FIRST_BUTTON("JOYSTICK_FIRST_BUTTON"),
JOYSTICK_FIRST_POV_BUTTON("JOYSTICK_FIRST_POV_BUTTON"),
JOYSTICK_LAST("JOYSTICK_LAST"),
JOYSTICK_LAST_AXIS_BUTTON("JOYSTICK_LAST_AXIS_BUTTON"),
JOYSTICK_LAST_BUTTON("JOYSTICK_LAST_BUTTON"),
JOYSTICK_LAST_POV_BUTTON("JOYSTICK_LAST_POV_BUTTON"),
;
	private String name;
	private JOYSTICK(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
