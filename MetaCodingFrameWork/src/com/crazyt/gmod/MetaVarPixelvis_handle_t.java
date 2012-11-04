package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("pixelvis_handle_t")
public class MetaVarPixelvis_handle_t extends MetaVarImpl implements IMetaVarAny{
	public MetaVarPixelvis_handle_t(String n) {
		super(n);
	}
	/**
	Overridden by the engine in order to clean up the pixelvis_handle_t.
	*/
	@External
	@ClientFunc
	public MetaVar __gc(){return null;};
}
