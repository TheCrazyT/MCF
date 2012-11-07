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
@Library("table")
public class LibTable{
	/**
	Adds the contents from one table to another
	*/
	@External
	@SharedFunc
	public MetaVarTable Add(MetaVarTable DestinationTableVar,MetaVarTable SourceTableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Changes all keys to integers
	*/
	//public MetaVarTable ClearKeys(MetaVarTable OriginalTableVar,MetaVarBoolean SaveKeysVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Concatenates the contents of a table to a string.
	*/
	@External
	@SharedFunc
	public MetaVar concat(MetaVarTable tblVar,MetaVarString continatorVar,MetaVarNumber startPosVar,MetaVarNumber endPosVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Erases all values from a table, and copies the values from another table to it.
	*/
	//public MetaVar CopyFromTo(MetaVarTable SourceTableVar,MetaVarTable DestinationTableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Copies and returns an identical table.
	*/
	@External
	@SharedFunc
	public MetaVarTable Copy(MetaVarTable originalTableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Counts the amount of keys in a table.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Count(MetaVarTable valueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Removes all values from a table
	*/
	@External
	@SharedFunc
	public MetaVar Empty(MetaVarTable TableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Iterates for each numeric index in the table.
	*/
	@External
	@SharedFunc
	public MetaVar foreachi(MetaVarTable tableVar,MetaVarFunction funcVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Iterates for each pair in the table, calling the function with the key and value of the pair.
	*/
	@External
	@SharedFunc
	public MetaVar foreach(MetaVarTable TableVar,MetaVarFunction FunctionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the highest sequential index starting from 1.
	*/
	@External
	@SharedFunc
	public MetaVarNumber getn(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks if a table has a value
	*/
	@External
	@SharedFunc
	public MetaVarBoolean HasValue(MetaVarTable tblVar,com.crazyt.gmod.IMetaVarAny valueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Inserts a value into a table at the end of the table or at the given position.
	*/
	@External
	@SharedFunc
	public MetaVarNumber insert(MetaVarTable tableVar,MetaVarNumber positionVar,com.crazyt.gmod.IMetaVarAny valueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the highest numeric index.
	*/
	@External
	@SharedFunc
	public MetaVarNumber maxn(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Removes a value from a table and shifts any other variables down to fill the gap.
	*/
	//public com.crazyt.gmod.IMetaVarAny remove(MetaVarTable tableVar,MetaVarNumber indexVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sorts a table in reverse order from <a href="http://wiki.garrysmod.com/page/Libraries/table" title="Libraries/table">table</a>.<a href="http://wiki.garrysmod.com/page/Libraries/table/sort" title="Libraries/table/sort">sort</a>
	*/
	@External
	@SharedFunc
	public MetaVarTable SortDesc(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sorts a table either ascending or by the given sort function.
	*/
	@External
	@SharedFunc
	public MetaVar sort(MetaVarTable tableVar,MetaVarFunction sorterVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Converts a table into a string
	*/
	//public MetaVarString ToString(MetaVarTable TableVar,MetaVarString TableNameVar,MetaVarBoolean "Nice"formattingVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
