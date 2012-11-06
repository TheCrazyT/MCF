package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_PostPlayerDraw extends MetaVarFunction{
	public HookGAMEMODE_PostPlayerDraw(String n) {
		super(n);
	}
	/**
	Called before each player is drawn.
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_PostPlayerDraw(MetaVarPlayer plyVar);
}
