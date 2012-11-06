package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
@Hook("GAMEMODE_AllowPlayerPickup")
public abstract class HookGAMEMODE_AllowPlayerPickup extends MetaVarFunction{
	public HookGAMEMODE_AllowPlayerPickup(String n) {
		super(n);
	}
	/**
	Called when a player tries to pick up something using the "use" key.
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_AllowPlayerPickup(MetaVarEntity playerVar,MetaVarEntity EntityVar);
}
