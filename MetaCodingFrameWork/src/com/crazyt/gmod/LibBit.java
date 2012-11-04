package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("bit")
public class LibBit{
	/**
	Returns the arithmetically shifted value.
	*/
	@External
	@SharedFunc
	public MetaVarNumber arshift(MetaVarNumber valueVar,MetaVarNumber shiftCountVar){return null;};
	/**
	Returns the bitwise and of all values specified.
	*/
	@External
	@SharedFunc
	public MetaVarNumber band(MetaVarNumber valueVar,MetaVarNumber otherValuesVar){return null;};
	/**
	Returns the bitwise not of the value.
	*/
	@External
	@SharedFunc
	public MetaVarNumber bnot(MetaVarNumber valueVar){return null;};
	/**
	Returns the bitwise and of all values specified.
	*/
	@External
	@SharedFunc
	public MetaVarNumber bor(MetaVarNumber valueVar,MetaVarNumber otherValuesVar){return null;};
	/**
	Swaps the byte order.
	*/
	@External
	@SharedFunc
	public MetaVarNumber bswap(MetaVarNumber valueVar){return null;};
	/**
	Returns the bitwise xor of all values specified.
	*/
	@External
	@SharedFunc
	public MetaVarNumber bxor(MetaVarNumber valueVar,MetaVarNumber otherValuesVar){return null;};
	/**
	Returns the left shifted value.
	*/
	@External
	@SharedFunc
	public MetaVarNumber lshift(MetaVarNumber valueVar,MetaVarNumber shiftCountVar){return null;};
	/**
	Returns the left rotated value.
	*/
	@External
	@SharedFunc
	public MetaVarNumber rol(MetaVarNumber valueVar,MetaVarNumber shiftCountVar){return null;};
	/**
	Returns the right shifted value.
	*/
	@External
	@SharedFunc
	public MetaVarNumber rshift(MetaVarNumber valueVar,MetaVarNumber shiftCountVar){return null;};
	/**
	Returns the hexadecimal representation of the number with the specified digits.
	*/
	@External
	@SharedFunc
	public MetaVarString tohex(MetaVarNumber valueVar,MetaVarNumber digitsVar){return null;};
}
