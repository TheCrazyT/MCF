package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum MOUSE implements MetaVar {
MOUSE_LEFT("MOUSE_LEFT"),
MOUSE_MIDDLE("MOUSE_MIDDLE"),
MOUSE_RIGHT("MOUSE_RIGHT"),
MOUSE_4("MOUSE_4"),
MOUSE_5("MOUSE_5"),
MOUSE_WHEEL_DOWN("MOUSE_WHEEL_DOWN"),
MOUSE_WHEEL_UP("MOUSE_WHEEL_UP"),
MOUSE_COUNT("MOUSE_COUNT"),
MOUSE_FIRST("MOUSE_FIRST"),
MOUSE_LAST("MOUSE_LAST"),
;
	private String name;
	private MOUSE(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
