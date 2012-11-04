package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("resource")
public class LibResource{
	/**
	Adds the specified and all related files to the files the client should download.
	*/
	@External
	@SharedFunc
	public MetaVar AddFile(MetaVarString pathVar){return null;};
	/**
	Adds the specified file to the files the client should download.
	*/
	@External
	@SharedFunc
	public MetaVar AddSingleFile(MetaVarString pathVar){return null;};
}
