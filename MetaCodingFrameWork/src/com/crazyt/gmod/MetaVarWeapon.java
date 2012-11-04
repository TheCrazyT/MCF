package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("Weapon")
public class MetaVarWeapon extends MetaVarImpl implements IMetaVarAny{
	public MetaVarWeapon(String n) {
		super(n);
	}
	/**
	Returns how much primary ammo is in clip.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Clip1(){return null;};
	/**
	Returns how much secondary ammo is in clip.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Clip2(){return null;};
	/**
	Returns the hold type of the weapon.
	*/
	@External
	@SharedFunc
	public MetaVarString GetHoldType(){return null;};
	/**
	Returns the non internal name of the weapon, that should be for displaying.
	*/
	@External
	@ClientFunc
	public MetaVarString GetPrintName(){return null;};
	/**
	Returns whenever the weapon is carried by the local player.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsCarriedByLocalPlayer(){return null;};
	/**
	Checks if the entity is a NPC or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsNPC(){return null;};
	/**
	Checks if the entity is a player or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsPlayer(){return null;};
	/**
	Checks if the entity is a vehicle or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsVehicle(){return null;};
	/**
	Checks if the entity is a weapon or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsWeapon(){return null;};
}
