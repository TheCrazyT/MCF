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
@Library("list")
public class LibList extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibList(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Adds an item to a named list
	*/
	@External
	@SharedFunc
	public MetaVar Add(MetaVarString identifierVar,com.crazyt.gmod.IMetaVarAny itemVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a copy of the list stored at identifier
	*/
	@External
	@SharedFunc
	public MetaVarTable Get(MetaVarString identifierVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the actual table of the list stored at identifier. Modifying this will affect the stored list
	*/
	@External
	@SharedFunc
	public MetaVarTable GetForEdit(MetaVarString identifierVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets a specific position in the named list to a value.
	*/
	@External
	@SharedFunc
	public MetaVar Set(MetaVarString identifierVar,com.crazyt.gmod.IMetaVarAny keyVar,com.crazyt.gmod.IMetaVarAny itemVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
