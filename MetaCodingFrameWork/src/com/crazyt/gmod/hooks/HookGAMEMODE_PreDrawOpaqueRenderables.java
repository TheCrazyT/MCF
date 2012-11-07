package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_PreDrawOpaqueRenderables")
public abstract class HookGAMEMODE_PreDrawOpaqueRenderables extends MetaVarFunctionImpl{
	public final static String INTERNAL_HOOK_NAME = "PreDrawOpaqueRenderables";
	public HookGAMEMODE_PreDrawOpaqueRenderables(String n) {
		super(n);
	}
	/**
	Called before all the opaque entities are drawn.
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_PreDrawOpaqueRenderables();
}
