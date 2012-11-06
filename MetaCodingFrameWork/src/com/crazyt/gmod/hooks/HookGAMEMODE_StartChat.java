package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_StartChat extends MetaVarFunction{
	public HookGAMEMODE_StartChat(String n) {
		super(n);
	}
	/**
	Runs when the user starts typing (opens the chatbox).
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_StartChat(MetaVarNumber TeamChatVar);
}
