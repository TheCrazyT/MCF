package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarPhysObjImpl.class)
public interface MetaVarPhysObj extends MetaVar,IMetaVarAny{
	/**
	Adds the specified velocity to the current.
	*/
	@External
	@SharedFunc
	public MetaVar AddAngleVelocity(MetaVarVector angularVelocityVar);
	/**
	Adds one or more bit bit flags.
	*/
	@External
	@SharedFunc
	public MetaVar AddGameFlag(MetaVarNumber flagsVar);
	/**
	Adds the specified velocity to the current.
	*/
	@External
	@SharedFunc
	public MetaVar AddVelocity(MetaVarVector velocityVar);
	/**
	Rotates the object so that it's angles are aligned to the ones inputed.
	*/
	@External
	@SharedFunc
	public MetaVarAngle AlignAngles(MetaVarAngle fromVar,MetaVarAngle toVar);
	/**
	Applies the specified force to the physics object.
	*/
	@External
	@SharedFunc
	public MetaVar ApplyForceCenter(MetaVarVector forceVar);
	/**
	Applies the specified force with an offset where the force is applied from.
	*/
	@External
	@SharedFunc
	public MetaVar ApplyForceOffset(MetaVarVector forceVar,MetaVarVector offsetVar);
	/**
	Removes one of more specified flags.
	*/
	@External
	@SharedFunc
	public MetaVar ClearGameFlag(MetaVarNumber flagsVar);
	/**
	Sets whenever the physics object should not collide with anything.
	*/
	@External
	@SharedFunc
	public MetaVar EnableCollisions(MetaVarBoolean enableVar);
	/**
	Sets whenever the physics object should be affected by drag.
	*/
	@External
	@SharedFunc
	public MetaVar EnableDrag(MetaVarBoolean enableVar);
	/**
	Sets whenever the physobject should be affected by gravity
	*/
	@External
	@SharedFunc
	public MetaVar EnableGravity(MetaVarBoolean enableVar);
	/**
	Sets whenever the physobject should be able to move or not
	*/
	@External
	@SharedFunc
	public MetaVar EnableMotion(MetaVarBoolean enableVar);
	/**
	Returns the mins and max of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetAABB();
	/**
	Gets the angular velocity of the object.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetAngleVelocity();
	/**
	Returns the angles of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarAngle GetAngles();
	/**
	Returns the linear and angular damping of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetDamping();
	/**
	Returns the kinetic energy of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetEnergy();
	/**
	Returns the parent entity of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetEntity();
	/**
	Returns the directional inertia of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetInertia();
	/**
	Returns the inverted inertia.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetInvInertia();
	/**
	Returns 1 divided by the entities mass.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetInvMass();
	/**
	Returns the mass of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMass();
	/**
	Returns the mass center of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetMassCenter();
	/**
	Returns the physical material of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarString GetMaterial();
	/**
	Returns a table of <a href="http://wiki.garrysmod.com/page/Classes/MeshVertex" title="Classes/MeshVertex" class="mw-redirect">MeshVertexes</a> where each 3 vertexes represent a triangle.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetMesh();
	/**
	Returns the position of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetPos();
	/**
	Returns the rotation damping of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetRotDamping();
	/**
	Returns the speed damping of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetSpeedDamping();
	/**
	Returns the stress of the entity.
	*/
	@External
	@ServerFunc
	public MetaVarNumber GetStress();
	/**
	Returns the surface area of the physics object in source-units².
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetSurfaceArea();
	/**
	Returns the absolute directional velocity of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetVelocity();
	/**
	Returns the volume in source units³.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetVolume();
	/**
	Returns whenever the specified flag(s) is/are set.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean HasGameFlag(MetaVarNumber flagsVar);
	/**
	Returns whenever the physics object is sleeping eg. not active.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsAsleep();
	/**
	Returns whenever the entity is able to collide or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsCollisionEnabled();
	/**
	Returns whenever the entity is affected by drag.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsDragEnabled();
	/**
	Returns whenever the entity is affected by gravity.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsGravityEnabled();
	/**
	Returns if the physics object can move itself (by velocity, acceleration)
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsMotionEnabled();
	/**
	Returns whenever the entity is able to move.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsMoveable();
	/**
	Returns whenever the entity is penetrating another physics object.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsPenetrating();
	/**
	Returns if the physics object is valid/not NULL.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsValid();
	/**
	Prints debug info about the state of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVar OutputDebugInfo();
	/**
	Sets the angles of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVar SetAngles(MetaVarAngle anglesVar);
	/**
	Sets the buoyancy ratio.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean SetBuoyancyRatio(MetaVarNumber buoyancyVar);
	/**
	Sets the linear and angular damping of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVar SetDamping(MetaVarNumber linearDampingVar,MetaVarNumber angularDampingVar);
	/**
	Sets the directional inertia.
	*/
	@External
	@SharedFunc
	public MetaVar SetInertia(MetaVarVector directionalInertiaVar);
	/**
	Sets the mass of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVar SetMass(MetaVarNumber massVar);
	/**
	Sets the mass of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVar SetMaterial(MetaVarString materialNameVar);
	/**
	Sets the position of the physobject.
	*/
	@External
	@SharedFunc
	public MetaVar SetPos(MetaVarVector positionVar);
	/**
	Sets the velocity of the physics object for the next iteration.
	*/
	@External
	@SharedFunc
	public MetaVar SetVelocity(MetaVarVector velocityVar);
	/**
	Sets the velocity of the physics object.
	*/
	@External
	@SharedFunc
	public MetaVar SetVelocityInstantaneous(MetaVarVector velocityVar);
	/**
	Make the physics object sleep.
	*/
	@External
	@SharedFunc
	public MetaVar Sleep();
	/**
	Wakes the physics object.
	*/
	@External
	@SharedFunc
	public MetaVar Wake();
}
