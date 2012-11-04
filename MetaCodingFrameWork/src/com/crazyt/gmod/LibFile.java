package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("file")
public class LibFile{
	/**
	Appends a file relative to the <i>data</i> folder.
	*/
	@External
	@SharedFunc
	public MetaVar Append(MetaVarString nameVar,MetaVarString contentVar){return null;};
	/**
	Deletes a file that is relative to the <i>data</i> folder.
	*/
	@External
	@SharedFunc
	public MetaVar Delete(MetaVarString nameVar){return null;};
	/**
	Creates a directory that is relative to the <i>data</i> folder.
	*/
	@External
	@SharedFunc
	public MetaVar CreateDir(MetaVarString nameVar){return null;};
	/**
	Returns a boolean of whether the file or directory exists or not.
	*/
	@External
	@SharedFunc
	public MetaVar Exists(MetaVarString nameVar,MetaVarString pathVar){return null;};
	/**
	Returns a table of files and directories.
	*/
	@External
	@SharedFunc
	public MetaVarTable Find(MetaVarString nameVar,MetaVarString pathVar,MetaVarString sortingVar){return null;};
	/**
	Returns if the given file is a directory.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsDir(MetaVarString fileNameVar,MetaVarString pathVar){return null;};
	/**
	Returns the file's size in bytes.
	*/
	@External
	@SharedFunc
	public MetaVar Size(MetaVarString fileNameVar,MetaVarString pathVar){return null;};
	/**
	Attempts to open a file with the given mode.
	*/
	@External
	@SharedFunc
	public MetaVarFile Open(MetaVarString fileNameVar,MetaVarString fileModeVar,MetaVarString pathVar){return null;};
	/**
	Returns the content of a file.
	*/
	@External
	@SharedFunc
	public MetaVar Read(MetaVarString fileNameVar,MetaVarString pathVar){return null;};
	/**
	Returns when the file was lasted modified in Unix time.
	*/
	@External
	@SharedFunc
	public MetaVar Time(MetaVarString fileNameVar,MetaVarString pathVar){return null;};
	/**
	Writes the given string to a file.
	*/
	@External
	@SharedFunc
	public MetaVar Write(MetaVarString fileNameVar,MetaVarString contentVar){return null;};
}
