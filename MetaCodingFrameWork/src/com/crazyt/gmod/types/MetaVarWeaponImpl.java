package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("Weapon")
public class MetaVarWeaponImpl extends MetaVarImpl implements MetaVarWeapon{
	/**
	Returns how much primary ammo is in clip.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Clip1(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns how much secondary ammo is in clip.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Clip2(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the hold type of the weapon.
	*/
	@External
	@SharedFunc
	public MetaVarString GetHoldType(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the non internal name of the weapon, that should be for displaying.
	*/
	@External
	@ClientFunc
	public MetaVarString GetPrintName(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the weapon is carried by the local player.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsCarriedByLocalPlayer(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks if the entity is a NPC or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsNPC(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks if the entity is a player or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsPlayer(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks if the entity is a vehicle or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsVehicle(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks if the entity is a weapon or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsWeapon(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarWeaponImpl(String n) {
		super(n);
	}
}
