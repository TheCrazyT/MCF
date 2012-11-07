package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("PhysObj")
public class MetaVarPhysObjImpl extends MetaVarImpl implements MetaVarPhysObj{
	/**
	Adds the specified velocity to the current.
	*/
	@External
	@SharedFunc
	public MetaVar AddAngleVelocity(MetaVarVector angularVelocityVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Adds one or more bit bit flags.
	*/
	@External
	@SharedFunc
	public MetaVar AddGameFlag(MetaVarNumber flagsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Adds the specified velocity to the current.
	*/
	@External
	@SharedFunc
	public MetaVar AddVelocity(MetaVarVector velocityVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Rotates the object so that it's angles are aligned to the ones inputed.
	*/
	@External
	@SharedFunc
	public MetaVarAngle AlignAngles(MetaVarAngle fromVar,MetaVarAngle toVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Applies the specified force to the physics object.
	*/
	@External
	@SharedFunc
	public MetaVar ApplyForceCenter(MetaVarVector forceVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Applies the specified force with an offset where the force is applied from.
	*/
	@External
	@SharedFunc
	public MetaVar ApplyForceOffset(MetaVarVector forceVar,MetaVarVector offsetVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Removes one of more specified flags.
	*/
	@External
	@SharedFunc
	public MetaVar ClearGameFlag(MetaVarNumber flagsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets whenever the physics object should not collide with anything.
	*/
	@External
	@SharedFunc
	public MetaVar EnableCollisions(MetaVarBoolean enableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets whenever the physics object should be affected by drag.
	*/
	@External
	@SharedFunc
	public MetaVar EnableDrag(MetaVarBoolean enableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets whenever the physobject should be affected by gravity
	*/
	@External
	@SharedFunc
	public MetaVar EnableGravity(MetaVarBoolean enableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets whenever the physobject should be able to move or not
	*/
	@External
	@SharedFunc
	public MetaVar EnableMotion(MetaVarBoolean enableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the mins and max of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetAABB(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the angular velocity of the object.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetAngleVelocity(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the angles of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarAngle GetAngles(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the linear and angular damping of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetDamping(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the kinetic energy of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetEnergy(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the parent entity of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetEntity(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the directional inertia of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetInertia(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the inverted inertia.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetInvInertia(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns 1 divided by the entities mass.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetInvMass(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the mass of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMass(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the mass center of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetMassCenter(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the physical material of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarString GetMaterial(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a table of <a href="http://wiki.garrysmod.com/page/Classes/MeshVertex" title="Classes/MeshVertex" class="mw-redirect">MeshVertexes</a> where each 3 vertexes represent a triangle.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetMesh(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the position of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetPos(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the rotation damping of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetRotDamping(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the speed damping of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetSpeedDamping(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the stress of the entity.
	*/
	@External
	@ServerFunc
	public MetaVarNumber GetStress(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the surface area of the physics object in source-units².
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetSurfaceArea(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the absolute directional velocity of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetVelocity(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the volume in source units³.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetVolume(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the specified flag(s) is/are set.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean HasGameFlag(MetaVarNumber flagsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the physics object is sleeping eg. not active.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsAsleep(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the entity is able to collide or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsCollisionEnabled(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the entity is affected by drag.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsDragEnabled(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the entity is affected by gravity.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsGravityEnabled(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the physics object can move itself (by velocity, acceleration)
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsMotionEnabled(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the entity is able to move.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsMoveable(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the entity is penetrating another physics object.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsPenetrating(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the physics object is valid/not NULL.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsValid(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Prints debug info about the state of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVar OutputDebugInfo(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the angles of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVar SetAngles(MetaVarAngle anglesVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the buoyancy ratio.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean SetBuoyancyRatio(MetaVarNumber buoyancyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the linear and angular damping of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamping(MetaVarNumber linearDampingVar,MetaVarNumber angularDampingVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the directional inertia.
	*/
	@External
	@SharedFunc
	public MetaVar SetInertia(MetaVarVector directionalInertiaVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the mass of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVar SetMass(MetaVarNumber massVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the mass of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVar SetMaterial(MetaVarString materialNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the position of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVar SetPos(MetaVarVector positionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the velocity of the physics object for the next iteration.
	*/
	@External
	@SharedFunc
	public MetaVar SetVelocity(MetaVarVector velocityVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the velocity of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVar SetVelocityInstantaneous(MetaVarVector velocityVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Make the physics object sleep.
	*/
	@External
	@SharedFunc
	public MetaVar Sleep(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Wakes the physics object.
	*/
	@External
	@SharedFunc
	public MetaVar Wake(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarPhysObjImpl(String n) {
		super(n);
	}
}
