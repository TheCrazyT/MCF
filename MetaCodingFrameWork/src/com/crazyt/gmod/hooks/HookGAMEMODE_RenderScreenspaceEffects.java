package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_RenderScreenspaceEffects")
public abstract class HookGAMEMODE_RenderScreenspaceEffects extends MetaVarFunctionImpl{
	public final static String INTERNAL_HOOK_NAME = "RenderScreenspaceEffects";
	public HookGAMEMODE_RenderScreenspaceEffects(String n) {
		super(n);
	}
	/**
	Used to render post processing effects such as bloom and color modify.
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_RenderScreenspaceEffects();
}
