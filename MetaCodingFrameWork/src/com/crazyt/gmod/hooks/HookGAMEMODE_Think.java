package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_Think")
public abstract class HookGAMEMODE_Think extends MetaVarFunctionImpl{
	public HookGAMEMODE_Think(String n) {
		super(n);
	}
	/**
	Called every think.
	*/
	@SharedFunc
	public abstract MetaVar GAMEMODE_Think();
}
