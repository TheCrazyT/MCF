package com.crazyt.gmod;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.libs.*;
import com.crazyt.mcf.External;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.BasicFunctions;
import com.crazyt.mcf.Library;
@External
public abstract class Functions extends BasicFunctions {
	/**
	Adds simple Get/Set accessor functions on the specified table.<br />
Can also force the value to be set to a number, bool or string.
	*/
	@External
	@SharedFunc
	public MetaVar AccessorFunc(MetaVarTable tabVar,com.crazyt.gmod.IMetaVarAny keyVar,MetaVarString nameVar,MetaVarNumber iForceVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Throws the error "[AccessorFuncNW] is depreciated. Look up 'SetupDataTables'. Sorry&#160;:("
	*/
	@External
	@SharedFunc
	public MetaVar AccessorFuncNW(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Marks a Lua file to be sent to clients when they join the server.
	*/
	@External
	@SharedFunc
	public MetaVar AddCSLuaFile(MetaVarString fileVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Tells the engine to register a console command. If the command was ran, the engine calls <a href="http://wiki.garrysmod.com/page/Libraries/concommand" title="Libraries/concommand">concommand</a>.<a href="/index.php?title=Libraries/concommand/Run&amp;action=edit&amp;redlink=1" class="new" title="Libraries/concommand/Run (page does not exist)">Run</a>. If you want to add a console command use <a href="http://wiki.garrysmod.com/page/Libraries/concommand" title="Libraries/concommand">concommand</a>.<a href="http://wiki.garrysmod.com/page/Libraries/concommand/Add" title="Libraries/concommand/Add">Add</a>.
	*/
	@External
	@SharedFunc
	public MetaVar AddConsoleCommand(MetaVarString nameVar,MetaVarString helpTextVar,MetaVarNumber flagsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Adds the specified vector to the PVS which is currently building. This allows all objects in visleafs visible from that vector to be drawn.
	*/
	@External
	@ServerFunc
	public MetaVar AddOriginToPVS(MetaVarVector positionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a CLASS_ Enum and assigns it as a global variable with a automatic value so as to prevent collisions with other scripts.
	*/
	@External
	@SharedFunc
	public MetaVar Add_NPC_Class(MetaVarString nameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Loads the specified material from the /cache folder, usually used in combination <a href="http://wiki.garrysmod.com/page/Libraries/steamworks" title="Libraries/steamworks">steamworks</a>.<a href="http://wiki.garrysmod.com/page/Libraries/steamworks/Download" title="Libraries/steamworks/Download">Download</a>.
	*/
	//public MetaVarIMaterial AddonMaterial(MetaVarString nameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates an <a href="http://wiki.garrysmod.com/page/Classes/Angle" title="Classes/Angle">Angle</a> object.
	*/
	@External
	@SharedFunc
	public MetaVarAngle Angle(MetaVarNumber pitchVar,MetaVarNumber yawVar,MetaVarNumber rollVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a angle with a randomized pitch, yaw and roll, each between -180 and 180 degrees.
	*/
	@External
	@SharedFunc
	public MetaVarAngle AngleRand(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sends the specified Lua code to all connected clients and executes it.
	*/
	@External
	@SharedFunc
	public MetaVar BroadcastLua(MetaVarString codeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Dumps the networked variables of all entities into one table and returns it.
	*/
	@External
	@SharedFunc
	public MetaVarTable BuildNetworkedVarsTable(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a non physical entity that only exists on the client.
	*/
	@External
	@ClientFunc
	public MetaVar ClientsideModel(MetaVarString nameVar,MetaVarNumber renderGroupVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a scene entity based on the scene name and the entity.
	*/
	//public MetaVarCSEnt ClientsideScene(MetaVarString nameVar,MetaVarEntity targetEntVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a <a href="http://wiki.garrysmod.com/page/Classes/Color" title="Classes/Color" class="mw-redirect">Color</a> object.
	*/
	@External
	@SharedFunc
	public MetaVar Color(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a new <a href="http://wiki.garrysmod.com/page/Classes/Color" title="Classes/Color" class="mw-redirect">Color</a> with the RGB components of the given <a href="http://wiki.garrysmod.com/page/Classes/Color" title="Classes/Color" class="mw-redirect">Color</a> and the alpha value specified.
	*/
	@External
	@SharedFunc
	public MetaVar ColorAlpha(MetaVarColor colorVar,MetaVarNumber alphaVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Converts a <a href="http://wiki.garrysmod.com/page/Structures/Color" title="Structures/Color">Color</a> object into HSV color space.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ColorToHSV(MetaVarColor colorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Compiles the file, and returns a function on success or nil on failure.
	*/
	@External
	@SharedFunc
	public MetaVar CompileFile(MetaVarString pathVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Compiles the string of Lua code as a function and returns it.<br /> If there is an error, it will print the error to the console and return nil.<br /> If HandleError is set to false, it will return an error string on failure, instead of nil.
	*/
	@External
	@SharedFunc
	public MetaVarFunction CompileString(MetaVarString codeVar,MetaVarString identifierVar,MetaVarBoolean HandleErrorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever a convar with the given name exists
	*/
	@External
	@SharedFunc
	public MetaVarBoolean ConVarExists(MetaVarString nameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Makes a clientside-only console variable
	*/
	@External
	@SharedFunc
	public MetaVar CreateClientConVar(MetaVarString nameVar,MetaVarBoolean shouldsaveVar,MetaVarBoolean userdataVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a console variable (ConVar), in general these are for things like gamemode/server settings.
	*/
	//public MetaVarConVar CreateConVar(MetaVarString nameVar,MetaVarString helptextVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a new material with the specified name and shader.
	*/
	//public MetaVarIMaterial CreateMaterial(MetaVarString nameVar,MetaVarString shaderVar,MetaVarTable materialDataVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a sound patch parented to the specified entity.
	*/
	@External
	@SharedFunc
	public MetaVarNumber CreateSound(MetaVarEntity targetEntVar,MetaVarString soundNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the uptime of the server in seconds.
	*/
	@External
	@SharedFunc
	public MetaVarNumber CurTime(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates an empty damage info.
	*/
	//public MetaVarCTakeDamageInfo DamageInfo(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Retrieves data from the base gamemode.
	*/
	@External
	@SharedFunc
	public MetaVar DeriveGamemode(MetaVarString TextVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a DMenu similar to a contextmenu and closes any current menus
	*/
	@External
	@ClientFunc
	public MetaVarPanel DermaMenu(MetaVarPanel parentVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a derma window to display information
	*/
	@External
	@ClientFunc
	public MetaVarPanel Derma_Message(MetaVarString TextVar,MetaVarString TitleVar,MetaVarString ButtonVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a derma window asking players to input a string.
	*/
	@External
	@ClientFunc
	public MetaVarPanel Derma_StringRequest(MetaVarString TitleVar,MetaVarString SubtitleVar,MetaVarString DefaultTextVar,MetaVarFunction ConfirmVar,MetaVarFunction CancelVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws the bloom shader, which creates a glowing effect from bright objects.
	*/
	@External
	@ClientFunc
	public MetaVar DrawBloom(MetaVarNumber DarkenVar,MetaVarNumber MultiplyVar,MetaVarNumber SizeXVar,MetaVarNumber SizeYVar,MetaVarNumber PassesVar,MetaVarNumber ColorMultiplyVar,MetaVarNumber RedVar,MetaVarNumber GreenVar,MetaVarNumber BlueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws a material overlay on the screen.
	*/
	@External
	@ClientFunc
	public MetaVar DrawMaterialOverlay(MetaVarString MaterialVar,MetaVarNumber RefractAmountVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a motion blur effect by drawing your screen multiple times.
	*/
	@External
	@ClientFunc
	public MetaVar DrawMotionBlur(MetaVarNumber AddAlphaVar,MetaVarNumber DrawAlphaVar,MetaVarNumber DelayVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws the sharpen shader, which creates more contrast.
	*/
	@External
	@ClientFunc
	public MetaVar DrawSharpen(MetaVarNumber ContrastVar,MetaVarNumber DistanceVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws the sobel shader, which detects edges and draws a black border.
	*/
	@External
	@ClientFunc
	public MetaVar DrawSobel(MetaVarNumber ThresholdVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws the texturize shader, which replaces each pixel on your screen with a different part of the texture depending on its brightness.  See <a href="http://wiki.garrysmod.com/page/Misc/Shaders/g_texturize" title="Misc/Shaders/g texturize">g_textureize</a> for information on making the texture.
	*/
	@External
	@ClientFunc
	public MetaVar DrawTexturize(MetaVarNumber ScaleVar,MetaVarNumber BaseTextureVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws the toy town shader, which blurs the top and bottom of your screen. This can make very large objects look like toys, hence the name.
	*/
	@External
	@ClientFunc
	public MetaVar DrawToyTown(MetaVarNumber PassesVar,MetaVarNumber HeightVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Drops the specified entity if with the physcannon by any player.
	*/
	@External
	@ServerFunc
	public MetaVar DropEntityIfHeld(MetaVarEntity entVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates or replaces a dynamic light with the given id
	*/
	//public MetaVarDlight_t DynamicLight(MetaVarNumber indexVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a new effect data object to be used with <a href="http://wiki.garrysmod.com/page/Libraries/util" title="Libraries/util">util</a>.<a href="http://wiki.garrysmod.com/page/Libraries/util/Effect" title="Libraries/util/Effect">Effect</a>.
	*/
	//public MetaVarCEffectData EffectData(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	An 'if then else'
	*/
	@External
	@SharedFunc
	public com.crazyt.gmod.IMetaVarAny Either(MetaVarBoolean conditionVar,com.crazyt.gmod.IMetaVarAny truevarVar,com.crazyt.gmod.IMetaVarAny falsevarVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Emits the specified sound at the specified position.
	*/
	@External
	@SharedFunc
	public MetaVar EmitSound(MetaVarString soundNameVar,MetaVarVector positionVar,MetaVarNumber volumeVar,MetaVarNumber soundLevelVar,MetaVarNumber soundFlagsVar,MetaVarNumber pitchVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the entity with the matching ent index or NULL.
	*/
	@External
	@SharedFunc
	public MetaVarEntity Entity(MetaVarNumber entityIndexVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sends the specified Lua code to all connected clients and executes it.
	*/
	@External
	@SharedFunc
	public MetaVar error(MetaVarString messageVar,MetaVarNumber errorLevelVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Throws a Lua error but does not break out of the current call stack.
	*/
	@External
	@SharedFunc
	public MetaVar ErrorNoHalt(MetaVarVararg argumentsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the angles of the players view calculated by <a href="http://wiki.garrysmod.com/page/Hooks/Base/CalcView" title="Hooks/Base/CalcView">Base:CalcView</a>.
	*/
	@External
	@ClientFunc
	public MetaVarAngle EyeAngles(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the position of the players view point calculated by <a href="http://wiki.garrysmod.com/page/Hooks/Base/CalcView" title="Hooks/Base/CalcView">Base:CalcView</a>.
	*/
	@External
	@ClientFunc
	public MetaVarVector EyePos(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the normal of the players view calculated by <a href="http://wiki.garrysmod.com/page/Hooks/Base/CalcView" title="Hooks/Base/CalcView">Base:CalcView</a> similar to <a href="http://wiki.garrysmod.com/page/Global/EyeAngles" title="Global/EyeAngles">EyeAngles</a>.
	*/
	@External
	@ClientFunc
	public MetaVarVector EyeVector(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the meta table for the class with the matching name.
	*/
	@External
	@SharedFunc
	public MetaVarTable FindMetaTable(MetaVarString metaNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the number of frames rendered since the game was launched.
	*/
	@External
	@ClientFunc
	public MetaVarNumber FrameNumber(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the time in second it took to render the last frame.
	*/
	@External
	@SharedFunc
	public MetaVarNumber FrameTime(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the ConVar with the specified name.
	*/
	//public MetaVarConVar GetConVar(MetaVarString nameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the numeric value ConVar with the specified name.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetConVarNumber(MetaVarString nameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the string value ConVar with the specified name.
	*/
	@External
	@SharedFunc
	public MetaVarString GetConVarString(MetaVarString nameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns an angle that is shared between the server and all clients.
	*/
	@External
	@SharedFunc
	public MetaVarAngle GetGlobalAngle(MetaVarString IndexVar,MetaVarAngle DefaultVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a boolean that is shared between the server and all clients.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean GetGlobalBool(MetaVarString IndexVar,MetaVarBoolean DefaultVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns an entity that is shared between the server and all clients.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetGlobalEntity(MetaVarString IndexVar,MetaVarEntity DefaultVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a float that is shared between the server and all clients.
	*/
	@External
	@SharedFunc
	public MetaVarString GetGlobalFloat(MetaVarString IndexVar,MetaVarNumber DefaultVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns an integer that is shared between the server and all clients.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetGlobalInt(MetaVarString IndexVar,MetaVarNumber DefaultVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a string that is shared between the server and all clients.
	*/
	@External
	@SharedFunc
	public MetaVarString GetGlobalString(MetaVarString IndexVar,MetaVarString DefaultVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a variable that is shared between the server and all clients.
	*/
	@External
	@SharedFunc
	public com.crazyt.gmod.IMetaVarAny GetGlobalVar(MetaVarString IndexVar,com.crazyt.gmod.IMetaVarAny DefaultVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a vector that is shared between the server and all clients.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetGlobalVector(MetaVarString IndexVar,MetaVarVector DefaultVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the panel that is used as a wrapper for the HUD.
	*/
	@External
	@ClientFunc
	public MetaVarPanel GetHUDPanel(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the name of the current server.
	*/
	@External
	@SharedFunc
	public MetaVarString GetHostName(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates or gets the rendertarget with the given name.
	*/
	//public MetaVarITexture GetRenderTarget(MetaVarString nameVar,MetaVarNumber widthVar,MetaVarNumber heightVar,MetaVarBoolean additiveVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates or gets the rendertarget with the given name, this function allows to adjust the creation of a rendertarget more than <a href="http://wiki.garrysmod.com/page/Global/GetRenderTarget" title="Global/GetRenderTarget">GetRenderTarget</a>
	*/
	//public MetaVarITexture GetRenderTargetEx(MetaVarString nameVar,MetaVarNumber widthVar,MetaVarNumber heightVar,MetaVarNumber indexVar,MetaVarNumber sizeModeVar,MetaVarNumber textureFlagsVar,MetaVarNumber rtFlagsVar,MetaVarNumber imageFormatVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Converts a color from HSV color space into RGB color space and returns a color object.
	*/
	@External
	@SharedFunc
	public MetaVar HSVToColor(MetaVarNumber hueVar,MetaVarNumber saturationVar,MetaVarNumber valueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Launches a threaded http request with the given parameters
	*/
	@External
	@SharedFunc
	public MetaVar HTTP(MetaVarHTTPRequest parametersVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns true if the bonename is in a list of bones that the bone editor does not like to modify
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsBullshitBone(MetaVarString bonenameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the passed object is an entity.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean isentity(com.crazyt.gmod.IMetaVarAny variableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the current even is first time predicted.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsFirstTimePredicted(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks whether or not a game is currently mounted.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsMounted(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks if a table or class is valid<br />Checks that an object is not nil, has an IsValid method and if this method returns true.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsValid(com.crazyt.gmod.IMetaVarAny toBeValidatedVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Convenience function that creates a DLabel, sets the text, and returns it
	*/
	@External
	@ClientFunc
	public MetaVarPanel Label(MetaVarString textVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Performs a linear interpolation from the start number to the end number.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Lerp(MetaVarNumber deltaVar,MetaVarNumber fromVar,MetaVarNumber toVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the player object of the current client.
	*/
	//public MetaVarPlayer LocalPlayer(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Translates the specified position and angle from the specified coordinate system into worldspace coordinates
	*/
	@External
	@SharedFunc
	public MetaVarVector LocalToWorld(MetaVarVector localPosVar,MetaVarAngle localAngVar,MetaVarVector originPosVar,MetaVarAngle originAngleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a localisation for the given token, if none is found it will return the default(second) parameter.
	*/
	@External
	@ClientFunc
	public MetaVar Localize(MetaVarString localisationTokenVar,MetaVarString defaultVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Either returns the material with the given name, or loads the material interpreting the first argument as the path.
	*/
	//public MetaVarIMaterial Material(MetaVarString materialNameVar,MetaVarString pngParametersVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns an empty matrix object.
	*/
	//public MetaVarVMatrix Matrix(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a new mesh object.
	*/
	//public MetaVarIMesh Mesh(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Runs <a href="http://wiki.garrysmod.com/page/Libraries/util" title="Libraries/util">util</a>.<a href="http://wiki.garrysmod.com/page/Libraries/util/PrecacheModel" title="Libraries/util/PrecacheModel">PrecacheModel</a> and returns the string
	*/
	@External
	@SharedFunc
	public MetaVarString Model(MetaVarString modelVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes every given argument to the console.<br />
Automatically attempts to convert each argument to a string. (See <a href="http://wiki.garrysmod.com/page/Global/tostring" title="Global/tostring">tostring</a>)<br />
Unlike <a href="http://wiki.garrysmod.com/page/Global/print" title="Global/print">print</a>, arguments are not separated by anything. They are simply concatenated.<br />
The text is colored depending on the realm where the function is called from (see the notes below).
	*/
	@External
	@SharedFunc
	public MetaVar Msg(MetaVarVararg argsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Works exactly like <a href="http://wiki.garrysmod.com/page/Global/Msg" title="Global/Msg">Msg</a> except that, if called on the server, will print to all players consoles plus the server console.
	*/
	@External
	@SharedFunc
	public MetaVar MsgAll(MetaVarVararg argsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Just like <a href="http://wiki.garrysmod.com/page/Global/Msg" title="Global/Msg">Msg</a>, except the text color is decided by the first argument.
	*/
	@External
	@SharedFunc
	public MetaVar MsgC(MetaVarColor colorVar,MetaVarVararg argsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Just like <a href="http://wiki.garrysmod.com/page/Global/Msg" title="Global/Msg">Msg</a>, except it adds a newline (<i>"\n"</i>) at the end.
	*/
	@External
	@SharedFunc
	public MetaVar MsgN(MetaVarVararg argsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a particle effect.
	*/
	@External
	@SharedFunc
	public MetaVar ParticleEffect(MetaVarString particleNameVar,MetaVarVector positionVar,MetaVarAngle anglesVar,MetaVarEntity parentVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a particle effect with specialized parameters.
	*/
	@External
	@SharedFunc
	public MetaVar ParticleEffectAttach(MetaVarString particleNameVar,MetaVarNumber attachTypeVar,MetaVarEntity entityVar,MetaVarNumber attachmentIDVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a new particle emitter.
	*/
	//public MetaVarCLuaEmitter ParticleEmitter(MetaVarVector positionVar,MetaVarBoolean use3DVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the player with the matching player index.
	*/
	//public MetaVarPlayer Player(MetaVarNumber playerIndexVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Recursively prints the contents of a table to the console.
	*/
	@External
	@SharedFunc
	public MetaVar PrintTable(MetaVarTable tableToPrintVar,MetaVarNumber indentVar,MetaVarTable doneVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the uptime of the game/server in seconds.
	*/
	@External
	@SharedFunc
	public MetaVarNumber RealTime(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a new recipient filter object.
	*/
	//public MetaVarCRecipientFilter RecipientFilter(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Executes the given console command with the parameters.
	*/
	@External
	@SharedFunc
	public MetaVar RunConsoleCommand(MetaVarString commandVar,MetaVarVararg argumentsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Evaluates and executes the given code, will throw an error on failure.
	*/
	@External
	@SharedFunc
	public MetaVar RunString(MetaVarString codeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the height of the screen (in pixels).
	*/
	@External
	@ClientFunc
	public MetaVarNumber ScrH(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the width of the screen (in pixels).
	*/
	@External
	@ClientFunc
	public MetaVarNumber ScrW(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a number based on the Size argument and your screen's width.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ScreenScale(MetaVarNumber SizeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Prints "ServerLog: PARAM" without a newline, to the server log and console.
	*/
	@External
	@ServerFunc
	public MetaVar ServerLog(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Adds the given string to the computers clipboard, which can then be pasted in or outside of GMod with Ctrl + V.
	*/
	@External
	@ClientFunc
	public MetaVar SetClipboardText(MetaVarString textVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets an integer that is shared between the server and all clients.
	*/
	@External
	@SharedFunc
	public MetaVar SetGlobalInt(MetaVarString IndexVar,MetaVarNumber ValueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Runs <a href="http://wiki.garrysmod.com/page/Libraries/util" title="Libraries/util">util</a>.<a href="http://wiki.garrysmod.com/page/Libraries/util/PrecacheSound" title="Libraries/util/PrecacheSound">PrecacheSound</a> and returns the string
	*/
	@External
	@SharedFunc
	public MetaVarString Sound(MetaVarString soundPathVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the duration of the sound specified in seconds.
	*/
	@External
	@SharedFunc
	public MetaVarNumber SoundDuration(MetaVarString soundNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a highly accurate time since the start up, ideal for benchmarking.
	*/
	@External
	@SharedFunc
	public MetaVarNumber SysTime(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the associated type id of the variable.
	*/
	@External
	@SharedFunc
	public MetaVarNumber TypeID(com.crazyt.gmod.IMetaVarAny variableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the current asynchronous in-game time.
	*/
	@External
	@SharedFunc
	public MetaVarNumber UnPredictedCurTime(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the time in seconds it took to render the VGUI.
	*/
	@External
	@SharedFunc
	public MetaVarNumber VGUIFrameTime(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if a panel is safe to use.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean ValidPanel(MetaVarPanel panelVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a <a href="http://wiki.garrysmod.com/page/Classes/Vector" title="Classes/Vector">Vector</a> object.
	*/
	@External
	@SharedFunc
	public MetaVarVector Vector(MetaVarNumber xVar,MetaVarNumber yVar,MetaVarNumber zVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a random vector whose components are each between -1 and 1
	*/
	@External
	@SharedFunc
	public MetaVarVector VectorRand(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Translates the specified position and angle into the specified coordinate system.
	*/
	@External
	@SharedFunc
	public MetaVarVector WorldToLocal(MetaVarVector newSystemOriginVar,MetaVarAngle newSystemAnglesVar,MetaVarVector positionVar,MetaVarAngle angleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Throws an error if the first argument evaluates to false, the second argument can be used to specify the error, otherwise "assertion failed". 
Otherwise returns all argument passed to the function
	*/
	//public MetaVarVararg assert(com.crazyt.gmod.IMetaVarAny expressionVar,MetaVarString errorMessageVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Executes the specified action on the garbage collector.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean collectgarbage(MetaVarString actionVar,MetaVarNumber argVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the environment table of either the stack level or the function specified.
	*/
	@External
	@SharedFunc
	public MetaVarTable getfenv(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets a table's metatable.<br />
Has <a href="http://wiki.garrysmod.com/page/Lua/Tutorials/Using_Metatables#metatable" title="Lua/Tutorials/Using Metatables">certain limitations</a>.<br />
	*/
	@External
	@SharedFunc
	public MetaVarTable getmetatable(MetaVarTable TabVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Executes a Lua script either relative to the current file, or absolute(relative to the /lua/ folder).
	*/
	@External
	@SharedFunc
	public MetaVar include(MetaVarString fileNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns an iterator function for a for loop that will return the values of the specified sequential numerical table in order.
	*/
	@External
	@SharedFunc
	public MetaVarFunction ipairs(MetaVarTable tabVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the passed object is an angle.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean isangle(com.crazyt.gmod.IMetaVarAny variableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the passed object is a boolean.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean isbool(com.crazyt.gmod.IMetaVarAny variableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the passed object is a function.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean isfunction(com.crazyt.gmod.IMetaVarAny variableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the passed object is a number.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean isnumber(com.crazyt.gmod.IMetaVarAny variableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the passed object is a string.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean isstring(com.crazyt.gmod.IMetaVarAny variableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the passed object is a table.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean istable(com.crazyt.gmod.IMetaVarAny variableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the passed object is a vector.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean isvector(com.crazyt.gmod.IMetaVarAny variableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a table with the specified module name and sets the function environment for said table, calls all additional loaders as the table as argument.
	*/
	@External
	@SharedFunc
	public MetaVar module(MetaVarString nameVar,MetaVarVararg loadersVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the next key and value pair in a table
	*/
	@External
	@SharedFunc
	public com.crazyt.gmod.IMetaVarAny next(MetaVarTable tabVar,com.crazyt.gmod.IMetaVarAny prevKeyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns an iterator function(<a href="http://wiki.garrysmod.com/page/Global/next" title="Global/next">next</a>) for a for loop that will return the values of the specified table in an arbitrary order.
	*/
	@External
	@SharedFunc
	public MetaVarFunction pairs(MetaVarTable tabVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Calls a function and catches an error that can be thrown while the execution of the call.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean pcall(MetaVarFunction funcVar,MetaVarVararg argumentsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes every given argument to the console.<br />
Automatically attempts to convert each argument to a string. (See <a href="http://wiki.garrysmod.com/page/Global/tostring" title="Global/tostring">tostring</a>)<br />
Separates arguments with a tab character (<i>"\t"</i>).
	*/
	@External
	@SharedFunc
	public MetaVar print(MetaVarVararg argsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Compares the first and the second argument without calling their __eq operator.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean rawequal(com.crazyt.gmod.IMetaVarAny arg2Var){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the value with the specified key from the table without calling the __newindex method.
	*/
	@External
	@SharedFunc
	public MetaVar rawset(MetaVarTable tableVar,com.crazyt.gmod.IMetaVarAny indexVar,com.crazyt.gmod.IMetaVarAny valueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	First tries to load a binary module with the given name, if unsuccesfull, it tries to load a lua module with the given name.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean require(MetaVarString nameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Used to select single values from a vararg or get the count of values in it.
	*/
	@External
	@SharedFunc
	public MetaVarVararg select(MetaVarVararg varargVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the enviroment for a function or a stack level, if a function is passed, the return value will be the function, otherwise nil.
	*/
	@External
	@SharedFunc
	public MetaVarFunction setfenv(MetaVarTable enviromentVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets, changes or removes a table's metatable.
Returns Tab (first argument).
	*/
	@External
	@SharedFunc
	public MetaVarTable setmetatable(MetaVarTable TabVar,MetaVarTable MetatableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Attempts to return an appropriate boolean for the given value
	*/
	@External
	@SharedFunc
	public MetaVarBoolean tobool(com.crazyt.gmod.IMetaVarAny valVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Converts the string to a number with the given base, returns nil on failure.
	*/
	@External
	@SharedFunc
	public MetaVarNumber tonumber(MetaVarNumber baseVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Attempts to convert an object to a string, if defined, it will call the <a href="http://wiki.garrysmod.com/page/Lua/Tutorials/Using_Metatables#tostring" title="Lua/Tutorials/Using Metatables">__tostring</a> method for the given object's metatable, <a href="http://wiki.garrysmod.com/page/Global/print" title="Global/print">print</a> also uses this functionality.
	*/
	//public MetaVarString tostring(com.crazyt.gmod.IMetaVarAny VarVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a string representing the name of the type of the passed object.
	*/
	@External
	@SharedFunc
	public MetaVarString type(com.crazyt.gmod.IMetaVarAny VarVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	This function takes a numeric indexed table and return all the members as a vararg, if specified it will start at the given index to the if specified end index.
	*/
	@External
	@SharedFunc
	public MetaVarVararg unpack(MetaVarTable tblVar,MetaVarNumber startIndexVar,MetaVarNumber endIndexVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Attempts to call the first function, if the execution fails, the second function is called with the error message, unlike in <a href="http://wiki.garrysmod.com/page/Global/pcall" title="Global/pcall">Global/pcall</a> the stack is not unwinded and can therefor be used to stack analyses using <a href="http://wiki.garrysmod.com/page/Libraries/debug" title="Libraries/debug">debug</a>.<a href="/index.php?title=Libraries/debug/getinfo&amp;action=edit&amp;redlink=1" class="new" title="Libraries/debug/getinfo (page does not exist)">getinfo</a>, the disadvantage of this function is, that it does not allow passing argument to the to be called function.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean xpcall(MetaVarFunction funcVar,MetaVarFunction errorCallbackVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("ai")
	public LibAi getAi(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("ai_schedule")
	public LibAi_schedule getAi_schedule(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("ai_task")
	public LibAi_task getAi_task(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("constraint")
	public LibConstraint getConstraint(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("construct")
	public LibConstruct getConstruct(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("gmsave")
	public LibGmsave getGmsave(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("hammer")
	public LibHammer getHammer(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("navmesh")
	public LibNavmesh getNavmesh(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("numpad")
	public LibNumpad getNumpad(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("umsg")
	public LibUmsg getUmsg(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("achievements")
	public LibAchievements getAchievements(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("cam")
	public LibCam getCam(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("chat")
	public LibChat getChat(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("controlpanel")
	public LibControlpanel getControlpanel(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("cookie")
	public LibCookie getCookie(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("derma")
	public LibDerma getDerma(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("dragndrop")
	public LibDragndrop getDragndrop(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("draw")
	public LibDraw getDraw(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("effects")
	public LibEffects getEffects(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("frame_blend")
	public LibFrame_blend getFrame_blend(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("gui")
	public LibGui getGui(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("GWEN")
	public LibGWEN getGWEN(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("halo")
	public LibHalo getHalo(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("input")
	public LibInput getInput(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("killicon")
	public LibKillicon getKillicon(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("language")
	public LibLanguage getLanguage(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("matproxy")
	public LibMatproxy getMatproxy(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("markup")
	public LibMarkup getMarkup(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("menubar")
	public LibMenubar getMenubar(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("menu")
	public LibMenu getMenu(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("mesh")
	public LibMesh getMesh(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("notification")
	public LibNotification getNotification(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("presets")
	public LibPresets getPresets(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("render")
	public LibRender getRender(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("search")
	public LibSearch getSearch(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("spawnmenu")
	public LibSpawnmenu getSpawnmenu(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("steamworks")
	public LibSteamworks getSteamworks(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("surface")
	public LibSurface getSurface(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("vgui")
	public LibVgui getVgui(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("video")
	public LibVideo getVideo(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("bit")
	public LibBit getBit(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("baseclass")
	public LibBaseclass getBaseclass(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("cleanup")
	public LibCleanup getCleanup(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("concommand")
	public LibConcommand getConcommand(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("coroutine")
	public LibCoroutine getCoroutine(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("cvars")
	public LibCvars getCvars(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("debugoverlay")
	public LibDebugoverlay getDebugoverlay(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("debug")
	public LibDebug getDebug(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("drive")
	public LibDrive getDrive(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("duplicator")
	public LibDuplicator getDuplicator(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("engine")
	public LibEngine getEngine(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("ents")
	public LibEnts getEnts(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("file")
	public LibFile getFile(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("gameevent")
	public LibGameevent getGameevent(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("gamemode")
	public LibGamemode getGamemode(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("game")
	public LibGame getGame(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("gmod")
	public LibGmod getGmod(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("hook")
	public LibHook getHook(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("http")
	public LibHttp getHttp(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("jit")
	public LibJit getJit(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("list")
	public LibList getList(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("math")
	public LibMath getMath(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("net")
	public LibNet getNet(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("os")
	public LibOs getOs(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("package")
	public LibPackage getPackage(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("physenv")
	public LibPhysenv getPhysenv(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("player_manager")
	public LibPlayer_manager getPlayer_manager(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("player")
	public LibPlayer getPlayer(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("properties")
	public LibProperties getProperties(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("resource")
	public LibResource getResource(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("saverestore")
	public LibSaverestore getSaverestore(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("scripted_ents")
	public LibScripted_ents getScripted_ents(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("sound")
	public LibSound getSound(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("sql")
	public LibSql getSql(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("string")
	public LibString getString(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("system")
	public LibSystem getSystem(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("table")
	public LibTable getTable(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("team")
	public LibTeam getTeam(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("timer")
	public LibTimer getTimer(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("undo")
	public LibUndo getUndo(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("usermessage")
	public LibUsermessage getUsermessage(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("util")
	public LibUtil getUtil(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("weapons")
	public LibWeapons getWeapons(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	@Library("widgets")
	public LibWidgets getWidgets(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
