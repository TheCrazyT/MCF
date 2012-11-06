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
@Library("hook")
public class LibHook extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibHook(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Add a hook to listen to the specified event.
	*/
	@External
	@SharedFunc
	public MetaVar Add(MetaVarString hookNameVar,com.crazyt.gmod.IMetaVarAny identifierVar,MetaVarFunction funcVar){return null;};
	/**
	Calls hooks associated with the hook name<br />
Calls all hooks until one returns something other than nil then returns that data.
	*/
	@External
	@SharedFunc
	public MetaVarVararg Call(MetaVarString hookNameVar,MetaVarTable gamemodeTableVar,MetaVarVararg argsVar){return null;};
	/**
	Returns a table containing subtables which contain all hooks.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetTable(){return null;};
	/**
	Removes the hook with the given indentifier from hookName's list.
	*/
	//public MetaVar Remove(MetaVarString hookNameVar,com.crazyt.gmod.IMetaVarAny identifierVar){return null;};
	/**
	Calls hooks associated with the hook name<br />
Calls all hooks until one returns something other than nil then returns that data.
	*/
	@External
	@SharedFunc
	public MetaVarVararg Run(MetaVarString hookNameVar,MetaVarVararg argsVar){return null;};
}
