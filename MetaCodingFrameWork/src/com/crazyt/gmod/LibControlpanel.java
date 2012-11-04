package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("controlpanel")
public class LibControlpanel{
	/**
	Returns (or creates if not exists) a controlpanel.
	*/
	@External
	@ClientFunc
	public MetaVarPanel Get(MetaVarString nameVar){return null;};
}
