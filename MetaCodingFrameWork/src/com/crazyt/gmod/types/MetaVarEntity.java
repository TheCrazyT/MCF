package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarEntityImpl.class)
public interface MetaVarEntity extends MetaVar,IMetaVarAny{
	/**
	Activates the entity. This needs to be used on some entities (like constraints) after being spawned.
	*/
	@External
	@SharedFunc
	public MetaVar Active();
	/**
	Applies engine effects to an entity, see <a href="http://wiki.garrysmod.com/page/Enums/EF" title="Enums/EF">EF_ Enums</a>.
	*/
	@External
	@SharedFunc
	public MetaVar AddEffects(MetaVarNumber effectEnumVar);
	/**
	Rotates an object so that it's angles are aligned to the ones inputed.
	*/
	@External
	@SharedFunc
	public MetaVarAngle AlignAngles(MetaVarAngle fromVar,MetaVarAngle toVar);
	/**
	Spawns a ragdoll for the entity, and makes the entity invisible.
	*/
	@External
	@ClientFunc
	public MetaVar BecomeRagdollOnClient();
	/**
	Returns the distance between the center of the bounding box and the furthest bounding box corner.
	*/
	@External
	@SharedFunc
	public MetaVarNumber BoundingRadius();
	/**
	Causes a specified function to be run if the entity is removed by any means.
	*/
	//public MetaVar CallOnRemove(MetaVarString identifierVar,MetaVarFunction removeFuncVar,com.crazyt.gmod.IMetaVarAny argn...Var);
	/**
	Whenever the entity is removed, entityToRemove will be removed also.
	*/
	@External
	@ServerFunc
	public MetaVar DeleteOnRemove(MetaVarEntity entityToRemoveVar);
	/**
	Performs a trace attack.
	*/
	//public MetaVar DispatchTraceAttack(MetaVarCTakeDamageInfo damageInfoVar,MetaVarVector traceStartVar,MetaVarVector traceEndVar);
	/**
	Returns the way one entity "feels" about another. Only used for NPCs. The returned value corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/D" title="Enums/D">D_ Enums</a>.
	*/
	@External
	@ServerFunc
	public MetaVarNumber Disposition(MetaVarEntity entVar);
	/**
	This removes the argument entity from an ent's list of entities to 'delete on remove'
	*/
	@External
	@ServerFunc
	public MetaVar DontDeleteOnRemove(MetaVarEntity entityToUnremoveVar);
	/**
	Running this function will draw the model of the attached entity. This can only be used in 3d rendering hooks, such as <a href="http://wiki.garrysmod.com/page/Events/Entity/Draw" title="Events/Entity/Draw">Draw</a>
	*/
	@External
	@ClientFunc
	public MetaVar DrawModel();
	/**
	Sets whenever an entities shadow should be drawn.
	*/
	@External
	@SharedFunc
	public MetaVar DrawShadow(MetaVarBoolean shouldDrawVar);
	/**
	Move an entity down until it collides with something.
	*/
	@External
	@ServerFunc
	public MetaVar DropToFloor();
	/**
	Plays a sound on an entity.
	*/
	@External
	@SharedFunc
	public MetaVar EmitSound(MetaVarString soundNameVar,MetaVarNumber soundLevelVar,MetaVarNumber pitchPercentVar);
	/**
	Flags an entity as using custom lua defined collisions. Fixes entities having spongy player collisions or not hitting traces, such as after <a href="http://wiki.garrysmod.com/page/Classes/Entity" title="Classes/Entity">Entity</a>:<a href="http://wiki.garrysmod.com/page/Classes/Entity/PhysicsFromMesh" title="Classes/Entity/PhysicsFromMesh">PhysicsFromMesh</a>
	*/
	@External
	@SharedFunc
	public MetaVar EnableCustomCollisions(MetaVarBoolean useCustomVar);
	/**
	Can be used to scale a model by a vector
	*/
	//public MetaVar EnableMatrix(MetaVarString matrixTypeVar,MetaVarVMatrix matrixVar);
	/**
	Gets the unique entity index of an entity.
	*/
	@External
	@SharedFunc
	public MetaVarNumber EntIndex();
	/**
	Extinguishes the entity if it is on fire.
	*/
	@External
	@ServerFunc
	public MetaVar Extinguish();
	/**
	Returns the direction a player/npc/ragdoll is looking as a world-oriented angle.
	*/
	@External
	@SharedFunc
	public MetaVarAngle EyeAngles();
	/**
	Returns the position of an Player/NPC's view, or two vectors for ragdolls (one for each eye)
	*/
	@External
	@SharedFunc
	public MetaVarVector EyePos();
	/**
	Fires an entity's input
	*/
	@External
	@ServerFunc
	public MetaVar Fire(MetaVarString inputVar,MetaVarString paramVar,MetaVarNumber delayVar);
	/**
	Fires a bullet.
	*/
	@External
	@SharedFunc
	public MetaVar FireBullets(MetaVarBullet bulletInfoVar);
	/**
	Gets the angles of given entity.
	*/
	@External
	@SharedFunc
	public MetaVarAngle GetAngles();
	/**
	Gets the orientation and position of the attachment by its id.
	*/
	@External
	@SharedFunc
	public MetaVar GetAttachment(MetaVarNumber attachmentIdVar);
	/**
	Returns a table with <a href="http://wiki.garrysmod.com/page/Classes/AttachmentData" title="Classes/AttachmentData" class="mw-redirect">AttachmentData</a> sets.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetAttachments();
	/**
	Returns the blood color this entity uses, which corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/BLOOD" title="Enums/BLOOD">BLOOD_ Enums</a>
	*/
	@External
	@ServerFunc
	public MetaVarNumber GetBloodColor();
	/**
	Returns a list of all attachments of the entity, a table containing <a href="http://wiki.garrysmod.com/page/Classes/BodyGroupData" title="Classes/BodyGroupData" class="mw-redirect">BodyGroupData</a> sets.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetBodyGroups();
	/**
	Gets the exact value for specific bodygroup of given entity.
	*/
	@External
	@SharedFunc
	public MetaVar GetBodygroup(MetaVarNumber idVar);
	/**
	Gets the number of bodygroups available for given entity.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetBodygroupCount();
	/**
	Gets the name of specific bodygroup for given entity.
	*/
	@External
	@SharedFunc
	public MetaVarString GetBodygroupName(MetaVarNumber idVar);
	/**
	Returns the classname of a entity.
	*/
	@External
	@SharedFunc
	public MetaVarString GetClass();
	/**
	Returns the entity's collision group, which corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/COLLISION" title="Enums/COLLISION">COLLISION_ Enums</a>
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetCollisionGroup();
	/**
	Returns the color the entity is set to.
	*/
	@External
	@SharedFunc
	public MetaVar GetColor();
	/**
	Returns the two entities involved in a constraint ent
	*/
	@External
	@ServerFunc
	public MetaVarEntity GetConstrainedEntities();
	/**
	Returns the two entities physobjects involved in a constraint ent
	*/
	//public MetaVarPhysObj GetConstrainedPhysObjects();
	/**
	Returns the forward vector of the entity, as a normalized direction vector
	*/
	@External
	@SharedFunc
	public MetaVarVector GetForward();
	/**
	Returns how much friction an entity has. Entities default to 1 (100%) and can be higher or even negative.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetFriction();
	/**
	Gets the gravity multiplier of the entity.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetGravity();
	/**
	Returns the object the entity is standing on.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetGroundEntity();
	/**
	Returns the material override for this entity.
	*/
	@External
	@SharedFunc
	public MetaVarString GetMaterial();
	/**
	Gets the model of given entity.
	*/
	@External
	@SharedFunc
	public MetaVarString GetModel();
	/**
	Returns the entity's movetype, which corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/MOVETYPE" title="Enums/MOVETYPE">MOVETYPE_ Enums</a>
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMoveType();
	/**
	Returns the mapping name of this entity.
	*/
	//public MetaVarString GetName();
	/**
	Returns if the entity's rendering has been disabled
	*/
	@External
	@SharedFunc
	public MetaVarBoolean GetNoDraw();
	/**
	Returns the body group count of the entity.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetNumBodyGroups();
	/**
	Returns the owner entity of this entity.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetOwner();
	/**
	Returns the parent entity of this entity.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetParent();
	/**
	Returns the entity's physics object, if the entity has physics
	*/
	//public MetaVarPhysObj GetPhysicsObject();
	/**
	Returns the number of physics object an entity has (usually 1 for non ragdolls)
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetPhysicsObjectCount();
	/**
	Returns a specific physics object from an entity with multiple (ragdolls)
	*/
	//public MetaVarPhysObj GetPhysicsObjectNum(MetaVarNumber physNumVar);
	/**
	Gets the position of entity in world.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetPos();
	/**
	Returns the rightward vector of the entity, as a normalized direction vector
	*/
	@External
	@SharedFunc
	public MetaVarVector GetRight();
	/**
	Returns the skin index of the current skin.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetSkin();
	/**
	Returns the table that contains all values saved within the entity.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetTable();
	/**
	Returns the upward vector of the entity, as a normalized direction vector
	*/
	@External
	@SharedFunc
	public MetaVarVector GetUp();
	/**
	Returns the directional velocity of the entity.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetVelocity();
	/**
	Returns the health of the entity.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Health();
	/**
	Sets the entity on fire.
	*/
	@External
	@ServerFunc
	public MetaVar Ignite();
	/**
	Returns true if the entity has constraints attached to it
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsConstrained();
	/**
	Returns if the entity is within the world bounds.
	*/
	@External
	@ServerFunc
	public MetaVarBoolean IsInWorld();
	/**
	Checks if the entity is a NPC or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsNPC();
	/**
	Returns if the entity is on fire.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsOnFire();
	/**
	Returns if the entity is on ground.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsOnGround();
	/**
	Checks if the entity is a player or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsPlayer();
	/**
	Returns if the entity is valid (ie not NULL).
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsValid();
	/**
	Checks if the entity is a vehicle or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsVehicle();
	/**
	Checks if the entity is a weapon or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsWeapon();
	/**
	Returns if the entity is the map's Entity[0] worldspawn
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsWorld();
	/**
	Converts a vector local to an entity into a worldspace vector
	*/
	@External
	@SharedFunc
	public MetaVarVector LocalToWorld(MetaVarVector lposVar);
	/**
	Gets the attachment index of the given attachment name, returns nothing if the attachment does not exist.
	*/
	@External
	@SharedFunc
	public MetaVarNumber LookupAttachment(MetaVarString attachmentNameVar);
	/**
	Gets the bone index of the given bone name, returns nothing if the bone does not exist.
	*/
	@External
	@SharedFunc
	public MetaVarNumber LookupBone(MetaVarString boneNameVar);
	/**
	Sets custom bone angles
	*/
	@External
	@SharedFunc
	public MetaVar ManipulateBoneAngles(MetaVarNumber BoneIDVar,MetaVarAngle AngleVar);
	/**
	Sets custom bone offsets
	*/
	@External
	@SharedFunc
	public MetaVar ManipulateBonePosition(MetaVarNumber BoneIDVar,MetaVarVector VectorVar);
	/**
	Sets custom bone scale
	*/
	@External
	@SharedFunc
	public MetaVar ManipulateBoneScale(MetaVarNumber BoneIDVar,MetaVarVector VectorVar);
	/**
	Performs a Ray OBBox intersection with the entity and returns the hit position.
	*/
	@External
	@SharedFunc
	public MetaVar NearestPoint(MetaVarVector positionVar);
	/**
	Returns the high corner of an entity's OBB as a local vector.
	*/
	@External
	@SharedFunc
	public MetaVarVector OBBMaxs();
	/**
	Wakes up the entity's physics object
	*/
	@External
	@SharedFunc
	public MetaVar PhysWake();
	/**
	Builds the mesh from a table mesh vertexes.
	*/
	@External
	@SharedFunc
	public MetaVar PhysicsFromMesh(MetaVarTable verticesVar,MetaVarBoolean staticVar);
	/**
	Sets the solid type of the physics.
	*/
	@External
	@SharedFunc
	public MetaVar PhysicsInit(MetaVarNumber solidTypeVar);
	/**
	Makes the physics object of the entity a AABB.
	*/
	@External
	@SharedFunc
	public MetaVar PhysicsInitBox(MetaVarVector minsVar,MetaVarVector maxsVar);
	/**
	Builds the mesh from multiple convex collision meshes.
	*/
	@External
	@SharedFunc
	public MetaVar PhysicsInitMultiConvex(MetaVarTable verticesVar);
	/**
	Makes the physics object of the entity a sphere.
	*/
	@External
	@SharedFunc
	public MetaVar PhysicsInitSphere(MetaVarNumber radiusVar);
	/**
	Removes the entity it is used on.
	*/
	//public MetaVar Remove();
	/**
	Removes all decals from the entities surface.
	*/
	@External
	@SharedFunc
	public MetaVar RemoveAllDecals();
	/**
	Removes the CallOnRemove'd function referred to by identifier
	*/
	@External
	@SharedFunc
	public MetaVar RemoveCallOnRemove(MetaVarString identifierVar);
	/**
	Sets the angles of the entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetAngles(MetaVarAngle anglesVar);
	/**
	Sets the blood color this entity uses.
	*/
	@External
	@ServerFunc
	public MetaVar SetBloodColor(MetaVarNumber bloodColorVar);
	/**
	Sets the entity's collision group. It takes an integer that corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/COLLISION" title="Enums/COLLISION">COLLISION_ Enums</a>
	*/
	@External
	@SharedFunc
	public MetaVar SetCollisionGroup(MetaVarNumber groupVar);
	/**
	Sets the color of an entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetColor(MetaVarColor colorVar);
	/**
	Sets how much friction an entity has when sliding against a surface. Entities default to 1 (100%) and can be higher or even negative.
	*/
	@External
	@SharedFunc
	public MetaVar SetFriction(MetaVarNumber frictionVar);
	/**
	Sets the gravity multiplier of the entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetGravity(MetaVarNumber gravityMultiplierVar);
	/**
	Sets the health of the entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetHealth(MetaVarNumber newHealthVar);
	/**
	Enables or disable the inverse kinematic usage of this entity.
	*/
	@External
	@ClientFunc
	public MetaVar SetIK(MetaVarBoolean useIKVar);
	/**
	Sets the rendering material override of the entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetMaterial(MetaVarString materialNameVar);
	/**
	Sets the health of the entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetModel(MetaVarString modelNameVar);
	/**
	Scales the model of the entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetModelScale(MetaVarNumber scaleVar,MetaVarNumber deltaTimeVar);
	/**
	Sets the entity's movetype. It takes an integer that corresponds to a <a href="http://wiki.garrysmod.com/page/Enums/MOVETYPE" title="Enums/MOVETYPE">MOVETYPE_ Enums</a>
	*/
	@External
	@SharedFunc
	public MetaVar SetMoveType(MetaVarNumber movetypeVar);
	/**
	Sets the mapping name of the entity.
	*/
	@External
	@ServerFunc
	public MetaVar SetName(MetaVarString mappingNameVar);
	/**
	Sets if the entity's model should render at all
	*/
	@External
	@SharedFunc
	public MetaVar SetNoDraw(MetaVarBoolean shouldNotDrawVar);
	/**
	Sets the "owner" of the entity, which will disable the collision and damage receiving for this entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetOwner(MetaVarEntity ownerVar);
	/**
	Sets the parent of this entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetParent();
	/**
	Moves the entity to the specified position.
	*/
	@External
	@SharedFunc
	public MetaVar SetPos(MetaVarVector positionVar);
	/**
	Sets the specified pose parameter to the specified value.
	*/
	@External
	@SharedFunc
	public MetaVar SetPoseParameter(MetaVarString poseNameVar,MetaVarNumber poseValueVar);
	/**
	Sets the skin of the entity.
	*/
	@External
	@SharedFunc
	public MetaVar SetSkin(MetaVarNumber skinIndexVar);
	/**
	Returns the amount of skins the entity has.
	*/
	@External
	@SharedFunc
	public MetaVarNumber SkinCount();
	/**
	Initializes the entity and starts it's networking.
	*/
	@External
	@SharedFunc
	public MetaVar Spawn();
	/**
	Applies the specified amount of damage to the entity.
	*/
	@External
	@ServerFunc
	public MetaVar TakeDamage(MetaVarNumber damageAmountVar,MetaVarEntity attackerVar,MetaVarEntity inflictorVar);
	/**
	Applies the damage specified by the damage info to the entity.
	*/
	//public MetaVar TakeDamageInfo(MetaVarCTakeDamageInfo damageInfoVar);
	/**
	Returns the "water level" describing how much the entity is interacting with water.
	*/
	@External
	@SharedFunc
	public MetaVarNumber WaterLevel();
	/**
	Converts a worldspace vector into a vector local to an entity
	*/
	@External
	@SharedFunc
	public MetaVarVector WorldToLocal(MetaVarVector wposVar);
}
