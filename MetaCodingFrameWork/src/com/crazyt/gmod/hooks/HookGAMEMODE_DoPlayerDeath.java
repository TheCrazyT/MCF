package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_DoPlayerDeath extends MetaVarFunction{
	public HookGAMEMODE_DoPlayerDeath(String n) {
		super(n);
	}
	/**
	Handles the player's death
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_DoPlayerDeath(MetaVarPlayer plyVar,MetaVarPlayer attackerVar,MetaVarCTakeDamageInfo dmginfoVar);
}
