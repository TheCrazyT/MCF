package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("IMesh")
public class MetaVarIMesh extends MetaVarImpl implements IMetaVarAny{
	public MetaVarIMesh(String n) {
		super(n);
	}
	/**
	Builds the mesh from a table mesh vertexes.
	*/
	@External
	@ClientFunc
	public MetaVar BuildFromTriangles(MetaVarTable vertexesVar){return null;};
	/**
	Deletes the mesh and frees the memory used by it..
	*/
	@External
	@ClientFunc
	public MetaVar Destroy(){return null;};
	/**
	Overridden by the engine in order to clean up the IMesh object.
	*/
	@External
	@ClientFunc
	public MetaVar __gc(){return null;};
}
