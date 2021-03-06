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
@External
@Library("concommand")
public class LibConcommand{
	/**
	Creates a console command that runs a function in lua with optional autocompletion function and help text.
	*/
	@External
	@SharedFunc
	public MetaVar Add(MetaVarString nameVar,MetaVarFunction commandFuncVar,MetaVarFunction autoCompleteFuncVar,MetaVarString helpTextVar,MetaVarNumber flagsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Removes a console command.
	*/
	//public MetaVar Remove(MetaVarString nameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
