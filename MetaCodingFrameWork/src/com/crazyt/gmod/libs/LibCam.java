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
@External
@Library("cam")
public class LibCam{
	/**
	Shakes the screen at a certain position.
	*/
	@External
	@ClientFunc
	public MetaVar ApplyShake(MetaVarVector posVar,MetaVarAngle anglesVar,MetaVarNumber factorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Switches the renderer back to the previous drawing mode from a 2D or 3D context.
	*/
	@External
	@ClientFunc
	public MetaVar End(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Switches the renderer back to the previous drawing mode from a 2D context.
	*/
	@External
	@ClientFunc
	public MetaVar End2D(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Switches the renderer back to the previous drawing mode from a 3D context.
	*/
	@External
	@ClientFunc
	public MetaVar End3D(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Switches the renderer back to the previous drawing mode from a 3D2D context.
	*/
	@External
	@ClientFunc
	public MetaVar End3D2D(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Switches the renderer back to the previous drawing mode from a 3D orthographic rendering context.
	*/
	@External
	@ClientFunc
	public MetaVar EndOrthoView(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Tells the renderer to ignore the depth buffer and draw any upcoming operation "ontop" of everything that was drawn yet.
	*/
	@External
	@ClientFunc
	public MetaVar IgnoreZ(MetaVarBoolean ignoreZVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Pops the current active rendering matrix from the stack and reinstates the previous one.
	*/
	@External
	@ClientFunc
	public MetaVar PopModelMatrix(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Pushes the specified matrix onto the render matrix stack.
	*/
	@External
	@ClientFunc
	public MetaVar PushModelMatrix(MetaVarVMatrix matrixVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets up a new rendering context.
	*/
	@External
	@ClientFunc
	public MetaVar Start(MetaVarRenderCamData dataTblVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets up a new 2D rendering context.
	*/
	@External
	@ClientFunc
	public MetaVar Start2D(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets up a new 3D rendering context.
	*/
	@External
	@ClientFunc
	public MetaVar Start3D(MetaVarVector posVar,MetaVarAngle anglesVar,MetaVarNumber fovVar,MetaVarNumber xVar,MetaVarRenderCamData yVar,MetaVarNumber wVar,MetaVarNumber hVar,MetaVarNumber zNearVar,MetaVarNumber zFarVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets up a new 3D rendering context.
	*/
	@External
	@ClientFunc
	public MetaVar Start3D2D(MetaVarVector posVar,MetaVarAngle anglesVar,MetaVarNumber scaleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets up a new 3d context using orthographic projection.
	*/
	@External
	@ClientFunc
	public MetaVar StartOrthoView(MetaVarNumber leftOffsetVar,MetaVarNumber topOffsetVar,MetaVarNumber rightOffsetVar,MetaVarNumber bottomOffsetVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
