package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
@Hook("GAMEMODE_HUDPaint")
public abstract class HookGAMEMODE_HUDPaint extends MetaVarFunction{
	public HookGAMEMODE_HUDPaint(String n) {
		super(n);
	}
	/**
	Called whenever the HUD should be drawn
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_HUDPaint();
}
