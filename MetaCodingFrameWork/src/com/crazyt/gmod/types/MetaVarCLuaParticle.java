package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarCLuaParticleImpl.class)
public interface MetaVarCLuaParticle extends MetaVar,IMetaVarAny{
	/**
	Returns the air resistance of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetAirResistance();
	/**
	Returns the angular velocities for each axis.
	*/
	@External
	@ClientFunc
	public MetaVarAngle GetAngleVelocity();
	/**
	Returns the current orientation of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarAngle GetAngles();
	/**
	Returns the bounciness of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetBounce();
	/**
	Returns the color of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetColor();
	/**
	Gets the time in seconds after which the particle will be destroyed.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetDieTime();
	/**
	Gets the alpha value that the particle will reach on its death.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetEndAlpha();
	/**
	Gets the length that the particle will reach on its death.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetEndLength();
	/**
	Gets the size that the particle will reach on its death.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetEndSize();
	/**
	Gets the gravity of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarVector GetGravity();
	/**
	Gets how long in second, the particle exists(can be overridden by SetLifeTime).
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetLifeTime();
	/**
	Gets the absolute position of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarVector GetPos();
	/**
	Returns the current rotation of the particle in radians, this should only be used for 2d particles.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetRoll();
	/**
	Returns the current rotation speed of the particle in radians, this should only be used for 2d particles.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetRollDelta();
	/**
	Gets the alpha value which the particle has when its created.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetStartAlpha();
	/**
	Gets the length which the particle has when its created.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetStartLength();
	/**
	Gets the size which the particle has when its created.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetStartSize();
	/**
	Gets the current velocity of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarVector GetVelocity();
	/**
	Sets the air resistance of the the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetAirResistance(MetaVarNumber airResistanceVar);
	/**
	Sets the angular velocity of the the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetAngleVelocity(MetaVarAngle angVelVar);
	/**
	Sets the angles of the the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetAngles(MetaVarAngle angVar);
	/**
	Sets the bounciness of the the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetBounce(MetaVarNumber bounceVar);
	/**
	Sets the whenever the particle should collide with the world or not.
	*/
	@External
	@ClientFunc
	public MetaVar SetCollide(MetaVarBoolean doCollideVar);
	/**
	Sets the function that gets called whenever the particle collides with the world, the arguments passed to the function are:
<a href="http://wiki.garrysmod.com/page/Classes/CLuaParticle" title="Classes/CLuaParticle">CLuaParticle</a> part, <a href="http://wiki.garrysmod.com/page/Classes/Vector" title="Classes/Vector">Vector</a> hitPos, <a href="http://wiki.garrysmod.com/page/Classes/Vector" title="Classes/Vector">Vector</a> hitNormal.
	*/
	@External
	@ClientFunc
	public MetaVar SetCollideCallback(MetaVarFunction collideFuncVar);
	/**
	Sets the color of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetColor(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar);
	/**
	Sets the time where the particle will be removed.
	*/
	@External
	@ClientFunc
	public MetaVar SetDieTime(MetaVarNumber dieTimeVar);
	/**
	Sets the alpha of the particle that it will reach when it dies.
	*/
	@External
	@ClientFunc
	public MetaVar SetEndAlpha(MetaVarNumber endAlphaVar);
	/**
	Sets the length of the particle that it will reach when it dies.
	*/
	@External
	@ClientFunc
	public MetaVar SetEndLength(MetaVarNumber endLengthVar);
	/**
	Sets the size of the particle that it will reach when it dies.
	*/
	@External
	@ClientFunc
	public MetaVar SetEndSize(MetaVarNumber endSizeVar);
	/**
	Sets the directional gravity aka. acceleration of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetGravity(MetaVarVector gravityVar);
	/**
	Sets the time the particles life time.
	*/
	@External
	@ClientFunc
	public MetaVar SetLifeTime(MetaVarNumber lifeTimeVar);
	/**
	Sets whenever particles should be lighted.
	*/
	@External
	@ClientFunc
	public MetaVar SetLighting(MetaVarBoolean useLightingVar);
	/**
	Sets when the particles think function should be called next, this uses the synchronized server time returned by <a href="http://wiki.garrysmod.com/page/Global/CurTime" title="Global/CurTime">CurTime</a>.
	*/
	@External
	@ClientFunc
	public MetaVar SetNextThink(MetaVarNumber nextThinkVar);
	/**
	Sets the position of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetPos(MetaVarVector posVar);
	/**
	Sets the roll of the particle in radians.
	*/
	@External
	@ClientFunc
	public MetaVar SetRoll(MetaVarNumber rollVar);
	/**
	Sets the roll delta of the particle in radians.
	*/
	@External
	@ClientFunc
	public MetaVar SetRollDelta(MetaVarNumber rollDeltaVar);
	/**
	Sets the initial alpha value of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetStartAlpha(MetaVarNumber startAlphaVar);
	/**
	Sets the initial length value of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetStartLength(MetaVarNumber startLengthVar);
	/**
	Sets the initial size value of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetStartSize(MetaVarNumber startSizeVar);
	/**
	Sets the think function of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetThinkFunction(MetaVarFunction thinkFuncVar);
	/**
	Sets the velocity of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetVelocity(MetaVarVector velVar);
	/**
	Scales the velocity based on the particle speed.
	*/
	@External
	@ClientFunc
	public MetaVar SetVelocityScale(MetaVarBoolean doScaleVar);
	/**
	Overridden by the engine in order to clean up the CLuaParticle.
	*/
	@External
	@ClientFunc
	public MetaVar __gc();
}
