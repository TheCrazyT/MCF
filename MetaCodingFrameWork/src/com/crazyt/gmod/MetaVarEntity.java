package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("Entity")
public class MetaVarEntity extends MetaVarImpl implements IMetaVarAny{
	public MetaVarEntity(String n) {
		super(n);
	}
	/**
	Activates the entity. This needs to be used on some entities (like constraints) after being spawned.
	*/
	@External
	public MetaVar Active(){return null;};
	/**
	Applies engine effects to an entity, see <a href="http://wiki.garrysmod.com/page/Enums/EF" title="Enums/EF">EF_ Enums</a>.
	*/
	@External
	public MetaVar AddEffects(MetaVarNumber effectEnumVar){return null;};
	/**
	Rotates an object so that it's angles are aligned to the ones inputed.
	*/
	@External
	public MetaVarAngle AlignAngles(MetaVarAngle fromVar,MetaVarAngle toVar){return null;};
	/**
	Spawns a ragdoll for the entity, and makes the entity invisible.
	*/
	@External
	public MetaVar BecomeRagdollOnClient(){return null;};
	/**
	Returns the distance between the center of the bounding box and the furthest bounding box corner.
	*/
	@External
	public MetaVarNumber BoundingRadius(){return null;};
	/**
	Causes a specified function to be run if the entity is removed by any means.
	*/
	//public MetaVar CallOnRemove(MetaVarString identifierVar,MetaVarFunction removeFuncVar,com.crazyt.gmod.IMetaVarAny argn...Var){return null;};
	/**
	Whenever the entity is removed, entityToRemove will be removed also.
	*/
	@External
	public MetaVar DeleteOnRemove(MetaVarEntity entityToRemoveVar){return null;};
	/**
	Performs a trace attack.
	*/
	//public MetaVar DispatchTraceAttack(MetaVarCTakeDamageInfo damageInfoVar,MetaVarVector traceStartVar,MetaVarVector traceEndVar){return null;};
	/**
	Returns the way one entity "feels" about another. Only used for NPCs. The returned value corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/D" title="Enums/D">D_ Enums</a>.
	*/
	@External
	public MetaVarNumber Disposition(MetaVarEntity entVar){return null;};
	/**
	This removes the argument entity from an ent's list of entities to 'delete on remove'
	*/
	@External
	public MetaVar DontDeleteOnRemove(MetaVarEntity entityToUnremoveVar){return null;};
	/**
	Running this function will draw the model of the attached entity. This can only be used in 3d rendering hooks, such as <a href="http://wiki.garrysmod.com/page/Events/Entity/Draw" title="Events/Entity/Draw">Draw</a>
	*/
	@External
	public MetaVar DrawModel(){return null;};
	/**
	Sets whenever an entities shadow should be drawn.
	*/
	@External
	public MetaVar DrawShadow(MetaVarBoolean shouldDrawVar){return null;};
	/**
	Move an entity down until it collides with something.
	*/
	@External
	public MetaVar DropToFloor(){return null;};
	/**
	Plays a sound on an entity.
	*/
	@External
	public MetaVar EmitSound(MetaVarString soundNameVar,MetaVarNumber soundLevelVar,MetaVarNumber pitchPercentVar){return null;};
	/**
	Flags an entity as using custom lua defined collisions. Fixes entities having spongy player collisions or not hitting traces, such as after <a href="http://wiki.garrysmod.com/page/Classes/Entity" title="Classes/Entity">Entity</a>:<a href="http://wiki.garrysmod.com/page/Classes/Entity/PhysicsFromMesh" title="Classes/Entity/PhysicsFromMesh">PhysicsFromMesh</a>
	*/
	@External
	public MetaVar EnableCustomCollisions(MetaVarBoolean useCustomVar){return null;};
	/**
	Can be used to scale a model by a vector
	*/
	//public MetaVar EnableMatrix(MetaVarString matrixTypeVar,MetaVarVMatrix matrixVar){return null;};
	/**
	Gets the unique entity index of an entity.
	*/
	@External
	public MetaVarNumber EntIndex(){return null;};
	/**
	Extinguishes the entity if it is on fire.
	*/
	@External
	public MetaVar Extinguish(){return null;};
	/**
	Returns the direction a player/npc/ragdoll is looking as a world-oriented angle.
	*/
	@External
	public MetaVarAngle EyeAngles(){return null;};
	/**
	Returns the position of an Player/NPC's view, or two vectors for ragdolls (one for each eye)
	*/
	@External
	public MetaVarVector EyePos(){return null;};
	/**
	Fires an entity's input
	*/
	@External
	public MetaVar Fire(MetaVarString inputVar,MetaVarString paramVar,MetaVarNumber delayVar){return null;};
	/**
	Fires a bullet.
	*/
	@External
	public MetaVar FireBullets(){return null;};
	/**
	Gets the angles of given entity.
	*/
	@External
	public MetaVarAngle GetAngles(){return null;};
	/**
	Gets the orientation and position of the attachment by its id.
	*/
	@External
	public MetaVar GetAttachment(MetaVarNumber attachmentIdVar){return null;};
	/**
	Returns a table with <a href="http://wiki.garrysmod.com/page/Classes/AttachmentData" title="Classes/AttachmentData" class="mw-redirect">AttachmentData</a> sets.
	*/
	@External
	public MetaVarTable GetAttachments(){return null;};
	/**
	Returns the blood color this entity uses, which corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/BLOOD" title="Enums/BLOOD">BLOOD_ Enums</a>
	*/
	@External
	public MetaVarNumber GetBloodColor(){return null;};
	/**
	Returns a list of all attachments of the entity, a table containing <a href="http://wiki.garrysmod.com/page/Classes/BodyGroupData" title="Classes/BodyGroupData" class="mw-redirect">BodyGroupData</a> sets.
	*/
	@External
	public MetaVarTable GetBodyGroups(){return null;};
	/**
	Gets the exact value for specific bodygroup of given entity.
	*/
	@External
	public MetaVar GetBodygroup(MetaVarNumber idVar){return null;};
	/**
	Gets the number of bodygroups available for given entity.
	*/
	@External
	public MetaVarNumber GetBodygroupCount(){return null;};
	/**
	Gets the name of specific bodygroup for given entity.
	*/
	@External
	public MetaVarString GetBodygroupName(MetaVarNumber idVar){return null;};
	/**
	Returns the classname of a entity.
	*/
	@External
	public MetaVarString GetClass(){return null;};
	/**
	Returns the entity's collision group, which corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/COLLISION" title="Enums/COLLISION">COLLISION_ Enums</a>
	*/
	@External
	public MetaVarNumber GetCollisionGroup(){return null;};
	/**
	Returns the color the entity is set to.
	*/
	@External
	public MetaVar GetColor(){return null;};
	/**
	Returns the two entities involved in a constraint ent
	*/
	@External
	public MetaVarEntity GetConstrainedEntities(){return null;};
	/**
	Returns the two entities physobjects involved in a constraint ent
	*/
	//public MetaVarPhysObj GetConstrainedPhysObjects(){return null;};
	/**
	Returns the forward vector of the entity, as a normalized direction vector
	*/
	@External
	public MetaVarVector GetForward(){return null;};
	/**
	Returns how much friction an entity has. Entities default to 1 (100%) and can be higher or even negative.
	*/
	@External
	public MetaVarNumber GetFriction(){return null;};
	/**
	Gets the gravity multiplier of the entity.
	*/
	@External
	public MetaVarNumber GetGravity(){return null;};
	/**
	Returns the object the entity is standing on.
	*/
	@External
	public MetaVarEntity GetGroundEntity(){return null;};
	/**
	Returns the material override for this entity.
	*/
	@External
	public MetaVarString GetMaterial(){return null;};
	/**
	Gets the model of given entity.
	*/
	@External
	public MetaVarString GetModel(){return null;};
	/**
	Returns the entity's movetype, which corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/MOVETYPE" title="Enums/MOVETYPE">MOVETYPE_ Enums</a>
	*/
	@External
	public MetaVarNumber GetMoveType(){return null;};
	/**
	Returns the mapping name of this entity.
	*/
	@External
	public MetaVarString GetName(){return null;};
	/**
	Returns if the entity's rendering has been disabled
	*/
	@External
	public MetaVarBoolean GetNoDraw(){return null;};
	/**
	Returns the body group count of the entity.
	*/
	@External
	public MetaVarNumber GetNumBodyGroups(){return null;};
	/**
	Returns the owner entity of this entity.
	*/
	@External
	public MetaVarEntity GetOwner(){return null;};
	/**
	Returns the parent entity of this entity.
	*/
	@External
	public MetaVarEntity GetParent(){return null;};
	/**
	Returns the entity's physics object, if the entity has physics
	*/
	//public MetaVarPhysObj GetPhysicsObject(){return null;};
	/**
	Returns the number of physics object an entity has (usually 1 for non ragdolls)
	*/
	@External
	public MetaVarNumber GetPhysicsObjectCount(){return null;};
	/**
	Returns a specific physics object from an entity with multiple (ragdolls)
	*/
	//public MetaVarPhysObj GetPhysicsObjectNum(MetaVarNumber physNumVar){return null;};
	/**
	Gets the position of entity in world.
	*/
	@External
	public MetaVarVector GetPos(){return null;};
	/**
	Returns the rightward vector of the entity, as a normalized direction vector
	*/
	@External
	public MetaVarVector GetRight(){return null;};
	/**
	Returns the skin index of the current skin.
	*/
	@External
	public MetaVarNumber GetSkin(){return null;};
	/**
	Returns the table that contains all values saved within the entity.
	*/
	@External
	public MetaVarTable GetTable(){return null;};
	/**
	Returns the upward vector of the entity, as a normalized direction vector
	*/
	@External
	public MetaVarVector GetUp(){return null;};
	/**
	Returns the directional velocity of the entity.
	*/
	@External
	public MetaVarVector GetVelocity(){return null;};
	/**
	Returns the health of the entity.
	*/
	@External
	public MetaVarNumber Health(){return null;};
	/**
	Sets the entity on fire.
	*/
	@External
	public MetaVar Ignite(){return null;};
	/**
	Returns true if the entity has constraints attached to it
	*/
	@External
	public MetaVarBoolean IsConstrained(){return null;};
	/**
	Returns if the entity is within the world bounds.
	*/
	@External
	public MetaVarBoolean IsInWorld(){return null;};
	/**
	Checks if the entity is a NPC or not.
	*/
	@External
	public MetaVarBoolean IsNPC(){return null;};
	/**
	Returns if the entity is on fire.
	*/
	@External
	public MetaVarBoolean IsOnFire(){return null;};
	/**
	Returns if the entity is on ground.
	*/
	@External
	public MetaVarBoolean IsOnGround(){return null;};
	/**
	Checks if the entity is a player or not.
	*/
	@External
	public MetaVarBoolean IsPlayer(){return null;};
	/**
	Returns if the entity is valid (ie not NULL).
	*/
	@External
	public MetaVarBoolean IsValid(){return null;};
	/**
	Checks if the entity is a vehicle or not.
	*/
	@External
	public MetaVarBoolean IsVehicle(){return null;};
	/**
	Checks if the entity is a weapon or not.
	*/
	@External
	public MetaVarBoolean IsWeapon(){return null;};
	/**
	Returns if the entity is the map's Entity[0] worldspawn
	*/
	@External
	public MetaVarBoolean IsWorld(){return null;};
	/**
	Converts a vector local to an entity into a worldspace vector
	*/
	@External
	public MetaVarVector LocalToWorld(MetaVarVector lposVar){return null;};
	/**
	Gets the attachment index of the given attachment name, returns nothing if the attachment does not exist.
	*/
	@External
	public MetaVarNumber LookupAttachment(MetaVarString attachmentNameVar){return null;};
	/**
	Gets the bone index of the given bone name, returns nothing if the bone does not exist.
	*/
	@External
	public MetaVarNumber LookupBone(MetaVarString boneNameVar){return null;};
	/**
	Sets custom bone angles
	*/
	@External
	public MetaVar ManipulateBoneAngles(MetaVarNumber BoneIDVar,MetaVarAngle AngleVar){return null;};
	/**
	Sets custom bone offsets
	*/
	@External
	public MetaVar ManipulateBonePosition(MetaVarNumber BoneIDVar,MetaVarVector VectorVar){return null;};
	/**
	Sets custom bone scale
	*/
	@External
	public MetaVar ManipulateBoneScale(MetaVarNumber BoneIDVar,MetaVarVector VectorVar){return null;};
	/**
	Performs a Ray OBBox intersection with the entity and returns the hit position.
	*/
	@External
	public MetaVar NearestPoint(MetaVarVector positionVar){return null;};
	/**
	Returns the high corner of an entity's OBB as a local vector.
	*/
	@External
	public MetaVarVector OBBMaxs(){return null;};
	/**
	Wakes up the entity's physics object
	*/
	@External
	public MetaVar PhysWake(){return null;};
	/**
	Builds the mesh from a table mesh vertexes.
	*/
	@External
	public MetaVar PhysicsFromMesh(MetaVarTable verticesVar,MetaVarBoolean staticVar){return null;};
	/**
	Sets the solid type of the physics.
	*/
	@External
	public MetaVar PhysicsInit(MetaVarNumber solidTypeVar){return null;};
	/**
	Makes the physics object of the entity a AABB.
	*/
	@External
	public MetaVar PhysicsInitBox(MetaVarVector minsVar,MetaVarVector maxsVar){return null;};
	/**
	Builds the mesh from multiple convex collision meshes.
	*/
	@External
	public MetaVar PhysicsInitMultiConvex(MetaVarTable verticesVar){return null;};
	/**
	Makes the physics object of the entity a sphere.
	*/
	@External
	public MetaVar PhysicsInitSphere(MetaVarNumber radiusVar){return null;};
	/**
	Removes the entity it is used on.
	*/
	@External
	public MetaVar Remove(){return null;};
	/**
	Removes all decals from the entities surface.
	*/
	@External
	public MetaVar RemoveAllDecals(){return null;};
	/**
	Removes the CallOnRemove'd function referred to by identifier
	*/
	@External
	public MetaVar RemoveCallOnRemove(MetaVarString identifierVar){return null;};
	/**
	Sets the angles of the entity.
	*/
	@External
	public MetaVar SetAngles(MetaVarAngle anglesVar){return null;};
	/**
	Sets the blood color this entity uses.
	*/
	@External
	public MetaVar SetBloodColor(MetaVarNumber bloodColorVar){return null;};
	/**
	Sets the entity's collision group. It takes an integer that corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/COLLISION" title="Enums/COLLISION">COLLISION_ Enums</a>
	*/
	@External
	public MetaVar SetCollisionGroup(MetaVarNumber groupVar){return null;};
	/**
	Sets the color of an entity.
	*/
	@External
	public MetaVar SetColor(){return null;};
	/**
	Sets how much friction an entity has when sliding against a surface. Entities default to 1 (100%) and can be higher or even negative.
	*/
	@External
	public MetaVar SetFriction(MetaVarNumber frictionVar){return null;};
	/**
	Sets the gravity multiplier of the entity.
	*/
	@External
	public MetaVar SetGravity(MetaVarNumber gravityMultiplierVar){return null;};
	/**
	Sets the health of the entity.
	*/
	@External
	public MetaVar SetHealth(MetaVarNumber newHealthVar){return null;};
	/**
	Enables or disable the inverse kinematic usage of this entity.
	*/
	@External
	public MetaVar SetIK(MetaVarBoolean useIKVar){return null;};
	/**
	Sets the rendering material override of the entity.
	*/
	@External
	public MetaVar SetMaterial(MetaVarString materialNameVar){return null;};
	/**
	Sets the health of the entity.
	*/
	@External
	public MetaVar SetModel(MetaVarString modelNameVar){return null;};
	/**
	Scales the model of the entity.
	*/
	@External
	public MetaVar SetModelScale(MetaVarNumber scaleVar,MetaVarNumber deltaTimeVar){return null;};
	/**
	Sets the entity's movetype. It takes an integer that corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/MOVETYPE" title="Enums/MOVETYPE">MOVETYPE_ Enums</a>
	*/
	@External
	public MetaVar SetMoveType(MetaVarNumber movetypeVar){return null;};
	/**
	Sets the mapping name of the entity.
	*/
	@External
	public MetaVar SetName(MetaVarString mappingNameVar){return null;};
	/**
	Sets if the entity's model should render at all
	*/
	@External
	public MetaVar SetNoDraw(MetaVarBoolean shouldNotDrawVar){return null;};
	/**
	Sets the "owner" of the entity, which will disable the collision and damage receiving for this entity.
	*/
	@External
	public MetaVar SetOwner(MetaVarEntity ownerVar){return null;};
	/**
	Sets the parent of this entity.
	*/
	@External
	public MetaVar SetParent(){return null;};
	/**
	Moves the entity to the specified position.
	*/
	@External
	public MetaVar SetPos(MetaVarVector positionVar){return null;};
	/**
	Sets the specified pose parameter to the specified value.
	*/
	@External
	public MetaVar SetPoseParameter(MetaVarString poseNameVar,MetaVarNumber poseValueVar){return null;};
	/**
	Sets the skin of the entity.
	*/
	@External
	public MetaVar SetSkin(MetaVarNumber skinIndexVar){return null;};
	/**
	Returns the amount of skins the entity has.
	*/
	@External
	public MetaVarNumber SkinCount(){return null;};
	/**
	Initializes the entity and starts it's networking.
	*/
	@External
	public MetaVar Spawn(){return null;};
	/**
	Applies the specified amount of damage to the entity.
	*/
	@External
	public MetaVar TakeDamage(MetaVarNumber damageAmountVar,MetaVarEntity attackerVar,MetaVarEntity inflictorVar){return null;};
	/**
	Applies the damage specified by the damage info to the entity.
	*/
	//public MetaVar TakeDamageInfo(MetaVarCTakeDamageInfo damageInfoVar){return null;};
	/**
	Returns the "water level" describing how much the entity is interacting with water.
	*/
	@External
	public MetaVarNumber WaterLevel(){return null;};
	/**
	Converts a worldspace vector into a vector local to an entity
	*/
	@External
	public MetaVarVector WorldToLocal(MetaVarVector wposVar){return null;};
}
