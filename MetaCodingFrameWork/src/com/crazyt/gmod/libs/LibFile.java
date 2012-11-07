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
@Library("file")
public class LibFile extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibFile(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Appends a file relative to the <i>data</i> folder.
	*/
	@External
	@SharedFunc
	public MetaVar Append(MetaVarString nameVar,MetaVarString contentVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Deletes a file that is relative to the <i>data</i> folder.
	*/
	@External
	@SharedFunc
	public MetaVar Delete(MetaVarString nameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a directory that is relative to the <i>data</i> folder.
	*/
	@External
	@SharedFunc
	public MetaVar CreateDir(MetaVarString nameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a boolean of whether the file or directory exists or not.
	*/
	@External
	@SharedFunc
	public MetaVar Exists(MetaVarString nameVar,MetaVarString pathVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a table of files and directories.
	*/
	@External
	@SharedFunc
	public MetaVarTable Find(MetaVarString nameVar,MetaVarString pathVar,MetaVarString sortingVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the given file is a directory.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsDir(MetaVarString fileNameVar,MetaVarString pathVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the file's size in bytes.
	*/
	@External
	@SharedFunc
	public MetaVar Size(MetaVarString fileNameVar,MetaVarString pathVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Attempts to open a file with the given mode.
	*/
	@External
	@SharedFunc
	public MetaVarFile Open(MetaVarString fileNameVar,MetaVarString fileModeVar,MetaVarString pathVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the content of a file.
	*/
	@External
	@SharedFunc
	public MetaVar Read(MetaVarString fileNameVar,MetaVarString pathVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns when the file was lasted modified in Unix time.
	*/
	@External
	@SharedFunc
	public MetaVar Time(MetaVarString fileNameVar,MetaVarString pathVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes the given string to a file.
	*/
	@External
	@SharedFunc
	public MetaVar Write(MetaVarString fileNameVar,MetaVarString contentVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
