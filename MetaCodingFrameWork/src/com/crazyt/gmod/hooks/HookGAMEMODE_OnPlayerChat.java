package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_OnPlayerChat")
public abstract class HookGAMEMODE_OnPlayerChat extends MetaVarFunctionImpl{
	public final static String INTERNAL_HOOK_NAME = "OnPlayerChat";
	public HookGAMEMODE_OnPlayerChat(String n) {
		super(n);
	}
	/**
	Process the player's chat.. return true for no default
	*/
	@SharedFunc
	public abstract MetaVar GAMEMODE_OnPlayerChat(@SimpleName("playerVar")MetaVarEntity playerVar,@SimpleName("textVar")MetaVarString textVar,@SimpleName("teamOnlyVar")MetaVarBoolean teamOnlyVar,@SimpleName("playerIsDeadVar")MetaVarBoolean playerIsDeadVar);
}
