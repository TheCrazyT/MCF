package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("http")
public class LibHttp{
	/**
	Launches a GET request.
	*/
	@External
	@SharedFunc
	public MetaVar Fetch(MetaVarString urlVar,MetaVarFunction onSuccessVar,MetaVarFunction onFailureVar){return null;};
	/**
	Launches a POST request
	*/
	@External
	@SharedFunc
	public MetaVar Post(MetaVarString urlVar,MetaVarTable parametersVar,MetaVarFunction onSuccessVar,MetaVarFunction onFailureVar){return null;};
}
