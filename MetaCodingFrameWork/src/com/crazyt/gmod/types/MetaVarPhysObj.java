package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("PhysObj")
public class MetaVarPhysObj extends MetaVarImpl implements IMetaVarAny{
	public MetaVarPhysObj(String n) {
		super(n);
	}
	/**
	Adds the specified velocity to the current.
	*/
	@External
	@SharedFunc
	public MetaVar AddAngleVelocity(MetaVarVector angularVelocityVar){return null;};
	/**
	Adds one or more bit bit flags.
	*/
	@External
	@SharedFunc
	public MetaVar AddGameFlag(MetaVarNumber flagsVar){return null;};
	/**
	Adds the specified velocity to the current.
	*/
	@External
	@SharedFunc
	public MetaVar AddVelocity(MetaVarVector velocityVar){return null;};
	/**
	Rotates the object so that it's angles are aligned to the ones inputed.
	*/
	@External
	@SharedFunc
	public MetaVarAngle AlignAngles(MetaVarAngle fromVar,MetaVarAngle toVar){return null;};
	/**
	Applies the specified force to the physics object.
	*/
	@External
	@SharedFunc
	public MetaVar ApplyForceCenter(MetaVarVector forceVar){return null;};
	/**
	Applies the specified force with an offset where the force is applied from.
	*/
	@External
	@SharedFunc
	public MetaVar ApplyForceOffset(MetaVarVector forceVar,MetaVarVector offsetVar){return null;};
	/**
	Removes one of more specified flags.
	*/
	@External
	@SharedFunc
	public MetaVar ClearGameFlag(MetaVarNumber flagsVar){return null;};
	/**
	Sets whenever the physics object should not collide with anything.
	*/
	@External
	@SharedFunc
	public MetaVar EnableCollisions(MetaVarBoolean enableVar){return null;};
	/**
	Sets whenever the physics object should be affected by drag.
	*/
	@External
	@SharedFunc
	public MetaVar EnableDrag(MetaVarBoolean enableVar){return null;};
	/**
	Sets whenever the physobject should be affected by gravity
	*/
	@External
	@SharedFunc
	public MetaVar EnableGravity(MetaVarBoolean enableVar){return null;};
	/**
	Sets whenever the physobject should be able to move or not
	*/
	@External
	@SharedFunc
	public MetaVar EnableMotion(MetaVarBoolean enableVar){return null;};
	/**
	Returns the mins and max of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetAABB(){return null;};
	/**
	Gets the angular velocity of the object.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetAngleVelocity(){return null;};
	/**
	Returns the angles of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarAngle GetAngles(){return null;};
	/**
	Returns the linear and angular damping of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetDamping(){return null;};
	/**
	Returns the kinetic energy of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetEnergy(){return null;};
	/**
	Returns the parent entity of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetEntity(){return null;};
	/**
	Returns the directional inertia of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetInertia(){return null;};
	/**
	Returns the inverted inertia.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetInvInertia(){return null;};
	/**
	Returns 1 divided by the entities mass.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetInvMass(){return null;};
	/**
	Returns the mass of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMass(){return null;};
	/**
	Returns the mass center of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetMassCenter(){return null;};
	/**
	Returns the physical material of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarString GetMaterial(){return null;};
	/**
	Returns a table of <a href="http://wiki.garrysmod.com/page/Classes/MeshVertex" title="Classes/MeshVertex" class="mw-redirect">MeshVertexes</a> where each 3 vertexes represent a triangle.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetMesh(){return null;};
	/**
	Returns the position of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetPos(){return null;};
	/**
	Returns the rotation damping of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetRotDamping(){return null;};
	/**
	Returns the speed damping of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetSpeedDamping(){return null;};
	/**
	Returns the stress of the entity.
	*/
	@External
	@ServerFunc
	public MetaVarNumber GetStress(){return null;};
	/**
	Returns the surface area of the physics object in source-units².
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetSurfaceArea(){return null;};
	/**
	Returns the absolute directional velocity of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetVelocity(){return null;};
	/**
	Returns the volume in source units³.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetVolume(){return null;};
	/**
	Returns whenever the specified flag(s) is/are set.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean HasGameFlag(MetaVarNumber flagsVar){return null;};
	/**
	Returns whenever the physics object is sleeping eg. not active.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsAsleep(){return null;};
	/**
	Returns whenever the entity is able to collide or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsCollisionEnabled(){return null;};
	/**
	Returns whenever the entity is affected by drag.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsDragEnabled(){return null;};
	/**
	Returns whenever the entity is affected by gravity.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsGravityEnabled(){return null;};
	/**
	Returns if the physics object can move itself (by velocity, acceleration)
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsMotionEnabled(){return null;};
	/**
	Returns whenever the entity is able to move.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsMoveable(){return null;};
	/**
	Returns whenever the entity is penetrating another physics object.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsPenetrating(){return null;};
	/**
	Returns if the physics object is valid/not NULL.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsValid(){return null;};
	/**
	Prints debug info about the state of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVar OutputDebugInfo(){return null;};
	/**
	Sets the angles of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVar SetAngles(MetaVarAngle anglesVar){return null;};
	/**
	Sets the buoyancy ratio.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean SetBuoyancyRatio(MetaVarNumber buoyancyVar){return null;};
	/**
	Sets the linear and angular damping of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamping(MetaVarNumber linearDampingVar,MetaVarNumber angularDampingVar){return null;};
	/**
	Sets the directional inertia.
	*/
	@External
	@SharedFunc
	public MetaVar SetInertia(MetaVarVector directionalInertiaVar){return null;};
	/**
	Sets the mass of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVar SetMass(MetaVarNumber massVar){return null;};
	/**
	Sets the mass of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVar SetMaterial(MetaVarString materialNameVar){return null;};
	/**
	Sets the position of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVar SetPos(MetaVarVector positionVar){return null;};
	/**
	Sets the velocity of the physics object for the next iteration.
	*/
	@External
	@SharedFunc
	public MetaVar SetVelocity(MetaVarVector velocityVar){return null;};
	/**
	Sets the velocity of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVar SetVelocityInstantaneous(MetaVarVector velocityVar){return null;};
	/**
	Make the physics object sleep.
	*/
	@External
	@SharedFunc
	public MetaVar Sleep(){return null;};
	/**
	Wakes the physics object.
	*/
	@External
	@SharedFunc
	public MetaVar Wake(){return null;};
}
