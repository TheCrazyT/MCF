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
@Library("http")
public class LibHttp extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibHttp(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Launches a GET request.
	*/
	@External
	@SharedFunc
	public MetaVar Fetch(MetaVarString urlVar,MetaVarFunction onSuccessVar,MetaVarFunction onFailureVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Launches a POST request
	*/
	@External
	@SharedFunc
	public MetaVar Post(MetaVarString urlVar,MetaVarTable parametersVar,MetaVarFunction onSuccessVar,MetaVarFunction onFailureVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
