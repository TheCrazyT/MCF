package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("CEffectData")
public class MetaVarCEffectDataImpl extends MetaVarImpl implements MetaVarCEffectData{
	/**
	Gets the angles of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarAngle GetAngles(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the attachment id for the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetAttachment(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the byte which represents the color of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetColor(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the damage type of the effect using <a href="http://wiki.garrysmod.com/page/Enums/DMG" title="Enums/DMG">DMG_ Enumss</a>.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetDamageType(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the entity index of the entity set for the effect.
	*/
	@External
	@ServerFunc
	public MetaVarNumber GetEntIndex(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the entity assigned to the effect.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetEntity(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the flags of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetFlags(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the hit box index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetHitBox(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the magnitude of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMagnitude(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the material index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMaterialIndex(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the normal of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetNormal(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the origin position of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetOrigin(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the radius of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetRadius(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the scale of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetScale(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the start position of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetStart(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the surface property index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetSurfaceProp(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the angle of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetAngles(MetaVarAngle effectAnglesVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the attachment id of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetAttachment(MetaVarNumber attachmentIDVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the color of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetColor(MetaVarNumber colorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the damage type of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamageType(MetaVarNumber damageTypeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the entity of the effect via its index.
	*/
	@External
	@ServerFunc
	public MetaVar SetEntIndex(MetaVarNumber entIndexVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the entity of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetEntity(MetaVarEntity entityVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the flags of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetFlags(MetaVarNumber flagsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the hit box index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetHitBox(MetaVarNumber hitBoxIndexVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the magnitude of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetMagnitude(MetaVarNumber magnitudeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the material index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetMaterialIndex(MetaVarNumber materialIndexVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the normal of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetNormal(MetaVarVector normalVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the origin of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetOrigin(MetaVarVector originVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the radius of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetRadius(MetaVarNumber radiusVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the scale of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetScale(MetaVarNumber scaleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the start of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetStart(MetaVarVector startVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the surface property index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetSurfaceProp(MetaVarNumber surfacePropertiesVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarCEffectDataImpl(String n) {
		super(n);
	}
}
