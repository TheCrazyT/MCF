package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("CTakeDamageInfo")
public class MetaVarCTakeDamageInfo extends MetaVarImpl implements IMetaVarAny{
	public MetaVarCTakeDamageInfo(String n) {
		super(n);
	}
	/**
	Increases the damage by damageIncrease.
	*/
	@External
	@SharedFunc
	public MetaVar AddDamage(MetaVarNumber damageIncreaseVar){return null;};
	/**
	Returns the ammo type used by the weapon that inflicted the damage.
	*/
	@External
	@SharedFunc
	public MetaVarString GetAmmoType(){return null;};
	/**
	Returns the attacker for example a player that shot the weapon.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetAttacker(){return null;};
	/**
	Returns the initial unmodified damage.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetBaseDamage(){return null;};
	/**
	Returns the total damage.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetDamage(){return null;};
	/**
	Returns a vector representing the damage force.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetDamageForce(){return null;};
	/**
	Returns the position where the damage was or is going to be applied to.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetDamagePosition(){return null;};
	/**
	Returns a bitflag containing <a href="http://wiki.garrysmod.com/page/Enums/DMG" title="Enums/DMG">DMG_ Enums</a> which indicates the damage type(s) of the damage.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetDamageType(){return null;};
	/**
	Returns the inflictor of the damage aka. the weapon.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetInflictor(){return null;};
	/**
	Returns the maximum damage.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMaxDamage(){return null;};
	/**
	Returns the initial, unmodified position where the damage occured.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetReportedPosition(){return null;};
	/**
	Returns true if the damage was caused by a bullet.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsBulletDamage(){return null;};
	/**
	Returns whenever the damageinfo contains the damage type specified.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsDamageType(MetaVarNumber dmgTypeVar){return null;};
	/**
	Returns whenever the damageinfo contains explosion damage.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsExplosionDamage(){return null;};
	/**
	Returns whenever the damageinfo contains fall damage.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsFallDamage(){return null;};
	/**
	Scales the damage by the given value.
	*/
	@External
	@SharedFunc
	public MetaVar ScaleDamage(MetaVarNumber scaleVar){return null;};
	/**
	Sets the attacker of the damage for example a player.
	*/
	@External
	@SharedFunc
	public MetaVar SetAttacker(MetaVarEntity entVar){return null;};
	/**
	Sets the amount of damage.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamage(MetaVarNumber damageVar){return null;};
	/**
	Sets the directional force of the damage.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamageForce(MetaVarVector forceVar){return null;};
	/**
	Sets the position of where the damage gets applied to.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamagePosition(MetaVarVector posVar){return null;};
	/**
	Sets the damage type using <a href="http://wiki.garrysmod.com/page/Enums/DMG" title="Enums/DMG">DMG_ Enums</a>.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamageType(MetaVarNumber typeVar){return null;};
	/**
	Sets the inflictor of the damage for example a weapon.
	*/
	@External
	@SharedFunc
	public MetaVar SetInflictor(MetaVarEntity inflictorVar){return null;};
	/**
	Sets the maximum damage the object can cause.
	*/
	@External
	@SharedFunc
	public MetaVar SetMaxDamage(MetaVarNumber maxDamageVar){return null;};
	/**
	Subtracts the specified amount from the damage.
	*/
	@External
	@SharedFunc
	public MetaVar SubtractDamage(MetaVarNumber damageVar){return null;};
}
