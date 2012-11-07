package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("pixelvis_handle_t")
public class MetaVarPixelvis_handle_tImpl extends MetaVarImpl implements MetaVarPixelvis_handle_t{
	/**
	Overridden by the engine in order to clean up the pixelvis_handle_t.
	*/
	@External
	@ClientFunc
	public MetaVar __gc(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarPixelvis_handle_tImpl(String n) {
		super(n);
	}
}
