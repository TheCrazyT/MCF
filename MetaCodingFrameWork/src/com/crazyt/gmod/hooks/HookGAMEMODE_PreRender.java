package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
@Hook("GAMEMODE_PreRender")
public abstract class HookGAMEMODE_PreRender extends MetaVarFunction{
	public HookGAMEMODE_PreRender(String n) {
		super(n);
	}
	/**
	Called before the renderer is about to start rendering the next frame.
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_PreRender();
}
