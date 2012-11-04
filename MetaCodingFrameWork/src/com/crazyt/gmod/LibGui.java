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
	public MetaVar ActivateGameUI(){return null;};
	/**
	Enables the mouse cursor without restricting player movement, like using Sandbox's Context Menu
	*/
	@External
	@ClientFunc
	public MetaVar EnableScreenClicker(MetaVarBoolean enabledVar){return null;};
	/**
	Hides the game menu overlay.
	*/
	@External
	@ClientFunc
	public MetaVar HideGameUI(){return null;};
	/**
	Simulates a mouse move to the given position.
	*/
	@External
	@ClientFunc
	public MetaVar InternalCursorMoved(MetaVarNumber posXVar,MetaVarNumber posYVar){return null;};
	/**
	Simulates a key press for the given key.
	*/
	@External
	@ClientFunc
	public MetaVar InternalKeyCodePressed(MetaVarNumber keyVar){return null;};
	/**
	Simulates a key release for the given key.
	*/
	@External
	@ClientFunc
	public MetaVar InternalKeyCodeReleased(MetaVarNumber keyVar){return null;};
	/**
	Simulates a key type typing to the specified key.
	*/
	@External
	@ClientFunc
	public MetaVar InternalKeyCodeTyped(MetaVarNumber keyVar){return null;};
	/**
	Simulates a double mouse key press for the given mouse key.
	*/
	@External
	@ClientFunc
	public MetaVar InternalMouseDoublePressed(MetaVarNumber keyVar){return null;};
	/**
	Simulates a mouse key press for the given mouse key.
	*/
	@External
	@ClientFunc
	public MetaVar InternalMousePressed(MetaVarNumber keyVar){return null;};
	/**
	Simulates a mouse key release for the given mouse key.
	*/
	@External
	@ClientFunc
	public MetaVar InternalMouseReleased(MetaVarNumber keyVar){return null;};
	/**
	Simulates a mouse wheel scroll with the given delta.
	*/
	@External
	@ClientFunc
	public MetaVar InternalMouseWheeled(MetaVarNumber deltaVar){return null;};
	/**
	Returns whenever the console is visible.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsConsoleVisible(){return null;};
	/**
	Returns whenever the game menu overlay.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsGameUIVisible(){return null;};
	/**
	Returns the cursor's position on the screen
	*/
	@External
	@ClientFunc
	public MetaVarNumber MousePos(){return null;};
	/**
	Returns x component of the mouse position.
	*/
	@External
	@ClientFunc
	public MetaVarNumber MouseX(){return null;};
	/**
	Returns y component of the mouse position.
	*/
	@External
	@ClientFunc
	public MetaVarNumber MouseY(){return null;};
	/**
	Converts the specified screen position to a direction vector local to the player's view
	*/
	@External
	@ClientFunc
	public MetaVarVector ScreenToVector(MetaVarNumber mouseXVar,MetaVarNumber mouseYVar){return null;};
	/**
	Sets the cursor's position on the screen, relative to the topleft corner of the window
	*/
	@External
	@ClientFunc
	public MetaVar SetMousePos(MetaVarNumber mouseXVar,MetaVarNumber mouseYVar){return null;};
}
