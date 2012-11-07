package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarWeaponImpl.class)
public interface MetaVarWeapon extends MetaVar,IMetaVarAny{
	/**
	Returns how much primary ammo is in clip.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Clip1();
	/**
	Returns how much secondary ammo is in clip.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Clip2();
	/**
	Returns the hold type of the weapon.
	*/
	@External
	@SharedFunc
	public MetaVarString GetHoldType();
	/**
	Returns the non internal name of the weapon, that should be for displaying.
	*/
	@External
	@ClientFunc
	public MetaVarString GetPrintName();
	/**
	Returns whenever the weapon is carried by the local player.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsCarriedByLocalPlayer();
	/**
	Checks if the entity is a NPC or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsNPC();
	/**
	Checks if the entity is a player or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsPlayer();
	/**
	Checks if the entity is a vehicle or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsVehicle();
	/**
	Checks if the entity is a weapon or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsWeapon();
}
