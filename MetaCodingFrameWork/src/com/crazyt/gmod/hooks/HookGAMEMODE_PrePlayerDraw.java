package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
@Hook("GAMEMODE_PrePlayerDraw")
public abstract class HookGAMEMODE_PrePlayerDraw extends MetaVarFunction{
	public HookGAMEMODE_PrePlayerDraw(String n) {
		super(n);
	}
	/**
	Called before each player is drawn.
	*/
	@ClientFunc
	public abstract MetaVarBoolean GAMEMODE_PrePlayerDraw(MetaVarPlayer plyVar);
}
