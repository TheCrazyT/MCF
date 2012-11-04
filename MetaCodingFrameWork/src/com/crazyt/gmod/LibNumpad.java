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
@Library("numpad")
public class LibNumpad extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibNumpad(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Activates numpad key owned by the player
	*/
	@External
	@ServerFunc
	public MetaVar Activate(MetaVarPlayer plyVar,MetaVarNumber keyVar,MetaVarBoolean isButtonVar){return null;};
	/**
	Deactivates numpad key owned by the player
	*/
	@External
	@ServerFunc
	public MetaVar Deactivate(MetaVarPlayer plyVar,MetaVarNumber keyVar,MetaVarBoolean isButtonVar){return null;};
	/**
	Returns true during a function added with <a href="http://wiki.garrysmod.com/page/Libraries/numpad" title="Libraries/numpad">numpad</a>.<a href="http://wiki.garrysmod.com/page/Libraries/numpad/Register" title="Libraries/numpad/Register">Register</a>
	*/
	@External
	@ServerFunc
	public MetaVarBoolean FromButton(){return null;};
	/**
	Adds a function to call when a player presses a key on the number pad
	*/
	@External
	@ServerFunc
	public MetaVarNumber OnDown(MetaVarPlayer plyVar,MetaVarNumber keyVar,MetaVarString nameVar,com.crazyt.gmod.IMetaVarAny argsVar){return null;};
	/**
	Adds a function to call when a player releases a key on the number pad
	*/
	//public MetaVarNumber OnUp(MetaVarPlayer plyVar,MetaVarNumber keyVar,MetaVarString nameVar,com.crazyt.gmod.IMetaVarAny args, ...Var){return null;};
	/**
	Registers a numpad library action for use with <a href="http://wiki.garrysmod.com/page/Libraries/numpad/OnDown" title="Libraries/numpad/OnDown">numpad.OnDown</a> and <a href="http://wiki.garrysmod.com/page/Libraries/numpad/OnUp" title="Libraries/numpad/OnUp">numpad.OnUp</a>.
	*/
	@External
	@ServerFunc
	public MetaVar Register(MetaVarString idVar,MetaVarFunction funcVar){return null;};
	/**
	Removes a function added by either <a href="http://wiki.garrysmod.com/page/Libraries/numpad" title="Libraries/numpad">numpad</a>.<a href="http://wiki.garrysmod.com/page/Libraries/numpad/OnUp" title="Libraries/numpad/OnUp">OnUp</a> or <a href="http://wiki.garrysmod.com/page/Libraries/numpad" title="Libraries/numpad">numpad</a>.<a href="http://wiki.garrysmod.com/page/Libraries/numpad/OnDown" title="Libraries/numpad/OnDown">OnDown</a>
	*/
	//public MetaVar Remove(MetaVarString nameVar){return null;};
	/**
	Either runs <a href="http://wiki.garrysmod.com/page/Libraries/numpad" title="Libraries/numpad">numpad</a>.<a href="http://wiki.garrysmod.com/page/Libraries/numpad/Activate" title="Libraries/numpad/Activate">Activate</a> or <a href="http://wiki.garrysmod.com/page/Libraries/numpad" title="Libraries/numpad">numpad</a>.<a href="http://wiki.garrysmod.com/page/Libraries/numpad/Deactivate" title="Libraries/numpad/Deactivate">Deactivate</a> depending on the key's current state
	*/
	@External
	@ServerFunc
	public MetaVar Toggle(MetaVarPlayer plyVar,MetaVarNumber keyVar){return null;};
}
