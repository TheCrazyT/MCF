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
	@External
	public MetaVar Active(){return null;};
	@External
	public MetaVar AddEffects(MetaVarNumber effectEnumVar){return null;};
	@External
	public MetaVarAngle AlignAngles(MetaVarAngle fromVar,MetaVarAngle toVar){return null;};
	@External
	public MetaVar BecomeRagdollOnClient(){return null;};
	@External
	public MetaVarNumber BoundingRadius(){return null;};
	//public MetaVar CallOnRemove(MetaVarString identifierVar,MetaVarFunction removeFuncVar,com.crazyt.gmod.IMetaVarAny argn...Var){return null;};
	@External
	public MetaVar DeleteOnRemove(MetaVarEntity entityToRemoveVar){return null;};
	//public MetaVar DispatchTraceAttack(MetaVarCTakeDamageInfo damageInfoVar,MetaVarVector traceStartVar,MetaVarVector traceEndVar){return null;};
	@External
	public MetaVarNumber Disposition(MetaVarEntity entVar){return null;};
	@External
	public MetaVar DontDeleteOnRemove(MetaVarEntity entityToUnremoveVar){return null;};
	@External
	public MetaVar DrawModel(){return null;};
	@External
	public MetaVar DrawShadow(MetaVarBoolean shouldDrawVar){return null;};
	@External
	public MetaVar DropToFloor(){return null;};
	@External
	public MetaVar EmitSound(MetaVarString soundNameVar,MetaVarNumber soundLevelVar,MetaVarNumber pitchPercentVar){return null;};
	@External
	public MetaVar EnableCustomCollisions(MetaVarBoolean useCustomVar){return null;};
	//public MetaVar EnableMatrix(MetaVarString matrixTypeVar,MetaVarVMatrix matrixVar){return null;};
	@External
	public MetaVarNumber EntIndex(){return null;};
	@External
	public MetaVar Extinguish(){return null;};
	@External
	public MetaVarAngle EyeAngles(){return null;};
	@External
	public MetaVarVector EyePos(){return null;};
	@External
	public MetaVar Fire(MetaVarString inputVar,MetaVarString paramVar,MetaVarNumber delayVar){return null;};
	@External
	public MetaVar FireBullets(){return null;};
	@External
	public MetaVarAngle GetAngles(){return null;};
	@External
	public MetaVar GetAttachment(MetaVarNumber attachmentIdVar){return null;};
	@External
	public MetaVarTable GetAttachments(){return null;};
	@External
	public MetaVarNumber GetBloodColor(){return null;};
	@External
	public MetaVarTable GetBodyGroups(){return null;};
	@External
	public MetaVar GetBodygroup(MetaVarNumber idVar){return null;};
	@External
	public MetaVarNumber GetBodygroupCount(){return null;};
	@External
	public MetaVarString GetBodygroupName(MetaVarNumber idVar){return null;};
	@External
	public MetaVarString GetClass(){return null;};
	@External
	public MetaVarNumber GetCollisionGroup(){return null;};
	@External
	public MetaVar GetColor(){return null;};
	@External
	public MetaVarEntity GetConstrainedEntities(){return null;};
	//public MetaVarPhysObj GetConstrainedPhysObjects(){return null;};
	@External
	public MetaVarVector GetForward(){return null;};
	@External
	public MetaVarNumber GetFriction(){return null;};
	@External
	public MetaVarNumber GetGravity(){return null;};
	@External
	public MetaVarEntity GetGroundEntity(){return null;};
	@External
	public MetaVarString GetMaterial(){return null;};
	@External
	public MetaVarString GetModel(){return null;};
	@External
	public MetaVarNumber GetMoveType(){return null;};
	@External
	public MetaVarString GetName(){return null;};
	@External
	public MetaVarBoolean GetNoDraw(){return null;};
	@External
	public MetaVarNumber GetNumBodyGroups(){return null;};
	@External
	public MetaVarEntity GetOwner(){return null;};
	@External
	public MetaVarEntity GetParent(){return null;};
	//public MetaVarPhysObj GetPhysicsObject(){return null;};
	@External
	public MetaVarNumber GetPhysicsObjectCount(){return null;};
	//public MetaVarPhysObj GetPhysicsObjectNum(MetaVarNumber physNumVar){return null;};
	@External
	public MetaVarVector GetPos(){return null;};
	@External
	public MetaVarVector GetRight(){return null;};
	@External
	public MetaVarNumber GetSkin(){return null;};
	@External
	public MetaVarTable GetTable(){return null;};
	@External
	public MetaVarVector GetUp(){return null;};
	@External
	public MetaVarVector GetVelocity(){return null;};
	@External
	public MetaVarNumber Health(){return null;};
	@External
	public MetaVar Ignite(){return null;};
	@External
	public MetaVarBoolean IsConstrained(){return null;};
	@External
	public MetaVarBoolean IsInWorld(){return null;};
	@External
	public MetaVarBoolean IsNPC(){return null;};
	@External
	public MetaVarBoolean IsOnFire(){return null;};
	@External
	public MetaVarBoolean IsOnGround(){return null;};
	@External
	public MetaVarBoolean IsPlayer(){return null;};
	@External
	public MetaVarBoolean IsValid(){return null;};
	@External
	public MetaVarBoolean IsVehicle(){return null;};
	@External
	public MetaVarBoolean IsWeapon(){return null;};
	@External
	public MetaVarBoolean IsWorld(){return null;};
	@External
	public MetaVarVector LocalToWorld(MetaVarVector lposVar){return null;};
	@External
	public MetaVarNumber LookupAttachment(MetaVarString attachmentNameVar){return null;};
	@External
	public MetaVarNumber LookupBone(MetaVarString boneNameVar){return null;};
	@External
	public MetaVar ManipulateBoneAngles(MetaVarNumber BoneIDVar,MetaVarAngle AngleVar){return null;};
	@External
	public MetaVar ManipulateBonePosition(MetaVarNumber BoneIDVar,MetaVarVector VectorVar){return null;};
	@External
	public MetaVar ManipulateBoneScale(MetaVarNumber BoneIDVar,MetaVarVector VectorVar){return null;};
	@External
	public MetaVar NearestPoint(MetaVarVector positionVar){return null;};
	@External
	public MetaVarVector OBBMaxs(){return null;};
	@External
	public MetaVar PhysWake(){return null;};
	@External
	public MetaVar PhysicsFromMesh(MetaVarTable verticesVar,MetaVarBoolean staticVar){return null;};
	@External
	public MetaVar PhysicsInit(MetaVarNumber solidTypeVar){return null;};
	@External
	public MetaVar PhysicsInitBox(MetaVarVector minsVar,MetaVarVector maxsVar){return null;};
	@External
	public MetaVar PhysicsInitMultiConvex(MetaVarTable verticesVar){return null;};
	@External
	public MetaVar PhysicsInitSphere(MetaVarNumber radiusVar){return null;};
	@External
	public MetaVar Remove(){return null;};
	@External
	public MetaVar RemoveAllDecals(){return null;};
	@External
	public MetaVar RemoveCallOnRemove(MetaVarString identifierVar){return null;};
	@External
	public MetaVar SetAngles(MetaVarAngle anglesVar){return null;};
	@External
	public MetaVar SetBloodColor(MetaVarNumber bloodColorVar){return null;};
	@External
	public MetaVar SetCollisionGroup(MetaVarNumber groupVar){return null;};
	@External
	public MetaVar SetColor(){return null;};
	@External
	public MetaVar SetFriction(MetaVarNumber frictionVar){return null;};
	@External
	public MetaVar SetGravity(MetaVarNumber gravityMultiplierVar){return null;};
	@External
	public MetaVar SetHealth(MetaVarNumber newHealthVar){return null;};
	@External
	public MetaVar SetIK(MetaVarBoolean useIKVar){return null;};
	@External
	public MetaVar SetMaterial(MetaVarString materialNameVar){return null;};
	@External
	public MetaVar SetModel(MetaVarString modelNameVar){return null;};
	@External
	public MetaVar SetModelScale(MetaVarNumber scaleVar,MetaVarNumber deltaTimeVar){return null;};
	@External
	public MetaVar SetMoveType(MetaVarNumber movetypeVar){return null;};
	@External
	public MetaVar SetName(MetaVarString mappingNameVar){return null;};
	@External
	public MetaVar SetNoDraw(MetaVarBoolean shouldNotDrawVar){return null;};
	@External
	public MetaVar SetOwner(MetaVarEntity ownerVar){return null;};
	@External
	public MetaVar SetParent(){return null;};
	@External
	public MetaVar SetPos(MetaVarVector positionVar){return null;};
	@External
	public MetaVar SetPoseParameter(MetaVarString poseNameVar,MetaVarNumber poseValueVar){return null;};
	@External
	public MetaVar SetSkin(MetaVarNumber skinIndexVar){return null;};
	@External
	public MetaVarNumber SkinCount(){return null;};
	@External
	public MetaVar Spawn(){return null;};
	@External
	public MetaVar TakeDamage(MetaVarNumber damageAmountVar,MetaVarEntity attackerVar,MetaVarEntity inflictorVar){return null;};
	//public MetaVar TakeDamageInfo(MetaVarCTakeDamageInfo damageInfoVar){return null;};
	@External
	public MetaVarNumber WaterLevel(){return null;};
	@External
	public MetaVarVector WorldToLocal(MetaVarVector wposVar){return null;};
}
