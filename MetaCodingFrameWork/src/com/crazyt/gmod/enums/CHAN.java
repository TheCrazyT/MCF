package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum CHAN implements MetaVar {
CHAN_AUTO("CHAN_AUTO"),
CHAN_BODY("CHAN_BODY"),
CHAN_ITEM("CHAN_ITEM"),
CHAN_REPLACE("CHAN_REPLACE"),
CHAN_STATIC("CHAN_STATIC"),
CHAN_STREAM("CHAN_STREAM"),
CHAN_USER_BASE("CHAN_USER_BASE"),
CHAN_VOICE_BASE("CHAN_VOICE_BASE"),
CHAN_VOICE("CHAN_VOICE"),
CHAN_WEAPON("CHAN_WEAPON"),
;
	private String name;
	private CHAN(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
