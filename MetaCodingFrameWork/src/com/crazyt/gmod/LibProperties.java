package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("properties")
public class LibProperties{
	/**
	Draws halo around hovered entity.
	*/
	@External
	@ClientFunc
	public MetaVar HaloThink(){return null;};
}
