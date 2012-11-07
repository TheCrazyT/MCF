package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("ConVar")
public class MetaVarConVarImpl extends MetaVarImpl implements MetaVarConVar{
	/**
	Tries to convert the current string value of the convar to a bool, where everything except "1" evaluates to false.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean GetBool(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the default value of the convar.
	*/
	@External
	@SharedFunc
	public MetaVarString GetDefault(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Attempts to convert the convars value to a float, this only works with numeric values or an empty string(which evaluates to 0).
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetFloat(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the help text assigned to that convar.
	*/
	@External
	@SharedFunc
	public MetaVarString GetHelpText(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Attempts to convert the convars value to a int, this only works with numeric values or an empty string(which evaluates to 0) and all decimal values are rounded down.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetInt(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the name of the convar.
	*/
	//public MetaVarString GetName(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the current value as string.
	*/
	@External
	@SharedFunc
	public MetaVarString GetString(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarConVarImpl(String n) {
		super(n);
	}
}
