package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("Panel")
public class MetaVarPanel extends MetaVarImpl implements IMetaVarAny{
	public MetaVarPanel(String n) {
		super(n);
	}
	/**
	Adds the specified object to the panel.
	*/
	@External
	public MetaVarPanel Add(){return null;};
	/**
	Aligns the panel on the bottom of its parent with the specified offset.
	*/
	@External
	public MetaVar AlignBottom(MetaVarNumber offsetVar){return null;};
	/**
	Aligns the panel on the left of its parent with the specified offset.
	*/
	@External
	public MetaVar AlignLeft(MetaVarNumber offsetVar){return null;};
	/**
	Aligns the panel on the right of its parent with the specified offset.
	*/
	@External
	public MetaVar AlignRight(MetaVarNumber offsetVar){return null;};
	/**
	Aligns the panel on the top of its parent with the specified offset.
	*/
	@External
	public MetaVar AlignTop(MetaVarNumber offsetVar){return null;};
	/**
	Centers the panel on its parent.
	*/
	@External
	public MetaVar Center(){return null;};
	/**
	Centers the panel horizontally with specified fraction.
	*/
	@External
	public MetaVar CenterHorizontal(MetaVarNumber fractionVar){return null;};
	/**
	Centers the panel vertically with specified fraction.
	*/
	@External
	public MetaVar CenterVertical(MetaVarNumber fractionVar){return null;};
	/**
	Returns the amount of children of the of panel.
	*/
	@External
	public MetaVarNumber ChildCount(){return null;};
	/**
	Marks all of the panel's children for deletion.
	*/
	@External
	public MetaVar Clear(){return null;};
	/**
	Copies position and size of the panel.
	*/
	@External
	public MetaVar CopyBounds(MetaVarPanel baseVar){return null;};
	/**
	Copies the height of the panel.
	*/
	@External
	public MetaVar CopyHeight(MetaVarPanel baseVar){return null;};
	/**
	Copies the position of the panel.
	*/
	@External
	public MetaVar CopyPos(MetaVarPanel baseVar){return null;};
	/**
	Copies the width of the panel.
	*/
	@External
	public MetaVar CopyWidth(MetaVarPanel baseVar){return null;};
	/**
	Returns the cursor position relative to the panels origin.
	*/
	@External
	public MetaVarNumber CursorPos(){return null;};
	/**
	Makes the panel "lock" the screen until it is removed.
	*/
	@External
	public MetaVar DoModal(MetaVarBoolean doModalVar){return null;};
	/**
	Sets the dock type of the panel.
	*/
	@External
	public MetaVar Dock(MetaVarNumber dockTypeVar){return null;};
	/**
	Sets the dock margin of the panel.
	*/
	@External
	public MetaVar DockMargin(MetaVarNumber marginLeftVar,MetaVarNumber marginTopVar,MetaVarNumber marginRightVar,MetaVarNumber marginBottomVar){return null;};
	/**
	Sets the dock padding of the panel.
	*/
	@External
	public MetaVar DockPadding(MetaVarNumber paddingLeftVar,MetaVarNumber paddingTopVar,MetaVarNumber paddingRightVar,MetaVarNumber paddingBottomVar){return null;};
	/**
	Finds a panel in its children(and sub children) with the given name.
	*/
	@External
	public MetaVarPanel Find(MetaVarString panelNameVar){return null;};
	/**
	Focuses the next panel in the focus queue.
	*/
	@External
	public MetaVar FocusNext(){return null;};
	/**
	Focuses the previous panel in the focus queue.
	*/
	@External
	public MetaVar FocusPrevious(){return null;};
	/**
	Returns the alpha multiplier for this panel.
	*/
	@External
	public MetaVarNumber GetAlpha(){return null;};
	/**
	Returns position and size of the panel.
	*/
	@External
	public MetaVarNumber GetBounds(){return null;};
	/**
	Gets a child by its index.
	*/
	@External
	public MetaVar GetChild(MetaVarNumber childIndexVar){return null;};
	/**
	Returns a table with all the child panels of the panel.
	*/
	@External
	public MetaVarTable GetChildren(){return null;};
	/**
	Returns the class name of the panel.
	*/
	@External
	public MetaVarString GetClassName(){return null;};
	/**
	Returns the internal name of the panel.
	*/
	@External
	public MetaVarString GetName(){return null;};
	/**
	Returns the parent of the panel, returns nil if there is no parent.
	*/
	@External
	public MetaVarPanel GetParent(){return null;};
	/**
	Returns the position of the panel relative to its parent.
	*/
	@External
	public MetaVarNumber GetPos(){return null;};
	/**
	Returns the size of the panel.
	*/
	@External
	public MetaVarNumber GetSize(){return null;};
	/**
	Returns the internal Lua table of the panel.
	*/
	@External
	public MetaVarTable GetTable(){return null;};
	/**
	Returns the height of the panel.
	*/
	@External
	public MetaVarNumber GetTall(){return null;};
	/**
	Returns the width of the panel.
	*/
	@External
	public MetaVarNumber GetWide(){return null;};
	/**
	Returns whenever the panel has child panels.
	*/
	@External
	public MetaVarBoolean HasChildren(){return null;};
	/**
	Returns if the panel is focused.
	*/
	@External
	public MetaVarBoolean HasParent(){return null;};
	/**
	Returns if the panel or any of its children(sub children and so on) has the focus.
	*/
	@External
	public MetaVarBoolean HasHierarchicalFocus(){return null;};
	/**
	Makes a panel invisible.
	*/
	@External
	public MetaVar Hide(){return null;};
	/**
	Causes the panel to re-layout in the next frame.
	*/
	@External
	public MetaVar InvalidateLayout(MetaVarBoolean layoutNowVar){return null;};
	/**
	Returns true if the mouse cursor is over this panel.
	*/
	@External
	public MetaVarBoolean IsHovered(){return null;};
	/**
	Returns true if the panel can receive keyboard input.
	*/
	@External
	public MetaVarBoolean IsKeyboardInputEnabled(){return null;};
	/**
	Returns if the panel is going to be deleted in the next frame.
	*/
	@External
	public MetaVarBoolean IsMarkedForDeletion(){return null;};
	/**
	Returns true if the panel can receive mouse input.
	*/
	@External
	public MetaVarBoolean IsMouseInputEnabled(){return null;};
	/**
	Returns if the panel is valid and not marked for deletion.
	*/
	@External
	public MetaVarBoolean IsValid(){return null;};
	/**
	Returns if the panel is visible.
	*/
	@External
	public MetaVarBoolean IsVisible(){return null;};
	/**
	Remove the focus from the panel.
	*/
	@External
	public MetaVar KillFocus(){return null;};
	/**
	Gets the absolute screen position of the position specified relative to the panel.
	*/
	@External
	public MetaVarNumber LocalToScreen(MetaVarNumber posXVar,MetaVarNumber posYVar){return null;};
	/**
	Focuses the panel and enables it to receive input.
	*/
	@External
	public MetaVar MakePopup(){return null;};
	/**
	Allows the panel to receive mouse input even if the mouse cursor is outside the bounds of the panel.
	*/
	@External
	public MetaVar MouseCapture(MetaVarBoolean doCaptureVar){return null;};
	/**
	Places the panel above the passed panel with the specified offset.
	*/
	@External
	public MetaVar MoveAbove(MetaVarPanel panelVar,MetaVarNumber offsetVar){return null;};
	/**
	Places the panel below the passed panel with the specified offset.
	*/
	@External
	public MetaVar MoveBelow(MetaVarPanel panelVar,MetaVarNumber offsetVar){return null;};
	/**
	Places the panel left to the passed panel with the specified offset.
	*/
	@External
	public MetaVar MoveLeftOf(MetaVarPanel panelVar,MetaVarNumber offsetVar){return null;};
	/**
	Places the panel right to the passed panel with the specified offset.
	*/
	@External
	public MetaVar MoveRightOf(MetaVarPanel panelVar,MetaVarNumber offsetVar){return null;};
	/**
	Sets whenever all child drawings should be clipped within the panels bounds.
	*/
	@External
	public MetaVar NoClipping(MetaVarBoolean clipVar){return null;};
	/**
	Paints a ghost copy of the panel at the given position with the given size.
	*/
	@External
	public MetaVar PaintAt(MetaVarNumber posXVar,MetaVarNumber posYVar,MetaVarNumber widthVar,MetaVarNumber heightVar){return null;};
	/**
	Paints the panel at its current position.
	*/
	@External
	public MetaVar PaintManual(){return null;};
	/**
	Parents the panel to the HUD.
	*/
	@External
	public MetaVar ParentToHUD(){return null;};
	/**
	Sends a command to the panel.
	*/
	@External
	public MetaVar PostMessage(MetaVarString messageNameVar){return null;};
	/**
	Marks a panel for deletion so it will be deleted the next frame.
	*/
	@External
	public MetaVar Remove(){return null;};
	/**
	Attempts to gain the input focus for the panel.
	*/
	@External
	public MetaVar RequestFocus(){return null;};
	/**
	Translates global screen coordinate to coordinates relative to the panel.
	*/
	@External
	public MetaVarNumber ScreenToLocal(MetaVarNumber screenXVar,MetaVarNumber screenYVar){return null;};
	/**
	Sets the alpha multiplier for the panel
	*/
	@External
	public MetaVar SetAlpha(MetaVarNumber alphaVar){return null;};
	/**
	Sets whenever the panel should be removed if the parent was removed.
	*/
	@External
	public MetaVar SetAutoDelete(MetaVarBoolean autoDeleteVar){return null;};
	/**
	Sets the background color of the panel.
	*/
	@External
	public MetaVar SetBGColor(MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){return null;};
	/**
	Sets the background color of the panel.
	*/
	@External
	public MetaVar SetBGColorEx(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){return null;};
	/**
	Sets the appearance of the cursor.
	*/
	@External
	public MetaVar SetCursor(MetaVarString cursorVar){return null;};
	/**
	Sets the foreground color of the panel.
	*/
	@External
	public MetaVar SetFGColor(MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){return null;};
	/**
	Sets the foreground color of the panel.
	*/
	@External
	public MetaVar SetFGColorEx(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){return null;};
	/**
	Sets the height of the panel.
	*/
	@External
	public MetaVar SetHeight(MetaVarNumber heightVar){return null;};
	/**
	Enables or disables the keyboard input for the panel.
	*/
	@External
	public MetaVar SetKeyBoardInputEnabled(MetaVarBoolean keyboardInputVar){return null;};
	/**
	Enables or disables the mouse input for the panel.
	*/
	@External
	public MetaVar SetMouseInputEnabled(MetaVarBoolean mouseInputVar){return null;};
	/**
	Sets whenever all the default background of the panel should be drawn or ot.
	*/
	@External
	public MetaVar SetPaintBackgroundEnabled(MetaVarBoolean paintBackgroundVar){return null;};
	/**
	Sets whenever all the default border of the panel should be drawn or ot.
	*/
	@External
	public MetaVar SetPaintBorderEnabled(MetaVarBoolean paintBorderVar){return null;};
	/**
	Sets if the panel was painted manually.
	*/
	@External
	public MetaVar SetPaintedManually(MetaVarBoolean paintedManuallyVar){return null;};
	/**
	Sets the parent of the panel.
	*/
	@External
	public MetaVar SetParent(MetaVarPanel parentVar){return null;};
	/**
	Sets the position of the panel.
	*/
	@External
	public MetaVar SetPos(MetaVarNumber posXVar,MetaVarNumber posYVar){return null;};
	/**
	Sets whenever the panel should be rendered in the next screenshot.
	*/
	@External
	public MetaVar SetRenderInScreenshots(MetaVarBoolean renderInScreenshotVar){return null;};
	/**
	Sets the size of the panel.
	*/
	@External
	public MetaVar SetSize(MetaVarNumber widthVar,MetaVarNumber heightVar){return null;};
	/**
	Sets the "visibility" of the panel.
	*/
	@External
	public MetaVar SetVisible(MetaVarBoolean visibleVar){return null;};
	/**
	Sets the width of the panel.
	*/
	@External
	public MetaVar SetWidth(MetaVarNumber widthVar){return null;};
	/**
	Sets the panels z position which determines the rendering order.
	*/
	@External
	public MetaVar SetZPos(MetaVarNumber zIndexVar){return null;};
	/**
	Resizes the panel to fit the bounds of its children.
	*/
	@External
	public MetaVar SizeToChildren(MetaVarBoolean sizeWVar,MetaVarBoolean sizeHVar){return null;};
	/**
	Sets the width of the panel.
	*/
	@External
	public MetaVar StretchToParent(MetaVarNumber offsetLeftVar,MetaVarNumber offsetTopVar,MetaVarNumber offsetRightVar,MetaVarNumber offsetBottomVar){return null;};
}
