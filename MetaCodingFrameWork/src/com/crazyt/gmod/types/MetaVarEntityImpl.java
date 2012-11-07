package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("Entity")
public class MetaVarEntityImpl extends MetaVarImpl implements MetaVarEntity{
	/**
	Activates the entity. This needs to be used on some entities (like constraints) after being spawned.
	*/
	@External
	@SharedFunc
	public MetaVar Active(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Applies engine effects to an entity, see <a href="http://wiki.garrysmod.com/page/Enums/EF" title="Enums/EF">EF_ Enums</a>.
	*/
	@External
	@SharedFunc
	public MetaVar AddEffects(MetaVarNumber effectEnumVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Rotates an object so that it's angles are aligned to the ones inputed.
	*/
	@External
	@SharedFunc
	public MetaVarAngle AlignAngles(MetaVarAngle fromVar,MetaVarAngle toVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Spawns a ragdoll for the entity, and makes the entity invisible.
	*/
	@External
	@ClientFunc
	public MetaVar BecomeRagdollOnClient(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the distance between the center of the bounding box and the furthest bounding box corner.
	*/
	@External
	@SharedFunc
	public MetaVarNumber BoundingRadius(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Causes a specified function to be run if the entity is removed by any means.
	*/
	//public MetaVar CallOnRemove(MetaVarString identifierVar,MetaVarFunction removeFuncVar,com.crazyt.gmod.IMetaVarAny argn...Var){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Whenever the entity is removed, entityToRemove will be removed also.
	*/
	@External
	@ServerFunc
	public MetaVar DeleteOnRemove(MetaVarEntity entityToRemoveVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Performs a trace attack.
	*/
	//public MetaVar DispatchTraceAttack(MetaVarCTakeDamageInfo damageInfoVar,MetaVarVector traceStartVar,MetaVarVector traceEndVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the way one entity "feels" about another. Only used for NPCs. The returned value corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/D" title="Enums/D">D_ Enums</a>.
	*/
	@External
	@ServerFunc
	public MetaVarNumber Disposition(MetaVarEntity entVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	This removes the argument entity from an ent's list of entities to 'delete on remove'
	*/
	@External
	@ServerFunc
	public MetaVar DontDeleteOnRemove(MetaVarEntity entityToUnremoveVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Running this function will draw the model of the attached entity. This can only be used in 3d rendering hooks, such as <a href="http://wiki.garrysmod.com/page/Events/Entity/Draw" title="Events/Entity/Draw">Draw</a>
	*/
	@External
	@ClientFunc
	public MetaVar DrawModel(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets whenever an entities shadow should be drawn.
	*/
	@External
	@SharedFunc
	public MetaVar DrawShadow(MetaVarBoolean shouldDrawVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Move an entity down until it collides with something.
	*/
	@External
	@ServerFunc
	public MetaVar DropToFloor(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Plays a sound on an entity.
	*/
	@External
	@SharedFunc
	public MetaVar EmitSound(MetaVarString soundNameVar,MetaVarNumber soundLevelVar,MetaVarNumber pitchPercentVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Flags an entity as using custom lua defined collisions. Fixes entities having spongy player collisions or not hitting traces, such as after <a href="http://wiki.garrysmod.com/page/Classes/Entity" title="Classes/Entity">Entity</a>:<a href="http://wiki.garrysmod.com/page/Classes/Entity/PhysicsFromMesh" title="Classes/Entity/PhysicsFromMesh">PhysicsFromMesh</a>
	*/
	@External
	@SharedFunc
	public MetaVar EnableCustomCollisions(MetaVarBoolean useCustomVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Can be used to scale a model by a vector
	*/
	//public MetaVar EnableMatrix(MetaVarString matrixTypeVar,MetaVarVMatrix matrixVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the unique entity index of an entity.
	*/
	@External
	@SharedFunc
	public MetaVarNumber EntIndex(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Extinguishes the entity if it is on fire.
	*/
	@External
	@ServerFunc
	public MetaVar Extinguish(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the direction a player/npc/ragdoll is looking as a world-oriented angle.
	*/
	@External
	@SharedFunc
	public MetaVarAngle EyeAngles(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the position of an Player/NPC's view, or two vectors for ragdolls (one for each eye)
	*/
	@External
	@SharedFunc
	public MetaVarVector EyePos(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Fires an entity's input
	*/
	@External
	@ServerFunc
	public MetaVar Fire(MetaVarString inputVar,MetaVarString paramVar,MetaVarNumber delayVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Fires a bullet.
	*/
	@External
	@SharedFunc
	public MetaVar FireBullets(MetaVarBullet bulletInfoVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the angles of given entity.
	*/
	@External
	@SharedFunc
	public MetaVarAngle GetAngles(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the orientation and position of the attachment by its id.
	*/
	@External
	@SharedFunc
	public MetaVar GetAttachment(MetaVarNumber attachmentIdVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a table with <a href="http://wiki.garrysmod.com/page/Classes/AttachmentData" title="Classes/AttachmentData" class="mw-redirect">AttachmentData</a> sets.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetAttachments(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the blood color this entity uses, which corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/BLOOD" title="Enums/BLOOD">BLOOD_ Enums</a>
	*/
	@External
	@ServerFunc
	public MetaVarNumber GetBloodColor(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a list of all attachments of the entity, a table containing <a href="http://wiki.garrysmod.com/page/Classes/BodyGroupData" title="Classes/BodyGroupData" class="mw-redirect">BodyGroupData</a> sets.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetBodyGroups(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the exact value for specific bodygroup of given entity.
	*/
	@External
	@SharedFunc
	public MetaVar GetBodygroup(MetaVarNumber idVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the number of bodygroups available for given entity.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetBodygroupCount(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the name of specific bodygroup for given entity.
	*/
	@External
	@SharedFunc
	public MetaVarString GetBodygroupName(MetaVarNumber idVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the classname of a entity.
	*/
	@External
	@SharedFunc
	public MetaVarString GetClass(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the entity's collision group, which corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/COLLISION" title="Enums/COLLISION">COLLISION_ Enums</a>
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetCollisionGroup(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the color the entity is set to.
	*/
	@External
	@SharedFunc
	public MetaVar GetColor(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the two entities involved in a constraint ent
	*/
	@External
	@ServerFunc
	public MetaVarEntity GetConstrainedEntities(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the two entities physobjects involved in a constraint ent
	*/
	//public MetaVarPhysObj GetConstrainedPhysObjects(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the forward vector of the entity, as a normalized direction vector
	*/
	@External
	@SharedFunc
	public MetaVarVector GetForward(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns how much friction an entity has. Entities default to 1 (100%) and can be higher or even negative.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetFriction(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the gravity multiplier of the entity.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetGravity(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the object the entity is standing on.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetGroundEntity(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the material override for this entity.
	*/
	@External
	@SharedFunc
	public MetaVarString GetMaterial(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the model of given entity.
	*/
	@External
	@SharedFunc
	public MetaVarString GetModel(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the entity's movetype, which corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/MOVETYPE" title="Enums/MOVETYPE">MOVETYPE_ Enums</a>
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMoveType(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the mapping name of this entity.
	*/
	//public MetaVarString GetName(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the entity's rendering has been disabled
	*/
	@External
	@SharedFunc
	public MetaVarBoolean GetNoDraw(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the body group count of the entity.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetNumBodyGroups(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the owner entity of this entity.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetOwner(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the parent entity of this entity.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetParent(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the entity's physics object, if the entity has physics
	*/
	//public MetaVarPhysObj GetPhysicsObject(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the number of physics object an entity has (usually 1 for non ragdolls)
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetPhysicsObjectCount(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a specific physics object from an entity with multiple (ragdolls)
	*/
	//public MetaVarPhysObj GetPhysicsObjectNum(MetaVarNumber physNumVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the position of entity in world.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetPos(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the rightward vector of the entity, as a normalized direction vector
	*/
	@External
	@SharedFunc
	public MetaVarVector GetRight(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the skin index of the current skin.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetSkin(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the table that contains all values saved within the entity.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetTable(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the upward vector of the entity, as a normalized direction vector
	*/
	@External
	@SharedFunc
	public MetaVarVector GetUp(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the directional velocity of the entity.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetVelocity(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the health of the entity.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Health(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the entity on fire.
	*/
	@External
	@ServerFunc
	public MetaVar Ignite(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns true if the entity has constraints attached to it
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsConstrained(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the entity is within the world bounds.
	*/
	@External
	@ServerFunc
	public MetaVarBoolean IsInWorld(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks if the entity is a NPC or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsNPC(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the entity is on fire.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsOnFire(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the entity is on ground.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsOnGround(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks if the entity is a player or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsPlayer(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the entity is valid (ie not NULL).
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsValid(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks if the entity is a vehicle or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsVehicle(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks if the entity is a weapon or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsWeapon(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the entity is the map's Entity[0] worldspawn
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsWorld(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Converts a vector local to an entity into a worldspace vector
	*/
	@External
	@SharedFunc
	public MetaVarVector LocalToWorld(MetaVarVector lposVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the attachment index of the given attachment name, returns nothing if the attachment does not exist.
	*/
	@External
	@SharedFunc
	public MetaVarNumber LookupAttachment(MetaVarString attachmentNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the bone index of the given bone name, returns nothing if the bone does not exist.
	*/
	@External
	@SharedFunc
	public MetaVarNumber LookupBone(MetaVarString boneNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets custom bone angles
	*/
	@External
	@SharedFunc
	public MetaVar ManipulateBoneAngles(MetaVarNumber BoneIDVar,MetaVarAngle AngleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets custom bone offsets
	*/
	@External
	@SharedFunc
	public MetaVar ManipulateBonePosition(MetaVarNumber BoneIDVar,MetaVarVector VectorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets custom bone scale
	*/
	@External
	@SharedFunc
	public MetaVar ManipulateBoneScale(MetaVarNumber BoneIDVar,MetaVarVector VectorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Performs a Ray OBBox intersection with the entity and returns the hit position.
	*/
	@External
	@SharedFunc
	public MetaVar NearestPoint(MetaVarVector positionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the high corner of an entity's OBB as a local vector.
	*/
	@External
	@SharedFunc
	public MetaVarVector OBBMaxs(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Wakes up the entity's physics object
	*/
	@External
	@SharedFunc
	public MetaVar PhysWake(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Builds the mesh from a table mesh vertexes.
	*/
	@External
	@SharedFunc
	public MetaVar PhysicsFromMesh(MetaVarTable verticesVar,MetaVarBoolean staticVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the solid type of the physics.
	*/
	@External
	@SharedFunc
	public MetaVar PhysicsInit(MetaVarNumber solidTypeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Makes the physics object of the entity a AABB.
	*/
	@External
	@SharedFunc
	public MetaVar PhysicsInitBox(MetaVarVector minsVar,MetaVarVector maxsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Builds the mesh from multiple convex collision meshes.
	*/
	@External
	@SharedFunc
	public MetaVar PhysicsInitMultiConvex(MetaVarTable verticesVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Makes the physics object of the entity a sphere.
	*/
	@External
	@SharedFunc
	public MetaVar PhysicsInitSphere(MetaVarNumber radiusVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Removes the entity it is used on.
	*/
	//public MetaVar Remove(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Removes all decals from the entities surface.
	*/
	@External
	@SharedFunc
	public MetaVar RemoveAllDecals(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Removes the CallOnRemove'd function referred to by identifier
	*/
	@External
	@SharedFunc
	public MetaVar RemoveCallOnRemove(MetaVarString identifierVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the angles of the entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetAngles(MetaVarAngle anglesVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the blood color this entity uses.
	*/
	@External
	@ServerFunc
	public MetaVar SetBloodColor(MetaVarNumber bloodColorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the entity's collision group. It takes an integer that corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/COLLISION" title="Enums/COLLISION">COLLISION_ Enums</a>
	*/
	@External
	@SharedFunc
	public MetaVar SetCollisionGroup(MetaVarNumber groupVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the color of an entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetColor(MetaVarColor colorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets how much friction an entity has when sliding against a surface. Entities default to 1 (100%) and can be higher or even negative.
	*/
	@External
	@SharedFunc
	public MetaVar SetFriction(MetaVarNumber frictionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the gravity multiplier of the entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetGravity(MetaVarNumber gravityMultiplierVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the health of the entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetHealth(MetaVarNumber newHealthVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Enables or disable the inverse kinematic usage of this entity.
	*/
	@External
	@ClientFunc
	public MetaVar SetIK(MetaVarBoolean useIKVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the rendering material override of the entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetMaterial(MetaVarString materialNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the health of the entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetModel(MetaVarString modelNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Scales the model of the entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetModelScale(MetaVarNumber scaleVar,MetaVarNumber deltaTimeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the entity's movetype. It takes an integer that corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/MOVETYPE" title="Enums/MOVETYPE">MOVETYPE_ Enums</a>
	*/
	@External
	@SharedFunc
	public MetaVar SetMoveType(MetaVarNumber movetypeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the mapping name of the entity.
	*/
	@External
	@ServerFunc
	public MetaVar SetName(MetaVarString mappingNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets if the entity's model should render at all
	*/
	@External
	@SharedFunc
	public MetaVar SetNoDraw(MetaVarBoolean shouldNotDrawVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the "owner" of the entity, which will disable the collision and damage receiving for this entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetOwner(MetaVarEntity ownerVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the parent of this entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetParent(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Moves the entity to the specified position.
	*/
	@External
	@SharedFunc
	public MetaVar SetPos(MetaVarVector positionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the specified pose parameter to the specified value.
	*/
	@External
	@SharedFunc
	public MetaVar SetPoseParameter(MetaVarString poseNameVar,MetaVarNumber poseValueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the skin of the entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetSkin(MetaVarNumber skinIndexVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the amount of skins the entity has.
	*/
	@External
	@SharedFunc
	public MetaVarNumber SkinCount(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Initializes the entity and starts it's networking.
	*/
	@External
	@SharedFunc
	public MetaVar Spawn(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Applies the specified amount of damage to the entity.
	*/
	@External
	@ServerFunc
	public MetaVar TakeDamage(MetaVarNumber damageAmountVar,MetaVarEntity attackerVar,MetaVarEntity inflictorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Applies the damage specified by the damage info to the entity.
	*/
	//public MetaVar TakeDamageInfo(MetaVarCTakeDamageInfo damageInfoVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the "water level" describing how much the entity is interacting with water.
	*/
	@External
	@SharedFunc
	public MetaVarNumber WaterLevel(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Converts a worldspace vector into a vector local to an entity
	*/
	@External
	@SharedFunc
	public MetaVarVector WorldToLocal(MetaVarVector wposVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarEntityImpl(String n) {
		super(n);
	}
}
