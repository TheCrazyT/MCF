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
@Library("input")
public class LibInput extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibInput(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Returns the cursor's position on the screen
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetCursorPos(){return null;};
	/**
	Gets the name of the key index.
	*/
	@External
	@ClientFunc
	public MetaVarString GetKeyName(MetaVarNumber keyVar){return null;};
	/**
	Gets whether a control key is being pressed
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsControlDown(){return null;};
	/**
	Gets whether a key is down
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsKeyDown(MetaVarNumber keyVar){return null;};
	/**
	Gets whether a mousebutton is down
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsMouseDown(MetaVarNumber mouseKeyVar){return null;};
	/**
	Gets whether a shift key is being pressed
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsShiftDown(){return null;};
	/**
	Gets the match uppercase key for the specified binding.
	*/
	@External
	@ClientFunc
	public MetaVar LookupBinding(MetaVarString bindingVar){return null;};
	/**
	Sets the cursor's position on the screen, relative to the topleft corner of the window
	*/
	@External
	@ClientFunc
	public MetaVar SetCursorPos(MetaVarNumber mouseXVar,MetaVarNumber mouseYVar){return null;};
}
