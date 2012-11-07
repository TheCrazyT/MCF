package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_StartChat")
public abstract class HookGAMEMODE_StartChat extends MetaVarFunctionImpl{
	public HookGAMEMODE_StartChat(String n) {
		super(n);
	}
	/**
	Runs when the user starts typing (opens the chatbox).
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_StartChat(@SimpleName("TeamChatVar")MetaVarNumber TeamChatVar);
}
