package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_AllowPlayerPickup")
public abstract class HookGAMEMODE_AllowPlayerPickup extends MetaVarFunctionImpl{
	public HookGAMEMODE_AllowPlayerPickup(String n) {
		super(n);
	}
	/**
	Called when a player tries to pick up something using the "use" key.
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_AllowPlayerPickup(@SimpleName("playerVar")MetaVarEntity playerVar,@SimpleName("EntityVar")MetaVarEntity EntityVar);
}
