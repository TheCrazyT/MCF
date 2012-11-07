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
@Library("chat")
public class LibChat{
	/**
	Adds text to the chat box.
	*/
	@External
	@ClientFunc
	public MetaVar AddText(MetaVarVararg ArgumentsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the chat box positions x and y.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetChatBoxPos(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Plays the chat "tick" sound.
	*/
	@External
	@ClientFunc
	public MetaVar PlaySound(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
