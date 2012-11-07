package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarPanelImpl.class)
public interface MetaVarPanel extends MetaVar,IMetaVarAny{
	@SimpleName("x")
	public MetaVarNumber getX();
	@SimpleName("x")
	public void setX(MetaVarNumber value);
	@SimpleName("y")
	public MetaVarNumber getY();
	@SimpleName("y")
	public void setY(MetaVarNumber value);
	/**
	Adds the specified object to the panel.
	*/
	@External
	@ClientFunc
	public MetaVarPanel Add();
	/**
	Aligns the panel on the bottom of its parent with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar AlignBottom(MetaVarNumber offsetVar);
	/**
	Aligns the panel on the left of its parent with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar AlignLeft(MetaVarNumber offsetVar);
	/**
	Aligns the panel on the right of its parent with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar AlignRight(MetaVarNumber offsetVar);
	/**
	Aligns the panel on the top of its parent with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar AlignTop(MetaVarNumber offsetVar);
	/**
	Centers the panel on its parent.
	*/
	@External
	@ClientFunc
	public MetaVar Center();
	/**
	Centers the panel horizontally with specified fraction.
	*/
	@External
	@ClientFunc
	public MetaVar CenterHorizontal(MetaVarNumber fractionVar);
	/**
	Centers the panel vertically with specified fraction.
	*/
	@External
	@ClientFunc
	public MetaVar CenterVertical(MetaVarNumber fractionVar);
	/**
	Returns the amount of children of the of panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ChildCount();
	/**
	Marks all of the panel's children for deletion.
	*/
	@External
	@ClientFunc
	public MetaVar Clear();
	/**
	Copies position and size of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar CopyBounds(MetaVarPanel baseVar);
	/**
	Copies the height of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar CopyHeight(MetaVarPanel baseVar);
	/**
	Copies the position of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar CopyPos(MetaVarPanel baseVar);
	/**
	Copies the width of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar CopyWidth(MetaVarPanel baseVar);
	/**
	Returns the cursor position relative to the panels origin.
	*/
	@External
	@ClientFunc
	public MetaVarNumber CursorPos();
	/**
	Makes the panel "lock" the screen until it is removed.
	*/
	@External
	@ClientFunc
	public MetaVar DoModal(MetaVarBoolean doModalVar);
	/**
	Sets the dock type of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar Dock(MetaVarNumber dockTypeVar);
	/**
	Sets the dock margin of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar DockMargin(MetaVarNumber marginLeftVar,MetaVarNumber marginTopVar,MetaVarNumber marginRightVar,MetaVarNumber marginBottomVar);
	/**
	Sets the dock padding of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar DockPadding(MetaVarNumber paddingLeftVar,MetaVarNumber paddingTopVar,MetaVarNumber paddingRightVar,MetaVarNumber paddingBottomVar);
	/**
	Finds a panel in its children(and sub children) with the given name.
	*/
	@External
	@ClientFunc
	public MetaVarPanel Find(MetaVarString panelNameVar);
	/**
	Focuses the next panel in the focus queue.
	*/
	@External
	@ClientFunc
	public MetaVar FocusNext();
	/**
	Focuses the previous panel in the focus queue.
	*/
	@External
	@ClientFunc
	public MetaVar FocusPrevious();
	/**
	Returns the alpha multiplier for this panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetAlpha();
	/**
	Returns position and size of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetBounds();
	/**
	Gets a child by its index.
	*/
	@External
	@ClientFunc
	public MetaVar GetChild(MetaVarNumber childIndexVar);
	/**
	Returns a table with all the child panels of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarTable GetChildren();
	/**
	Returns the class name of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarString GetClassName();
	/**
	Returns the internal name of the panel.
	*/
	//public MetaVarString GetName();
	/**
	Returns the parent of the panel, returns nil if there is no parent.
	*/
	@External
	@ClientFunc
	public MetaVarPanel GetParent();
	/**
	Returns the position of the panel relative to its parent.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetPos();
	/**
	Returns the size of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetSize();
	/**
	Returns the internal Lua table of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarTable GetTable();
	/**
	Returns the height of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetTall();
	/**
	Returns the width of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetWide();
	/**
	Returns whenever the panel has child panels.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean HasChildren();
	/**
	Returns if the panel is focused.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean HasParent();
	/**
	Returns if the panel or any of its children(sub children and so on) has the focus.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean HasHierarchicalFocus();
	/**
	Makes a panel invisible.
	*/
	@External
	@ClientFunc
	public MetaVar Hide();
	/**
	Causes the panel to re-layout in the next frame.
	*/
	@External
	@ClientFunc
	public MetaVar InvalidateLayout(MetaVarBoolean layoutNowVar);
	/**
	Returns true if the mouse cursor is over this panel.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsHovered();
	/**
	Returns true if the panel can receive keyboard input.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsKeyboardInputEnabled();
	/**
	Returns if the panel is going to be deleted in the next frame.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsMarkedForDeletion();
	/**
	Returns true if the panel can receive mouse input.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsMouseInputEnabled();
	/**
	Returns if the panel is valid and not marked for deletion.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsValid();
	/**
	Returns if the panel is visible.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsVisible();
	/**
	Remove the focus from the panel.
	*/
	@External
	@ClientFunc
	public MetaVar KillFocus();
	/**
	Gets the absolute screen position of the position specified relative to the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber LocalToScreen(MetaVarNumber posXVar,MetaVarNumber posYVar);
	/**
	Focuses the panel and enables it to receive input.
	*/
	@External
	@ClientFunc
	public MetaVar MakePopup();
	/**
	Allows the panel to receive mouse input even if the mouse cursor is outside the bounds of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar MouseCapture(MetaVarBoolean doCaptureVar);
	/**
	Places the panel above the passed panel with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar MoveAbove(MetaVarPanel panelVar,MetaVarNumber offsetVar);
	/**
	Places the panel below the passed panel with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar MoveBelow(MetaVarPanel panelVar,MetaVarNumber offsetVar);
	/**
	Places the panel left to the passed panel with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar MoveLeftOf(MetaVarPanel panelVar,MetaVarNumber offsetVar);
	/**
	Places the panel right to the passed panel with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar MoveRightOf(MetaVarPanel panelVar,MetaVarNumber offsetVar);
	/**
	Sets whenever all child drawings should be clipped within the panels bounds.
	*/
	@External
	@ClientFunc
	public MetaVar NoClipping(MetaVarBoolean clipVar);
	/**
	Paints a ghost copy of the panel at the given position with the given size.
	*/
	@External
	@ClientFunc
	public MetaVar PaintAt(MetaVarNumber posXVar,MetaVarNumber posYVar,MetaVarNumber widthVar,MetaVarNumber heightVar);
	/**
	Paints the panel at its current position.
	*/
	@External
	@ClientFunc
	public MetaVar PaintManual();
	/**
	Parents the panel to the HUD.
	*/
	@External
	@ClientFunc
	public MetaVar ParentToHUD();
	/**
	Sends a command to the panel.
	*/
	@External
	@ClientFunc
	public MetaVar PostMessage(MetaVarString messageNameVar);
	/**
	Marks a panel for deletion so it will be deleted the next frame.
	*/
	//public MetaVar Remove();
	/**
	Attempts to gain the input focus for the panel.
	*/
	@External
	@ClientFunc
	public MetaVar RequestFocus();
	/**
	Translates global screen coordinate to coordinates relative to the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ScreenToLocal(MetaVarNumber screenXVar,MetaVarNumber screenYVar);
	/**
	Sets the alpha multiplier for the panel
	*/
	@External
	@ClientFunc
	public MetaVar SetAlpha(MetaVarNumber alphaVar);
	/**
	Sets whenever the panel should be removed if the parent was removed.
	*/
	@External
	@ClientFunc
	public MetaVar SetAutoDelete(MetaVarBoolean autoDeleteVar);
	/**
	Sets the background color of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetBGColor(MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar);
	/**
	Sets the background color of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetBGColorEx(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar);
	/**
	Sets the appearance of the cursor.
	*/
	@External
	@ClientFunc
	public MetaVar SetCursor(MetaVarString cursorVar);
	/**
	Sets the foreground color of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetFGColor(MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar);
	/**
	Sets the foreground color of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetFGColorEx(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar);
	/**
	Sets the height of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetHeight(MetaVarNumber heightVar);
	/**
	Enables or disables the keyboard input for the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetKeyBoardInputEnabled(MetaVarBoolean keyboardInputVar);
	/**
	Enables or disables the mouse input for the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetMouseInputEnabled(MetaVarBoolean mouseInputVar);
	/**
	Sets whenever all the default background of the panel should be drawn or ot.
	*/
	@External
	@ClientFunc
	public MetaVar SetPaintBackgroundEnabled(MetaVarBoolean paintBackgroundVar);
	/**
	Sets whenever all the default border of the panel should be drawn or ot.
	*/
	@External
	@ClientFunc
	public MetaVar SetPaintBorderEnabled(MetaVarBoolean paintBorderVar);
	/**
	Sets if the panel was painted manually.
	*/
	@External
	@ClientFunc
	public MetaVar SetPaintedManually(MetaVarBoolean paintedManuallyVar);
	/**
	Sets the parent of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetParent(MetaVarPanel parentVar);
	/**
	Sets the position of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetPos(MetaVarNumber posXVar,MetaVarNumber posYVar);
	/**
	Sets whenever the panel should be rendered in the next screenshot.
	*/
	@External
	@ClientFunc
	public MetaVar SetRenderInScreenshots(MetaVarBoolean renderInScreenshotVar);
	/**
	Sets the size of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetSize(MetaVarNumber widthVar,MetaVarNumber heightVar);
	/**
	Sets the "visibility" of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetVisible(MetaVarBoolean visibleVar);
	/**
	Sets the width of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetWidth(MetaVarNumber widthVar);
	/**
	Sets the panels z position which determines the rendering order.
	*/
	@External
	@ClientFunc
	public MetaVar SetZPos(MetaVarNumber zIndexVar);
	/**
	Resizes the panel to fit the bounds of its children.
	*/
	@External
	@ClientFunc
	public MetaVar SizeToChildren(MetaVarBoolean sizeWVar,MetaVarBoolean sizeHVar);
	/**
	Sets the width of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar StretchToParent(MetaVarNumber offsetLeftVar,MetaVarNumber offsetTopVar,MetaVarNumber offsetRightVar,MetaVarNumber offsetBottomVar);
}
