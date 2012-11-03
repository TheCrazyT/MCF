package com.crazyt.gmod;
import com.crazyt.gmod.*;
import com.crazyt.mcf.External;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
@External
public class Functions {
	@External
	public MetaVar AccessorFunc(MetaVarTable tabVar,com.crazyt.gmod.IMetaVarAny keyVar,MetaVarString nameVar,MetaVarNumber iForceVar){return null;};
	@External
	public MetaVar AccessorFuncNW(){return null;};
	@External
	public MetaVar AddCSLuaFile(MetaVarString fileVar){return null;};
	@External
	public MetaVar AddConsoleCommand(MetaVarString nameVar,MetaVarString helpTextVar,MetaVarNumber flagsVar){return null;};
	@External
	public MetaVar AddOriginToPVS(MetaVarVector positionVar){return null;};
	@External
	public MetaVar Add_NPC_Class(MetaVarString nameVar){return null;};
	//public MetaVarIMaterial AddonMaterial(MetaVarString nameVar){return null;};
	@External
	public MetaVarAngle Angle(MetaVarNumber pitchVar,MetaVarNumber yawVar,MetaVarNumber rollVar){return null;};
	@External
	public MetaVarAngle AngleRand(){return null;};
	@External
	public MetaVar BroadcastLua(MetaVarString codeVar){return null;};
	@External
	public MetaVarTable BuildNetworkedVarsTable(){return null;};
	@External
	public MetaVar ClientsideModel(MetaVarString nameVar,MetaVarNumber renderGroupVar){return null;};
	//public MetaVarCSEnt ClientsideScene(MetaVarString nameVar,MetaVarEntity targetEntVar){return null;};
	@External
	public MetaVar Color(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){return null;};
	@External
	public MetaVar ColorAlpha(MetaVarNumber alphaVar){return null;};
	@External
	public MetaVarNumber ColorToHSV(){return null;};
	@External
	public MetaVar CompileFile(MetaVarString pathVar){return null;};
	@External
	public MetaVarFunction CompileString(MetaVarString codeVar,MetaVarString identifierVar,MetaVarBoolean HandleErrorVar){return null;};
	@External
	public MetaVarBoolean ConVarExists(MetaVarString nameVar){return null;};
	@External
	public MetaVar CreateClientConVar(MetaVarString nameVar,MetaVarBoolean shouldsaveVar,MetaVarBoolean userdataVar){return null;};
	//public MetaVarConVar CreateConVar(MetaVarString nameVar,MetaVarString helptextVar){return null;};
	//public MetaVarIMaterial CreateMaterial(MetaVarString nameVar,MetaVarString shaderVar,MetaVarTable materialDataVar){return null;};
	@External
	public MetaVarNumber CreateSound(MetaVarEntity targetEntVar,MetaVarString soundNameVar){return null;};
	@External
	public MetaVarNumber CurTime(){return null;};
	//public MetaVarCTakeDamageInfo DamageInfo(){return null;};
	@External
	public MetaVar DeriveGamemode(MetaVarString TextVar){return null;};
	@External
	public MetaVarPanel DermaMenu(MetaVarPanel parentVar){return null;};
	@External
	public MetaVarPanel Derma_Message(MetaVarString TextVar,MetaVarString TitleVar,MetaVarString ButtonVar){return null;};
	@External
	public MetaVarPanel Derma_StringRequest(MetaVarString TitleVar,MetaVarString SubtitleVar,MetaVarString DefaultTextVar,MetaVarFunction ConfirmVar,MetaVarFunction CancelVar){return null;};
	@External
	public MetaVar DrawBloom(MetaVarNumber DarkenVar,MetaVarNumber MultiplyVar,MetaVarNumber SizeXVar,MetaVarNumber SizeYVar,MetaVarNumber PassesVar,MetaVarNumber ColorMultiplyVar,MetaVarNumber RedVar,MetaVarNumber GreenVar,MetaVarNumber BlueVar){return null;};
	@External
	public MetaVar DrawMaterialOverlay(MetaVarString MaterialVar,MetaVarNumber RefractAmountVar){return null;};
	@External
	public MetaVar DrawMotionBlur(MetaVarNumber AddAlphaVar,MetaVarNumber DrawAlphaVar,MetaVarNumber DelayVar){return null;};
	@External
	public MetaVar DrawSharpen(MetaVarNumber ContrastVar,MetaVarNumber DistanceVar){return null;};
	@External
	public MetaVar DrawSobel(MetaVarNumber ThresholdVar){return null;};
	@External
	public MetaVar DrawTexturize(MetaVarNumber ScaleVar,MetaVarNumber BaseTextureVar){return null;};
	@External
	public MetaVar DrawToyTown(MetaVarNumber PassesVar,MetaVarNumber HeightVar){return null;};
	@External
	public MetaVar DropEntityIfHeld(MetaVarEntity entVar){return null;};
	//public MetaVarDlight_t DynamicLight(MetaVarNumber indexVar){return null;};
	//public MetaVarCEffectData EffectData(){return null;};
	@External
	public com.crazyt.gmod.IMetaVarAny Either(MetaVarBoolean conditionVar,com.crazyt.gmod.IMetaVarAny truevarVar,com.crazyt.gmod.IMetaVarAny falsevarVar){return null;};
	@External
	public MetaVar EmitSound(MetaVarString soundNameVar,MetaVarVector positionVar,MetaVarNumber volumeVar,MetaVarNumber soundLevelVar,MetaVarNumber soundFlagsVar,MetaVarNumber pitchVar){return null;};
	@External
	public MetaVarEntity Entity(MetaVarNumber entityIndexVar){return null;};
	@External
	public MetaVar error(MetaVarString messageVar,MetaVarNumber errorLevelVar){return null;};
	@External
	public MetaVar ErrorNoHalt(MetaVarVararg argumentsVar){return null;};
	@External
	public MetaVarAngle EyeAngles(){return null;};
	@External
	public MetaVarVector EyePos(){return null;};
	@External
	public MetaVarVector EyeVector(){return null;};
	@External
	public MetaVarTable FindMetaTable(MetaVarString metaNameVar){return null;};
	@External
	public MetaVarNumber FrameNumber(){return null;};
	@External
	public MetaVarNumber FrameTime(){return null;};
	//public MetaVarConVar GetConVar(MetaVarString nameVar){return null;};
	@External
	public MetaVarNumber GetConVarNumber(MetaVarString nameVar){return null;};
	@External
	public MetaVarString GetConVarString(MetaVarString nameVar){return null;};
	@External
	public MetaVarAngle GetGlobalAngle(MetaVarString IndexVar,MetaVarAngle DefaultVar){return null;};
	@External
	public MetaVarBoolean GetGlobalBool(MetaVarString IndexVar,MetaVarBoolean DefaultVar){return null;};
	@External
	public MetaVarEntity GetGlobalEntity(MetaVarString IndexVar,MetaVarEntity DefaultVar){return null;};
	@External
	public MetaVarString GetGlobalFloat(MetaVarString IndexVar,MetaVarNumber DefaultVar){return null;};
	@External
	public MetaVarNumber GetGlobalInt(MetaVarString IndexVar,MetaVarNumber DefaultVar){return null;};
	@External
	public MetaVarString GetGlobalString(MetaVarString IndexVar,MetaVarString DefaultVar){return null;};
	@External
	public com.crazyt.gmod.IMetaVarAny GetGlobalVar(MetaVarString IndexVar,com.crazyt.gmod.IMetaVarAny DefaultVar){return null;};
	@External
	public MetaVarVector GetGlobalVector(MetaVarString IndexVar,MetaVarVector DefaultVar){return null;};
	@External
	public MetaVarPanel GetHUDPanel(){return null;};
	@External
	public MetaVarString GetHostName(){return null;};
	//public MetaVarITexture GetRenderTarget(MetaVarString nameVar,MetaVarNumber widthVar,MetaVarNumber heightVar,MetaVarBoolean additiveVar){return null;};
	//public MetaVarITexture GetRenderTargetEx(MetaVarString nameVar,MetaVarNumber widthVar,MetaVarNumber heightVar,MetaVarNumber indexVar,MetaVarNumber sizeModeVar,MetaVarNumber textureFlagsVar,MetaVarNumber rtFlagsVar,MetaVarNumber imageFormatVar){return null;};
	@External
	public MetaVar HSVToColor(MetaVarNumber hueVar,MetaVarNumber saturationVar,MetaVarNumber valueVar){return null;};
	@External
	public MetaVar HTTP(){return null;};
	@External
	public MetaVarBoolean IsBullshitBone(MetaVarString bonenameVar){return null;};
	@External
	public MetaVarBoolean isentity(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	@External
	public MetaVarBoolean IsFirstTimePredicted(){return null;};
	@External
	public MetaVarBoolean IsMounted(){return null;};
	@External
	public MetaVarBoolean IsValid(com.crazyt.gmod.IMetaVarAny toBeValidatedVar){return null;};
	@External
	public MetaVarPanel Label(MetaVarString textVar){return null;};
	@External
	public MetaVarNumber Lerp(MetaVarNumber deltaVar,MetaVarNumber fromVar,MetaVarNumber toVar){return null;};
	//public MetaVarPlayer LocalPlayer(){return null;};
	@External
	public MetaVarVector LocalToWorld(MetaVarVector localPosVar,MetaVarAngle localAngVar,MetaVarVector originPosVar,MetaVarAngle originAngleVar){return null;};
	@External
	public MetaVar Localize(MetaVarString localisationTokenVar,MetaVarString defaultVar){return null;};
	//public MetaVarIMaterial Material(MetaVarString materialNameVar,MetaVarString pngParametersVar){return null;};
	//public MetaVarVMatrix Matrix(){return null;};
	//public MetaVarIMesh Mesh(){return null;};
	@External
	public MetaVarString Model(MetaVarString modelVar){return null;};
	@External
	public MetaVar Msg(MetaVarVararg argsVar){return null;};
	@External
	public MetaVar MsgAll(MetaVarVararg argsVar){return null;};
	@External
	public MetaVar MsgC(MetaVarVararg argsVar){return null;};
	@External
	public MetaVar MsgN(MetaVarVararg argsVar){return null;};
	@External
	public MetaVar ParticleEffect(MetaVarString particleNameVar,MetaVarVector positionVar,MetaVarAngle anglesVar,MetaVarEntity parentVar){return null;};
	@External
	public MetaVar ParticleEffectAttach(MetaVarString particleNameVar,MetaVarNumber attachTypeVar,MetaVarEntity entityVar,MetaVarNumber attachmentIDVar){return null;};
	//public MetaVarCLuaEmitter ParticleEmitter(MetaVarVector positionVar,MetaVarBoolean use3DVar){return null;};
	//public MetaVarPlayer Player(MetaVarNumber playerIndexVar){return null;};
	@External
	public MetaVar PrintTable(MetaVarTable tableToPrintVar,MetaVarNumber indentVar,MetaVarTable doneVar){return null;};
	@External
	public MetaVarNumber RealTime(){return null;};
	//public MetaVarCRecipientFilter RecipientFilter(){return null;};
	@External
	public MetaVar RunConsoleCommand(MetaVarString commandVar,MetaVarVararg argumentsVar){return null;};
	@External
	public MetaVar RunString(MetaVarString codeVar){return null;};
	@External
	public MetaVarNumber ScrH(){return null;};
	@External
	public MetaVarNumber ScrW(){return null;};
	@External
	public MetaVarNumber ScreenScale(MetaVarNumber SizeVar){return null;};
	@External
	public MetaVar ServerLog(){return null;};
	@External
	public MetaVar SetClipboardText(MetaVarString textVar){return null;};
	@External
	public MetaVar SetGlobalInt(MetaVarString IndexVar,MetaVarNumber ValueVar){return null;};
	@External
	public MetaVarString Sound(MetaVarString soundPathVar){return null;};
	@External
	public MetaVarNumber SoundDuration(MetaVarString soundNameVar){return null;};
	@External
	public MetaVarNumber SysTime(){return null;};
	@External
	public MetaVarNumber TypeID(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	@External
	public MetaVarNumber UnPredictedCurTime(){return null;};
	@External
	public MetaVarNumber VGUIFrameTime(){return null;};
	@External
	public MetaVarBoolean ValidPanel(MetaVarPanel panelVar){return null;};
	@External
	public MetaVarVector Vector(MetaVarNumber xVar,MetaVarNumber yVar,MetaVarNumber zVar){return null;};
	@External
	public MetaVarVector VectorRand(){return null;};
	@External
	public MetaVarVector WorldToLocal(MetaVarVector newSystemOriginVar,MetaVarAngle newSystemAnglesVar,MetaVarVector positionVar,MetaVarAngle angleVar){return null;};
	//public MetaVarVararg assert(com.crazyt.gmod.IMetaVarAny expressionVar,MetaVarString errorMessageVar){return null;};
	@External
	public MetaVarBoolean collectgarbage(MetaVarString actionVar,MetaVarNumber argVar){return null;};
	@External
	public MetaVarTable getfenv(){return null;};
	@External
	public MetaVarTable getmetatable(MetaVarTable TabVar){return null;};
	@External
	public MetaVar include(MetaVarString fileNameVar){return null;};
	@External
	public MetaVarFunction ipairs(MetaVarTable tabVar){return null;};
	@External
	public MetaVarBoolean isangle(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	@External
	public MetaVarBoolean isbool(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	@External
	public MetaVarBoolean isfunction(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	@External
	public MetaVarBoolean isnumber(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	@External
	public MetaVarBoolean isstring(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	@External
	public MetaVarBoolean istable(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	@External
	public MetaVarBoolean isvector(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	@External
	public MetaVar module(MetaVarString nameVar,MetaVarVararg loadersVar){return null;};
	@External
	public com.crazyt.gmod.IMetaVarAny next(MetaVarTable tabVar,com.crazyt.gmod.IMetaVarAny prevKeyVar){return null;};
	@External
	public MetaVarFunction pairs(MetaVarTable tabVar){return null;};
	@External
	public MetaVarBoolean pcall(MetaVarFunction funcVar,MetaVarVararg argumentsVar){return null;};
	@External
	public MetaVar print(MetaVarVararg argsVar){return null;};
	@External
	public MetaVarBoolean rawequal(com.crazyt.gmod.IMetaVarAny arg2Var){return null;};
	@External
	public MetaVar rawset(MetaVarTable tableVar,com.crazyt.gmod.IMetaVarAny indexVar,com.crazyt.gmod.IMetaVarAny valueVar){return null;};
	@External
	public MetaVarBoolean require(MetaVarString nameVar){return null;};
	@External
	public MetaVarVararg select(MetaVarVararg varargVar){return null;};
	@External
	public MetaVarFunction setfenv(MetaVarTable enviromentVar){return null;};
	@External
	public MetaVarTable setmetatable(MetaVarTable TabVar,MetaVarTable MetatableVar){return null;};
	@External
	public MetaVarBoolean tobool(com.crazyt.gmod.IMetaVarAny valVar){return null;};
	@External
	public MetaVarNumber tonumber(MetaVarNumber baseVar){return null;};
	@External
	public MetaVarString tostring(com.crazyt.gmod.IMetaVarAny VarVar){return null;};
	@External
	public MetaVarString type(com.crazyt.gmod.IMetaVarAny VarVar){return null;};
	@External
	public MetaVarVararg unpack(MetaVarTable tblVar,MetaVarNumber startIndexVar,MetaVarNumber endIndexVar){return null;};
	@External
	public MetaVarBoolean xpcall(MetaVarFunction funcVar,MetaVarFunction errorCallbackVar){return null;};
}
