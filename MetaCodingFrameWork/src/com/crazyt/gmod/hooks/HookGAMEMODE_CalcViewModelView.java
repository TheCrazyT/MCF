package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_CalcViewModelView")
public abstract class HookGAMEMODE_CalcViewModelView extends MetaVarFunctionImpl{
	public HookGAMEMODE_CalcViewModelView(String n) {
		super(n);
	}
	/**
	Called to set the view model's position
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_CalcViewModelView(@SimpleName("weaponVar")MetaVarEntity weaponVar,@SimpleName("viewModelVar")MetaVarEntity viewModelVar,@SimpleName("oldEyePositionVar")MetaVarVector oldEyePositionVar,@SimpleName("oldEyeAnglesVar")MetaVarAngle oldEyeAnglesVar,@SimpleName("eyePositionVar")MetaVarVector eyePositionVar,@SimpleName("eyeAnglesVar")MetaVarAngle eyeAnglesVar);
}
