package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_ShouldCollide extends MetaVarFunction{
	public HookGAMEMODE_ShouldCollide(String n) {
		super(n);
	}
	/**
	Called whenever the engine wants to poll two entities should be able to collide.
	*/
	@SharedFunc
	public abstract MetaVar GAMEMODE_ShouldCollide(MetaVarEntity ent1Var,MetaVarEntity ent2Var);
}
