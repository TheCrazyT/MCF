package com.crazyt.gmod.libs;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
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
	public MetaVar AddNetworkString(MetaVarString strVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Encodes the specified string to base64.
	*/
	@External
	@SharedFunc
	public MetaVarString Base64Encode(MetaVarString strVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Applies explosion damage to all entities in the specified radius.
	*/
	@External
	@SharedFunc
	public MetaVar BlastDamage(MetaVarEntity inflictorVar,MetaVarEntity attackerVar,MetaVarVector damageOriginVar,MetaVarNumber damageRadiusVar,MetaVarNumber damageVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Generates the hash of the specified value.
	*/
	@External
	@SharedFunc
	public MetaVarString CRC(MetaVarString stringToHashVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Compresses the given string using <a rel="nofollow" class="external text" href="http://fastlz.org/">FastLZ</a>.
	*/
	@External
	@SharedFunc
	public MetaVarString Compress(MetaVarString strVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the current date formatted like '2012-10-31 18-00-00'
	*/
	@External
	@SharedFunc
	public MetaVarString DateStamp(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Performs a trace and paints a decal to the surface hit.
	*/
	@External
	@SharedFunc
	public MetaVar Decal(MetaVarString decalNameVar,MetaVarVector traceStartVar,MetaVarVector traceEndVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Performs a trace and paints a decal to the surface hit.
	*/
	@External
	@ClientFunc
	public MetaVar DecalEx(MetaVarIMaterial materialVar,MetaVarEntity entVar,MetaVarVector positionVar,MetaVarVector normalVar,MetaVarNumber wVar,MetaVarNumber hVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the full material path by the decal name.
	*/
	@External
	@SharedFunc
	public MetaVarString DecalMaterial(MetaVarString decalNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Decompresses the given string using <a rel="nofollow" class="external text" href="http://fastlz.org/">FastLZ</a>.
	*/
	@External
	@SharedFunc
	public MetaVarString Decompress(MetaVarString compressedStringVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the distance between a line and a point in 3d space.
	*/
	@External
	@SharedFunc
	public MetaVarNumber DistanceToLine(MetaVarVector lineStartVar,MetaVarVector lineEndVar,MetaVarVector pointPosVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a effect with the specified data.
	*/
	@External
	@SharedFunc
	public MetaVar Effect(MetaVarString effectNameVar,MetaVarCEffectData effectDataVar,MetaVarBoolean allowOverrideVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a new PixVis handle.
	*/
	@External
	@ClientFunc
	public MetaVarPixelvis_handle_t GetPixelVisibleHandle(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Utility function to quickly generate a trace table that starts at the players view position, and ends 16384 units along a specified direction
	*/
	@External
	@SharedFunc
	public MetaVarTable GetPlayerTrace(MetaVarPlayer plyVar,MetaVarVector dirVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets information about the sun position and obstruction or nil if there is no sun.
	*/
	@External
	@ClientFunc
	public MetaVar GetSunInfo(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the matching surface index for the surface name.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetSurfaceIndex(MetaVarString surfaceNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Performs a ray box intersection and returns position, normal and the fraction.
	*/
	@External
	@SharedFunc
	public MetaVarVector IntersectRayWithOBB(MetaVarVector rayStartVar,MetaVarVector rayDirectionVar,MetaVarVector boxOriginVar,MetaVarAngle boxAnglesVar,MetaVarVector boxMinsVar,MetaVarVector boxMaxsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Performs a ray plane intersection and returns the hit position or nil.
	*/
	@External
	@SharedFunc
	public MetaVarNumber IntersectRayWithPlane(MetaVarVector rayOriginVar,MetaVarVector rayDirectionVar,MetaVarVector planePositionVar,MetaVarVector planeNormalVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks if a certain position in within the world bounds.
	*/
	@External
	@ServerFunc
	public MetaVarBoolean IsInWorld(MetaVarVector positionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks if the model is loaded in the game.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsModelLoaded(MetaVarString modelNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the skybox is visibile from the point specified.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsSkyboxVisibleFromPoint(MetaVarVector positionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks if the specified model is valid.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsValidModel(MetaVarString modelNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks if the specified prop is valid.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsValidProp(MetaVarString modelNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks if the specified model name points to a valid ragdoll.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsValidRagdoll(MetaVarString ragdollNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Converts a JSON string to a Lua table.
	*/
	@External
	@SharedFunc
	public MetaVarTable JSONToTable(MetaVarString JSONstringVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Converts a KeyValue string to a Lua table.
	*/
	@External
	@SharedFunc
	public MetaVarTable KeyValuesToTable(MetaVarString KeyValuestringVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a vector in world coordinates based on an entity and local coordinates
	*/
	@External
	@SharedFunc
	public MetaVarVector LocalToWorld(MetaVarEntity entVar,MetaVarVector lposVar,MetaVarNumber bonenumVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the string associated with the given id.
	*/
	@External
	@SharedFunc
	public MetaVarString NetworkIDToString(MetaVarNumber stringTableIDVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the string associated with the given id.
	*/
	@External
	@SharedFunc
	public MetaVarNumber NetworkStringToID(MetaVarString networkStringVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a tracer effect with the given parameters.
	*/
	@External
	@SharedFunc
	public MetaVar ParticleTracer(MetaVarString nameVar,MetaVarVector startPosVar,MetaVarVector endPosVar,MetaVarBoolean doWhizVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a tracer effect with the given parameters.
	*/
	@External
	@SharedFunc
	public MetaVar ParticleTracerEx(MetaVarString nameVar,MetaVarVector startPosVar,MetaVarVector endPosVar,MetaVarNumber entityIndexVar,MetaVarBoolean doWhizVar,MetaVarNumber attachmentIndexVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the visibility of the PixVis with the specified parameters, visibility ranges from 0-1.
	*/
	@External
	@ClientFunc
	public MetaVarNumber PixelVisible(MetaVarVector positionVar,MetaVarNumber radiusVar,MetaVarPixelvis_handle_t PixVisVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the contents of the position specified.
	*/
	@External
	@SharedFunc
	public MetaVarNumber PointContents(MetaVarVector positionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Precaches a model for later use.
	*/
	@External
	@SharedFunc
	public MetaVar PrecacheModel(MetaVarString modelNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Precaches a sound for later use.
	*/
	@External
	@SharedFunc
	public MetaVar PrecacheSound(MetaVarString soundNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Performs a trace with the given origin, direction and filter.
	*/
	@External
	@SharedFunc
	public MetaVar QuickTrace(MetaVarVector originVar,MetaVarVector directionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the absolute system path the file relative to /garrysmod/.
	*/
	@External
	@SharedFunc
	public MetaVarString RelativePathToFull(MetaVarString fileVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Makes the screen shake
	*/
	@External
	@SharedFunc
	public MetaVar ScreenShake(MetaVarVector posVar,MetaVarNumber amplitudeVar,MetaVarNumber frequencyVar,MetaVarNumber durationVar,MetaVarNumber radiusVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Convert a string to a certain type
	*/
	@External
	@SharedFunc
	public com.crazyt.gmod.IMetaVarAny StringToType(MetaVarString strVar,MetaVarString typenameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Converts a table to a JSON string.
	*/
	@External
	@SharedFunc
	public MetaVarString TableToJSON(MetaVarTable tableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Converts the given table into a key value string.
	*/
	@External
	@SharedFunc
	public MetaVarString TableToKeyValues(MetaVarTable tableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Runs a trace using the ent's collisionmodel between two points, returning a <a href="http://wiki.garrysmod.com/page/Structures/TraceRes" title="Structures/TraceRes" class="mw-redirect">TraceRes Structure</a>
	*/
	@External
	@SharedFunc
	public MetaVarTable TraceEntity(MetaVarEntity entVar,MetaVarTable tracedataVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Performs a hull trace with the given trace data.
	*/
	@External
	@SharedFunc
	public MetaVar TraceHull(MetaVarHullTrace TraceDataVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Performs a trace with the given trace data.
	*/
	@External
	@SharedFunc
	public MetaVar TraceLine(MetaVarTrace TraceDataVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
