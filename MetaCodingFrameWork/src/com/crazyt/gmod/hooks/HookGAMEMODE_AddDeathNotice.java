package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_AddDeathNotice")
public abstract class HookGAMEMODE_AddDeathNotice extends MetaVarFunction{
	public HookGAMEMODE_AddDeathNotice(String n) {
		super(n);
	}
	/**
	Adds an death notice entry
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_AddDeathNotice(@SimpleName("victim")MetaVarString victimVar,@SimpleName("victimsTeam")MetaVarNumber victimsTeamVar,@SimpleName("inflictor")MetaVarString inflictorVar,@SimpleName("attacker")MetaVarString attackerVar,@SimpleName("attackersTeam")MetaVarNumber attackersTeamVar);
}
