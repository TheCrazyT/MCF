package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarCTakeDamageInfoImpl.class)
public interface MetaVarCTakeDamageInfo extends MetaVar,IMetaVarAny{
	/**
	Increases the damage by damageIncrease.
	*/
	@External
	@SharedFunc
	public MetaVar AddDamage(MetaVarNumber damageIncreaseVar);
	/**
	Returns the ammo type used by the weapon that inflicted the damage.
	*/
	@External
	@SharedFunc
	public MetaVarString GetAmmoType();
	/**
	Returns the attacker for example a player that shot the weapon.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetAttacker();
	/**
	Returns the initial unmodified damage.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetBaseDamage();
	/**
	Returns the total damage.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetDamage();
	/**
	Returns a vector representing the damage force.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetDamageForce();
	/**
	Returns the position where the damage was or is going to be applied to.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetDamagePosition();
	/**
	Returns a bitflag containing <a href="http://wiki.garrysmod.com/page/Enums/DMG" title="Enums/DMG">DMG_ Enums</a> which indicates the damage type(s) of the damage.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetDamageType();
	/**
	Returns the inflictor of the damage aka. the weapon.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetInflictor();
	/**
	Returns the maximum damage.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMaxDamage();
	/**
	Returns the initial, unmodified position where the damage occured.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetReportedPosition();
	/**
	Returns true if the damage was caused by a bullet.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsBulletDamage();
	/**
	Returns whenever the damageinfo contains the damage type specified.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsDamageType(MetaVarNumber dmgTypeVar);
	/**
	Returns whenever the damageinfo contains explosion damage.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsExplosionDamage();
	/**
	Returns whenever the damageinfo contains fall damage.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsFallDamage();
	/**
	Scales the damage by the given value.
	*/
	@External
	@SharedFunc
	public MetaVar ScaleDamage(MetaVarNumber scaleVar);
	/**
	Sets the attacker of the damage for example a player.
	*/
	@External
	@SharedFunc
	public MetaVar SetAttacker(MetaVarEntity entVar);
	/**
	Sets the amount of damage.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamage(MetaVarNumber damageVar);
	/**
	Sets the directional force of the damage.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamageForce(MetaVarVector forceVar);
	/**
	Sets the position of where the damage gets applied to.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamagePosition(MetaVarVector posVar);
	/**
	Sets the damage type using <a href="http://wiki.garrysmod.com/page/Enums/DMG" title="Enums/DMG">DMG_ Enums</a>.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamageType(MetaVarNumber typeVar);
	/**
	Sets the inflictor of the damage for example a weapon.
	*/
	@External
	@SharedFunc
	public MetaVar SetInflictor(MetaVarEntity inflictorVar);
	/**
	Sets the maximum damage the object can cause.
	*/
	@External
	@SharedFunc
	public MetaVar SetMaxDamage(MetaVarNumber maxDamageVar);
	/**
	Subtracts the specified amount from the damage.
	*/
	@External
	@SharedFunc
	public MetaVar SubtractDamage(MetaVarNumber damageVar);
}
