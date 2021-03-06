package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("CLuaParticle")
public class MetaVarCLuaParticleImpl extends MetaVarImpl implements MetaVarCLuaParticle{
	/**
	Returns the air resistance of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetAirResistance(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the angular velocities for each axis.
	*/
	@External
	@ClientFunc
	public MetaVarAngle GetAngleVelocity(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the current orientation of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarAngle GetAngles(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the bounciness of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetBounce(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the color of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetColor(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the time in seconds after which the particle will be destroyed.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetDieTime(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the alpha value that the particle will reach on its death.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetEndAlpha(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the length that the particle will reach on its death.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetEndLength(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the size that the particle will reach on its death.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetEndSize(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the gravity of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarVector GetGravity(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets how long in second, the particle exists(can be overridden by SetLifeTime).
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetLifeTime(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the absolute position of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarVector GetPos(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the current rotation of the particle in radians, this should only be used for 2d particles.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetRoll(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the current rotation speed of the particle in radians, this should only be used for 2d particles.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetRollDelta(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the alpha value which the particle has when its created.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetStartAlpha(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the length which the particle has when its created.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetStartLength(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the size which the particle has when its created.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetStartSize(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the current velocity of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarVector GetVelocity(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the air resistance of the the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetAirResistance(MetaVarNumber airResistanceVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the angular velocity of the the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetAngleVelocity(MetaVarAngle angVelVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the angles of the the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetAngles(MetaVarAngle angVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the bounciness of the the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetBounce(MetaVarNumber bounceVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the whenever the particle should collide with the world or not.
	*/
	@External
	@ClientFunc
	public MetaVar SetCollide(MetaVarBoolean doCollideVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the function that gets called whenever the particle collides with the world, the arguments passed to the function are:
<a href="http://wiki.garrysmod.com/page/Classes/CLuaParticle" title="Classes/CLuaParticle">CLuaParticle</a> part, <a href="http://wiki.garrysmod.com/page/Classes/Vector" title="Classes/Vector">Vector</a> hitPos, <a href="http://wiki.garrysmod.com/page/Classes/Vector" title="Classes/Vector">Vector</a> hitNormal.
	*/
	@External
	@ClientFunc
	public MetaVar SetCollideCallback(MetaVarFunction collideFuncVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the color of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetColor(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the time where the particle will be removed.
	*/
	@External
	@ClientFunc
	public MetaVar SetDieTime(MetaVarNumber dieTimeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the alpha of the particle that it will reach when it dies.
	*/
	@External
	@ClientFunc
	public MetaVar SetEndAlpha(MetaVarNumber endAlphaVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the length of the particle that it will reach when it dies.
	*/
	@External
	@ClientFunc
	public MetaVar SetEndLength(MetaVarNumber endLengthVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the size of the particle that it will reach when it dies.
	*/
	@External
	@ClientFunc
	public MetaVar SetEndSize(MetaVarNumber endSizeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the directional gravity aka. acceleration of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetGravity(MetaVarVector gravityVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the time the particles life time.
	*/
	@External
	@ClientFunc
	public MetaVar SetLifeTime(MetaVarNumber lifeTimeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets whenever particles should be lighted.
	*/
	@External
	@ClientFunc
	public MetaVar SetLighting(MetaVarBoolean useLightingVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets when the particles think function should be called next, this uses the synchronized server time returned by <a href="http://wiki.garrysmod.com/page/Global/CurTime" title="Global/CurTime">CurTime</a>.
	*/
	@External
	@ClientFunc
	public MetaVar SetNextThink(MetaVarNumber nextThinkVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the position of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetPos(MetaVarVector posVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the roll of the particle in radians.
	*/
	@External
	@ClientFunc
	public MetaVar SetRoll(MetaVarNumber rollVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the roll delta of the particle in radians.
	*/
	@External
	@ClientFunc
	public MetaVar SetRollDelta(MetaVarNumber rollDeltaVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the initial alpha value of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetStartAlpha(MetaVarNumber startAlphaVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the initial length value of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetStartLength(MetaVarNumber startLengthVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the initial size value of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetStartSize(MetaVarNumber startSizeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the think function of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetThinkFunction(MetaVarFunction thinkFuncVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the velocity of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetVelocity(MetaVarVector velVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Scales the velocity based on the particle speed.
	*/
	@External
	@ClientFunc
	public MetaVar SetVelocityScale(MetaVarBoolean doScaleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Overridden by the engine in order to clean up the CLuaParticle.
	*/
	@External
	@ClientFunc
	public MetaVar __gc(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarCLuaParticleImpl(String n) {
		super(n);
	}
}
