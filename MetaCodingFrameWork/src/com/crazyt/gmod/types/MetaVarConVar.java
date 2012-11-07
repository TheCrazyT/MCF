package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarConVarImpl.class)
public interface MetaVarConVar extends MetaVar,IMetaVarAny{
	/**
	Tries to convert the current string value of the convar to a bool, where everything except "1" evaluates to false.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean GetBool();
	/**
	Returns the default value of the convar.
	*/
	@External
	@SharedFunc
	public MetaVarString GetDefault();
	/**
	Attempts to convert the convars value to a float, this only works with numeric values or an empty string(which evaluates to 0).
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetFloat();
	/**
	Returns the help text assigned to that convar.
	*/
	@External
	@SharedFunc
	public MetaVarString GetHelpText();
	/**
	Attempts to convert the convars value to a int, this only works with numeric values or an empty string(which evaluates to 0) and all decimal values are rounded down.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetInt();
	/**
	Returns the name of the convar.
	*/
	//public MetaVarString GetName();
	/**
	Returns the current value as string.
	*/
	@External
	@SharedFunc
	public MetaVarString GetString();
}
