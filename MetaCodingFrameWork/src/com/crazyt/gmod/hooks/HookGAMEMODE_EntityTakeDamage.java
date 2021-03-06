package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_EntityTakeDamage")
public abstract class HookGAMEMODE_EntityTakeDamage extends MetaVarFunctionImpl{
	public final static String INTERNAL_HOOK_NAME = "EntityTakeDamage";
	public HookGAMEMODE_EntityTakeDamage(String n) {
		super(n);
	}
	/**
	Called when an entity takes damage.
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_EntityTakeDamage(@SimpleName("TargetVar")MetaVarEntity TargetVar,@SimpleName("DamageInfoVar")MetaVarCTakeDamageInfo DamageInfoVar);
}
