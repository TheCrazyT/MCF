package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_OnPlayerChat extends MetaVarFunction{
	public HookGAMEMODE_OnPlayerChat(String n) {
		super(n);
	}
	/**
	Process the player's chat.. return true for no default
	*/
	@SharedFunc
	public abstract MetaVar GAMEMODE_OnPlayerChat(MetaVarEntity playerVar,MetaVarString textVar,MetaVarBoolean teamOnlyVar,MetaVarBoolean playerIsDeadVar);
}
