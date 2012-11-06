package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_PlayerInitialSpawn extends MetaVarFunction{
	public HookGAMEMODE_PlayerInitialSpawn(String n) {
		super(n);
	}
	/**
	Called when the player spawns for the first time.
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_PlayerInitialSpawn(MetaVarPlayer playerVar);
}