package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_PlayerSpawn")
public abstract class HookGAMEMODE_PlayerSpawn extends MetaVarFunctionImpl{
	public final static String INTERNAL_HOOK_NAME = "PlayerSpawn";
	public HookGAMEMODE_PlayerSpawn(String n) {
		super(n);
	}
	/**
	Called whenever a player spawned.
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_PlayerSpawn(@SimpleName("sprayerVar")MetaVarPlayer sprayerVar);
}
