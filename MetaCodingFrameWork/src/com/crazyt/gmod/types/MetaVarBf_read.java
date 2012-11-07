package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarBf_readImpl.class)
public interface MetaVarBf_read extends MetaVar,IMetaVarAny{
	/**
	Reads an returns an angle object from the bitstream.
	*/
	@External
	@ClientFunc
	public MetaVarAngle ReadAngle();
	/**
	Reads 1 bit an returns a bool representing the bit.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean ReadBool();
	/**
	Reads a signed char and returns a number from -127 to 127 representing the ascii value of that char.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ReadChar();
	/**
	Reads a short representing an entity index and returns the matching entity handle.
	*/
	@External
	@ClientFunc
	public MetaVarEntity ReadEntity();
	/**
	Reads a 4 byte float from the bitstream and returns it.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ReadFloat();
	/**
	Reads a 4 byte long from the bitstream and returns it.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ReadLong();
	/**
	Reads a 2 byte short from the bitstream and returns it.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ReadShort();
	/**
	Reads a null terminated string from the bitstream.
	*/
	@External
	@ClientFunc
	public MetaVarString ReadString();
	/**
	Reads a special encoded vector normal from the bitstream and returns it, this function is not suitable to send vectors that represent a position.
	*/
	@External
	@ClientFunc
	public MetaVarVector ReadVectorNormal();
	/**
	Rewinds the bitstream so it can be read again.
	*/
	@External
	@ClientFunc
	public MetaVar Reset();
}
