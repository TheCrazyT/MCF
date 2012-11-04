package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("vgui")
public class LibVgui{
	/**
	Creates a panel by the specified classname.
	*/
	@External
	@ClientFunc
	public MetaVarPanel Create(MetaVarString classnameVar,MetaVarPanel parentVar,MetaVarString nameVar){return null;};
	/**
	Returns whenever the cursor is current active and visible.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean CursorVisible(){return null;};
	/**
	Returns whenever the currently focused panel has a parent.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean FocusedHasParent(){return null;};
	/**
	Returns the panel the cursor is hovering above.
	*/
	@External
	@ClientFunc
	public MetaVarPanel GetHoveredPanel(){return null;};
	/**
	Returns the panel which is currently received keyboard input.
	*/
	@External
	@ClientFunc
	public MetaVarPanel GetKeyboardFocus(){return null;};
	/**
	Returns the global world panel which is the parent to all others.
	*/
	@External
	@ClientFunc
	public MetaVarPanel GetWorldPanel(){return null;};
	/**
	Returns whenever the cursor is hovering the world panel.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsHoveringWorld(){return null;};
}
