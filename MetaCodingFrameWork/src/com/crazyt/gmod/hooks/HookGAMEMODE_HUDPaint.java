package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_HUDPaint")
public abstract class HookGAMEMODE_HUDPaint extends MetaVarFunctionImpl{
	public HookGAMEMODE_HUDPaint(String n) {
		super(n);
	}
	/**
	Called whenever the HUD should be drawn
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_HUDPaint();
}
