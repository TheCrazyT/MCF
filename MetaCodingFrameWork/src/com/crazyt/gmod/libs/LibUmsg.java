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
@Library("umsg")
public class LibUmsg{
	/**
	Write an angle to the user message.
	*/
	@External
	@ServerFunc
	public MetaVar Angle(MetaVarAngle angleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Write a bool to the user message.
	*/
	@External
	@ServerFunc
	public MetaVar Bool(MetaVarBoolean angleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Write a null terminated string to the user message.
	*/
	@External
	@ServerFunc
	public MetaVar String(MetaVarString stringVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes a signed char to the usermessage.
	*/
	//public MetaVar Char(MetaVarNumber charVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Dispatches to usermessage to the client(s).
	*/
	@External
	@ServerFunc
	public MetaVar End(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes a Vector to the usermessage.
	*/
	@External
	@ServerFunc
	public MetaVar Vector(MetaVarVector vectorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes an entity object to the usermessage.
	*/
	@External
	@ServerFunc
	public MetaVar Entity(MetaVarEntity entityVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes a float to the usermessage.
	*/
	@External
	@ServerFunc
	public MetaVar Float(MetaVarNumber floatVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes a vector normal to the usermessage.
	*/
	@External
	@ServerFunc
	public MetaVar VectorNormal(MetaVarVector normalVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes a signed int to the usermessage.
	*/
	@External
	@ServerFunc
	public MetaVar Long(MetaVarNumber intVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	The string specified will be networked to the client and receive a identifying number, which will be send instead of the string to optimize networking.
	*/
	@External
	@ServerFunc
	public MetaVar PoolString(MetaVarString stringVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes a signed short to the usermessage.
	*/
	@External
	@ServerFunc
	public MetaVar Short(MetaVarNumber shortVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Starts a new usermessage.
	*/
	@External
	@ServerFunc
	public MetaVar Start(MetaVarString nameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
