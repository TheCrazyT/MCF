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
@Library("engine")
public class LibEngine{
	/**
	Returns the name of the currently running gamemode.
	*/
	@External
	@SharedFunc
	public MetaVarString ActiveGamemode(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a table containing info for all installed gamemodes
	*/
	@External
	@SharedFunc
	public MetaVarTable GetGamemodes(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns an array of tables corresponding to all games from which Garry's Mod supports mounting content.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetGames(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	
	*/
	@External
	@SharedFunc
	public MetaVar SetMounted(MetaVarString depotVar,MetaVarBoolean mountedVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
