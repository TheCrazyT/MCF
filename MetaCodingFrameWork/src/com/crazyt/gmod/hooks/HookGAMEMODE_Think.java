package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_Think extends MetaVarFunction{
	public HookGAMEMODE_Think(String n) {
		super(n);
	}
	/**
	Called every think.
	*/
	@SharedFunc
	public abstract MetaVar GAMEMODE_Think();
}