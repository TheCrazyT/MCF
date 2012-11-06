package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_KeyRelease extends MetaVarFunction{
	public HookGAMEMODE_KeyRelease(String n) {
		super(n);
	}
	/**
	Runs when a key has been released. (see IN enums)
	*/
	@SharedFunc
	public abstract MetaVar GAMEMODE_KeyRelease(MetaVarEntity playerVar,MetaVarNumber keyVar);
}
