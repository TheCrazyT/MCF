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
@Library("undo")
public class LibUndo{
	/**
	Adds an entity to the current undo block
	*/
	@External
	@ServerFunc
	public MetaVar Finish(MetaVarEntity entVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Adds a function to call when the current undo block is undone
	*/
	//public MetaVar AddFunction(MetaVarFunction funcVar,com.crazyt.gmod.IMetaVarAny arg2,...Var){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Begins a new undo entry
	*/
	@External
	@ServerFunc
	public MetaVar Create(MetaVarString nameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Processes an undo block (in table form). This is used internally by the undo manager when a player presses Z.
	*/
	@External
	@ServerFunc
	public MetaVarNumber Do_Undo(MetaVarTable tabVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a table containing all undo blocks
	*/
	@External
	@SharedFunc
	public MetaVarTable GetTable(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Replaces any instance of the "from" reference with the "to" reference, in any existing undo block. Returns true if something was replaced
	*/
	@External
	@ServerFunc
	public MetaVarBoolean ReplaceEntity(MetaVarEntity fromVar,MetaVarEntity toVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets a custom undo text for the current undo block
	*/
	@External
	@ServerFunc
	public MetaVar SetCustomUndoText(MetaVarString customTextVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the player which the current undo block belongs to
	*/
	@External
	@ServerFunc
	public MetaVar SetPlayer(MetaVarPlayer plyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
