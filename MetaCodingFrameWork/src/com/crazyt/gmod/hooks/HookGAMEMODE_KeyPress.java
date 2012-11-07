package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_KeyPress")
public abstract class HookGAMEMODE_KeyPress extends MetaVarFunctionImpl{
	public final static String INTERNAL_HOOK_NAME = "KeyPress";
	public HookGAMEMODE_KeyPress(String n) {
		super(n);
	}
	/**
	Player pressed a key (see IN enums)
	*/
	@SharedFunc
	public abstract MetaVar GAMEMODE_KeyPress(@SimpleName("playerVar")MetaVarEntity playerVar,@SimpleName("keyVar")MetaVarNumber keyVar);
}
