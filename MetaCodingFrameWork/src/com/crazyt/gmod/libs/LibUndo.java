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
@Library("undo")
public class LibUndo extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibUndo(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Adds an entity to the current undo block
	*/
	@External
	@ServerFunc
	public MetaVar Finish(MetaVarEntity entVar){return null;};
	/**
	Adds a function to call when the current undo block is undone
	*/
	//public MetaVar AddFunction(MetaVarFunction funcVar,com.crazyt.gmod.IMetaVarAny arg2, ...Var){return null;};
	/**
	Begins a new undo entry
	*/
	@External
	@ServerFunc
	public MetaVar Create(MetaVarString nameVar){return null;};
	/**
	Processes an undo block (in table form). This is used internally by the undo manager when a player presses Z.
	*/
	@External
	@ServerFunc
	public MetaVarNumber Do_Undo(MetaVarTable tabVar){return null;};
	/**
	Returns a table containing all undo blocks
	*/
	@External
	@SharedFunc
	public MetaVarTable GetTable(){return null;};
	/**
	Replaces any instance of the "from" reference with the "to" reference, in any existing undo block. Returns true if something was replaced
	*/
	@External
	@ServerFunc
	public MetaVarBoolean ReplaceEntity(MetaVarEntity fromVar,MetaVarEntity toVar){return null;};
	/**
	Sets a custom undo text for the current undo block
	*/
	@External
	@ServerFunc
	public MetaVar SetCustomUndoText(MetaVarString customTextVar){return null;};
	/**
	Sets the player which the current undo block belongs to
	*/
	@External
	@ServerFunc
	public MetaVar SetPlayer(MetaVarPlayer plyVar){return null;};
}
