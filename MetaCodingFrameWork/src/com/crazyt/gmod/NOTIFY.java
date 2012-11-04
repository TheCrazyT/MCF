package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum NOTIFY implements MetaVar {
NOTIFY_CLEANUP("NOTIFY_CLEANUP"),
NOTIFY_ERROR("NOTIFY_ERROR"),
NOTIFY_GENERIC("NOTIFY_GENERIC"),
NOTIFY_HINT("NOTIFY_HINT"),
NOTIFY_UNDO("NOTIFY_UNDO"),
;
	private String name;
	private NOTIFY(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
