package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum NPC implements MetaVar {
NPC_STATE_ALERT("NPC_STATE_ALERT"),
NPC_STATE_COMBAT("NPC_STATE_COMBAT"),
NPC_STATE_DEAD("NPC_STATE_DEAD"),
NPC_STATE_IDLE("NPC_STATE_IDLE"),
NPC_STATE_INVALID("NPC_STATE_INVALID"),
NPC_STATE_NONE("NPC_STATE_NONE"),
NPC_STATE_PLAYDEAD("NPC_STATE_PLAYDEAD"),
NPC_STATE_PRONE("NPC_STATE_PRONE"),
NPC_STATE_SCRIPT("NPC_STATE_SCRIPT"),
;
	private String name;
	private NPC(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
