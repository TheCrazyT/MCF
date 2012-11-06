package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
public abstract class HookGAMEMODE_PlayerSwitchWeapon extends MetaVarFunction{
	public HookGAMEMODE_PlayerSwitchWeapon(String n) {
		super(n);
	}
	/**
	Called when a player switched their weapon.
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_PlayerSwitchWeapon(MetaVarPlayer playerVar,MetaVarWeapon oldWeaponVar,MetaVarWeapon newWeaponVar);
}
