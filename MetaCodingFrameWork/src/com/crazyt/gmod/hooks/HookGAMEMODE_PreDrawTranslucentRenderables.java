package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_PreDrawTranslucentRenderables")
public abstract class HookGAMEMODE_PreDrawTranslucentRenderables extends MetaVarFunctionImpl{
	public HookGAMEMODE_PreDrawTranslucentRenderables(String n) {
		super(n);
	}
	/**
	Called before all the translucent entities are drawn.
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_PreDrawTranslucentRenderables();
}
