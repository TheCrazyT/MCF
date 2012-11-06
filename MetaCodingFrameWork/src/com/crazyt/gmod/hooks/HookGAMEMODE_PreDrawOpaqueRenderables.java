package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_PreDrawOpaqueRenderables extends MetaVarFunction{
	public HookGAMEMODE_PreDrawOpaqueRenderables(String n) {
		super(n);
	}
	/**
	Called before all the opaque entities are drawn.
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_PreDrawOpaqueRenderables();
}
