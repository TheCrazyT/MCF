package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
@Hook("GAMEMODE_PlayerSpray")
public abstract class HookGAMEMODE_PlayerSpray extends MetaVarFunction{
	public HookGAMEMODE_PlayerSpray(String n) {
		super(n);
	}
	/**
	Called whenever a player sprayed his logo, return true to prevent the spray.
	*/
	@ServerFunc
	public abstract MetaVarBoolean GAMEMODE_PlayerSpray(MetaVarPlayer sprayerVar);
}
