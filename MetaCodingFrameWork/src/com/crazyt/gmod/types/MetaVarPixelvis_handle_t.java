package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarPixelvis_handle_tImpl.class)
public interface MetaVarPixelvis_handle_t extends MetaVar,IMetaVarAny{
	/**
	Overridden by the engine in order to clean up the pixelvis_handle_t.
	*/
	@External
	@ClientFunc
	public MetaVar __gc();
}
