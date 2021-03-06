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
@Library("sql")
public class LibSql{
	/**
	Tells the engine a set of queries is coming. Will wait until <a href="http://wiki.garrysmod.com/page/Libraries/sql" title="Libraries/sql">sql</a>.<a href="http://wiki.garrysmod.com/page/Libraries/sql/Commit" title="Libraries/sql/Commit">Commit</a> is called to run them.
	*/
	@External
	@SharedFunc
	public MetaVar Begin(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Tells the engine to execute a series of queries queued for execution.
	*/
	@External
	@SharedFunc
	public MetaVar Commit(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the last error from a SQLite query.
	*/
	@External
	@SharedFunc
	public MetaVarString LastError(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Performs a query on the local SQLite database, returns a table as result set, nil on failure.
	*/
	@External
	@SharedFunc
	public MetaVarTable Query(MetaVarString queryVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Escapes dangerous characters and symbols from user input used in a SQL Query.
	*/
	@External
	@SharedFunc
	public MetaVarString SQLStr(MetaVarString stringVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the table with the specified name exists.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean TableExists(MetaVarString tableNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
