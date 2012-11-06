package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
@Hook("GAMEMODE_Initialize")
public abstract class HookGAMEMODE_Initialize extends MetaVarFunction{
	public HookGAMEMODE_Initialize(String n) {
		super(n);
	}
	/**
	Called after the gamemode loads and starts
	*/
	@SharedFunc
	public abstract MetaVar GAMEMODE_Initialize();
}
