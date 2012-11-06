package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_CanPlayerUnfreeze extends MetaVarFunction{
	public HookGAMEMODE_CanPlayerUnfreeze(String n) {
		super(n);
	}
	/**
	Determines if the player can unfreeze the entity
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_CanPlayerUnfreeze(MetaVarPlayer playerVar,MetaVarEntity entityVar,MetaVarPhysObj physObjVar);
}
