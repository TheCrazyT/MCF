package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_EntityTakeDamage")
public abstract class HookGAMEMODE_EntityTakeDamage extends MetaVarFunction{
	public HookGAMEMODE_EntityTakeDamage(String n) {
		super(n);
	}
	/**
	Called when an entity takes damage.
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_EntityTakeDamage(@SimpleName("Target")MetaVarEntity TargetVar,@SimpleName("DamageInfo")MetaVarCTakeDamageInfo DamageInfoVar);
}
