package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("halo")
public class LibHalo{
	/**
	Applies a "halo" glow effect to one or multiple entities.
	*/
	//public MetaVar Add(MetaVarTable entitiesVar,MetaVarColor colorVar,MetaVarNumber blurXVar,MetaVarNumber blurYVar,MetaVarNumber passesVar,MetaVarBoolean additiveVar,MetaVarBoolean ignoreZVar){return null;};
	/**
	Renders a halo according to the specified table, only used internally, called from a PostDrawEffects hook added by the holo library
	*/
	@External
	@ClientFunc
	public MetaVar Render(MetaVarTable entryVar){return null;};
}
