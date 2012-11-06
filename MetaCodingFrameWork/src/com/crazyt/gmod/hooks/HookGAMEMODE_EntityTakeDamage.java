package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_EntityTakeDamage extends MetaVarFunction{
	public HookGAMEMODE_EntityTakeDamage(String n) {
		super(n);
	}
	/**
	Called when an entity takes damage.
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_EntityTakeDamage(MetaVarEntity TargetVar,MetaVarCTakeDamageInfo DamageInfoVar);
}
