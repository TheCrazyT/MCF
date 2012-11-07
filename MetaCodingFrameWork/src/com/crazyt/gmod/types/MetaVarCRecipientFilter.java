package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarCRecipientFilterImpl.class)
public interface MetaVarCRecipientFilter extends MetaVar,IMetaVarAny{
	/**
	Adds all players to the recipient filter.
	*/
	@External
	@ServerFunc
	public MetaVar AddAllPlayers();
	/**
	Adds all players that are in the same PVS as this position.
	*/
	@External
	@ServerFunc
	public MetaVar AddPVS(MetaVarVector PositionVar);
	/**
	Adds a player to the recipient filter
	*/
	@External
	@ServerFunc
	public MetaVar AddPlayer(MetaVarPlayer PlayerVar);
	/**
	Removes all players from the recipient filter.
	*/
	@External
	@ServerFunc
	public MetaVar RemoveAllPlayers();
	/**
	Removes all players that can see this PVS from the recipient filter.
	*/
	@External
	@ServerFunc
	public MetaVar RemovePVS(MetaVarVector PositionVar);
	/**
	Removes the player from the recipient filter.
	*/
	@External
	@ServerFunc
	public MetaVar RemovePlayer(MetaVarPlayer PlayerVar);
	/**
	Overridden by the engine in order to clean up the CRecipientFilter object.
	*/
	@External
	@ServerFunc
	public MetaVar __gc();
}
