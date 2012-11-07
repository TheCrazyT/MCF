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
@Library("resource")
public class LibResource extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibResource(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Adds the specified and all related files to the files the client should download.
	*/
	@External
	@SharedFunc
	public MetaVar AddFile(MetaVarString pathVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Adds the specified file to the files the client should download.
	*/
	@External
	@SharedFunc
	public MetaVar AddSingleFile(MetaVarString pathVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
