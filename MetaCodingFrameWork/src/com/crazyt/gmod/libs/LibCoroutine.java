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
@Library("coroutine")
public class LibCoroutine{
	/**
	Creates a coroutine of the given function.
	*/
	@External
	@SharedFunc
	public MetaVarThread create(MetaVarFunction funcVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Resumes the given coroutine and passes the given vararg to either the function arguments or the <a href="http://wiki.garrysmod.com/page/Libraries/coroutine" title="Libraries/coroutine">coroutine</a>.<a href="http://wiki.garrysmod.com/page/Libraries/coroutine/yield" title="Libraries/coroutine/yield">yield</a> that is inside that function and returns whatever yield is called with the next time or by the final return in the function.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean resume(MetaVarThread coroutineVar,MetaVarVararg argsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the active coroutine or nil if we are not within a coroutine.
	*/
	@External
	@SharedFunc
	public MetaVarThread running(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the status of the coroutine passed to it, the possible statuses are "suspended", "running", and "dead".
	*/
	@External
	@SharedFunc
	public MetaVarString status(MetaVarThread coroutineVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a function which calling is equivalent with calling <a href="http://wiki.garrysmod.com/page/Libraries/coroutine" title="Libraries/coroutine">coroutine</a>.<a href="http://wiki.garrysmod.com/page/Libraries/coroutine/resume" title="Libraries/coroutine/resume">resume</a> with the coroutine and all extra parameters.
	*/
	@External
	@SharedFunc
	public MetaVarFunction wrap(MetaVarFunction coroutineVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Pauses the active coroutine and passes all additional variables to the call of <a href="http://wiki.garrysmod.com/page/Libraries/coroutine" title="Libraries/coroutine">coroutine</a>.<a href="http://wiki.garrysmod.com/page/Libraries/coroutine/resume" title="Libraries/coroutine/resume">resume</a> that resumed the coroutine last time, and returns all additional variables that were passed to the previous call of resume.
	*/
	@External
	@SharedFunc
	public MetaVarVararg yield(MetaVarVararg argsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
