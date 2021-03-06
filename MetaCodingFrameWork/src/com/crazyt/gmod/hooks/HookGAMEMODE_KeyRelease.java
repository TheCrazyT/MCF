package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_KeyRelease")
public abstract class HookGAMEMODE_KeyRelease extends MetaVarFunctionImpl{
	public final static String INTERNAL_HOOK_NAME = "KeyRelease";
	public HookGAMEMODE_KeyRelease(String n) {
		super(n);
	}
	/**
	Runs when a key has been released. (see IN enums)
	*/
	@SharedFunc
	public abstract MetaVar GAMEMODE_KeyRelease(@SimpleName("playerVar")MetaVarEntity playerVar,@SimpleName("keyVar")MetaVarNumber keyVar);
}
