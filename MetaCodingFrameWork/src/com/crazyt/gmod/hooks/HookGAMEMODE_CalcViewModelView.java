package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_CalcViewModelView extends MetaVarFunction{
	public HookGAMEMODE_CalcViewModelView(String n) {
		super(n);
	}
	/**
	Called to set the view model's position
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_CalcViewModelView(MetaVarEntity weaponVar,MetaVarEntity viewModelVar,MetaVarVector oldEyePositionVar,MetaVarAngle oldEyeAnglesVar,MetaVarVector eyePositionVar,MetaVarAngle eyeAnglesVar);
}
