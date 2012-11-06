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
import com.crazyt.mcf.BasicFunctions;
import com.crazyt.mcf.BuildClass;
@External
@Library("chat")
public class LibChat extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibChat(MetaCommand mc){
		this.metaCommand = mc;
	}
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