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
@Library("player")
public class LibPlayer{
	/**
	Gets all the current players in the server (not including connecting clients).
	*/
	@External
	@SharedFunc
	public MetaVarTable GetAll(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a table of all bot entities.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetBots(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the player with the specified connection ID.
	*/
	@External
	@SharedFunc
	public MetaVar GetByID(MetaVarNumber connectionIDVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the player with the specified uniqueID.
	*/
	@External
	@SharedFunc
	public MetaVar GetByUniqueID(MetaVarString uniqueIDVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a table of all actual players.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetHumans(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
