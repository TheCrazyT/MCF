package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Library;
import com.crazyt.mcf.BasicFunctions;
import com.crazyt.mcf.BuildClass;
@External
@Library("debug")
public class LibDebug extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibDebug(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Prints out the lua function call stack to the console.
	*/
	@External
	@SharedFunc
	public MetaVar Trace(){return null;};
	/**
	Returns the internal Lua registry tables.
	*/
	@External
	@SharedFunc
	public MetaVarTable getregistry(){return null;};
}
