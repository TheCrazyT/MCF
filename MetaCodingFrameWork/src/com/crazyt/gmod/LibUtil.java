package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Library;
import com.crazyt.mcf.BasicFunctions;
import com.crazyt.mcf.BuildClass;
@External
@Library("util")
public class LibUtil extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibUtil(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Precaches the string for networking.
	*/
	@External
	@ServerFunc
	public MetaVar AddNetworkString(MetaVarString strVar){return null;};
	/**
	Encodes the specified string to base64.
	*/
	@External
	@SharedFunc
	public MetaVarString Base64Encode(MetaVarString strVar){return null;};
	/**
	Applies explosion damage to all entities in the specified radius.
	*/
	@External
	@SharedFunc
	public MetaVar BlastDamage(MetaVarEntity inflictorVar,MetaVarEntity attackerVar,MetaVarVector damageOriginVar,MetaVarNumber damageRadiusVar,MetaVarNumber damageVar){return null;};
	/**
	Generates the hash of the specified value.
	*/
	@External
	@SharedFunc
	public MetaVarString CRC(MetaVarString stringToHashVar){return null;};
	/**
	Compresses the given string using <a rel="nofollow" class="external text" href="http://fastlz.org/">FastLZ</a>.
	*/
	@External
	@SharedFunc
	public MetaVarString Compress(MetaVarString strVar){return null;};
	/**
	Returns the current date formatted like '2012-10-31 18-00-00'
	*/
	@External
	@SharedFunc
	public MetaVarString DateStamp(){return null;};
	/**
	Performs a trace and paints a decal to the surface hit.
	*/
	@External
	@SharedFunc
	public MetaVar Decal(MetaVarString decalNameVar,MetaVarVector traceStartVar,MetaVarVector traceEndVar){return null;};
	/**
	Performs a trace and paints a decal to the surface hit.
	*/
	@External
	@ClientFunc
	public MetaVar DecalEx(MetaVarIMaterial materialVar,MetaVarEntity entVar,MetaVarVector positionVar,MetaVarVector normalVar,MetaVarNumber wVar,MetaVarNumber hVar){return null;};
	/**
	Gets the full material path by the decal name.
	*/
	@External
	@SharedFunc
	public MetaVarString DecalMaterial(MetaVarString decalNameVar){return null;};
	/**
	Decompresses the given string using <a rel="nofollow" class="external text" href="http://fastlz.org/">FastLZ</a>.
	*/
	@External
	@SharedFunc
	public MetaVarString Decompress(MetaVarString compressedStringVar){return null;};
	/**
	Gets the distance between a line and a point in 3d space.
	*/
	@External
	@SharedFunc
	public MetaVarNumber DistanceToLine(MetaVarVector lineStartVar,MetaVarVector lineEndVar,MetaVarVector pointPosVar){return null;};
	/**
	Creates a effect with the specified data.
	*/
	@External
	@SharedFunc
	public MetaVar Effect(MetaVarString effectNameVar,MetaVarCEffectData effectDataVar,MetaVarBoolean allowOverrideVar){return null;};
	/**
	Creates a new PixVis handle.
	*/
	@External
	@ClientFunc
	public MetaVarPixelvis_handle_t GetPixelVisibleHandle(){return null;};
	/**
	Utility function to quickly generate a trace table that starts at the players view position, and ends 16384 units along a specified direction
	*/
	@External
	@SharedFunc
	public MetaVarTable GetPlayerTrace(MetaVarPlayer plyVar,MetaVarVector dirVar){return null;};
	/**
	Gets information about the sun position and obstruction or nil if there is no sun.
	*/
	@External
	@ClientFunc
	public MetaVar GetSunInfo(){return null;};
	/**
	Returns the matching surface index for the surface name.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetSurfaceIndex(MetaVarString surfaceNameVar){return null;};
	/**
	Performs a ray box intersection and returns position, normal and the fraction.
	*/
	@External
	@SharedFunc
	public MetaVarVector IntersectRayWithOBB(MetaVarVector rayStartVar,MetaVarVector rayDirectionVar,MetaVarVector boxOriginVar,MetaVarAngle boxAnglesVar,MetaVarVector boxMinsVar,MetaVarVector boxMaxsVar){return null;};
	/**
	Performs a ray plane intersection and returns the hit position or nil.
	*/
	@External
	@SharedFunc
	public MetaVarNumber IntersectRayWithPlane(MetaVarVector rayOriginVar,MetaVarVector rayDirectionVar,MetaVarVector planePositionVar,MetaVarVector planeNormalVar){return null;};
	/**
	Checks if a certain position in within the world bounds.
	*/
	@External
	@ServerFunc
	public MetaVarBoolean IsInWorld(MetaVarVector positionVar){return null;};
	/**
	Checks if the model is loaded in the game.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsModelLoaded(MetaVarString modelNameVar){return null;};
	/**
	Returns whenever the skybox is visibile from the point specified.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsSkyboxVisibleFromPoint(MetaVarVector positionVar){return null;};
	/**
	Checks if the specified model is valid.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsValidModel(MetaVarString modelNameVar){return null;};
	/**
	Checks if the specified prop is valid.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsValidProp(MetaVarString modelNameVar){return null;};
	/**
	Checks if the specified model name points to a valid ragdoll.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsValidRagdoll(MetaVarString ragdollNameVar){return null;};
	/**
	Converts a JSON string to a Lua table.
	*/
	@External
	@SharedFunc
	public MetaVarTable JSONToTable(MetaVarString JSONstringVar){return null;};
	/**
	Converts a KeyValue string to a Lua table.
	*/
	@External
	@SharedFunc
	public MetaVarTable KeyValuesToTable(MetaVarString KeyValuestringVar){return null;};
	/**
	Returns a vector in world coordinates based on an entity and local coordinates
	*/
	@External
	@SharedFunc
	public MetaVarVector LocalToWorld(MetaVarEntity entVar,MetaVarVector lposVar,MetaVarNumber bonenumVar){return null;};
	/**
	Returns the string associated with the given id.
	*/
	@External
	@SharedFunc
	public MetaVarString NetworkIDToString(MetaVarNumber stringTableIDVar){return null;};
	/**
	Returns the string associated with the given id.
	*/
	@External
	@SharedFunc
	public MetaVarNumber NetworkStringToID(MetaVarString networkStringVar){return null;};
	/**
	Creates a tracer effect with the given parameters.
	*/
	@External
	@SharedFunc
	public MetaVar ParticleTracer(MetaVarString nameVar,MetaVarVector startPosVar,MetaVarVector endPosVar,MetaVarBoolean doWhizVar){return null;};
	/**
	Creates a tracer effect with the given parameters.
	*/
	@External
	@SharedFunc
	public MetaVar ParticleTracerEx(MetaVarString nameVar,MetaVarVector startPosVar,MetaVarVector endPosVar,MetaVarNumber entityIndexVar,MetaVarBoolean doWhizVar,MetaVarNumber attachmentIndexVar){return null;};
	/**
	Returns the visibility of the PixVis with the specified parameters, visibility ranges from 0-1.
	*/
	@External
	@ClientFunc
	public MetaVarNumber PixelVisible(MetaVarVector positionVar,MetaVarNumber radiusVar,MetaVarPixelvis_handle_t PixVisVar){return null;};
	/**
	Returns the contents of the position specified.
	*/
	@External
	@SharedFunc
	public MetaVarNumber PointContents(MetaVarVector positionVar){return null;};
	/**
	Precaches a model for later use.
	*/
	@External
	@SharedFunc
	public MetaVar PrecacheModel(MetaVarString modelNameVar){return null;};
	/**
	Precaches a sound for later use.
	*/
	@External
	@SharedFunc
	public MetaVar PrecacheSound(MetaVarString soundNameVar){return null;};
	/**
	Performs a trace with the given origin, direction and filter.
	*/
	@External
	@SharedFunc
	public MetaVar QuickTrace(MetaVarVector originVar,MetaVarVector directionVar){return null;};
	/**
	Returns the absolute system path the file relative to /garrysmod/.
	*/
	@External
	@SharedFunc
	public MetaVarString RelativePathToFull(MetaVarString fileVar){return null;};
	/**
	Makes the screen shake
	*/
	@External
	@SharedFunc
	public MetaVar ScreenShake(MetaVarVector posVar,MetaVarNumber amplitudeVar,MetaVarNumber frequencyVar,MetaVarNumber durationVar,MetaVarNumber radiusVar){return null;};
	/**
	Convert a string to a certain type
	*/
	@External
	@SharedFunc
	public com.crazyt.gmod.IMetaVarAny StringToType(MetaVarString strVar,MetaVarString typenameVar){return null;};
	/**
	Converts a table to a JSON string.
	*/
	@External
	@SharedFunc
	public MetaVarString TableToJSON(MetaVarTable tableVar){return null;};
	/**
	Converts the given table into a key value string.
	*/
	@External
	@SharedFunc
	public MetaVarString TableToKeyValues(MetaVarTable tableVar){return null;};
	/**
	Runs a trace using the ent's collisionmodel between two points, returning a <a href="http://wiki.garrysmod.com/page/Structures/TraceRes" title="Structures/TraceRes" class="mw-redirect">TraceRes Structure</a>
	*/
	@External
	@SharedFunc
	public MetaVarTable TraceEntity(MetaVarEntity entVar,MetaVarTable tracedataVar){return null;};
	/**
	Performs a hull trace with the given trace data.
	*/
	@External
	@SharedFunc
	public MetaVar TraceHull(MetaVarHullTrace TraceDataVar){return null;};
	/**
	Performs a trace with the given trace data.
	*/
	@External
	@SharedFunc
	public MetaVar TraceLine(MetaVarTrace TraceDataVar){return null;};
}
