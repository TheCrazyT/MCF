package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_AdjustMouseSensitivity")
public abstract class HookGAMEMODE_AdjustMouseSensitivity extends MetaVarFunction{
	public HookGAMEMODE_AdjustMouseSensitivity(String n) {
		super(n);
	}
	/**
	Allows you to adjust the mouse sensitivity
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_AdjustMouseSensitivity(@SimpleName("defaultSensitivityVar")MetaVarNumber defaultSensitivityVar);
}
