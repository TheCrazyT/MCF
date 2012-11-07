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
@Library("package")
public class LibPackage extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibPackage(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Sets the __index member of the passed table to _G.
	*/
	@External
	@SharedFunc
	public MetaVar seeall(MetaVarTable tableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
