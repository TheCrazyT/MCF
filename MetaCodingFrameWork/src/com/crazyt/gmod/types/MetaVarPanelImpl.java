package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("Panel")
public class MetaVarPanelImpl extends MetaVarImpl implements MetaVarPanel{
	private MetaVarNumber x;
	@SimpleName("x")
	public MetaVarNumber getX(){ return x;}
	@SimpleName("x")
	public void setX(MetaVarNumber value){ x=value;}
	private MetaVarNumber y;
	@SimpleName("y")
	public MetaVarNumber getY(){ return y;}
	@SimpleName("y")
	public void setY(MetaVarNumber value){ y=value;}
	/**
	Adds the specified object to the panel.
	*/
	@External
	@ClientFunc
	public MetaVarPanel Add(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Aligns the panel on the bottom of its parent with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar AlignBottom(MetaVarNumber offsetVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Aligns the panel on the left of its parent with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar AlignLeft(MetaVarNumber offsetVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Aligns the panel on the right of its parent with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar AlignRight(MetaVarNumber offsetVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Aligns the panel on the top of its parent with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar AlignTop(MetaVarNumber offsetVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Centers the panel on its parent.
	*/
	@External
	@ClientFunc
	public MetaVar Center(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Centers the panel horizontally with specified fraction.
	*/
	@External
	@ClientFunc
	public MetaVar CenterHorizontal(MetaVarNumber fractionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Centers the panel vertically with specified fraction.
	*/
	@External
	@ClientFunc
	public MetaVar CenterVertical(MetaVarNumber fractionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the amount of children of the of panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ChildCount(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Marks all of the panel's children for deletion.
	*/
	@External
	@ClientFunc
	public MetaVar Clear(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Copies position and size of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar CopyBounds(MetaVarPanel baseVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Copies the height of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar CopyHeight(MetaVarPanel baseVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Copies the position of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar CopyPos(MetaVarPanel baseVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Copies the width of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar CopyWidth(MetaVarPanel baseVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the cursor position relative to the panels origin.
	*/
	@External
	@ClientFunc
	public MetaVarNumber CursorPos(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Makes the panel "lock" the screen until it is removed.
	*/
	@External
	@ClientFunc
	public MetaVar DoModal(MetaVarBoolean doModalVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the dock type of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar Dock(MetaVarNumber dockTypeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the dock margin of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar DockMargin(MetaVarNumber marginLeftVar,MetaVarNumber marginTopVar,MetaVarNumber marginRightVar,MetaVarNumber marginBottomVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the dock padding of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar DockPadding(MetaVarNumber paddingLeftVar,MetaVarNumber paddingTopVar,MetaVarNumber paddingRightVar,MetaVarNumber paddingBottomVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Finds a panel in its children(and sub children) with the given name.
	*/
	@External
	@ClientFunc
	public MetaVarPanel Find(MetaVarString panelNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Focuses the next panel in the focus queue.
	*/
	@External
	@ClientFunc
	public MetaVar FocusNext(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Focuses the previous panel in the focus queue.
	*/
	@External
	@ClientFunc
	public MetaVar FocusPrevious(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the alpha multiplier for this panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetAlpha(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns position and size of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetBounds(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets a child by its index.
	*/
	@External
	@ClientFunc
	public MetaVar GetChild(MetaVarNumber childIndexVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a table with all the child panels of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarTable GetChildren(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the class name of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarString GetClassName(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the internal name of the panel.
	*/
	//public MetaVarString GetName(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the parent of the panel, returns nil if there is no parent.
	*/
	@External
	@ClientFunc
	public MetaVarPanel GetParent(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the position of the panel relative to its parent.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetPos(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the size of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetSize(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the internal Lua table of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarTable GetTable(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the height of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetTall(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the width of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetWide(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the panel has child panels.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean HasChildren(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the panel is focused.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean HasParent(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the panel or any of its children(sub children and so on) has the focus.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean HasHierarchicalFocus(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Makes a panel invisible.
	*/
	@External
	@ClientFunc
	public MetaVar Hide(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Causes the panel to re-layout in the next frame.
	*/
	@External
	@ClientFunc
	public MetaVar InvalidateLayout(MetaVarBoolean layoutNowVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns true if the mouse cursor is over this panel.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsHovered(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns true if the panel can receive keyboard input.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsKeyboardInputEnabled(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the panel is going to be deleted in the next frame.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsMarkedForDeletion(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns true if the panel can receive mouse input.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsMouseInputEnabled(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the panel is valid and not marked for deletion.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsValid(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the panel is visible.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsVisible(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Remove the focus from the panel.
	*/
	@External
	@ClientFunc
	public MetaVar KillFocus(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the absolute screen position of the position specified relative to the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber LocalToScreen(MetaVarNumber posXVar,MetaVarNumber posYVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Focuses the panel and enables it to receive input.
	*/
	@External
	@ClientFunc
	public MetaVar MakePopup(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Allows the panel to receive mouse input even if the mouse cursor is outside the bounds of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar MouseCapture(MetaVarBoolean doCaptureVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Places the panel above the passed panel with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar MoveAbove(MetaVarPanel panelVar,MetaVarNumber offsetVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Places the panel below the passed panel with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar MoveBelow(MetaVarPanel panelVar,MetaVarNumber offsetVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Places the panel left to the passed panel with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar MoveLeftOf(MetaVarPanel panelVar,MetaVarNumber offsetVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Places the panel right to the passed panel with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar MoveRightOf(MetaVarPanel panelVar,MetaVarNumber offsetVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets whenever all child drawings should be clipped within the panels bounds.
	*/
	@External
	@ClientFunc
	public MetaVar NoClipping(MetaVarBoolean clipVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Paints a ghost copy of the panel at the given position with the given size.
	*/
	@External
	@ClientFunc
	public MetaVar PaintAt(MetaVarNumber posXVar,MetaVarNumber posYVar,MetaVarNumber widthVar,MetaVarNumber heightVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Paints the panel at its current position.
	*/
	@External
	@ClientFunc
	public MetaVar PaintManual(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Parents the panel to the HUD.
	*/
	@External
	@ClientFunc
	public MetaVar ParentToHUD(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sends a command to the panel.
	*/
	@External
	@ClientFunc
	public MetaVar PostMessage(MetaVarString messageNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Marks a panel for deletion so it will be deleted the next frame.
	*/
	//public MetaVar Remove(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Attempts to gain the input focus for the panel.
	*/
	@External
	@ClientFunc
	public MetaVar RequestFocus(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Translates global screen coordinate to coordinates relative to the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ScreenToLocal(MetaVarNumber screenXVar,MetaVarNumber screenYVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the alpha multiplier for the panel
	*/
	@External
	@ClientFunc
	public MetaVar SetAlpha(MetaVarNumber alphaVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets whenever the panel should be removed if the parent was removed.
	*/
	@External
	@ClientFunc
	public MetaVar SetAutoDelete(MetaVarBoolean autoDeleteVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the background color of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetBGColor(MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the background color of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetBGColorEx(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the appearance of the cursor.
	*/
	@External
	@ClientFunc
	public MetaVar SetCursor(MetaVarString cursorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the foreground color of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetFGColor(MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the foreground color of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetFGColorEx(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the height of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetHeight(MetaVarNumber heightVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Enables or disables the keyboard input for the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetKeyBoardInputEnabled(MetaVarBoolean keyboardInputVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Enables or disables the mouse input for the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetMouseInputEnabled(MetaVarBoolean mouseInputVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets whenever all the default background of the panel should be drawn or ot.
	*/
	@External
	@ClientFunc
	public MetaVar SetPaintBackgroundEnabled(MetaVarBoolean paintBackgroundVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets whenever all the default border of the panel should be drawn or ot.
	*/
	@External
	@ClientFunc
	public MetaVar SetPaintBorderEnabled(MetaVarBoolean paintBorderVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets if the panel was painted manually.
	*/
	@External
	@ClientFunc
	public MetaVar SetPaintedManually(MetaVarBoolean paintedManuallyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the parent of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetParent(MetaVarPanel parentVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the position of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetPos(MetaVarNumber posXVar,MetaVarNumber posYVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets whenever the panel should be rendered in the next screenshot.
	*/
	@External
	@ClientFunc
	public MetaVar SetRenderInScreenshots(MetaVarBoolean renderInScreenshotVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the size of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetSize(MetaVarNumber widthVar,MetaVarNumber heightVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the "visibility" of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetVisible(MetaVarBoolean visibleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the width of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetWidth(MetaVarNumber widthVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the panels z position which determines the rendering order.
	*/
	@External
	@ClientFunc
	public MetaVar SetZPos(MetaVarNumber zIndexVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Resizes the panel to fit the bounds of its children.
	*/
	@External
	@ClientFunc
	public MetaVar SizeToChildren(MetaVarBoolean sizeWVar,MetaVarBoolean sizeHVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the width of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar StretchToParent(MetaVarNumber offsetLeftVar,MetaVarNumber offsetTopVar,MetaVarNumber offsetRightVar,MetaVarNumber offsetBottomVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarPanelImpl(String n) {
		super(n);
	}
}
