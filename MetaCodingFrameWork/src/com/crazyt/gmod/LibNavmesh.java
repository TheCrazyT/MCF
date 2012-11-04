package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("navmesh")
public class LibNavmesh{
	/**
	This function does not appear to do anything.
	*/
	@External
	@ServerFunc
	public MetaVar GetMap(){return null;};
}
