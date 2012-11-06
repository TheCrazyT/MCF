package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_PlayerCanHearPlayersVoice")
public abstract class HookGAMEMODE_PlayerCanHearPlayersVoice extends MetaVarFunction{
	public HookGAMEMODE_PlayerCanHearPlayersVoice(String n) {
		super(n);
	}
	/**
	Polls if a player can be heard by another player.
	*/
	@ServerFunc
	public abstract MetaVarBoolean GAMEMODE_PlayerCanHearPlayersVoice(@SimpleName("listener")MetaVarPlayer listenerVar,@SimpleName("talker")MetaVarPlayer talkerVar);
}
