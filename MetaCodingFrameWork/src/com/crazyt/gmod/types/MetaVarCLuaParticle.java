package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("CLuaParticle")
public class MetaVarCLuaParticle extends MetaVarImpl implements IMetaVarAny{
	public MetaVarCLuaParticle(String n) {
		super(n);
	}
	/**
	Returns the air resistance of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetAirResistance(){return null;};
	/**
	Returns the angular velocities for each axis.
	*/
	@External
	@ClientFunc
	public MetaVarAngle GetAngleVelocity(){return null;};
	/**
	Returns the current orientation of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarAngle GetAngles(){return null;};
	/**
	Returns the bounciness of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetBounce(){return null;};
	/**
	Returns the color of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetColor(){return null;};
	/**
	Gets the time in seconds after which the particle will be destroyed.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetDieTime(){return null;};
	/**
	Gets the alpha value that the particle will reach on its death.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetEndAlpha(){return null;};
	/**
	Gets the length that the particle will reach on its death.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetEndLength(){return null;};
	/**
	Gets the size that the particle will reach on its death.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetEndSize(){return null;};
	/**
	Gets the gravity of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarVector GetGravity(){return null;};
	/**
	Gets how long in second, the particle exists(can be overridden by SetLifeTime).
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetLifeTime(){return null;};
	/**
	Gets the absolute position of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarVector GetPos(){return null;};
	/**
	Returns the current rotation of the particle in radians, this should only be used for 2d particles.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetRoll(){return null;};
	/**
	Returns the current rotation speed of the particle in radians, this should only be used for 2d particles.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetRollDelta(){return null;};
	/**
	Gets the alpha value which the particle has when its created.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetStartAlpha(){return null;};
	/**
	Gets the length which the particle has when its created.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetStartLength(){return null;};
	/**
	Gets the size which the particle has when its created.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetStartSize(){return null;};
	/**
	Gets the current velocity of the particle.
	*/
	@External
	@ClientFunc
	public MetaVarVector GetVelocity(){return null;};
	/**
	Sets the air resistance of the the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetAirResistance(MetaVarNumber airResistanceVar){return null;};
	/**
	Sets the angular velocity of the the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetAngleVelocity(MetaVarAngle angVelVar){return null;};
	/**
	Sets the angles of the the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetAngles(MetaVarAngle angVar){return null;};
	/**
	Sets the bounciness of the the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetBounce(MetaVarNumber bounceVar){return null;};
	/**
	Sets the whenever the particle should collide with the world or not.
	*/
	@External
	@ClientFunc
	public MetaVar SetCollide(MetaVarBoolean doCollideVar){return null;};
	/**
	Sets the function that gets called whenever the particle collides with the world, the arguments passed to the function are:
<a href="http://wiki.garrysmod.com/page/Classes/CLuaParticle" title="Classes/CLuaParticle">CLuaParticle</a> part, <a href="http://wiki.garrysmod.com/page/Classes/Vector" title="Classes/Vector">Vector</a> hitPos, <a href="http://wiki.garrysmod.com/page/Classes/Vector" title="Classes/Vector">Vector</a> hitNormal.
	*/
	@External
	@ClientFunc
	public MetaVar SetCollideCallback(MetaVarFunction collideFuncVar){return null;};
	/**
	Sets the color of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetColor(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar){return null;};
	/**
	Sets the time where the particle will be removed.
	*/
	@External
	@ClientFunc
	public MetaVar SetDieTime(MetaVarNumber dieTimeVar){return null;};
	/**
	Sets the alpha of the particle that it will reach when it dies.
	*/
	@External
	@ClientFunc
	public MetaVar SetEndAlpha(MetaVarNumber endAlphaVar){return null;};
	/**
	Sets the length of the particle that it will reach when it dies.
	*/
	@External
	@ClientFunc
	public MetaVar SetEndLength(MetaVarNumber endLengthVar){return null;};
	/**
	Sets the size of the particle that it will reach when it dies.
	*/
	@External
	@ClientFunc
	public MetaVar SetEndSize(MetaVarNumber endSizeVar){return null;};
	/**
	Sets the directional gravity aka. acceleration of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetGravity(MetaVarVector gravityVar){return null;};
	/**
	Sets the time the particles life time.
	*/
	@External
	@ClientFunc
	public MetaVar SetLifeTime(MetaVarNumber lifeTimeVar){return null;};
	/**
	Sets whenever particles should be lighted.
	*/
	@External
	@ClientFunc
	public MetaVar SetLighting(MetaVarBoolean useLightingVar){return null;};
	/**
	Sets when the particles think function should be called next, this uses the synchronized server time returned by <a href="http://wiki.garrysmod.com/page/Global/CurTime" title="Global/CurTime">CurTime</a>.
	*/
	@External
	@ClientFunc
	public MetaVar SetNextThink(MetaVarNumber nextThinkVar){return null;};
	/**
	Sets the position of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetPos(MetaVarVector posVar){return null;};
	/**
	Sets the roll of the particle in radians.
	*/
	@External
	@ClientFunc
	public MetaVar SetRoll(MetaVarNumber rollVar){return null;};
	/**
	Sets the roll delta of the particle in radians.
	*/
	@External
	@ClientFunc
	public MetaVar SetRollDelta(MetaVarNumber rollDeltaVar){return null;};
	/**
	Sets the initial alpha value of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetStartAlpha(MetaVarNumber startAlphaVar){return null;};
	/**
	Sets the initial length value of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetStartLength(MetaVarNumber startLengthVar){return null;};
	/**
	Sets the initial size value of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetStartSize(MetaVarNumber startSizeVar){return null;};
	/**
	Sets the think function of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetThinkFunction(MetaVarFunction thinkFuncVar){return null;};
	/**
	Sets the velocity of the particle.
	*/
	@External
	@ClientFunc
	public MetaVar SetVelocity(MetaVarVector velVar){return null;};
	/**
	Scales the velocity based on the particle speed.
	*/
	@External
	@ClientFunc
	public MetaVar SetVelocityScale(MetaVarBoolean doScaleVar){return null;};
	/**
	Overridden by the engine in order to clean up the CLuaParticle.
	*/
	@External
	@ClientFunc
	public MetaVar __gc(){return null;};
}
