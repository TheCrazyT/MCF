package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_PlayerInitialSpawn")
public abstract class HookGAMEMODE_PlayerInitialSpawn extends MetaVarFunctionImpl{
	public final static String INTERNAL_HOOK_NAME = "PlayerInitialSpawn";
	public HookGAMEMODE_PlayerInitialSpawn(String n) {
		super(n);
	}
	/**
	Called when the player spawns for the first time.
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_PlayerInitialSpawn(@SimpleName("playerVar")MetaVarPlayer playerVar);
}
