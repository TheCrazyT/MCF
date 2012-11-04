package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Library;
import com.crazyt.mcf.BasicFunctions;
import com.crazyt.mcf.BuildClass;
@External
@Library("umsg")
public class LibUmsg extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibUmsg(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Write an angle to the user message.
	*/
	@External
	@ServerFunc
	public MetaVar Angle(MetaVarAngle angleVar){return null;};
	/**
	Write a bool to the user message.
	*/
	@External
	@ServerFunc
	public MetaVar Bool(MetaVarBoolean angleVar){return null;};
	/**
	Write a null terminated string to the user message.
	*/
	@External
	@ServerFunc
	public MetaVar String(MetaVarString stringVar){return null;};
	/**
	Writes a signed char to the usermessage.
	*/
	//public MetaVar Char(MetaVarNumber charVar){return null;};
	/**
	Dispatches to usermessage to the client(s).
	*/
	@External
	@ServerFunc
	public MetaVar End(){return null;};
	/**
	Writes a Vector to the usermessage.
	*/
	@External
	@ServerFunc
	public MetaVar Vector(MetaVarVector vectorVar){return null;};
	/**
	Writes an entity object to the usermessage.
	*/
	@External
	@ServerFunc
	public MetaVar Entity(MetaVarEntity entityVar){return null;};
	/**
	Writes a float to the usermessage.
	*/
	@External
	@ServerFunc
	public MetaVar Float(MetaVarNumber floatVar){return null;};
	/**
	Writes a vector normal to the usermessage.
	*/
	@External
	@ServerFunc
	public MetaVar VectorNormal(MetaVarVector normalVar){return null;};
	/**
	Writes a signed int to the usermessage.
	*/
	@External
	@ServerFunc
	public MetaVar Long(MetaVarNumber intVar){return null;};
	/**
	The string specified will be networked to the client and receive a identifying number, which will be send instead of the string to optimize networking.
	*/
	@External
	@ServerFunc
	public MetaVar PoolString(MetaVarString stringVar){return null;};
	/**
	Writes a signed short to the usermessage.
	*/
	@External
	@ServerFunc
	public MetaVar Short(MetaVarNumber shortVar){return null;};
	/**
	Starts a new usermessage.
	*/
	@External
	@ServerFunc
	public MetaVar Start(MetaVarString nameVar){return null;};
}
