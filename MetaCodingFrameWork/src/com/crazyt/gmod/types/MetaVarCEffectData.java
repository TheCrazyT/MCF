package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarCEffectDataImpl.class)
public interface MetaVarCEffectData extends MetaVar,IMetaVarAny{
	/**
	Gets the angles of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarAngle GetAngles();
	/**
	Returns the attachment id for the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetAttachment();
	/**
	Gets the byte which represents the color of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetColor();
	/**
	Gets the damage type of the effect using <a href="http://wiki.garrysmod.com/page/Enums/DMG" title="Enums/DMG">DMG_ Enumss</a>.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetDamageType();
	/**
	Returns the entity index of the entity set for the effect.
	*/
	@External
	@ServerFunc
	public MetaVarNumber GetEntIndex();
	/**
	Gets the entity assigned to the effect.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetEntity();
	/**
	Gets the flags of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetFlags();
	/**
	Gets the hit box index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetHitBox();
	/**
	Returns the magnitude of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMagnitude();
	/**
	Returns the material index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMaterialIndex();
	/**
	Gets the normal of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetNormal();
	/**
	Returns the origin position of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetOrigin();
	/**
	Gets the radius of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetRadius();
	/**
	Gets the scale of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetScale();
	/**
	Returns the start position of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetStart();
	/**
	Returns the surface property index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetSurfaceProp();
	/**
	Sets the angle of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetAngles(MetaVarAngle effectAnglesVar);
	/**
	Sets the attachment id of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetAttachment(MetaVarNumber attachmentIDVar);
	/**
	Sets the color of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetColor(MetaVarNumber colorVar);
	/**
	Sets the damage type of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamageType(MetaVarNumber damageTypeVar);
	/**
	Sets the entity of the effect via its index.
	*/
	@External
	@ServerFunc
	public MetaVar SetEntIndex(MetaVarNumber entIndexVar);
	/**
	Sets the entity of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetEntity(MetaVarEntity entityVar);
	/**
	Sets the flags of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetFlags(MetaVarNumber flagsVar);
	/**
	Sets the hit box index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetHitBox(MetaVarNumber hitBoxIndexVar);
	/**
	Sets the magnitude of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetMagnitude(MetaVarNumber magnitudeVar);
	/**
	Sets the material index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetMaterialIndex(MetaVarNumber materialIndexVar);
	/**
	Sets the normal of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetNormal(MetaVarVector normalVar);
	/**
	Sets the origin of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetOrigin(MetaVarVector originVar);
	/**
	Sets the radius of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetRadius(MetaVarNumber radiusVar);
	/**
	Sets the scale of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetScale(MetaVarNumber scaleVar);
	/**
	Sets the start of the effect to be created with this effect data.
	*/
	@External
	@SharedFunc
	public MetaVar SetStart(MetaVarVector startVar);
	/**
	Sets the surface property index of the effect.
	*/
	@External
	@SharedFunc
	public MetaVar SetSurfaceProp(MetaVarNumber surfacePropertiesVar);
}
