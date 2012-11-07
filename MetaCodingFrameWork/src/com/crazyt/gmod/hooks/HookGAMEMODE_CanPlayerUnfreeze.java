package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_CanPlayerUnfreeze")
public abstract class HookGAMEMODE_CanPlayerUnfreeze extends MetaVarFunctionImpl{
	public final static String INTERNAL_HOOK_NAME = "CanPlayerUnfreeze";
	public HookGAMEMODE_CanPlayerUnfreeze(String n) {
		super(n);
	}
	/**
	Determines if the player can unfreeze the entity
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_CanPlayerUnfreeze(@SimpleName("playerVar")MetaVarPlayer playerVar,@SimpleName("entityVar")MetaVarEntity entityVar,@SimpleName("physObjVar")MetaVarPhysObj physObjVar);
}
