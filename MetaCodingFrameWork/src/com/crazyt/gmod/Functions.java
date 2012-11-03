package com.crazyt.gmod;
import com.crazyt.gmod.*;
import com.crazyt.mcf.External;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
@External
public class Functions {
	@External
	public MetaVar AccessorFunc(MetaVarTable tabVar,com.crazyt.gmod.IMetaVarAny keyVar,MetaVarString nameVar,MetaVarNumber iForceVar){return null;};
	/**
	Throws the error "[AccessorFuncNW] is depreciated. Look up 'SetupDataTables'. Sorry&#160;:("
	*/
	@External
	public MetaVar AccessorFuncNW(){return null;};
	/**
	Marks a Lua file to be sent to clients when they join the server.
	*/
	@External
	public MetaVar AddCSLuaFile(MetaVarString fileVar){return null;};
	@External
	public MetaVar AddConsoleCommand(MetaVarString nameVar,MetaVarString helpTextVar,MetaVarNumber flagsVar){return null;};
	/**
	Adds the specified vector to the PVS which is currently building. This allows all objects in visleafs visible from that vector to be drawn.
	*/
	@External
	public MetaVar AddOriginToPVS(MetaVarVector positionVar){return null;};
	/**
	Creates a CLASS_ Enum and assigns it as a global variable with a automatic value so as to prevent collisions with other scripts.
	*/
	@External
	public MetaVar Add_NPC_Class(MetaVarString nameVar){return null;};
	//public MetaVarIMaterial AddonMaterial(MetaVarString nameVar){return null;};
	/**
	Creates an angle and prints the value to the console.
	*/
	@External
	public MetaVarAngle Angle(MetaVarNumber pitchVar,MetaVarNumber yawVar,MetaVarNumber rollVar){return null;};
	/**
	Returns a angle with a randomized pitch, yaw and roll, each between -180 and 180 degrees.
	*/
	@External
	public MetaVarAngle AngleRand(){return null;};
	/**
	Sends the specified Lua code to all connected clients and executes it.
	*/
	@External
	public MetaVar BroadcastLua(MetaVarString codeVar){return null;};
	/**
	Dumps the networked variables of all entities into one table and returns it.
	*/
	@External
	public MetaVarTable BuildNetworkedVarsTable(){return null;};
	/**
	Creates a non physical entity that only exists on the client.
	*/
	@External
	public MetaVar ClientsideModel(MetaVarString nameVar,MetaVarNumber renderGroupVar){return null;};
	/**
	Creates a scene entity based on the scene name and the entity.
	*/
	//public MetaVarCSEnt ClientsideScene(MetaVarString nameVar,MetaVarEntity targetEntVar){return null;};
	/**
	Creates a color and prints the components to the console.
	*/
	@External
	public MetaVar Color(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){return null;};
	@External
	public MetaVar ColorAlpha(MetaVarNumber alphaVar){return null;};
	/**
	Creates a color and prints the HSV values to the console.
	*/
	@External
	public MetaVarNumber ColorToHSV(){return null;};
	/**
	Compiles the file, and returns a function on success or nil on failure.
	*/
	@External
	public MetaVar CompileFile(MetaVarString pathVar){return null;};
	@External
	public MetaVarFunction CompileString(MetaVarString codeVar,MetaVarString identifierVar,MetaVarBoolean HandleErrorVar){return null;};
	/**
	Returns whenever a convar with the given name exists
	*/
	@External
	public MetaVarBoolean ConVarExists(MetaVarString nameVar){return null;};
	/**
	Makes a clientside-only console variable
	*/
	@External
	public MetaVar CreateClientConVar(MetaVarString nameVar,MetaVarBoolean shouldsaveVar,MetaVarBoolean userdataVar){return null;};
	/**
	Creates a console variable (ConVar), in general these are for things like gamemode/server settings.
	*/
	//public MetaVarConVar CreateConVar(MetaVarString nameVar,MetaVarString helptextVar){return null;};
	/**
	Creates a new material with the specified name and shader.
	*/
	//public MetaVarIMaterial CreateMaterial(MetaVarString nameVar,MetaVarString shaderVar,MetaVarTable materialDataVar){return null;};
	/**
	Returns a sound patch parented to the specified entity.
	*/
	@External
	public MetaVarNumber CreateSound(MetaVarEntity targetEntVar,MetaVarString soundNameVar){return null;};
	/**
	Returns the uptime of the server in seconds.
	*/
	@External
	public MetaVarNumber CurTime(){return null;};
	/**
	Creates an empty damage info.
	*/
	//public MetaVarCTakeDamageInfo DamageInfo(){return null;};
	/**
	Retrieves data from the base gamemode.
	*/
	@External
	public MetaVar DeriveGamemode(MetaVarString TextVar){return null;};
	/**
	Creates a DMenu similar to a contextmenu and closes any current menus
	*/
	@External
	public MetaVarPanel DermaMenu(MetaVarPanel parentVar){return null;};
	/**
	Creates a derma window to display information
	*/
	@External
	public MetaVarPanel Derma_Message(MetaVarString TextVar,MetaVarString TitleVar,MetaVarString ButtonVar){return null;};
	/**
	Creates a derma window asking players to input a string.
	*/
	@External
	public MetaVarPanel Derma_StringRequest(MetaVarString TitleVar,MetaVarString SubtitleVar,MetaVarString DefaultTextVar,MetaVarFunction ConfirmVar,MetaVarFunction CancelVar){return null;};
	/**
	Draws the bloom shader, which creates a glowing effect from bright objects.
	*/
	@External
	public MetaVar DrawBloom(MetaVarNumber DarkenVar,MetaVarNumber MultiplyVar,MetaVarNumber SizeXVar,MetaVarNumber SizeYVar,MetaVarNumber PassesVar,MetaVarNumber ColorMultiplyVar,MetaVarNumber RedVar,MetaVarNumber GreenVar,MetaVarNumber BlueVar){return null;};
	/**
	Draws a material overlay on the screen.
	*/
	@External
	public MetaVar DrawMaterialOverlay(MetaVarString MaterialVar,MetaVarNumber RefractAmountVar){return null;};
	/**
	Creates a motion blur effect by drawing your screen multiple times.
	*/
	@External
	public MetaVar DrawMotionBlur(MetaVarNumber AddAlphaVar,MetaVarNumber DrawAlphaVar,MetaVarNumber DelayVar){return null;};
	/**
	Draws the sharpen shader, which creates more contrast.
	*/
	@External
	public MetaVar DrawSharpen(MetaVarNumber ContrastVar,MetaVarNumber DistanceVar){return null;};
	/**
	Draws the sobel shader, which detects edges and draws a black border.
	*/
	@External
	public MetaVar DrawSobel(MetaVarNumber ThresholdVar){return null;};
	/**
	Draws the texturize shader with a pattern texture.
	*/
	@External
	public MetaVar DrawTexturize(MetaVarNumber ScaleVar,MetaVarNumber BaseTextureVar){return null;};
	/**
	Draws the toy town shader, which blurs the top and bottom of your screen. This can make very large objects look like toys, hence the name.
	*/
	@External
	public MetaVar DrawToyTown(MetaVarNumber PassesVar,MetaVarNumber HeightVar){return null;};
	/**
	Drops the specified entity if with the physcannon by any player.
	*/
	@External
	public MetaVar DropEntityIfHeld(MetaVarEntity entVar){return null;};
	/**
	Creates or replaces a dynamic light with the given id
	*/
	//public MetaVarDlight_t DynamicLight(MetaVarNumber indexVar){return null;};
	//public MetaVarCEffectData EffectData(){return null;};
	/**
	An 'if then else'
	*/
	@External
	public com.crazyt.gmod.IMetaVarAny Either(MetaVarBoolean conditionVar,com.crazyt.gmod.IMetaVarAny truevarVar,com.crazyt.gmod.IMetaVarAny falsevarVar){return null;};
	/**
	Emits the specified sound at the specified position.
	*/
	@External
	public MetaVar EmitSound(MetaVarString soundNameVar,MetaVarVector positionVar,MetaVarNumber volumeVar,MetaVarNumber soundLevelVar,MetaVarNumber soundFlagsVar,MetaVarNumber pitchVar){return null;};
	/**
	Returns the entity with the matching ent index or NULL.
	*/
	@External
	public MetaVarEntity Entity(MetaVarNumber entityIndexVar){return null;};
	/**
	Sends the specified Lua code to all connected clients and executes it.
	*/
	@External
	public MetaVar error(MetaVarString messageVar,MetaVarNumber errorLevelVar){return null;};
	/**
	Throws a Lua error but does not break out of the current call stack.
	*/
	@External
	public MetaVar ErrorNoHalt(MetaVarVararg argumentsVar){return null;};
	/**
	Print the view angles
	*/
	@External
	public MetaVarAngle EyeAngles(){return null;};
	/**
	Print the view position
	*/
	@External
	public MetaVarVector EyePos(){return null;};
	/**
	Print the view angles
	*/
	@External
	public MetaVarVector EyeVector(){return null;};
	/**
	Returns the meta table for the class with the matching name.
	*/
	@External
	public MetaVarTable FindMetaTable(MetaVarString metaNameVar){return null;};
	/**
	Returns the number of frames rendered since the game was launched.
	*/
	@External
	public MetaVarNumber FrameNumber(){return null;};
	/**
	Returns the time in second it took to render the last frame.
	*/
	@External
	public MetaVarNumber FrameTime(){return null;};
	/**
	Gets the ConVar with the specified name.
	*/
	//public MetaVarConVar GetConVar(MetaVarString nameVar){return null;};
	/**
	Gets the numeric value ConVar with the specified name.
	*/
	@External
	public MetaVarNumber GetConVarNumber(MetaVarString nameVar){return null;};
	/**
	Gets the string value ConVar with the specified name.
	*/
	@External
	public MetaVarString GetConVarString(MetaVarString nameVar){return null;};
	/**
	Returns an angle that is shared between the server and all clients.
	*/
	@External
	public MetaVarAngle GetGlobalAngle(MetaVarString IndexVar,MetaVarAngle DefaultVar){return null;};
	/**
	Returns a boolean that is shared between the server and all clients.
	*/
	@External
	public MetaVarBoolean GetGlobalBool(MetaVarString IndexVar,MetaVarBoolean DefaultVar){return null;};
	/**
	Returns an entity that is shared between the server and all clients.
	*/
	@External
	public MetaVarEntity GetGlobalEntity(MetaVarString IndexVar,MetaVarEntity DefaultVar){return null;};
	/**
	Returns a float that is shared between the server and all clients.
	*/
	@External
	public MetaVarString GetGlobalFloat(MetaVarString IndexVar,MetaVarNumber DefaultVar){return null;};
	/**
	Returns an integer that is shared between the server and all clients.
	*/
	@External
	public MetaVarNumber GetGlobalInt(MetaVarString IndexVar,MetaVarNumber DefaultVar){return null;};
	/**
	Returns a string that is shared between the server and all clients.
	*/
	@External
	public MetaVarString GetGlobalString(MetaVarString IndexVar,MetaVarString DefaultVar){return null;};
	/**
	Returns a variable that is shared between the server and all clients.
	*/
	@External
	public com.crazyt.gmod.IMetaVarAny GetGlobalVar(MetaVarString IndexVar,com.crazyt.gmod.IMetaVarAny DefaultVar){return null;};
	/**
	Returns a vector that is shared between the server and all clients.
	*/
	@External
	public MetaVarVector GetGlobalVector(MetaVarString IndexVar,MetaVarVector DefaultVar){return null;};
	/**
	Returns the panel that is used as a wrapper for the HUD.
	*/
	@External
	public MetaVarPanel GetHUDPanel(){return null;};
	/**
	Returns the name of the current server.
	*/
	@External
	public MetaVarString GetHostName(){return null;};
	/**
	Creates or gets the rendertarget with the given name.
	*/
	//public MetaVarITexture GetRenderTarget(MetaVarString nameVar,MetaVarNumber widthVar,MetaVarNumber heightVar,MetaVarBoolean additiveVar){return null;};
	//public MetaVarITexture GetRenderTargetEx(MetaVarString nameVar,MetaVarNumber widthVar,MetaVarNumber heightVar,MetaVarNumber indexVar,MetaVarNumber sizeModeVar,MetaVarNumber textureFlagsVar,MetaVarNumber rtFlagsVar,MetaVarNumber imageFormatVar){return null;};
	/**
	Converts a color from HSV color space into RGB color space and returns a color object.
	*/
	@External
	public MetaVar HSVToColor(MetaVarNumber hueVar,MetaVarNumber saturationVar,MetaVarNumber valueVar){return null;};
	/**
	Launches a threaded http request with the given parameters
	*/
	@External
	public MetaVar HTTP(){return null;};
	/**
	Returns true if the bonename is in a list of bones that the bone editor does not like to modify
	*/
	@External
	public MetaVarBoolean IsBullshitBone(MetaVarString bonenameVar){return null;};
	/**
	Returns if the passed object is an entity.
	*/
	@External
	public MetaVarBoolean isentity(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	/**
	Returns if the current even is first time predicted.
	*/
	@External
	public MetaVarBoolean IsFirstTimePredicted(){return null;};
	/**
	Checks whether or not a game is currently mounted.
	*/
	@External
	public MetaVarBoolean IsMounted(){return null;};
	@External
	public MetaVarBoolean IsValid(com.crazyt.gmod.IMetaVarAny toBeValidatedVar){return null;};
	/**
	Convenience function that creates a DLabel, sets the text, and returns it
	*/
	@External
	public MetaVarPanel Label(MetaVarString textVar){return null;};
	/**
	Performs a linear interpolation from the start number to the end number.
	*/
	@External
	public MetaVarNumber Lerp(MetaVarNumber deltaVar,MetaVarNumber fromVar,MetaVarNumber toVar){return null;};
	/**
	Returns the player object of the current client.
	*/
	//public MetaVarPlayer LocalPlayer(){return null;};
	/**
	Translates the specified position and angle from the specified coordinate system into worldspace coordinates
	*/
	@External
	public MetaVarVector LocalToWorld(MetaVarVector localPosVar,MetaVarAngle localAngVar,MetaVarVector originPosVar,MetaVarAngle originAngleVar){return null;};
	/**
	Returns a localisation for the given token, if none is found it will return the default(second) parameter.
	*/
	@External
	public MetaVar Localize(MetaVarString localisationTokenVar,MetaVarString defaultVar){return null;};
	/**
	Either returns the material with the given name, or loads the material interpreting the first argument as the path.
	*/
	//public MetaVarIMaterial Material(MetaVarString materialNameVar,MetaVarString pngParametersVar){return null;};
	/**
	Returns an empty matrix object.
	*/
	//public MetaVarVMatrix Matrix(){return null;};
	/**
	Returns a new mesh object.
	*/
	//public MetaVarIMesh Mesh(){return null;};
	/**
	From entities/gmod_cameraprop.lua
	*/
	@External
	public MetaVarString Model(MetaVarString modelVar){return null;};
	/**
	Prints "Hello World!" to the console.
	*/
	@External
	public MetaVar Msg(MetaVarVararg argsVar){return null;};
	@External
	public MetaVar MsgAll(MetaVarVararg argsVar){return null;};
	/**
	Prints "Hello World!" in red to the console.
	*/
	@External
	public MetaVar MsgC(MetaVarVararg argsVar){return null;};
	/**
	Prints "Hello, World!" in two lines to the console.
	*/
	@External
	public MetaVar MsgN(MetaVarVararg argsVar){return null;};
	/**
	Creates a particle effect.
	*/
	@External
	public MetaVar ParticleEffect(MetaVarString particleNameVar,MetaVarVector positionVar,MetaVarAngle anglesVar,MetaVarEntity parentVar){return null;};
	/**
	Creates a particle effect with specialized parameters.
	*/
	@External
	public MetaVar ParticleEffectAttach(MetaVarString particleNameVar,MetaVarNumber attachTypeVar,MetaVarEntity entityVar,MetaVarNumber attachmentIDVar){return null;};
	/**
	Creates a new particle emitter.
	*/
	//public MetaVarCLuaEmitter ParticleEmitter(MetaVarVector positionVar,MetaVarBoolean use3DVar){return null;};
	/**
	Returns the player with the matching player index.
	*/
	//public MetaVarPlayer Player(MetaVarNumber playerIndexVar){return null;};
	/**
	Recursively prints the contents of a table to the console.
	*/
	@External
	public MetaVar PrintTable(MetaVarTable tableToPrintVar,MetaVarNumber indentVar,MetaVarTable doneVar){return null;};
	/**
	Returns the uptime of the game/server in seconds.
	*/
	@External
	public MetaVarNumber RealTime(){return null;};
	/**
	Creates a new recipient filter object.
	*/
	//public MetaVarCRecipientFilter RecipientFilter(){return null;};
	/**
	Executes the given console command with the parameters.
	*/
	@External
	public MetaVar RunConsoleCommand(MetaVarString commandVar,MetaVarVararg argumentsVar){return null;};
	/**
	Evaluates and executes the given code, will throw an error on failure.
	*/
	@External
	public MetaVar RunString(MetaVarString codeVar){return null;};
	/**
	Returns the height of the screen (in pixels).
	*/
	@External
	public MetaVarNumber ScrH(){return null;};
	/**
	Gets the width of the screen (in pixels).
	*/
	@External
	public MetaVarNumber ScrW(){return null;};
	/**
	Returns a number based on the Size argument and your screen's width.
	*/
	@External
	public MetaVarNumber ScreenScale(MetaVarNumber SizeVar){return null;};
	/**
	Prints "ServerLog: PARAM" without a newline, to the server log and console.
	*/
	@External
	public MetaVar ServerLog(){return null;};
	/**
	Adds the given string to the computers clipboard, which can then be pasted in or outside of GMod with Ctrl + V.
	*/
	@External
	public MetaVar SetClipboardText(MetaVarString textVar){return null;};
	/**
	Sets an integer that is shared between the server and all clients.
	*/
	@External
	public MetaVar SetGlobalInt(MetaVarString IndexVar,MetaVarNumber ValueVar){return null;};
	/**
	From entities/sent_ball.lua
	*/
	@External
	public MetaVarString Sound(MetaVarString soundPathVar){return null;};
	/**
	Returns the duration of the sound specified in seconds.
	*/
	@External
	public MetaVarNumber SoundDuration(MetaVarString soundNameVar){return null;};
	/**
	Returns a highly accurate time since the start up, ideal for benchmarking.
	*/
	@External
	public MetaVarNumber SysTime(){return null;};
	/**
	Gets the associated type id of the variable.
	*/
	@External
	public MetaVarNumber TypeID(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	/**
	Returns the current asynchronous in-game time.
	*/
	@External
	public MetaVarNumber UnPredictedCurTime(){return null;};
	/**
	Returns the time in seconds it took to render the VGUI.
	*/
	@External
	public MetaVarNumber VGUIFrameTime(){return null;};
	/**
	Returns if a panel is safe to use.
	*/
	@External
	public MetaVarBoolean ValidPanel(MetaVarPanel panelVar){return null;};
	/**
	Creates a vector and prints the value to the console.
	*/
	@External
	public MetaVarVector Vector(MetaVarNumber xVar,MetaVarNumber yVar,MetaVarNumber zVar){return null;};
	/**
	Returns a random vector whose components are each between -1 and 1
	*/
	@External
	public MetaVarVector VectorRand(){return null;};
	/**
	Translates the specified position and angle into the specified coordinate system.
	*/
	@External
	public MetaVarVector WorldToLocal(MetaVarVector newSystemOriginVar,MetaVarAngle newSystemAnglesVar,MetaVarVector positionVar,MetaVarAngle angleVar){return null;};
	/**
	Throws an error if the first argument evaluates to false, the second argument can be used to specify the error, otherwise "assertion failed". 
Otherwise returns all argument passed to the function
	*/
	//public MetaVarVararg assert(com.crazyt.gmod.IMetaVarAny expressionVar,MetaVarString errorMessageVar){return null;};
	/**
	Executes the specified action on the garbage collector.
	*/
	@External
	public MetaVarBoolean collectgarbage(MetaVarString actionVar,MetaVarNumber argVar){return null;};
	/**
	Returns the environment table of either the stack level or the function specified.
	*/
	@External
	public MetaVarTable getfenv(){return null;};
	@External
	public MetaVarTable getmetatable(MetaVarTable TabVar){return null;};
	/**
	Executes a Lua script either relative to the current file, or absolute(relative to the /lua/ folder).
	*/
	@External
	public MetaVar include(MetaVarString fileNameVar){return null;};
	/**
	Returns an iterator function for a for loop that will return the values of the specified sequential numerical table in order.
	*/
	@External
	public MetaVarFunction ipairs(MetaVarTable tabVar){return null;};
	/**
	Returns if the passed object is an angle.
	*/
	@External
	public MetaVarBoolean isangle(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	/**
	Returns if the passed object is a boolean.
	*/
	@External
	public MetaVarBoolean isbool(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	/**
	Returns if the passed object is a function.
	*/
	@External
	public MetaVarBoolean isfunction(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	/**
	Returns if the passed object is a number.
	*/
	@External
	public MetaVarBoolean isnumber(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	/**
	Returns if the passed object is a string.
	*/
	@External
	public MetaVarBoolean isstring(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	/**
	Returns if the passed object is a table.
	*/
	@External
	public MetaVarBoolean istable(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	/**
	Returns if the passed object is a vector.
	*/
	@External
	public MetaVarBoolean isvector(com.crazyt.gmod.IMetaVarAny variableVar){return null;};
	/**
	Creates a table with the specified module name and sets the function environment for said table, calls all additional loaders as the table as argument.
	*/
	@External
	public MetaVar module(MetaVarString nameVar,MetaVarVararg loadersVar){return null;};
	/**
	Returns the next key and value pair in a table
	*/
	@External
	public com.crazyt.gmod.IMetaVarAny next(MetaVarTable tabVar,com.crazyt.gmod.IMetaVarAny prevKeyVar){return null;};
	/**
	Prints the name of all players
	*/
	@External
	public MetaVarFunction pairs(MetaVarTable tabVar){return null;};
	/**
	Calls a function and catches an error that can be thrown while the execution of the call.
	*/
	@External
	public MetaVarBoolean pcall(MetaVarFunction funcVar,MetaVarVararg argumentsVar){return null;};
	/**
	Prints "Hello World!" to the console.
	*/
	@External
	public MetaVar print(MetaVarVararg argsVar){return null;};
	/**
	Compares the first and the second argument without calling their __eq operator.
	*/
	@External
	public MetaVarBoolean rawequal(com.crazyt.gmod.IMetaVarAny arg2Var){return null;};
	/**
	Sets the value with the specified key from the table without calling the __newindex method.
	*/
	@External
	public MetaVar rawset(MetaVarTable tableVar,com.crazyt.gmod.IMetaVarAny indexVar,com.crazyt.gmod.IMetaVarAny valueVar){return null;};
	/**
	First tries to load a binary module with the given name, if unsuccesfull, it tries to load a lua module with the given name.
	*/
	@External
	public MetaVarBoolean require(MetaVarString nameVar){return null;};
	/**
	Used to select single values from a vararg or get the count of values in it.
	*/
	@External
	public MetaVarVararg select(MetaVarVararg varargVar){return null;};
	/**
	Sets the enviroment for a function or a stack level, if a function is passed, the return value will be the function, otherwise nil.
	*/
	@External
	public MetaVarFunction setfenv(MetaVarTable enviromentVar){return null;};
	/**
	Sets, changes or removes a table's metatable.
Returns Tab (first argument).
	*/
	@External
	public MetaVarTable setmetatable(MetaVarTable TabVar,MetaVarTable MetatableVar){return null;};
	/**
	Attempts to return an appropriate boolean for the given value
	*/
	@External
	public MetaVarBoolean tobool(com.crazyt.gmod.IMetaVarAny valVar){return null;};
	/**
	Converts the string to a number with the given base, returns nil on failure.
	*/
	@External
	public MetaVarNumber tonumber(MetaVarNumber baseVar){return null;};
	/**
	Convert a number to a string.
	*/
	@External
	public MetaVarString tostring(com.crazyt.gmod.IMetaVarAny VarVar){return null;};
	/**
	Returns a string representing the name of the type of the passed object.
	*/
	@External
	public MetaVarString type(com.crazyt.gmod.IMetaVarAny VarVar){return null;};
	/**
	This function takes a numeric indexed table and return all the members as a vararg, if specified it will start at the given index to the if specified end index.
	*/
	@External
	public MetaVarVararg unpack(MetaVarTable tblVar,MetaVarNumber startIndexVar,MetaVarNumber endIndexVar){return null;};
	/**
	Catch an error.
	*/
	@External
	public MetaVarBoolean xpcall(MetaVarFunction funcVar,MetaVarFunction errorCallbackVar){return null;};
}
