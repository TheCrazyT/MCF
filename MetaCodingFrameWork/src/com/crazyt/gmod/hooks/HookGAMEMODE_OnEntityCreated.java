package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_OnEntityCreated")
public abstract class HookGAMEMODE_OnEntityCreated extends MetaVarFunction{
	public HookGAMEMODE_OnEntityCreated(String n) {
		super(n);
	}
	/**
	Called right after the Entity has been made visible to Lua.
	*/
	@SharedFunc
	public abstract MetaVar GAMEMODE_OnEntityCreated(@SimpleName("entity")MetaVarEntity entityVar);
}
