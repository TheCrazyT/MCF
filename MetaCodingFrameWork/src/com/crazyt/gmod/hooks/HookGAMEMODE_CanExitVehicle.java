package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_CanExitVehicle")
public abstract class HookGAMEMODE_CanExitVehicle extends MetaVarFunctionImpl{
	public final static String INTERNAL_HOOK_NAME = "CanExitVehicle";
	public HookGAMEMODE_CanExitVehicle(String n) {
		super(n);
	}
	/**
	Determines if the player can exit the vehicle
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_CanExitVehicle(@SimpleName("vehicleVar")MetaVarEntity vehicleVar,@SimpleName("playerVar")MetaVarPlayer playerVar);
}
