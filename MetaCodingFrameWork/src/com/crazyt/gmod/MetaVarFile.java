package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("File")
public class MetaVarFile extends MetaVarImpl implements IMetaVarAny{
	public MetaVarFile(String n) {
		super(n);
	}
	/**
	Dumps the file changes to disk and closes the file handle which makes the handle useless.
	*/
	@External
	@SharedFunc
	public MetaVar Close(){return null;};
	/**
	Dumps the file changes to disk and saves the file.
	*/
	@External
	@SharedFunc
	public MetaVar Flush(){return null;};
	/**
	Reads the specified amount of chars and returns them as a binary string.
	*/
	@External
	@SharedFunc
	public MetaVarString Read(MetaVarNumber lengthVar){return null;};
	/**
	Reads one byte of the file and returns whenever that byte was not null.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean ReadBool(){return null;};
	/**
	Reads one byte of the file and returns the decimal ASCII value.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadByte(){return null;};
	/**
	Reads 8 bytes from the file converts them to a double and returns them.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadDouble(){return null;};
	/**
	Reads 4 bytes from the file converts them to a float and returns them.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadFloat(){return null;};
	/**
	Reads 4 bytes from the file converts them to a long and returns them.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadLong(){return null;};
	/**
	Reads 2 bytes from the file converts them to a short and returns them.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadShort(){return null;};
	/**
	Sets the file pointer to the specified position.
	*/
	@External
	@SharedFunc
	public MetaVar Seek(MetaVarNumber posVar){return null;};
	/**
	Returns the size of the file in bytes.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Size(){return null;};
	/**
	Moves the file pointer by the specified amount of chars.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Skip(MetaVarNumber amountVar){return null;};
	/**
	Returns the current position of the file pointer.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Tell(){return null;};
	/**
	Writes the given string into the file.
	*/
	@External
	@SharedFunc
	public MetaVar Write(MetaVarString dataVar){return null;};
	/**
	Writes on byte, representing the a Boolean to the file.
	*/
	@External
	@SharedFunc
	public MetaVar WriteBool(MetaVarBoolean boolVar){return null;};
	/**
	Writes a byte to the file.
	*/
	@External
	@SharedFunc
	public MetaVar WriteByte(MetaVarNumber byteVar){return null;};
	/**
	Writes a 8byte floating point double to the file.
	*/
	@External
	@SharedFunc
	public MetaVar WriteDouble(MetaVarNumber doubleVar){return null;};
	/**
	Writes a 4byte float to the file.
	*/
	@External
	@SharedFunc
	public MetaVar WriteFloat(MetaVarNumber floatVar){return null;};
	/**
	Writes a 4byte integer to the file.
	*/
	@External
	@SharedFunc
	public MetaVar WriteLong(MetaVarNumber intVar){return null;};
	/**
	Writes a 2 byte integer to the file.
	*/
	@External
	@SharedFunc
	public MetaVar WriteShort(MetaVarNumber shortVar){return null;};
	/**
	Overridden by the engine in order to clean up the file object, the collection of a file object will lead to the close of the file handle and therefor cause it to be saved.
	*/
	@External
	@SharedFunc
	public MetaVar __gc(){return null;};
}
