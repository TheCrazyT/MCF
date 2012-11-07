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
@Library("mesh")
public class LibMesh{
	/**
	Pushes the new vertex data onto the render stack.
	*/
	@External
	@ClientFunc
	public MetaVar AdvanceVertex(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Starts a new dynamic mesh.
	*/
	@External
	@ClientFunc
	public MetaVar Begin(MetaVarNumber primitiveTypeVar,MetaVarNumber primiteCountVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the color to be used for the next vertex.
	*/
	@External
	@ClientFunc
	public MetaVar Color(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Ends the mesh and renders it.
	*/
	@External
	@ClientFunc
	public MetaVar End(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the normal to be used for the next vertex.
	*/
	@External
	@ClientFunc
	public MetaVar Normal(MetaVarVector normalVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the position to be used for the next vertex.
	*/
	@External
	@ClientFunc
	public MetaVar Position(MetaVarVector positionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws a quad using 4 vertices.
	*/
	@External
	@ClientFunc
	public MetaVar Quad(MetaVarVector vertex1Var,MetaVarVector vertex2Var,MetaVarVector vertex3Var,MetaVarVector vertex4Var){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws a quad using a position, a normal and the size.
	*/
	@External
	@ClientFunc
	public MetaVar QuadEasy(MetaVarVector positionVar,MetaVarVector normalVar,MetaVarNumber sizeXVar,MetaVarNumber sizeYVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the specular map values.
	*/
	@External
	@ClientFunc
	public MetaVar Specular(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the s tangent to be used.
	*/
	@External
	@ClientFunc
	public MetaVar TangentS(MetaVarVector sTangerVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the texture coordinates for the next vertex.
	*/
	@External
	@ClientFunc
	public MetaVar TexCoord(MetaVarNumber stageVar,MetaVarNumber uVar,MetaVarNumber vVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the T tangent to be used.
	*/
	@External
	@ClientFunc
	public MetaVar TangentT(MetaVarVector tTangerVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the amount of vertex that have yet been pushes.
	*/
	@External
	@ClientFunc
	public MetaVarNumber VertexCount(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
