package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("coroutine")
public class LibCoroutine{
	/**
	Creates a coroutine of the given function.
	*/
	@External
	@SharedFunc
	public MetaVarThread create(MetaVarFunction funcVar){return null;};
	/**
	Resumes the given coroutine and passes the given vararg to either the function arguments or the <a href="http://wiki.garrysmod.com/page/Libraries/coroutine" title="Libraries/coroutine">coroutine</a>.<a href="http://wiki.garrysmod.com/page/Libraries/coroutine/yield" title="Libraries/coroutine/yield">yield</a> that is inside that function and returns whatever yield is called with the next time or by the final return in the function.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean resume(MetaVarThread coroutineVar,MetaVarVararg argsVar){return null;};
	/**
	Returns the active coroutine or nil if we are not within a coroutine.
	*/
	@External
	@SharedFunc
	public MetaVarThread running(){return null;};
	/**
	Returns the status of the coroutine passed to it, the possible statuses are "suspended", "running", and "dead".
	*/
	@External
	@SharedFunc
	public MetaVarString status(MetaVarThread coroutineVar){return null;};
	/**
	Returns a function which calling is equivalent with calling <a href="http://wiki.garrysmod.com/page/Libraries/coroutine" title="Libraries/coroutine">coroutine</a>.<a href="http://wiki.garrysmod.com/page/Libraries/coroutine/resume" title="Libraries/coroutine/resume">resume</a> with the coroutine and all extra parameters.
	*/
	@External
	@SharedFunc
	public MetaVarFunction wrap(MetaVarFunction coroutineVar){return null;};
	/**
	Pauses the active coroutine and passes all additional variables to the call of <a href="http://wiki.garrysmod.com/page/Libraries/coroutine" title="Libraries/coroutine">coroutine</a>.<a href="http://wiki.garrysmod.com/page/Libraries/coroutine/resume" title="Libraries/coroutine/resume">resume</a> that resumed the coroutine last time, and returns all additional variables that were passed to the previous call of resume.
	*/
	@External
	@SharedFunc
	public MetaVarVararg yield(MetaVarVararg argsVar){return null;};
}