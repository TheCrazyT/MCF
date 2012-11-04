package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("CRecipientFilter")
public class MetaVarCRecipientFilter extends MetaVarImpl implements IMetaVarAny{
	public MetaVarCRecipientFilter(String n) {
		super(n);
	}
	/**
	Adds all players to the recipient filter.
	*/
	@External
	@ServerFunc
	public MetaVar AddAllPlayers(){return null;};
	/**
	Adds all players that are in the same PVS as this position.
	*/
	@External
	@ServerFunc
	public MetaVar AddPVS(MetaVarVector PositionVar){return null;};
	/**
	Adds a player to the recipient filter
	*/
	@External
	@ServerFunc
	public MetaVar AddPlayer(MetaVarPlayer PlayerVar){return null;};
	/**
	Removes all players from the recipient filter.
	*/
	@External
	@ServerFunc
	public MetaVar RemoveAllPlayers(){return null;};
	/**
	Removes all players that can see this PVS from the recipient filter.
	*/
	@External
	@ServerFunc
	public MetaVar RemovePVS(MetaVarVector PositionVar){return null;};
	/**
	Removes the player from the recipient filter.
	*/
	@External
	@ServerFunc
	public MetaVar RemovePlayer(MetaVarPlayer PlayerVar){return null;};
	/**
	Overridden by the engine in order to clean up the CRecipientFilter object.
	*/
	@External
	@ServerFunc
	public MetaVar __gc(){return null;};
}
