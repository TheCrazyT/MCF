package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_HUDPaintBackground")
public abstract class HookGAMEMODE_HUDPaintBackground extends MetaVarFunctionImpl{
	public final static String INTERNAL_HOOK_NAME = "HUDPaintBackground";
	public HookGAMEMODE_HUDPaintBackground(String n) {
		super(n);
	}
	/**
	Called whenever the HUD background is being drawn.
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_HUDPaintBackground();
}
