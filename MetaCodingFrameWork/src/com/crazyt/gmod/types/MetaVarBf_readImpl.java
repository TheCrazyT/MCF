package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("bf_read")
public class MetaVarBf_readImpl extends MetaVarImpl implements MetaVarBf_read{
	/**
	Reads an returns an angle object from the bitstream.
	*/
	@External
	@ClientFunc
	public MetaVarAngle ReadAngle(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads 1 bit an returns a bool representing the bit.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean ReadBool(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads a signed char and returns a number from -127 to 127 representing the ascii value of that char.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ReadChar(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads a short representing an entity index and returns the matching entity handle.
	*/
	@External
	@ClientFunc
	public MetaVarEntity ReadEntity(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads a 4 byte float from the bitstream and returns it.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ReadFloat(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads a 4 byte long from the bitstream and returns it.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ReadLong(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads a 2 byte short from the bitstream and returns it.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ReadShort(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads a null terminated string from the bitstream.
	*/
	@External
	@ClientFunc
	public MetaVarString ReadString(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads a special encoded vector normal from the bitstream and returns it, this function is not suitable to send vectors that represent a position.
	*/
	@External
	@ClientFunc
	public MetaVarVector ReadVectorNormal(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Rewinds the bitstream so it can be read again.
	*/
	@External
	@ClientFunc
	public MetaVar Reset(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarBf_readImpl(String n) {
		super(n);
	}
}
