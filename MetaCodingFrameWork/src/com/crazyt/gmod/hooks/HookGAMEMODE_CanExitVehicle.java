package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
@Hook("GAMEMODE_CanExitVehicle")
public abstract class HookGAMEMODE_CanExitVehicle extends MetaVarFunction{
	public HookGAMEMODE_CanExitVehicle(String n) {
		super(n);
	}
	/**
	Determines if the player can exit the vehicle
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_CanExitVehicle(MetaVarEntity vehicleVar,MetaVarPlayer playerVar);
}
