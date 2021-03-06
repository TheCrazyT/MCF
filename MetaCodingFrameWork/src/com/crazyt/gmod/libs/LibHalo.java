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
@Library("halo")
public class LibHalo{
	/**
	Applies a "halo" glow effect to one or multiple entities.
	*/
	@External
	@ClientFunc
	public MetaVar Add(MetaVarTable entitiesVar,MetaVarColor colorVar,MetaVarNumber blurXVar,MetaVarNumber blurYVar,MetaVarNumber passesVar,MetaVarBoolean additiveVar,MetaVarBoolean ignoreZVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Renders a halo according to the specified table, only used internally, called from a PostDrawEffects hook added by the holo library
	*/
	@External
	@ClientFunc
	public MetaVar Render(MetaVarTable entryVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
