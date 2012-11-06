package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_ShutDown extends MetaVarFunction{
	public HookGAMEMODE_ShutDown(String n) {
		super(n);
	}
	/**
	Called whenever the Lua enviroment is about to be shut down.
	*/
	@SharedFunc
	public abstract MetaVar GAMEMODE_ShutDown();
}
