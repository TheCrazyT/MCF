package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("player")
public class LibPlayer{
	/**
	Gets all the current players in the server (not including connecting clients).
	*/
	@External
	@SharedFunc
	public MetaVarTable GetAll(){return null;};
	/**
	Returns a table of all bot entities.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetBots(){return null;};
	/**
	Gets the player with the specified connection ID.
	*/
	@External
	@SharedFunc
	public MetaVar GetByID(MetaVarNumber connectionIDVar){return null;};
	/**
	Gets the player with the specified uniqueID.
	*/
	@External
	@SharedFunc
	public MetaVar GetByUniqueID(MetaVarString uniqueIDVar){return null;};
	/**
	Returns a table of all actual players.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetHumans(){return null;};
}
