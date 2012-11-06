package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_PreDrawTranslucentRenderables extends MetaVarFunction{
	public HookGAMEMODE_PreDrawTranslucentRenderables(String n) {
		super(n);
	}
	/**
	Called before all the translucent entities are drawn.
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_PreDrawTranslucentRenderables();
}
