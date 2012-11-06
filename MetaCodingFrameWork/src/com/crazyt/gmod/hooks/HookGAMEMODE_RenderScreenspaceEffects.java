package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_RenderScreenspaceEffects extends MetaVarFunction{
	public HookGAMEMODE_RenderScreenspaceEffects(String n) {
		super(n);
	}
	/**
	Used to render post processing effects such as bloom and color modify.
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_RenderScreenspaceEffects();
}
