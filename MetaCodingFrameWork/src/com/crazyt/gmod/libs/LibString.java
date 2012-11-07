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
@Library("string")
public class LibString{
	/**
	Splits a string up wherever it finds the given separator.
	*/
	@External
	@SharedFunc
	public MetaVarTable Explode(MetaVarString separatorVar,MetaVarString strVar,MetaVarBoolean use_patternsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Joins all values of pieces together to a single string.
	*/
	@External
	@SharedFunc
	public MetaVarString Implode(MetaVarString glueVar,MetaVarTable piecesVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Splits the stirng into characters and creates a sequential table.
	*/
	@External
	@SharedFunc
	public MetaVar ToTable(MetaVarString stringVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the the chars in their ASCII representation.
	*/
	//public MetaVarNumber byte(MetaVarString stringVar,MetaVarNumber startPosVar,MetaVarNumber endPosVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Takes the given bytes and converts them to a string.
	*/
	//public MetaVarString char(MetaVarVararg bytesVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Attempts to find the specified substring in a string, uses patterns by default.
	*/
	@External
	@SharedFunc
	public MetaVarNumber find(MetaVarString haystackVar,MetaVarString needleVar,MetaVarNumber startPosVar,MetaVarBoolean noPatternsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Formats the specified values into the string given.
	*/
	@External
	@SharedFunc
	public MetaVarString format(MetaVarString formatVar,MetaVarVararg formatParametersVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns an iterator which will return either 1 value if no groupings are defined, or the group matches.
	*/
	@External
	@SharedFunc
	public MetaVarFunction gmatch(MetaVarString hayStackVar,MetaVarString patternVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	This functions main purpose is to replace certain character sequences in a string.
	*/
	@External
	@SharedFunc
	public MetaVar gsub(MetaVarString stringVar,MetaVarString patternVar,MetaVarNumber maxReplacesVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Counts the number of characters in the string (length).
	*/
	@External
	@SharedFunc
	public MetaVarNumber len(MetaVarString strVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Changes any upper-case characters in a string to lower-case.
	*/
	@External
	@SharedFunc
	public MetaVarString lower(MetaVarString strVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Finds a pattern in a string.
	*/
	@External
	@SharedFunc
	public MetaVar match(MetaVarString stringVar,MetaVarString patternVar,MetaVarNumber startPositionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Repeats a string by the given value.
	*/
	@External
	@SharedFunc
	public MetaVarString rep(MetaVarString strVar,MetaVarNumber repetitionsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reverses a string.
	*/
	@External
	@SharedFunc
	public MetaVarString reverse(MetaVarString strVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a sub-string, located between 2 characters in a specified string.
	*/
	@External
	@SharedFunc
	public MetaVarString sub(MetaVarString stringVar,MetaVarNumber StartPosVar,MetaVarNumber EndPosVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Changes any lower-case characters in a string to upper-case.
	*/
	@External
	@SharedFunc
	public MetaVarString upper(MetaVarString strVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
