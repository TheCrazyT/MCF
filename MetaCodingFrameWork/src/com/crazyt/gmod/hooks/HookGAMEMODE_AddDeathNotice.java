package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_AddDeathNotice extends MetaVarFunction{
	public HookGAMEMODE_AddDeathNotice(String n) {
		super(n);
	}
	/**
	Adds an death notice entry
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_AddDeathNotice(MetaVarString victimVar,MetaVarNumber victimsTeamVar,MetaVarString inflictorVar,MetaVarString attackerVar,MetaVarNumber attackersTeamVar);
}
