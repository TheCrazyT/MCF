package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_CalcView extends MetaVarFunction{
	public HookGAMEMODE_CalcView(String n) {
		super(n);
	}
	/**
	Allows override of the default view.
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_CalcView(MetaVarEntity playerVar,MetaVarVector originVar,MetaVarAngle anglesVar,MetaVarNumber fovVar,MetaVarNumber nearZVar,MetaVarNumber farZVar);
}
