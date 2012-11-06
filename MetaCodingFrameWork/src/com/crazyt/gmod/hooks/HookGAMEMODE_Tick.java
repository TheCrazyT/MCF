package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_Tick extends MetaVarFunction{
	public HookGAMEMODE_Tick(String n) {
		super(n);
	}
	/**
	Called every server tick.
	*/
	@SharedFunc
	public abstract MetaVar GAMEMODE_Tick();
}
