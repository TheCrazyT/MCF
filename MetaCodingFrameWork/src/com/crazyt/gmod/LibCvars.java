package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("cvars")
public class LibCvars{
	/**
	Sets a callback to be called when the named convar changes
	*/
	@External
	@SharedFunc
	public MetaVar AddChangeCallback(MetaVarString nameVar,MetaVarFunction funcVar){return null;};
}
