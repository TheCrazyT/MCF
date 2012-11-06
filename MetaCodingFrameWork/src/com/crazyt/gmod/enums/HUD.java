package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum HUD implements MetaVar {
HUD_PRINTCENTER("HUD_PRINTCENTER"),
HUD_PRINTCONSOLE("HUD_PRINTCONSOLE"),
HUD_PRINTNOTIFY("HUD_PRINTNOTIFY"),
HUD_PRINTTALK("HUD_PRINTTALK"),
;
	private String name;
	private HUD(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
