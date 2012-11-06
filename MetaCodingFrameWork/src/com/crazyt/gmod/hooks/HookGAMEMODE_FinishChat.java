package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
@Hook("GAMEMODE_FinishChat")
public abstract class HookGAMEMODE_FinishChat extends MetaVarFunction{
	public HookGAMEMODE_FinishChat(String n) {
		super(n);
	}
	/**
	Runs when user cancels/finishes typing.
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_FinishChat();
}
