package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("render")
public class LibRender{
	/**
	Adds a beam segment to the beam started by <a href="http://wiki.garrysmod.com/page/Libraries/render" title="Libraries/render">render</a>.<a href="http://wiki.garrysmod.com/page/Libraries/render/StartBeam" title="Libraries/render/StartBeam">StartBeam</a>.
	*/
	@External
	@ClientFunc
	public MetaVar AddBeam(MetaVarVector startPosVar,MetaVarNumber widthVar,MetaVarNumber textureEndVar,MetaVarColor colorVar){return null;};
	/**
	Dumps the current render target and allows the pixels to be accessed by <a href="http://wiki.garrysmod.com/page/Libraries/render" title="Libraries/render">render</a>.<a href="http://wiki.garrysmod.com/page/Libraries/render/ReadPixel" title="Libraries/render/ReadPixel">ReadPixel</a>.
	*/
	@External
	@ClientFunc
	public MetaVar CapturePixels(){return null;};
	/**
	Captures a part of the current render target and returns the data as a binary string in the given format.
	*/
	@External
	@ClientFunc
	public MetaVarString Capture(MetaVarRenderCaptureData captureDataVar){return null;};
	/**
	Clears the current rendertarget for obeying the current stencil buffer conditions.
	*/
	@External
	@ClientFunc
	public MetaVar ClearBuffersObeyStencil(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar,MetaVarBoolean depthVar){return null;};
	/**
	Resets the depth buffer.
	*/
	@External
	@ClientFunc
	public MetaVar ClearDepth(){return null;};
	/**
	Sets the stencil value in a specified rect.
	*/
	@External
	@ClientFunc
	public MetaVar ClearStencilBufferRectangle(MetaVarNumber originXVar,MetaVarNumber originYVar,MetaVarNumber endXVar,MetaVarNumber endYVar,MetaVarNumber stencilValueVar){return null;};
	/**
	Resets all values in the stencil buffer to zero.
	*/
	@External
	@ClientFunc
	public MetaVar ClearStencil(){return null;};
	/**
	Clears the current render target and the specified buffers.
	*/
	@External
	@ClientFunc
	public MetaVar Clear(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar,MetaVarBoolean clearDepthVar,MetaVarBoolean clearStencilVar){return null;};
	/**
	Calculates the lighting caused by dynamic lights for the specified surface.
	*/
	@External
	@ClientFunc
	public MetaVarVector ComputeDynamicLighting(MetaVarVector positionVar,MetaVarVector normalVar){return null;};
	/**
	Calculates the light color of a certain surface.
	*/
	@External
	@ClientFunc
	public MetaVar ComputeLighting(MetaVarVector positionVar,MetaVarVector normalVar){return null;};
	/**
	Changes the cull mode.
	*/
	@External
	@ClientFunc
	public MetaVar CullMode(MetaVarNumber cullModeVar){return null;};
	/**
	Draws textured beam.
	*/
	@External
	@ClientFunc
	public MetaVar DrawBeam(MetaVarVector startPosVar,MetaVarVector endPosVar,MetaVarNumber widthVar,MetaVarNumber textureStartVar,MetaVarNumber textureEndVar,MetaVarColor colorVar){return null;};
	/**
	Draws a rotated box in 3d space.
	*/
	@External
	@ClientFunc
	public MetaVar DrawBox(MetaVarVector positionVar,MetaVarAngle anglesVar,MetaVarVector minsVar,MetaVarVector maxsVar,MetaVarColor colorVar,MetaVarBoolean writeZVar){return null;};
	/**
	Draws a line in 3d space.
	*/
	@External
	@ClientFunc
	public MetaVar DrawLine(MetaVarVector startPosVar,MetaVarVector endPosVar,MetaVarBoolean writeZVar){return null;};
	/**
	Draws a quad.
	*/
	@External
	@ClientFunc
	public MetaVar DrawQuadEasy(MetaVarVector positionVar,MetaVarVector normalVar,MetaVarNumber widthVar,MetaVarNumber heightVar,MetaVarColor colorVar,MetaVarNumber rotationVar){return null;};
	/**
	Draws 2 connected triangles.
	*/
	@External
	@ClientFunc
	public MetaVar DrawQuad(MetaVarVector vert1Var,MetaVarVector vert2Var,MetaVarVector vert3Var,MetaVarVector ver4Var){return null;};
	/**
	Draws the the current material to the area specified.
	*/
	@External
	@ClientFunc
	public MetaVar DrawScreenQuadEx(MetaVarNumber startXVar,MetaVarNumber startYVar,MetaVarNumber widthVar,MetaVarNumber heightVar){return null;};
	/**
	Draws the the current material to the whole screen.
	*/
	@External
	@ClientFunc
	public MetaVar DrawScreenQuad(){return null;};
	/**
	Draws a sphere in 3d space.
	*/
	@External
	@ClientFunc
	public MetaVar DrawSphere(MetaVarVector positionVar,MetaVarNumber radiusVar,MetaVarNumber longitudeStepsVar,MetaVarNumber latitudeStepsVar,MetaVarColor colorVar){return null;};
	/**
	Draws a sprite in 3d space.
	*/
	@External
	@ClientFunc
	public MetaVar DrawSprite(MetaVarVector positionVar,MetaVarNumber widthVar,MetaVarNumber heightVar,MetaVarColor colorVar){return null;};
	/**
	Draws a wireframe sphere in 3d space.
	*/
	@External
	@ClientFunc
	public MetaVar DrawWireframeBox(MetaVarVector positionVar,MetaVarNumber radiusVar,MetaVarNumber longitudeStepsVar,MetaVarNumber latitudeStepsVar,MetaVarColor colorVar,MetaVarBoolean writeZVar){return null;};
	/**
	Draws a rotated wireframe box in 3d space.
	*/
	@External
	@ClientFunc
	public MetaVar DrawWireframeSphere(MetaVarVector positionVar,MetaVarAngle anglesVar,MetaVarVector minsVar,MetaVarVector maxsVar,MetaVarColor colorVar,MetaVarBoolean writeZVar){return null;};
	/**
	Sets the status of the clip renderer, returns previous state.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean EnableClipping(MetaVarBoolean stateVar){return null;};
	/**
	Ends the beam mesh of a beam started with <a href="http://wiki.garrysmod.com/page/Libraries/render" title="Libraries/render">render</a>.<a href="http://wiki.garrysmod.com/page/Libraries/render/StartBeam" title="Libraries/render/StartBeam">StartBeam</a>.
	*/
	@External
	@ClientFunc
	public MetaVar EndBeam(){return null;};
	/**
	Sets the color of the fog.
	*/
	@External
	@ClientFunc
	public MetaVar FogColor(MetaVarNumber redVar,MetaVarNumber greenVar,MetaVarNumber blueVar){return null;};
	/**
	Sets the at which the fog reaches its max density.
	*/
	@External
	@ClientFunc
	public MetaVar FogEnd(MetaVarNumber distanceVar){return null;};
	/**
	Sets the maximum density of the fog.
	*/
	@External
	@ClientFunc
	public MetaVar FogMaxDensity(MetaVarNumber maxDensityVar){return null;};
	/**
	Sets the mode of fog.
	*/
	@External
	@ClientFunc
	public MetaVar FogMode(MetaVarNumber fogModeVar){return null;};
	/**
	Sets the distance at which the fog starts showing up.
	*/
	@External
	@ClientFunc
	public MetaVar FogStart(MetaVarNumber fogStartVar){return null;};
	/**
	Returns the ambient color of the map.
	*/
	@External
	@ClientFunc
	public MetaVarVector GetAmbientLightColor(){return null;};
	/**
	Returns the current alpha blending.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetBlend(){return null;};
	/**
	Returns the current color modulation values as normals.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetColorModulation(){return null;};
	/**
	Returns the maximum available directX version.
	*/
	@External
	@ClientFunc
	public MetaVar GetDXLevel(){return null;};
	/**
	Gets the light exposure on the specified position.
	*/
	@External
	@ClientFunc
	public MetaVarVector GetLightColor(MetaVarVector positionVar){return null;};
	/**
	Returns the currently active render target.
	*/
	//public MetaVarITexture GetRenderTarget(){return null;};
	/**
	Performs a render trace and returns the color of the surface hit, this uses a low res version of the texture.
	*/
	@External
	@ClientFunc
	public MetaVarVector GetSurfaceColor(MetaVarVector startPosVar,MetaVarVector endPosVar){return null;};
	/**
	Sets the render material override.
	*/
	@External
	@ClientFunc
	public MetaVar MaterialOverride(){return null;};
	/**
	Creates a new ClientsideModel, renders it at the specified pos/ang, and removes it
	*/
	@External
	@ClientFunc
	public MetaVar Model(MetaVarTable settingsVar){return null;};
	/**
	Sets whenever to write to the depth buffer and object to the depth buffer.
	*/
	@External
	@ClientFunc
	public MetaVar OverrideDepthEnable(MetaVarBoolean dontWriteVar,MetaVarBoolean dontReadVar){return null;};
	/**
	Removes the current active clipping plane from the clip plane stack.
	*/
	@External
	@ClientFunc
	public MetaVar PopCustomClipPlane(){return null;};
	/**
	Pops the current flashlight mode from the flashlight mode stack.
	*/
	@External
	@ClientFunc
	public MetaVar PopFlashlightMode(){return null;};
	/**
	Pushes a new clipping plane of the clip plane stack and sets it as active.
	*/
	@External
	@ClientFunc
	public MetaVar PushCustomClipPlane(MetaVarVector normalVar,MetaVarNumber distanceVar){return null;};
	/**
	Enables the flashlight projection for the upcoming rendering.
	*/
	@External
	@ClientFunc
	public MetaVar PushFlashlightMode(MetaVarBoolean unknownVar){return null;};
	/**
	Reads the color of the specified pixel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ReadPixel(MetaVarNumber xVar,MetaVarNumber yVar){return null;};
	/**
	Renders the HUD on the screen.
	*/
	@External
	@ClientFunc
	public MetaVar RenderHUD(MetaVarNumber xVar,MetaVarNumber yVar,MetaVarNumber wVar,MetaVarNumber hVar){return null;};
	/**
	Renders the scene with the specified viewData to the current active render target.
	*/
	@External
	@ClientFunc
	public MetaVar RenderView(MetaVarViewData viewVar){return null;};
	/**
	Sets the alpha blending for every upcoming render operation.
	*/
	@External
	@ClientFunc
	public MetaVar SetBlend(MetaVarNumber blendingVar){return null;};
	/**
	Sets the color modulation.
	*/
	@External
	@ClientFunc
	public MetaVar SetColorModulation(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar){return null;};
	/**
	If the fog mode is set to MATERIAL_FOG_LINEAR_BELOW_FOG_Z, the fog will only be rendered below the specified distance.
	*/
	@External
	@ClientFunc
	public MetaVar SetFogZ(MetaVarNumber fogZVar){return null;};
	/**
	Sets the material to be used in any upcoming render operation.
	*/
	@External
	@ClientFunc
	public MetaVar SetMaterial(MetaVarIMaterial textureVar){return null;};
	/**
	Sets the render target with the specified index to the specified rt.
	*/
	@External
	@ClientFunc
	public MetaVar SetRenderTargetEx(MetaVarNumber rtIndexVar,MetaVarITexture textureVar){return null;};
	/**
	Sets the render target to the specified rt.
	*/
	@External
	@ClientFunc
	public MetaVar SetRenderTarget(MetaVarITexture textureVar){return null;};
	/**
	Sets a scissoring rect which limits the drawing area.
	*/
	@External
	@ClientFunc
	public MetaVar SetScissorRect(MetaVarNumber startXVar,MetaVarNumber startYVar,MetaVarNumber endXVar,MetaVarNumber endYVar,MetaVarBoolean enableVar){return null;};
	/**
	Sets the compare function of the stencil.
	*/
	@External
	@ClientFunc
	public MetaVar SetStencilCompareFunction(MetaVarNumber compareFunctionVar){return null;};
	/**
	Sets the state of the stencil buffer.
	*/
	@External
	@ClientFunc
	public MetaVar SetStencilEnable(MetaVarBoolean newStateVar){return null;};
	/**
	Sets what the stencil should do if the compare function was not successful.
	*/
	@External
	@ClientFunc
	public MetaVar SetStencilFailOperation(MetaVarNumber failOperationVar){return null;};
	/**
	Sets what the stencil should do if the compare function was successful.
	*/
	@External
	@ClientFunc
	public MetaVar SetStencilPassOperation(MetaVarNumber passOperationVar){return null;};
	/**
	Sets the reference value which will be used for all stencil operations.
	*/
	@External
	@ClientFunc
	public MetaVar SetStencilReferenceValue(MetaVarNumber referenceValueVar){return null;};
	/**
	Sets what the stencil should do if the compare function was not successful due to the zBuffer.
	*/
	@External
	@ClientFunc
	public MetaVar SetStencilZFailOperation(MetaVarNumber zFailOperationVar){return null;};
	/**
	Changes the view port position and size.
	*/
	@External
	@ClientFunc
	public MetaVar SetViewPort(MetaVarNumber xVar,MetaVarNumber yVar,MetaVarNumber wVar,MetaVarNumber hVar){return null;};
	/**
	Swaps the the frame buffers/cycles the frame.
	*/
	@External
	@ClientFunc
	public MetaVar Spin(){return null;};
	/**
	Start a new beam draw operation.
	*/
	@External
	@ClientFunc
	public MetaVar StartBeam(MetaVarNumber segmentCountVar){return null;};
	/**
	Returns whenever the game supports HDR eg. if the directX level is higher or equal 8.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean SupportsHDR(){return null;};
	/**
	Returns if the current settings and the system allow the usage of pixel shaders 1.4.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean SupportsPixelShaders_1_4(){return null;};
	/**
	Returns if the current settings and the system allow the usage of pixel shaders 2.0.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean SupportsPixelShaders_2_0(){return null;};
	/**
	Returns if the current settings and the system allow the usage of vertex shaders 2.0.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean SupportsVertexShaders_2_0(){return null;};
	/**
	Suppresses or enables any engine lighting for any upcoming render operation.
	*/
	@External
	@ClientFunc
	public MetaVar SuppressEngineLighting(MetaVarBoolean suppressLightingVar){return null;};
}
