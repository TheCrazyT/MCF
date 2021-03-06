package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_PlayerSpray")
public abstract class HookGAMEMODE_PlayerSpray extends MetaVarFunctionImpl{
	public final static String INTERNAL_HOOK_NAME = "PlayerSpray";
	public HookGAMEMODE_PlayerSpray(String n) {
		super(n);
	}
	/**
	Called whenever a player sprayed his logo, return true to prevent the spray.
	*/
	@ServerFunc
	public abstract MetaVarBoolean GAMEMODE_PlayerSpray(@SimpleName("sprayerVar")MetaVarPlayer sprayerVar);
}
