package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_PlayerSay")
public abstract class HookGAMEMODE_PlayerSay extends MetaVarFunctionImpl{
	public HookGAMEMODE_PlayerSay(String n) {
		super(n);
	}
	/**
	Called when a player types and enters a text message.
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_PlayerSay(@SimpleName("playerVar")MetaVarEntity playerVar,@SimpleName("messageVar")MetaVarString messageVar,@SimpleName("teamVar")MetaVarBoolean teamVar);
}
