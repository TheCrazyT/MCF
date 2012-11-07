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
@Library("input")
public class LibInput{
	/**
	Returns the cursor's position on the screen
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetCursorPos(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the name of the key index.
	*/
	@External
	@ClientFunc
	public MetaVarString GetKeyName(MetaVarNumber keyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets whether a control key is being pressed
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsControlDown(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets whether a key is down
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsKeyDown(MetaVarNumber keyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets whether a mousebutton is down
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsMouseDown(MetaVarNumber mouseKeyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets whether a shift key is being pressed
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsShiftDown(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the match uppercase key for the specified binding.
	*/
	@External
	@ClientFunc
	public MetaVar LookupBinding(MetaVarString bindingVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the cursor's position on the screen, relative to the topleft corner of the window
	*/
	@External
	@ClientFunc
	public MetaVar SetCursorPos(MetaVarNumber mouseXVar,MetaVarNumber mouseYVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
