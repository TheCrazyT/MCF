package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_PlayerUse")
public abstract class HookGAMEMODE_PlayerUse extends MetaVarFunction{
	public HookGAMEMODE_PlayerUse(String n) {
		super(n);
	}
	/**
	Called when a player tries to "use" an entity.
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_PlayerUse(@SimpleName("player")MetaVarEntity playerVar,@SimpleName("Entity")MetaVarEntity EntityVar);
}
