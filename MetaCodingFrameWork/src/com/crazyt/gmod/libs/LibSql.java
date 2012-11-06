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
@Library("sql")
public class LibSql extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibSql(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Tells the engine a set of queries is coming. Will wait until <a href="http://wiki.garrysmod.com/page/Libraries/sql" title="Libraries/sql">sql</a>.<a href="http://wiki.garrysmod.com/page/Libraries/sql/Commit" title="Libraries/sql/Commit">Commit</a> is called to run them.
	*/
	@External
	@SharedFunc
	public MetaVar Begin(){return null;};
	/**
	Tells the engine to execute a series of queries queued for execution.
	*/
	@External
	@SharedFunc
	public MetaVar Commit(){return null;};
	/**
	Returns the last error from a SQLite query.
	*/
	@External
	@SharedFunc
	public MetaVarString LastError(){return null;};
	/**
	Performs a query on the local SQLite database, returns a table as result set, nil on failure.
	*/
	@External
	@SharedFunc
	public MetaVarTable Query(MetaVarString queryVar){return null;};
	/**
	Escapes dangerous characters and symbols from user input used in a SQL Query.
	*/
	@External
	@SharedFunc
	public MetaVarString SQLStr(MetaVarString stringVar){return null;};
	/**
	Returns if the table with the specified name exists.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean TableExists(MetaVarString tableNameVar){return null;};
}
