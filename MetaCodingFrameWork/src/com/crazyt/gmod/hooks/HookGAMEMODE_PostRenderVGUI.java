package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_PostRenderVGUI")
public abstract class HookGAMEMODE_PostRenderVGUI extends MetaVarFunctionImpl{
	public HookGAMEMODE_PostRenderVGUI(String n) {
		super(n);
	}
	/**
	Called after the VGUI has been drawn.
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_PostRenderVGUI();
}
