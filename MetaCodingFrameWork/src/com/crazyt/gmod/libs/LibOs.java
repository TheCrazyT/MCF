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
@Library("os")
public class LibOs extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibOs(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Returns the approximate cpu time the application ran.
	*/
	@External
	@SharedFunc
	public MetaVarNumber clock(){return null;};
	/**
	Returns the the date formatted in a string or a table, in order to receive a table the string must contain *t, any formatting will cause *t to be ignored eg. getting formatted into the string, if the string starts with an&#160;! the date will be using UCT time.
	*/
	@External
	@SharedFunc
	public MetaVarString date(MetaVarString formatVar,MetaVarNumber timeVar){return null;};
	/**
	Subtracts the second of the first value and rounds the result.
	*/
	@External
	@SharedFunc
	public MetaVarNumber difftime(MetaVarNumber timeAVar,MetaVarNumber timeBVar){return null;};
	/**
	Returns the system time in seconds past the unix epoch. If a table is supplied, the function attempts to build a system time with the specified table members.
	*/
	@External
	@SharedFunc
	public MetaVarNumber time(MetaVarDateData dateDataVar){return null;};
}
