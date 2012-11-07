package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_CanPlayerSuicide")
public abstract class HookGAMEMODE_CanPlayerSuicide extends MetaVarFunctionImpl{
	public HookGAMEMODE_CanPlayerSuicide(String n) {
		super(n);
	}
	/**
	Determines if the player can kill themselves using the concommands "kill" or "explode"
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_CanPlayerSuicide(@SimpleName("playerVar")MetaVarPlayer playerVar);
}
