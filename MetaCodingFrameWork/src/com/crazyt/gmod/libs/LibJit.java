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
@Library("jit")
public class LibJit{
	/**
	Returns the status of the JIT compiler and the current optimizations enabled.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean status(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
