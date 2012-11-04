package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("jit")
public class LibJit{
	/**
	Returns the status of the JIT compiler and the current optimizations enabled.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean status(){return null;};
}
