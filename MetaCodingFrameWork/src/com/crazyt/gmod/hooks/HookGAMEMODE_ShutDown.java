package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_ShutDown")
public abstract class HookGAMEMODE_ShutDown extends MetaVarFunctionImpl{
	public HookGAMEMODE_ShutDown(String n) {
		super(n);
	}
	/**
	Called whenever the Lua enviroment is about to be shut down.
	*/
	@SharedFunc
	public abstract MetaVar GAMEMODE_ShutDown();
}
