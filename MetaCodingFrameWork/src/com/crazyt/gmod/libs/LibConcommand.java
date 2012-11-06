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
@Library("concommand")
public class LibConcommand extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibConcommand(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Creates a console command that runs a function in lua with optional autocompletion function and help text.
	*/
	//public MetaVar Add(MetaVarString nameVar,MetaVarFunction commandFuncVar,MetaVarFunction autoCompleteFuncVar,MetaVarString helpTextVar,MetaVarNumber flagsVar){return null;};
	/**
	Removes a console command.
	*/
	//public MetaVar Remove(MetaVarString nameVar){return null;};
}
