package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("package")
public class LibPackage{
	/**
	Sets the __index member of the passed table to _G.
	*/
	@External
	@SharedFunc
	public MetaVar seeall(MetaVarTable tableVar){return null;};
}
