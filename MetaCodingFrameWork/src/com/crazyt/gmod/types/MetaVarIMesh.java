package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarIMeshImpl.class)
public interface MetaVarIMesh extends MetaVar,IMetaVarAny{
	/**
	Builds the mesh from a table mesh vertexes.
	*/
	@External
	@ClientFunc
	public MetaVar BuildFromTriangles(MetaVarTable vertexesVar);
	/**
	Deletes the mesh and frees the memory used by it..
	*/
	@External
	@ClientFunc
	public MetaVar Destroy();
	/**
	Overridden by the engine in order to clean up the IMesh object.
	*/
	@External
	@ClientFunc
	public MetaVar __gc();
}
