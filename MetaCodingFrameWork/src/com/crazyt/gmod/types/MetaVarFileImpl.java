package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("File")
public class MetaVarFileImpl extends MetaVarImpl implements MetaVarFile{
	/**
	Dumps the file changes to disk and closes the file handle which makes the handle useless.
	*/
	@External
	@SharedFunc
	public MetaVar Close(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Dumps the file changes to disk and saves the file.
	*/
	@External
	@SharedFunc
	public MetaVar Flush(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads the specified amount of chars and returns them as a binary string.
	*/
	@External
	@SharedFunc
	public MetaVarString Read(MetaVarNumber lengthVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads one byte of the file and returns whenever that byte was not null.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean ReadBool(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads one byte of the file and returns the decimal ASCII value.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadByte(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads 8 bytes from the file converts them to a double and returns them.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadDouble(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads 4 bytes from the file converts them to a float and returns them.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadFloat(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads 4 bytes from the file converts them to a long and returns them.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadLong(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads 2 bytes from the file converts them to a short and returns them.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadShort(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the file pointer to the specified position.
	*/
	@External
	@SharedFunc
	public MetaVar Seek(MetaVarNumber posVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the size of the file in bytes.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Size(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Moves the file pointer by the specified amount of chars.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Skip(MetaVarNumber amountVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the current position of the file pointer.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Tell(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes the given string into the file.
	*/
	@External
	@SharedFunc
	public MetaVar Write(MetaVarString dataVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes on byte, representing the a Boolean to the file.
	*/
	@External
	@SharedFunc
	public MetaVar WriteBool(MetaVarBoolean boolVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes a byte to the file.
	*/
	@External
	@SharedFunc
	public MetaVar WriteByte(MetaVarNumber byteVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes a 8byte floating point double to the file.
	*/
	@External
	@SharedFunc
	public MetaVar WriteDouble(MetaVarNumber doubleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes a 4byte float to the file.
	*/
	@External
	@SharedFunc
	public MetaVar WriteFloat(MetaVarNumber floatVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes a 4byte integer to the file.
	*/
	@External
	@SharedFunc
	public MetaVar WriteLong(MetaVarNumber intVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes a 2 byte integer to the file.
	*/
	@External
	@SharedFunc
	public MetaVar WriteShort(MetaVarNumber shortVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Overridden by the engine in order to clean up the file object, the collection of a file object will lead to the close of the file handle and therefor cause it to be saved.
	*/
	@External
	@SharedFunc
	public MetaVar __gc(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarFileImpl(String n) {
		super(n);
	}
}
