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
@Library("render")
public class LibRender extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibRender(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Adds a beam segment to the beam started by <a href="http://wiki.garrysmod.com/page/Libraries/render" title="Libraries/render">render</a>.<a href="http://wiki.garrysmod.com/page/Libraries/render/StartBeam" title="Libraries/render/StartBeam">StartBeam</a>.
	*/
	@External
	@ClientFunc
	public MetaVar AddBeam(MetaVarVector startPosVar,MetaVarNumber widthVar,MetaVarNumber textureEndVar,MetaVarColor colorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Dumps the current render target and allows the pixels to be accessed by <a href="http://wiki.garrysmod.com/page/Libraries/render" title="Libraries/render">render</a>.<a href="http://wiki.garrysmod.com/page/Libraries/render/ReadPixel" title="Libraries/render/ReadPixel">ReadPixel</a>.
	*/
	@External
	@ClientFunc
	public MetaVar CapturePixels(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Captures a part of the current render target and returns the data as a binary string in the given format.
	*/
	@External
	@ClientFunc
	public MetaVarString Capture(MetaVarRenderCaptureData captureDataVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Clears the current rendertarget for obeying the current stencil buffer conditions.
	*/
	@External
	@ClientFunc
	public MetaVar ClearBuffersObeyStencil(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar,MetaVarBoolean depthVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Resets the depth buffer.
	*/
	@External
	@ClientFunc
	public MetaVar ClearDepth(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the stencil value in a specified rect.
	*/
	@External
	@ClientFunc
	public MetaVar ClearStencilBufferRectangle(MetaVarNumber originXVar,MetaVarNumber originYVar,MetaVarNumber endXVar,MetaVarNumber endYVar,MetaVarNumber stencilValueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Resets all values in the stencil buffer to zero.
	*/
	@External
	@ClientFunc
	public MetaVar ClearStencil(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Clears the current render target and the specified buffers.
	*/
	@External
	@ClientFunc
	public MetaVar Clear(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar,MetaVarBoolean clearDepthVar,MetaVarBoolean clearStencilVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Calculates the lighting caused by dynamic lights for the specified surface.
	*/
	@External
	@ClientFunc
	public MetaVarVector ComputeDynamicLighting(MetaVarVector positionVar,MetaVarVector normalVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Calculates the light color of a certain surface.
	*/
	@External
	@ClientFunc
	public MetaVar ComputeLighting(MetaVarVector positionVar,MetaVarVector normalVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Changes the cull mode.
	*/
	@External
	@ClientFunc
	public MetaVar CullMode(MetaVarNumber cullModeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws textured beam.
	*/
	@External
	@ClientFunc
	public MetaVar DrawBeam(MetaVarVector startPosVar,MetaVarVector endPosVar,MetaVarNumber widthVar,MetaVarNumber textureStartVar,MetaVarNumber textureEndVar,MetaVarColor colorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws a rotated box in 3d space.
	*/
	@External
	@ClientFunc
	public MetaVar DrawBox(MetaVarVector positionVar,MetaVarAngle anglesVar,MetaVarVector minsVar,MetaVarVector maxsVar,MetaVarColor colorVar,MetaVarBoolean writeZVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws a line in 3d space.
	*/
	@External
	@ClientFunc
	public MetaVar DrawLine(MetaVarVector startPosVar,MetaVarVector endPosVar,MetaVarBoolean writeZVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws a quad.
	*/
	@External
	@ClientFunc
	public MetaVar DrawQuadEasy(MetaVarVector positionVar,MetaVarVector normalVar,MetaVarNumber widthVar,MetaVarNumber heightVar,MetaVarColor colorVar,MetaVarNumber rotationVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws 2 connected triangles.
	*/
	@External
	@ClientFunc
	public MetaVar DrawQuad(MetaVarVector vert1Var,MetaVarVector vert2Var,MetaVarVector vert3Var,MetaVarVector ver4Var){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws the the current material to the area specified.
	*/
	@External
	@ClientFunc
	public MetaVar DrawScreenQuadEx(MetaVarNumber startXVar,MetaVarNumber startYVar,MetaVarNumber widthVar,MetaVarNumber heightVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws the the current material to the whole screen.
	*/
	@External
	@ClientFunc
	public MetaVar DrawScreenQuad(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws a sphere in 3d space.
	*/
	@External
	@ClientFunc
	public MetaVar DrawSphere(MetaVarVector positionVar,MetaVarNumber radiusVar,MetaVarNumber longitudeStepsVar,MetaVarNumber latitudeStepsVar,MetaVarColor colorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws a sprite in 3d space.
	*/
	@External
	@ClientFunc
	public MetaVar DrawSprite(MetaVarVector positionVar,MetaVarNumber widthVar,MetaVarNumber heightVar,MetaVarColor colorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws a wireframe sphere in 3d space.
	*/
	@External
	@ClientFunc
	public MetaVar DrawWireframeBox(MetaVarVector positionVar,MetaVarNumber radiusVar,MetaVarNumber longitudeStepsVar,MetaVarNumber latitudeStepsVar,MetaVarColor colorVar,MetaVarBoolean writeZVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws a rotated wireframe box in 3d space.
	*/
	@External
	@ClientFunc
	public MetaVar DrawWireframeSphere(MetaVarVector positionVar,MetaVarAngle anglesVar,MetaVarVector minsVar,MetaVarVector maxsVar,MetaVarColor colorVar,MetaVarBoolean writeZVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the status of the clip renderer, returns previous state.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean EnableClipping(MetaVarBoolean stateVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Ends the beam mesh of a beam started with <a href="http://wiki.garrysmod.com/page/Libraries/render" title="Libraries/render">render</a>.<a href="http://wiki.garrysmod.com/page/Libraries/render/StartBeam" title="Libraries/render/StartBeam">StartBeam</a>.
	*/
	@External
	@ClientFunc
	public MetaVar EndBeam(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the color of the fog.
	*/
	@External
	@ClientFunc
	public MetaVar FogColor(MetaVarNumber redVar,MetaVarNumber greenVar,MetaVarNumber blueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the at which the fog reaches its max density.
	*/
	@External
	@ClientFunc
	public MetaVar FogEnd(MetaVarNumber distanceVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the maximum density of the fog.
	*/
	@External
	@ClientFunc
	public MetaVar FogMaxDensity(MetaVarNumber maxDensityVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the mode of fog.
	*/
	@External
	@ClientFunc
	public MetaVar FogMode(MetaVarNumber fogModeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the distance at which the fog starts showing up.
	*/
	@External
	@ClientFunc
	public MetaVar FogStart(MetaVarNumber fogStartVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the ambient color of the map.
	*/
	@External
	@ClientFunc
	public MetaVarVector GetAmbientLightColor(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the current alpha blending.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetBlend(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the current color modulation values as normals.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetColorModulation(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the maximum available directX version.
	*/
	@External
	@ClientFunc
	public MetaVar GetDXLevel(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the light exposure on the specified position.
	*/
	@External
	@ClientFunc
	public MetaVarVector GetLightColor(MetaVarVector positionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the currently active render target.
	*/
	//public MetaVarITexture GetRenderTarget(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Performs a render trace and returns the color of the surface hit, this uses a low res version of the texture.
	*/
	@External
	@ClientFunc
	public MetaVarVector GetSurfaceColor(MetaVarVector startPosVar,MetaVarVector endPosVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the render material override.
	*/
	@External
	@ClientFunc
	public MetaVar MaterialOverride(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a new ClientsideModel, renders it at the specified pos/ang, and removes it
	*/
	@External
	@ClientFunc
	public MetaVar Model(MetaVarTable settingsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets whenever to write to the depth buffer and object to the depth buffer.
	*/
	@External
	@ClientFunc
	public MetaVar OverrideDepthEnable(MetaVarBoolean dontWriteVar,MetaVarBoolean dontReadVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Removes the current active clipping plane from the clip plane stack.
	*/
	@External
	@ClientFunc
	public MetaVar PopCustomClipPlane(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Pops the current flashlight mode from the flashlight mode stack.
	*/
	@External
	@ClientFunc
	public MetaVar PopFlashlightMode(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Pushes a new clipping plane of the clip plane stack and sets it as active.
	*/
	@External
	@ClientFunc
	public MetaVar PushCustomClipPlane(MetaVarVector normalVar,MetaVarNumber distanceVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Enables the flashlight projection for the upcoming rendering.
	*/
	@External
	@ClientFunc
	public MetaVar PushFlashlightMode(MetaVarBoolean unknownVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads the color of the specified pixel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ReadPixel(MetaVarNumber xVar,MetaVarNumber yVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Renders the HUD on the screen.
	*/
	@External
	@ClientFunc
	public MetaVar RenderHUD(MetaVarNumber xVar,MetaVarNumber yVar,MetaVarNumber wVar,MetaVarNumber hVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Renders the scene with the specified viewData to the current active render target.
	*/
	@External
	@ClientFunc
	public MetaVar RenderView(MetaVarViewData viewVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the alpha blending for every upcoming render operation.
	*/
	@External
	@ClientFunc
	public MetaVar SetBlend(MetaVarNumber blendingVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the color modulation.
	*/
	@External
	@ClientFunc
	public MetaVar SetColorModulation(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	If the fog mode is set to MATERIAL_FOG_LINEAR_BELOW_FOG_Z, the fog will only be rendered below the specified distance.
	*/
	@External
	@ClientFunc
	public MetaVar SetFogZ(MetaVarNumber fogZVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the material to be used in any upcoming render operation.
	*/
	@External
	@ClientFunc
	public MetaVar SetMaterial(MetaVarIMaterial textureVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the render target with the specified index to the specified rt.
	*/
	@External
	@ClientFunc
	public MetaVar SetRenderTargetEx(MetaVarNumber rtIndexVar,MetaVarITexture textureVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the render target to the specified rt.
	*/
	@External
	@ClientFunc
	public MetaVar SetRenderTarget(MetaVarITexture textureVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets a scissoring rect which limits the drawing area.
	*/
	@External
	@ClientFunc
	public MetaVar SetScissorRect(MetaVarNumber startXVar,MetaVarNumber startYVar,MetaVarNumber endXVar,MetaVarNumber endYVar,MetaVarBoolean enableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the compare function of the stencil.
	*/
	@External
	@ClientFunc
	public MetaVar SetStencilCompareFunction(MetaVarNumber compareFunctionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the state of the stencil buffer.
	*/
	@External
	@ClientFunc
	public MetaVar SetStencilEnable(MetaVarBoolean newStateVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets what the stencil should do if the compare function was not successful.
	*/
	@External
	@ClientFunc
	public MetaVar SetStencilFailOperation(MetaVarNumber failOperationVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets what the stencil should do if the compare function was successful.
	*/
	@External
	@ClientFunc
	public MetaVar SetStencilPassOperation(MetaVarNumber passOperationVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the reference value which will be used for all stencil operations.
	*/
	@External
	@ClientFunc
	public MetaVar SetStencilReferenceValue(MetaVarNumber referenceValueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets what the stencil should do if the compare function was not successful due to the zBuffer.
	*/
	@External
	@ClientFunc
	public MetaVar SetStencilZFailOperation(MetaVarNumber zFailOperationVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Changes the view port position and size.
	*/
	@External
	@ClientFunc
	public MetaVar SetViewPort(MetaVarNumber xVar,MetaVarNumber yVar,MetaVarNumber wVar,MetaVarNumber hVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Swaps the the frame buffers/cycles the frame.
	*/
	@External
	@ClientFunc
	public MetaVar Spin(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Start a new beam draw operation.
	*/
	@External
	@ClientFunc
	public MetaVar StartBeam(MetaVarNumber segmentCountVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the game supports HDR eg. if the directX level is higher or equal 8.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean SupportsHDR(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the current settings and the system allow the usage of pixel shaders 1.4.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean SupportsPixelShaders_1_4(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the current settings and the system allow the usage of pixel shaders 2.0.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean SupportsPixelShaders_2_0(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the current settings and the system allow the usage of vertex shaders 2.0.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean SupportsVertexShaders_2_0(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Suppresses or enables any engine lighting for any upcoming render operation.
	*/
	@External
	@ClientFunc
	public MetaVar SuppressEngineLighting(MetaVarBoolean suppressLightingVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
