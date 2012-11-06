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
import com.crazyt.mcf.BasicFunctions;
import com.crazyt.mcf.BuildClass;
@External
@Library("player")
public class LibPlayer extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibPlayer(MetaCommand mc){
		this.metaCommand = mc;
	}
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
