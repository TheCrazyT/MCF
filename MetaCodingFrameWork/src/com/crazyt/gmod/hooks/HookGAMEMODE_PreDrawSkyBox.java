package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
@Hook("GAMEMODE_PreDrawSkyBox")
public abstract class HookGAMEMODE_PreDrawSkyBox extends MetaVarFunction{
	public HookGAMEMODE_PreDrawSkyBox(String n) {
		super(n);
	}
	/**
	Called before the sky box is drawn.
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_PreDrawSkyBox();
}
