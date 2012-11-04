package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("CEffectData")
public class MetaVarCEffectData extends MetaVarImpl implements IMetaVarAny{
	public MetaVarCEffectData(String n) {
		super(n);
	}
	/**
	Gets the angles of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarAngle GetAngles(){return null;};
	/**
	Returns the attachment id for the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetAttachment(){return null;};
	/**
	Gets the byte which represents the color of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetColor(){return null;};
	/**
	Gets the damage type of the effect using <a href="http://wiki.garrysmod.com/page/Enums/DMG" title="Enums/DMG">DMG_ Enumss</a>.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetDamageType(){return null;};
	/**
	Returns the entity index of the entity set for the effect.
	*/
	@External
	@ServerFunc
	public MetaVarNumber GetEntIndex(){return null;};
	/**
	Gets the entity assigned to the effect.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetEntity(){return null;};
	/**
	Gets the flags of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetFlags(){return null;};
	/**
	Gets the hit box index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetHitBox(){return null;};
	/**
	Returns the magnitude of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMagnitude(){return null;};
	/**
	Returns the material index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMaterialIndex(){return null;};
	/**
	Gets the normal of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetNormal(){return null;};
	/**
	Returns the origin position of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetOrigin(){return null;};
	/**
	Gets the radius of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetRadius(){return null;};
	/**
	Gets the scale of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetScale(){return null;};
	/**
	Returns the start position of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetStart(){return null;};
	/**
	Returns the surface property index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetSurfaceProp(){return null;};
	/**
	Sets the angle of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetAngles(MetaVarAngle effectAnglesVar){return null;};
	/**
	Sets the attachment id of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetAttachment(MetaVarNumber attachmentIDVar){return null;};
	/**
	Sets the color of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetColor(MetaVarNumber colorVar){return null;};
	/**
	Sets the damage type of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamageType(MetaVarNumber damageTypeVar){return null;};
	/**
	Sets the entity of the effect via its index.
	*/
	@External
	@ServerFunc
	public MetaVar SetEntIndex(MetaVarNumber entIndexVar){return null;};
	/**
	Sets the entity of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetEntity(MetaVarEntity entityVar){return null;};
	/**
	Sets the flags of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetFlags(MetaVarNumber flagsVar){return null;};
	/**
	Sets the hit box index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetHitBox(MetaVarNumber hitBoxIndexVar){return null;};
	/**
	Sets the magnitude of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetMagnitude(MetaVarNumber magnitudeVar){return null;};
	/**
	Sets the material index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetMaterialIndex(MetaVarNumber materialIndexVar){return null;};
	/**
	Sets the normal of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetNormal(MetaVarVector normalVar){return null;};
	/**
	Sets the origin of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetOrigin(MetaVarVector originVar){return null;};
	/**
	Sets the radius of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetRadius(MetaVarNumber radiusVar){return null;};
	/**
	Sets the scale of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetScale(MetaVarNumber scaleVar){return null;};
	/**
	Sets the start of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetStart(MetaVarVector startVar){return null;};
	/**
	Sets the surface property index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetSurfaceProp(MetaVarNumber surfacePropertiesVar){return null;};
}
