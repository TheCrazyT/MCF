package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
@Hook("GAMEMODE_InitPostEntity")
public abstract class HookGAMEMODE_InitPostEntity extends MetaVarFunction{
	public HookGAMEMODE_InitPostEntity(String n) {
		super(n);
	}
	/**
	Called after all the entities are initialized
	*/
	@SharedFunc
	public abstract MetaVar GAMEMODE_InitPostEntity();
}
