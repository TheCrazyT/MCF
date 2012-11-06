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
@Library("table")
public class LibTable extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibTable(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Adds the contents from one table to another
	*/
	//public MetaVarTable Add(MetaVarTable Destination TableVar,MetaVarTable Source TableVar){return null;};
	/**
	Changes all keys to integers
	*/
	//public MetaVarTable ClearKeys(MetaVarTable Original TableVar,MetaVarBoolean Save KeysVar){return null;};
	/**
	Concatenates the contents of a table to a string.
	*/
	@External
	@SharedFunc
	public MetaVar concat(MetaVarTable tblVar,MetaVarString continatorVar,MetaVarNumber startPosVar,MetaVarNumber endPosVar){return null;};
	/**
	Erases all values from a table, and copies the values from another table to it.
	*/
	//public MetaVar CopyFromTo(MetaVarTable Source TableVar,MetaVarTable Destination TableVar){return null;};
	/**
	Copies and returns an identical table.
	*/
	@External
	@SharedFunc
	public MetaVarTable Copy(MetaVarTable originalTableVar){return null;};
	/**
	Counts the amount of keys in a table.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Count(MetaVarTable valueVar){return null;};
	/**
	Removes all values from a table
	*/
	@External
	@SharedFunc
	public MetaVar Empty(MetaVarTable TableVar){return null;};
	/**
	Iterates for each numeric index in the table.
	*/
	@External
	@SharedFunc
	public MetaVar foreachi(MetaVarTable tableVar,MetaVarFunction funcVar){return null;};
	/**
	Iterates for each pair in the table, calling the function with the key and value of the pair.
	*/
	@External
	@SharedFunc
	public MetaVar foreach(MetaVarTable TableVar,MetaVarFunction FunctionVar){return null;};
	/**
	Returns the highest sequential index starting from 1.
	*/
	@External
	@SharedFunc
	public MetaVarNumber getn(){return null;};
	/**
	Checks if a table has a value
	*/
	@External
	@SharedFunc
	public MetaVarBoolean HasValue(MetaVarTable tblVar,com.crazyt.gmod.IMetaVarAny valueVar){return null;};
	/**
	Inserts a value into a table at the end of the table or at the given position.
	*/
	@External
	@SharedFunc
	public MetaVarNumber insert(MetaVarTable tableVar,MetaVarNumber positionVar,com.crazyt.gmod.IMetaVarAny valueVar){return null;};
	/**
	Returns the highest numeric index.
	*/
	@External
	@SharedFunc
	public MetaVarNumber maxn(){return null;};
	/**
	Removes a value from a table and shifts any other variables down to fill the gap.
	*/
	//public com.crazyt.gmod.IMetaVarAny remove(MetaVarTable tableVar,MetaVarNumber indexVar){return null;};
	/**
	Sorts a table in reverse order from <a href="http://wiki.garrysmod.com/page/Libraries/table" title="Libraries/table">table</a>.<a href="http://wiki.garrysmod.com/page/Libraries/table/sort" title="Libraries/table/sort">sort</a>
	*/
	@External
	@SharedFunc
	public MetaVarTable SortDesc(){return null;};
	/**
	Sorts a table either ascending or by the given sort function.
	*/
	@External
	@SharedFunc
	public MetaVar sort(MetaVarTable tableVar,MetaVarFunction sorterVar){return null;};
	/**
	Converts a table into a string
	*/
	//public MetaVarString ToString(MetaVarTable TableVar,MetaVarString Table NameVar,MetaVarBoolean "Nice" formattingVar){return null;};
}
