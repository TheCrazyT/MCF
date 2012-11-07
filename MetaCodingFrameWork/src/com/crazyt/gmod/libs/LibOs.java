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
@Library("os")
public class LibOs{
	/**
	Returns the approximate cpu time the application ran.
	*/
	@External
	@SharedFunc
	public MetaVarNumber clock(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the the date formatted in a string or a table, in order to receive a table the string must contain *t, any formatting will cause *t to be ignored eg. getting formatted into the string, if the string starts with an&#160;! the date will be using UCT time.
	*/
	@External
	@SharedFunc
	public MetaVarString date(MetaVarString formatVar,MetaVarNumber timeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Subtracts the second of the first value and rounds the result.
	*/
	@External
	@SharedFunc
	public MetaVarNumber difftime(MetaVarNumber timeAVar,MetaVarNumber timeBVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the system time in seconds past the unix epoch. If a table is supplied, the function attempts to build a system time with the specified table members.
	*/
	@External
	@SharedFunc
	public MetaVarNumber time(MetaVarDateData dateDataVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
