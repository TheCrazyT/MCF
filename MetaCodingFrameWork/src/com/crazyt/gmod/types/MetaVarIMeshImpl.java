package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("IMesh")
public class MetaVarIMeshImpl extends MetaVarImpl implements MetaVarIMesh{
	/**
	Builds the mesh from a table mesh vertexes.
	*/
	@External
	@ClientFunc
	public MetaVar BuildFromTriangles(MetaVarTable vertexesVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Deletes the mesh and frees the memory used by it..
	*/
	@External
	@ClientFunc
	public MetaVar Destroy(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Overridden by the engine in order to clean up the IMesh object.
	*/
	@External
	@ClientFunc
	public MetaVar __gc(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarIMeshImpl(String n) {
		super(n);
	}
}
