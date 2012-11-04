package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("bf_read")
public class MetaVarBf_read extends MetaVarImpl implements IMetaVarAny{
	public MetaVarBf_read(String n) {
		super(n);
	}
	/**
	Reads an returns an angle object from the bitstream.
	*/
	@External
	@ClientFunc
	public MetaVarAngle ReadAngle(){return null;};
	/**
	Reads 1 bit an returns a bool representing the bit.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean ReadBool(){return null;};
	/**
	Reads a signed char and returns a number from -127 to 127 representing the ascii value of that char.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ReadChar(){return null;};
	/**
	Reads a short representing an entity index and returns the matching entity handle.
	*/
	@External
	@ClientFunc
	public MetaVarEntity ReadEntity(){return null;};
	/**
	Reads a 4 byte float from the bitstream and returns it.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ReadFloat(){return null;};
	/**
	Reads a 4 byte long from the bitstream and returns it.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ReadLong(){return null;};
	/**
	Reads a 2 byte short from the bitstream and returns it.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ReadShort(){return null;};
	/**
	Reads a null terminated string from the bitstream.
	*/
	@External
	@ClientFunc
	public MetaVarString ReadString(){return null;};
	/**
	Reads a special encoded vector normal from the bitstream and returns it, this function is not suitable to send vectors that represent a position.
	*/
	@External
	@ClientFunc
	public MetaVarVector ReadVectorNormal(){return null;};
	/**
	Rewinds the bitstream so it can be read again.
	*/
	@External
	@ClientFunc
	public MetaVar Reset(){return null;};
}
