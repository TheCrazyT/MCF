package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_PostRender extends MetaVarFunction{
	public HookGAMEMODE_PostRender(String n) {
		super(n);
	}
	/**
	Called after the frame has been rendered.
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_PostRender();
}
