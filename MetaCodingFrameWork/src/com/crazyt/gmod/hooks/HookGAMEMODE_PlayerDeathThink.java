package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
@Hook("GAMEMODE_PlayerDeathThink")
public abstract class HookGAMEMODE_PlayerDeathThink extends MetaVarFunction{
	public HookGAMEMODE_PlayerDeathThink(String n) {
		super(n);
	}
	/**
	Called every think while the player is dead.
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_PlayerDeathThink(MetaVarPlayer plyVar);
}
