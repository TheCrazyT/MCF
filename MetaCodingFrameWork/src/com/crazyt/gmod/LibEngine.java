package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Library;
import com.crazyt.mcf.BasicFunctions;
import com.crazyt.mcf.BuildClass;
@External
@Library("engine")
public class LibEngine extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibEngine(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Returns the name of the currently running gamemode.
	*/
	@External
	@SharedFunc
	public MetaVarString ActiveGamemode(){return null;};
	/**
	Returns a table containing info for all installed gamemodes
	*/
	@External
	@SharedFunc
	public MetaVarTable GetGamemodes(){return null;};
	/**
	Returns an array of tables corresponding to all games from which Garry's Mod supports mounting content.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetGames(){return null;};
	/**
	
	*/
	@External
	@SharedFunc
	public MetaVar SetMounted(MetaVarString depotVar,MetaVarBoolean mountedVar){return null;};
}
