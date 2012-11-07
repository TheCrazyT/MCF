package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("CTakeDamageInfo")
public class MetaVarCTakeDamageInfoImpl extends MetaVarImpl implements MetaVarCTakeDamageInfo{
	/**
	Increases the damage by damageIncrease.
	*/
	@External
	@SharedFunc
	public MetaVar AddDamage(MetaVarNumber damageIncreaseVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the ammo type used by the weapon that inflicted the damage.
	*/
	@External
	@SharedFunc
	public MetaVarString GetAmmoType(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the attacker for example a player that shot the weapon.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetAttacker(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the initial unmodified damage.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetBaseDamage(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the total damage.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetDamage(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a vector representing the damage force.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetDamageForce(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the position where the damage was or is going to be applied to.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetDamagePosition(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a bitflag containing <a href="http://wiki.garrysmod.com/page/Enums/DMG" title="Enums/DMG">DMG_ Enums</a> which indicates the damage type(s) of the damage.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetDamageType(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the inflictor of the damage aka. the weapon.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetInflictor(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the maximum damage.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMaxDamage(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the initial, unmodified position where the damage occured.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetReportedPosition(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns true if the damage was caused by a bullet.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsBulletDamage(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the damageinfo contains the damage type specified.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsDamageType(MetaVarNumber dmgTypeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the damageinfo contains explosion damage.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsExplosionDamage(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the damageinfo contains fall damage.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsFallDamage(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Scales the damage by the given value.
	*/
	@External
	@SharedFunc
	public MetaVar ScaleDamage(MetaVarNumber scaleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the attacker of the damage for example a player.
	*/
	@External
	@SharedFunc
	public MetaVar SetAttacker(MetaVarEntity entVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the amount of damage.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamage(MetaVarNumber damageVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the directional force of the damage.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamageForce(MetaVarVector forceVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the position of where the damage gets applied to.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamagePosition(MetaVarVector posVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the damage type using <a href="http://wiki.garrysmod.com/page/Enums/DMG" title="Enums/DMG">DMG_ Enums</a>.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamageType(MetaVarNumber typeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the inflictor of the damage for example a weapon.
	*/
	@External
	@SharedFunc
	public MetaVar SetInflictor(MetaVarEntity inflictorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the maximum damage the object can cause.
	*/
	@External
	@SharedFunc
	public MetaVar SetMaxDamage(MetaVarNumber maxDamageVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Subtracts the specified amount from the damage.
	*/
	@External
	@SharedFunc
	public MetaVar SubtractDamage(MetaVarNumber damageVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarCTakeDamageInfoImpl(String n) {
		super(n);
	}
}
