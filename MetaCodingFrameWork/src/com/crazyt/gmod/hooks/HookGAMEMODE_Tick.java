package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_Tick")
public abstract class HookGAMEMODE_Tick extends MetaVarFunctionImpl{
	public final static String INTERNAL_HOOK_NAME = "Tick";
	public HookGAMEMODE_Tick(String n) {
		super(n);
	}
	/**
	Called every server tick.
	*/
	@SharedFunc
	public abstract MetaVar GAMEMODE_Tick();
}
