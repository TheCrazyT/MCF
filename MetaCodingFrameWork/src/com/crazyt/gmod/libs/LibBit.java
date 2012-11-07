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
@Library("bit")
public class LibBit{
	/**
	Returns the arithmetically shifted value.
	*/
	@External
	@SharedFunc
	public MetaVarNumber arshift(MetaVarNumber valueVar,MetaVarNumber shiftCountVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the bitwise and of all values specified.
	*/
	@External
	@SharedFunc
	public MetaVarNumber band(MetaVarNumber valueVar,MetaVarNumber otherValuesVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the bitwise not of the value.
	*/
	@External
	@SharedFunc
	public MetaVarNumber bnot(MetaVarNumber valueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the bitwise and of all values specified.
	*/
	@External
	@SharedFunc
	public MetaVarNumber bor(MetaVarNumber valueVar,MetaVarNumber otherValuesVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Swaps the byte order.
	*/
	@External
	@SharedFunc
	public MetaVarNumber bswap(MetaVarNumber valueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the bitwise xor of all values specified.
	*/
	@External
	@SharedFunc
	public MetaVarNumber bxor(MetaVarNumber valueVar,MetaVarNumber otherValuesVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the left shifted value.
	*/
	@External
	@SharedFunc
	public MetaVarNumber lshift(MetaVarNumber valueVar,MetaVarNumber shiftCountVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the left rotated value.
	*/
	@External
	@SharedFunc
	public MetaVarNumber rol(MetaVarNumber valueVar,MetaVarNumber shiftCountVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the right shifted value.
	*/
	@External
	@SharedFunc
	public MetaVarNumber rshift(MetaVarNumber valueVar,MetaVarNumber shiftCountVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the hexadecimal representation of the number with the specified digits.
	*/
	@External
	@SharedFunc
	public MetaVarString tohex(MetaVarNumber valueVar,MetaVarNumber digitsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
