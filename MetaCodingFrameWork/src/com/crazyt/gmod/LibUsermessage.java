package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("usermessage")
public class LibUsermessage{
	/**
	Returns a table of every usermessage hook
	*/
	@External
	@SharedFunc
	public MetaVarTable GetTable(){return null;};
	/**
	Sets a hook for the specified to be called when a usermessage with the specified name arrives
	*/
	@External
	@SharedFunc
	public MetaVar Hook(MetaVarString nameVar,MetaVarFunction callbackVar){return null;};
	/**
	Called by the engine when a usermessage arrives, this method calls the hook function specified by <a href="http://wiki.garrysmod.com/page/Libraries/usermessage" title="Libraries/usermessage">usermessage</a>.<a href="http://wiki.garrysmod.com/page/Libraries/usermessage/Hook" title="Libraries/usermessage/Hook">Hook</a> if any.
	*/
	@External
	@SharedFunc
	public MetaVar IncomingMessage(MetaVarString nameVar,MetaVarBf_read msgVar){return null;};
}
