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
@Library("hook")
public class LibHook{
	/**
	Add a hook to listen to the specified event.
	*/
	@External
	@SharedFunc
	public MetaVar Add(MetaVarString hookNameVar,com.crazyt.gmod.IMetaVarAny identifierVar,MetaVarFunction funcVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Calls hooks associated with the hook name<br />
Calls all hooks until one returns something other than nil then returns that data.
	*/
	@External
	@SharedFunc
	public MetaVarVararg Call(MetaVarString hookNameVar,MetaVarTable gamemodeTableVar,MetaVarVararg argsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a table containing subtables which contain all hooks.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetTable(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Removes the hook with the given indentifier from hookName's list.
	*/
	//public MetaVar Remove(MetaVarString hookNameVar,com.crazyt.gmod.IMetaVarAny identifierVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Calls hooks associated with the hook name<br />
Calls all hooks until one returns something other than nil then returns that data.
	*/
	@External
	@SharedFunc
	public MetaVarVararg Run(MetaVarString hookNameVar,MetaVarVararg argsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
