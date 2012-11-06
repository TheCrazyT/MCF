package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_CanPlayerUnfreeze")
public abstract class HookGAMEMODE_CanPlayerUnfreeze extends MetaVarFunction{
	public HookGAMEMODE_CanPlayerUnfreeze(String n) {
		super(n);
	}
	/**
	Determines if the player can unfreeze the entity
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_CanPlayerUnfreeze(@SimpleName("player")MetaVarPlayer playerVar,@SimpleName("entity")MetaVarEntity entityVar,@SimpleName("physObj")MetaVarPhysObj physObjVar);
}
