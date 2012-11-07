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
@Library("timer")
public class LibTimer{
	/**
	Adjusts the timer if the timer with the given identifier exists, otherwise creates it.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean Adjust(com.crazyt.gmod.IMetaVarAny identifierVar,MetaVarNumber delayVar,MetaVarNumber repsVar,MetaVarFunction funcVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a new timer.
	*/
	@External
	@SharedFunc
	public MetaVar Create(MetaVarString identifierVar,MetaVarNumber delayVar,MetaVarNumber repetitionsVar,MetaVarFunction funcVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Removes the timer with the given name.
	*/
	@External
	@SharedFunc
	public MetaVar Destroy(com.crazyt.gmod.IMetaVarAny identifierVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the given timer exists.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean Exists(com.crazyt.gmod.IMetaVarAny identifierVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Pauses the given timer.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean Pause(com.crazyt.gmod.IMetaVarAny identifierVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Removes the timer with the given name.
	*/
	//public MetaVar Remove(com.crazyt.gmod.IMetaVarAny identifierVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Runs the given function after a specified delay.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean Simple(MetaVarNumber delayVar,MetaVarFunction funcVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Restarts the given timer.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean Start(com.crazyt.gmod.IMetaVarAny identifierVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Stops the given timer.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean Stop(com.crazyt.gmod.IMetaVarAny identifierVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Runs either <a href="http://wiki.garrysmod.com/page/Libraries/timer" title="Libraries/timer">timer</a>.<a href="http://wiki.garrysmod.com/page/Libraries/timer/Pause" title="Libraries/timer/Pause">Pause</a> or <a href="http://wiki.garrysmod.com/page/Libraries/timer" title="Libraries/timer">timer</a>.<a href="http://wiki.garrysmod.com/page/Libraries/timer/UnPause" title="Libraries/timer/UnPause">UnPause</a> based on the timer's current status
	*/
	@External
	@SharedFunc
	public MetaVarBoolean Toggle(com.crazyt.gmod.IMetaVarAny identifierVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Unpauses the timer.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean UnPause(com.crazyt.gmod.IMetaVarAny identifierVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
