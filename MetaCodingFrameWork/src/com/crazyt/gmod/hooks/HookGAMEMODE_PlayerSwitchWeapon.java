package com.crazyt.gmod.hooks;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.Hook;
import com.crazyt.mcf.SimpleName;
@Hook("GAMEMODE_PlayerSwitchWeapon")
public abstract class HookGAMEMODE_PlayerSwitchWeapon extends MetaVarFunctionImpl{
	public HookGAMEMODE_PlayerSwitchWeapon(String n) {
		super(n);
	}
	/**
	Called when a player switched their weapon.
	*/
	@ServerFunc
	public abstract MetaVar GAMEMODE_PlayerSwitchWeapon(@SimpleName("playerVar")MetaVarPlayer playerVar,@SimpleName("oldWeaponVar")MetaVarWeapon oldWeaponVar,@SimpleName("newWeaponVar")MetaVarWeapon newWeaponVar);
}
