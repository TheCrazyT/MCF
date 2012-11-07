package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("CRecipientFilter")
public class MetaVarCRecipientFilterImpl extends MetaVarImpl implements MetaVarCRecipientFilter{
	/**
	Adds all players to the recipient filter.
	*/
	@External
	@ServerFunc
	public MetaVar AddAllPlayers(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Adds all players that are in the same PVS as this position.
	*/
	@External
	@ServerFunc
	public MetaVar AddPVS(MetaVarVector PositionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Adds a player to the recipient filter
	*/
	@External
	@ServerFunc
	public MetaVar AddPlayer(MetaVarPlayer PlayerVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Removes all players from the recipient filter.
	*/
	@External
	@ServerFunc
	public MetaVar RemoveAllPlayers(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Removes all players that can see this PVS from the recipient filter.
	*/
	@External
	@ServerFunc
	public MetaVar RemovePVS(MetaVarVector PositionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Removes the player from the recipient filter.
	*/
	@External
	@ServerFunc
	public MetaVar RemovePlayer(MetaVarPlayer PlayerVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Overridden by the engine in order to clean up the CRecipientFilter object.
	*/
	@External
	@ServerFunc
	public MetaVar __gc(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarCRecipientFilterImpl(String n) {
		super(n);
	}
}
