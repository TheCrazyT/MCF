package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_CalcView")
public abstract class HookGAMEMODE_CalcView extends MetaVarFunction{
	public HookGAMEMODE_CalcView(String n) {
		super(n);
	}
	/**
	Allows override of the default view.
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_CalcView(@SimpleName("player")MetaVarEntity playerVar,@SimpleName("origin")MetaVarVector originVar,@SimpleName("angles")MetaVarAngle anglesVar,@SimpleName("fov")MetaVarNumber fovVar,@SimpleName("nearZ")MetaVarNumber nearZVar,@SimpleName("farZ")MetaVarNumber farZVar);
}
