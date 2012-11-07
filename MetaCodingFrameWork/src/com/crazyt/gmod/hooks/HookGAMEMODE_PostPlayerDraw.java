package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_PostPlayerDraw")
public abstract class HookGAMEMODE_PostPlayerDraw extends MetaVarFunctionImpl{
	public HookGAMEMODE_PostPlayerDraw(String n) {
		super(n);
	}
	/**
	Called before each player is drawn.
	*/
	@ClientFunc
	public abstract MetaVar GAMEMODE_PostPlayerDraw(@SimpleName("plyVar")MetaVarPlayer plyVar);
}
