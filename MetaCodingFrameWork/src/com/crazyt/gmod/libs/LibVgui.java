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
@Library("vgui")
public class LibVgui{
	/**
	Creates a panel by the specified classname.
	*/
	@External
	@ClientFunc
	public MetaVarPanel Create(MetaVarString classnameVar,MetaVarPanel parentVar,MetaVarString nameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the cursor is current active and visible.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean CursorVisible(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the currently focused panel has a parent.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean FocusedHasParent(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the panel the cursor is hovering above.
	*/
	@External
	@ClientFunc
	public MetaVarPanel GetHoveredPanel(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the panel which is currently received keyboard input.
	*/
	@External
	@ClientFunc
	public MetaVarPanel GetKeyboardFocus(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the global world panel which is the parent to all others.
	*/
	@External
	@ClientFunc
	public MetaVarPanel GetWorldPanel(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the cursor is hovering the world panel.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsHoveringWorld(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
