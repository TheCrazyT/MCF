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
@Library("gui")
public class LibGui extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibGui(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Opens the game menu overlay.
	*/
	@External
	@ClientFunc
	public MetaVar ActivateGameUI(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Enables the mouse cursor without restricting player movement, like using Sandbox's Context Menu
	*/
	@External
	@ClientFunc
	public MetaVar EnableScreenClicker(MetaVarBoolean enabledVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Hides the game menu overlay.
	*/
	@External
	@ClientFunc
	public MetaVar HideGameUI(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Simulates a mouse move to the given position.
	*/
	@External
	@ClientFunc
	public MetaVar InternalCursorMoved(MetaVarNumber posXVar,MetaVarNumber posYVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Simulates a key press for the given key.
	*/
	@External
	@ClientFunc
	public MetaVar InternalKeyCodePressed(MetaVarNumber keyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Simulates a key release for the given key.
	*/
	@External
	@ClientFunc
	public MetaVar InternalKeyCodeReleased(MetaVarNumber keyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Simulates a key type typing to the specified key.
	*/
	@External
	@ClientFunc
	public MetaVar InternalKeyCodeTyped(MetaVarNumber keyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Simulates a double mouse key press for the given mouse key.
	*/
	@External
	@ClientFunc
	public MetaVar InternalMouseDoublePressed(MetaVarNumber keyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Simulates a mouse key press for the given mouse key.
	*/
	@External
	@ClientFunc
	public MetaVar InternalMousePressed(MetaVarNumber keyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Simulates a mouse key release for the given mouse key.
	*/
	@External
	@ClientFunc
	public MetaVar InternalMouseReleased(MetaVarNumber keyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Simulates a mouse wheel scroll with the given delta.
	*/
	@External
	@ClientFunc
	public MetaVar InternalMouseWheeled(MetaVarNumber deltaVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the console is visible.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsConsoleVisible(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the game menu overlay.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsGameUIVisible(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the cursor's position on the screen
	*/
	@External
	@ClientFunc
	public MetaVarNumber MousePos(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns x component of the mouse position.
	*/
	@External
	@ClientFunc
	public MetaVarNumber MouseX(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns y component of the mouse position.
	*/
	@External
	@ClientFunc
	public MetaVarNumber MouseY(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Converts the specified screen position to a direction vector local to the player's view
	*/
	@External
	@ClientFunc
	public MetaVarVector ScreenToVector(MetaVarNumber mouseXVar,MetaVarNumber mouseYVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the cursor's position on the screen, relative to the topleft corner of the window
	*/
	@External
	@ClientFunc
	public MetaVar SetMousePos(MetaVarNumber mouseXVar,MetaVarNumber mouseYVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
