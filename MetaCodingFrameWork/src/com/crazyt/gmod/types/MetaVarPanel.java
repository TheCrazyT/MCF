package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("Panel")
public class MetaVarPanel extends MetaVarImpl implements IMetaVarAny{
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
	public MetaVarPanel(String n) {
		super(n);
	}
	/**
	Adds the specified object to the panel.
	*/
	@External
	@ClientFunc
	public MetaVarPanel Add(){return null;};
	/**
	Aligns the panel on the bottom of its parent with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar AlignBottom(MetaVarNumber offsetVar){return null;};
	/**
	Aligns the panel on the left of its parent with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar AlignLeft(MetaVarNumber offsetVar){return null;};
	/**
	Aligns the panel on the right of its parent with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar AlignRight(MetaVarNumber offsetVar){return null;};
	/**
	Aligns the panel on the top of its parent with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar AlignTop(MetaVarNumber offsetVar){return null;};
	/**
	Centers the panel on its parent.
	*/
	@External
	@ClientFunc
	public MetaVar Center(){return null;};
	/**
	Centers the panel horizontally with specified fraction.
	*/
	@External
	@ClientFunc
	public MetaVar CenterHorizontal(MetaVarNumber fractionVar){return null;};
	/**
	Centers the panel vertically with specified fraction.
	*/
	@External
	@ClientFunc
	public MetaVar CenterVertical(MetaVarNumber fractionVar){return null;};
	/**
	Returns the amount of children of the of panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ChildCount(){return null;};
	/**
	Marks all of the panel's children for deletion.
	*/
	@External
	@ClientFunc
	public MetaVar Clear(){return null;};
	/**
	Copies position and size of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar CopyBounds(MetaVarPanel baseVar){return null;};
	/**
	Copies the height of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar CopyHeight(MetaVarPanel baseVar){return null;};
	/**
	Copies the position of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar CopyPos(MetaVarPanel baseVar){return null;};
	/**
	Copies the width of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar CopyWidth(MetaVarPanel baseVar){return null;};
	/**
	Returns the cursor position relative to the panels origin.
	*/
	@External
	@ClientFunc
	public MetaVarNumber CursorPos(){return null;};
	/**
	Makes the panel "lock" the screen until it is removed.
	*/
	@External
	@ClientFunc
	public MetaVar DoModal(MetaVarBoolean doModalVar){return null;};
	/**
	Sets the dock type of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar Dock(MetaVarNumber dockTypeVar){return null;};
	/**
	Sets the dock margin of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar DockMargin(MetaVarNumber marginLeftVar,MetaVarNumber marginTopVar,MetaVarNumber marginRightVar,MetaVarNumber marginBottomVar){return null;};
	/**
	Sets the dock padding of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar DockPadding(MetaVarNumber paddingLeftVar,MetaVarNumber paddingTopVar,MetaVarNumber paddingRightVar,MetaVarNumber paddingBottomVar){return null;};
	/**
	Finds a panel in its children(and sub children) with the given name.
	*/
	@External
	@ClientFunc
	public MetaVarPanel Find(MetaVarString panelNameVar){return null;};
	/**
	Focuses the next panel in the focus queue.
	*/
	@External
	@ClientFunc
	public MetaVar FocusNext(){return null;};
	/**
	Focuses the previous panel in the focus queue.
	*/
	@External
	@ClientFunc
	public MetaVar FocusPrevious(){return null;};
	/**
	Returns the alpha multiplier for this panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetAlpha(){return null;};
	/**
	Returns position and size of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetBounds(){return null;};
	/**
	Gets a child by its index.
	*/
	@External
	@ClientFunc
	public MetaVar GetChild(MetaVarNumber childIndexVar){return null;};
	/**
	Returns a table with all the child panels of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarTable GetChildren(){return null;};
	/**
	Returns the class name of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarString GetClassName(){return null;};
	/**
	Returns the internal name of the panel.
	*/
	//public MetaVarString GetName(){return null;};
	/**
	Returns the parent of the panel, returns nil if there is no parent.
	*/
	@External
	@ClientFunc
	public MetaVarPanel GetParent(){return null;};
	/**
	Returns the position of the panel relative to its parent.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetPos(){return null;};
	/**
	Returns the size of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetSize(){return null;};
	/**
	Returns the internal Lua table of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarTable GetTable(){return null;};
	/**
	Returns the height of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetTall(){return null;};
	/**
	Returns the width of the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetWide(){return null;};
	/**
	Returns whenever the panel has child panels.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean HasChildren(){return null;};
	/**
	Returns if the panel is focused.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean HasParent(){return null;};
	/**
	Returns if the panel or any of its children(sub children and so on) has the focus.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean HasHierarchicalFocus(){return null;};
	/**
	Makes a panel invisible.
	*/
	@External
	@ClientFunc
	public MetaVar Hide(){return null;};
	/**
	Causes the panel to re-layout in the next frame.
	*/
	@External
	@ClientFunc
	public MetaVar InvalidateLayout(MetaVarBoolean layoutNowVar){return null;};
	/**
	Returns true if the mouse cursor is over this panel.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsHovered(){return null;};
	/**
	Returns true if the panel can receive keyboard input.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsKeyboardInputEnabled(){return null;};
	/**
	Returns if the panel is going to be deleted in the next frame.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsMarkedForDeletion(){return null;};
	/**
	Returns true if the panel can receive mouse input.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsMouseInputEnabled(){return null;};
	/**
	Returns if the panel is valid and not marked for deletion.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsValid(){return null;};
	/**
	Returns if the panel is visible.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsVisible(){return null;};
	/**
	Remove the focus from the panel.
	*/
	@External
	@ClientFunc
	public MetaVar KillFocus(){return null;};
	/**
	Gets the absolute screen position of the position specified relative to the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber LocalToScreen(MetaVarNumber posXVar,MetaVarNumber posYVar){return null;};
	/**
	Focuses the panel and enables it to receive input.
	*/
	@External
	@ClientFunc
	public MetaVar MakePopup(){return null;};
	/**
	Allows the panel to receive mouse input even if the mouse cursor is outside the bounds of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar MouseCapture(MetaVarBoolean doCaptureVar){return null;};
	/**
	Places the panel above the passed panel with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar MoveAbove(MetaVarPanel panelVar,MetaVarNumber offsetVar){return null;};
	/**
	Places the panel below the passed panel with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar MoveBelow(MetaVarPanel panelVar,MetaVarNumber offsetVar){return null;};
	/**
	Places the panel left to the passed panel with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar MoveLeftOf(MetaVarPanel panelVar,MetaVarNumber offsetVar){return null;};
	/**
	Places the panel right to the passed panel with the specified offset.
	*/
	@External
	@ClientFunc
	public MetaVar MoveRightOf(MetaVarPanel panelVar,MetaVarNumber offsetVar){return null;};
	/**
	Sets whenever all child drawings should be clipped within the panels bounds.
	*/
	@External
	@ClientFunc
	public MetaVar NoClipping(MetaVarBoolean clipVar){return null;};
	/**
	Paints a ghost copy of the panel at the given position with the given size.
	*/
	@External
	@ClientFunc
	public MetaVar PaintAt(MetaVarNumber posXVar,MetaVarNumber posYVar,MetaVarNumber widthVar,MetaVarNumber heightVar){return null;};
	/**
	Paints the panel at its current position.
	*/
	@External
	@ClientFunc
	public MetaVar PaintManual(){return null;};
	/**
	Parents the panel to the HUD.
	*/
	@External
	@ClientFunc
	public MetaVar ParentToHUD(){return null;};
	/**
	Sends a command to the panel.
	*/
	@External
	@ClientFunc
	public MetaVar PostMessage(MetaVarString messageNameVar){return null;};
	/**
	Marks a panel for deletion so it will be deleted the next frame.
	*/
	//public MetaVar Remove(){return null;};
	/**
	Attempts to gain the input focus for the panel.
	*/
	@External
	@ClientFunc
	public MetaVar RequestFocus(){return null;};
	/**
	Translates global screen coordinate to coordinates relative to the panel.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ScreenToLocal(MetaVarNumber screenXVar,MetaVarNumber screenYVar){return null;};
	/**
	Sets the alpha multiplier for the panel
	*/
	@External
	@ClientFunc
	public MetaVar SetAlpha(MetaVarNumber alphaVar){return null;};
	/**
	Sets whenever the panel should be removed if the parent was removed.
	*/
	@External
	@ClientFunc
	public MetaVar SetAutoDelete(MetaVarBoolean autoDeleteVar){return null;};
	/**
	Sets the background color of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetBGColor(MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){return null;};
	/**
	Sets the background color of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetBGColorEx(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){return null;};
	/**
	Sets the appearance of the cursor.
	*/
	@External
	@ClientFunc
	public MetaVar SetCursor(MetaVarString cursorVar){return null;};
	/**
	Sets the foreground color of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetFGColor(MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){return null;};
	/**
	Sets the foreground color of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetFGColorEx(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){return null;};
	/**
	Sets the height of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetHeight(MetaVarNumber heightVar){return null;};
	/**
	Enables or disables the keyboard input for the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetKeyBoardInputEnabled(MetaVarBoolean keyboardInputVar){return null;};
	/**
	Enables or disables the mouse input for the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetMouseInputEnabled(MetaVarBoolean mouseInputVar){return null;};
	/**
	Sets whenever all the default background of the panel should be drawn or ot.
	*/
	@External
	@ClientFunc
	public MetaVar SetPaintBackgroundEnabled(MetaVarBoolean paintBackgroundVar){return null;};
	/**
	Sets whenever all the default border of the panel should be drawn or ot.
	*/
	@External
	@ClientFunc
	public MetaVar SetPaintBorderEnabled(MetaVarBoolean paintBorderVar){return null;};
	/**
	Sets if the panel was painted manually.
	*/
	@External
	@ClientFunc
	public MetaVar SetPaintedManually(MetaVarBoolean paintedManuallyVar){return null;};
	/**
	Sets the parent of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetParent(MetaVarPanel parentVar){return null;};
	/**
	Sets the position of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetPos(MetaVarNumber posXVar,MetaVarNumber posYVar){return null;};
	/**
	Sets whenever the panel should be rendered in the next screenshot.
	*/
	@External
	@ClientFunc
	public MetaVar SetRenderInScreenshots(MetaVarBoolean renderInScreenshotVar){return null;};
	/**
	Sets the size of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetSize(MetaVarNumber widthVar,MetaVarNumber heightVar){return null;};
	/**
	Sets the "visibility" of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetVisible(MetaVarBoolean visibleVar){return null;};
	/**
	Sets the width of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar SetWidth(MetaVarNumber widthVar){return null;};
	/**
	Sets the panels z position which determines the rendering order.
	*/
	@External
	@ClientFunc
	public MetaVar SetZPos(MetaVarNumber zIndexVar){return null;};
	/**
	Resizes the panel to fit the bounds of its children.
	*/
	@External
	@ClientFunc
	public MetaVar SizeToChildren(MetaVarBoolean sizeWVar,MetaVarBoolean sizeHVar){return null;};
	/**
	Sets the width of the panel.
	*/
	@External
	@ClientFunc
	public MetaVar StretchToParent(MetaVarNumber offsetLeftVar,MetaVarNumber offsetTopVar,MetaVarNumber offsetRightVar,MetaVarNumber offsetBottomVar){return null;};
}
