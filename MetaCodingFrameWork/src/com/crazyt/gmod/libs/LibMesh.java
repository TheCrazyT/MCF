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
@Library("mesh")
public class LibMesh extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibMesh(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Pushes the new vertex data onto the render stack.
	*/
	@External
	@ClientFunc
	public MetaVar AdvanceVertex(){return null;};
	/**
	Starts a new dynamic mesh.
	*/
	@External
	@ClientFunc
	public MetaVar Begin(MetaVarNumber primitiveTypeVar,MetaVarNumber primiteCountVar){return null;};
	/**
	Sets the color to be used for the next vertex.
	*/
	@External
	@ClientFunc
	public MetaVar Color(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){return null;};
	/**
	Ends the mesh and renders it.
	*/
	@External
	@ClientFunc
	public MetaVar End(){return null;};
	/**
	Sets the normal to be used for the next vertex.
	*/
	@External
	@ClientFunc
	public MetaVar Normal(MetaVarVector normalVar){return null;};
	/**
	Sets the position to be used for the next vertex.
	*/
	@External
	@ClientFunc
	public MetaVar Position(MetaVarVector positionVar){return null;};
	/**
	Draws a quad using 4 vertices.
	*/
	@External
	@ClientFunc
	public MetaVar Quad(MetaVarVector vertex1Var,MetaVarVector vertex2Var,MetaVarVector vertex3Var,MetaVarVector vertex4Var){return null;};
	/**
	Draws a quad using a position, a normal and the size.
	*/
	@External
	@ClientFunc
	public MetaVar QuadEasy(MetaVarVector positionVar,MetaVarVector normalVar,MetaVarNumber sizeXVar,MetaVarNumber sizeYVar){return null;};
	/**
	Sets the specular map values.
	*/
	@External
	@ClientFunc
	public MetaVar Specular(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){return null;};
	/**
	Sets the s tangent to be used.
	*/
	@External
	@ClientFunc
	public MetaVar TangentS(MetaVarVector sTangerVar){return null;};
	/**
	Sets the texture coordinates for the next vertex.
	*/
	@External
	@ClientFunc
	public MetaVar TexCoord(MetaVarNumber stageVar,MetaVarNumber uVar,MetaVarNumber vVar){return null;};
	/**
	Sets the T tangent to be used.
	*/
	@External
	@ClientFunc
	public MetaVar TangentT(MetaVarVector tTangerVar){return null;};
	/**
	Returns the amount of vertex that have yet been pushes.
	*/
	@External
	@ClientFunc
	public MetaVarNumber VertexCount(){return null;};
}
