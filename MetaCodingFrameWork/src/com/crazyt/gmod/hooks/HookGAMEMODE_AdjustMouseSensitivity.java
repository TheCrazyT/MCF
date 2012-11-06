package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_AdjustMouseSensitivity extends MetaVarFunction{
	public HookGAMEMODE_AdjustMouseSensitivity(String n) {
		super(n);
	}
	/**
	Allows you to adjust the mouse sensitivity
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_AdjustMouseSensitivity(MetaVarNumber defaultSensitivityVar);
}
