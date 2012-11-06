package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_KeyPress extends MetaVarFunction{
	public HookGAMEMODE_KeyPress(String n) {
		super(n);
	}
	/**
	Player pressed a key (see IN enums)
	*/
	@SharedFunc
	public abstract MetaVar GAMEMODE_KeyPress(MetaVarEntity playerVar,MetaVarNumber keyVar);
}
