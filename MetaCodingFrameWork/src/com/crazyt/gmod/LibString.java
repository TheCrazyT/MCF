package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Library;
import com.crazyt.mcf.BasicFunctions;
import com.crazyt.mcf.BuildClass;
@External
@Library("string")
public class LibString extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibString(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Splits a string up wherever it finds the given separator.
	*/
	@External
	@SharedFunc
	public MetaVarTable Explode(MetaVarString separatorVar,MetaVarString strVar,MetaVarBoolean use_patternsVar){return null;};
	/**
	Joins all values of pieces together to a single string.
	*/
	@External
	@SharedFunc
	public MetaVarString Implode(MetaVarString glueVar,MetaVarTable piecesVar){return null;};
	/**
	Splits the stirng into characters and creates a sequential table.
	*/
	@External
	@SharedFunc
	public MetaVar ToTable(MetaVarString stringVar){return null;};
	/**
	Returns the the chars in their ASCII representation.
	*/
	//public MetaVarNumber byte(MetaVarString stringVar,MetaVarNumber startPosVar,MetaVarNumber endPosVar){return null;};
	/**
	Takes the given bytes and converts them to a string.
	*/
	//public MetaVarString char(MetaVarVararg bytesVar){return null;};
	/**
	Attempts to find the specified substring in a string, uses patterns by default.
	*/
	@External
	@SharedFunc
	public MetaVarNumber find(MetaVarString haystackVar,MetaVarString needleVar,MetaVarNumber startPosVar,MetaVarBoolean noPatternsVar){return null;};
	/**
	Formats the specified values into the string given.
	*/
	@External
	@SharedFunc
	public MetaVarString format(MetaVarString formatVar,MetaVarVararg formatParametersVar){return null;};
	/**
	Returns an iterator which will return either 1 value if no groupings are defined, or the group matches.
	*/
	@External
	@SharedFunc
	public MetaVarFunction gmatch(MetaVarString hayStackVar,MetaVarString patternVar){return null;};
	/**
	This functions main purpose is to replace certain character sequences in a string.
	*/
	@External
	@SharedFunc
	public MetaVar gsub(MetaVarString stringVar,MetaVarString patternVar,MetaVarNumber maxReplacesVar){return null;};
	/**
	Counts the number of characters in the string (length).
	*/
	@External
	@SharedFunc
	public MetaVarNumber len(MetaVarString strVar){return null;};
	/**
	Changes any upper-case characters in a string to lower-case.
	*/
	@External
	@SharedFunc
	public MetaVarString lower(MetaVarString strVar){return null;};
	/**
	Finds a pattern in a string.
	*/
	@External
	@SharedFunc
	public MetaVar match(MetaVarString stringVar,MetaVarString patternVar,MetaVarNumber startPositionVar){return null;};
	/**
	Repeats a string by the given value.
	*/
	@External
	@SharedFunc
	public MetaVarString rep(MetaVarString strVar,MetaVarNumber repetitionsVar){return null;};
	/**
	Reverses a string.
	*/
	@External
	@SharedFunc
	public MetaVarString reverse(MetaVarString strVar){return null;};
	/**
	Returns a sub-string, located between 2 characters in a specified string.
	*/
	@External
	@SharedFunc
	public MetaVarString sub(MetaVarString stringVar,MetaVarNumber StartPosVar,MetaVarNumber EndPosVar){return null;};
	/**
	Changes any lower-case characters in a string to upper-case.
	*/
	@External
	@SharedFunc
	public MetaVarString upper(MetaVarString strVar){return null;};
}
