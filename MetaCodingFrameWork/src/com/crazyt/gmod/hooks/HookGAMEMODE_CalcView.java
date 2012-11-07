package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_CalcView")
public abstract class HookGAMEMODE_CalcView extends MetaVarFunctionImpl{
	public HookGAMEMODE_CalcView(String n) {
		super(n);
	}
	/**
	Allows override of the default view.
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_CalcView(@SimpleName("playerVar")MetaVarEntity playerVar,@SimpleName("originVar")MetaVarVector originVar,@SimpleName("anglesVar")MetaVarAngle anglesVar,@SimpleName("fovVar")MetaVarNumber fovVar,@SimpleName("nearZVar")MetaVarNumber nearZVar,@SimpleName("farZVar")MetaVarNumber farZVar);
}
