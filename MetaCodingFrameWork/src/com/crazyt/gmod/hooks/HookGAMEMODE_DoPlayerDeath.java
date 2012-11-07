package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_DoPlayerDeath")
public abstract class HookGAMEMODE_DoPlayerDeath extends MetaVarFunctionImpl{
	public final static String INTERNAL_HOOK_NAME = "DoPlayerDeath";
	public HookGAMEMODE_DoPlayerDeath(String n) {
		super(n);
	}
	/**
	Handles the player's death
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_DoPlayerDeath(@SimpleName("plyVar")MetaVarPlayer plyVar,@SimpleName("attackerVar")MetaVarPlayer attackerVar,@SimpleName("dmginfoVar")MetaVarCTakeDamageInfo dmginfoVar);
}
