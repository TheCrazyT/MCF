package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_PlayerSpawn extends MetaVarFunction{
	public HookGAMEMODE_PlayerSpawn(String n) {
		super(n);
	}
	/**
	Called whenever a player spawned.
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_PlayerSpawn(MetaVarPlayer sprayerVar);
}
