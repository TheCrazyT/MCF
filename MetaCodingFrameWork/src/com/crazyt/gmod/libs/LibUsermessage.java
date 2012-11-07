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
@Library("usermessage")
public class LibUsermessage extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibUsermessage(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Returns a table of every usermessage hook
	*/
	@External
	@SharedFunc
	public MetaVarTable GetTable(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets a hook for the specified to be called when a usermessage with the specified name arrives
	*/
	@External
	@SharedFunc
	public MetaVar Hook(MetaVarString nameVar,MetaVarFunction callbackVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Called by the engine when a usermessage arrives, this method calls the hook function specified by <a href="http://wiki.garrysmod.com/page/Libraries/usermessage" title="Libraries/usermessage">usermessage</a>.<a href="http://wiki.garrysmod.com/page/Libraries/usermessage/Hook" title="Libraries/usermessage/Hook">Hook</a> if any.
	*/
	@External
	@SharedFunc
	public MetaVar IncomingMessage(MetaVarString nameVar,MetaVarBf_read msgVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
