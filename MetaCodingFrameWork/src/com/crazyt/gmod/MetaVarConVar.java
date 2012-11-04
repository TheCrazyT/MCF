package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("ConVar")
public class MetaVarConVar extends MetaVarImpl implements IMetaVarAny{
	public MetaVarConVar(String n) {
		super(n);
	}
	/**
	Tries to convert the current string value of the convar to a bool, where everything except "1" evaluates to false.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean GetBool(){return null;};
	/**
	Returns the default value of the convar.
	*/
	@External
	@SharedFunc
	public MetaVarString GetDefault(){return null;};
	/**
	Attempts to convert the convars value to a float, this only works with numeric values or an empty string(which evaluates to 0).
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetFloat(){return null;};
	/**
	Returns the help text assigned to that convar.
	*/
	@External
	@SharedFunc
	public MetaVarString GetHelpText(){return null;};
	/**
	Attempts to convert the convars value to a int, this only works with numeric values or an empty string(which evaluates to 0) and all decimal values are rounded down.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetInt(){return null;};
	/**
	Returns the name of the convar.
	*/
	//public MetaVarString GetName(){return null;};
	/**
	Returns the current value as string.
	*/
	@External
	@SharedFunc
	public MetaVarString GetString(){return null;};
}
