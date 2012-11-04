package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("chat")
public class LibChat{
	/**
	Adds text to the chat box.
	*/
	@External
	@ClientFunc
	public MetaVar AddText(MetaVarVararg ArgumentsVar){return null;};
	/**
	Returns the chat box positions x and y.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetChatBoxPos(){return null;};
	/**
	Plays the chat "tick" sound.
	*/
	@External
	@ClientFunc
	public MetaVar PlaySound(){return null;};
}
