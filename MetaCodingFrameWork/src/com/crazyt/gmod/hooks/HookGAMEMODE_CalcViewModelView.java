package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_CalcViewModelView")
public abstract class HookGAMEMODE_CalcViewModelView extends MetaVarFunction{
	public HookGAMEMODE_CalcViewModelView(String n) {
		super(n);
	}
	/**
	Called to set the view model's position
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_CalcViewModelView(@SimpleName("weapon")MetaVarEntity weaponVar,@SimpleName("viewModel")MetaVarEntity viewModelVar,@SimpleName("oldEyePosition")MetaVarVector oldEyePositionVar,@SimpleName("oldEyeAngles")MetaVarAngle oldEyeAnglesVar,@SimpleName("eyePosition")MetaVarVector eyePositionVar,@SimpleName("eyeAngles")MetaVarAngle eyeAnglesVar);
}
