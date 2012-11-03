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
	@External
	public MetaVarPanel Add(){return null;};
	@External
	public MetaVar AlignBottom(MetaVarNumber offsetVar){return null;};
	@External
	public MetaVar AlignLeft(MetaVarNumber offsetVar){return null;};
	@External
	public MetaVar AlignRight(MetaVarNumber offsetVar){return null;};
	@External
	public MetaVar AlignTop(MetaVarNumber offsetVar){return null;};
	@External
	public MetaVar Center(){return null;};
	@External
	public MetaVar CenterHorizontal(MetaVarNumber fractionVar){return null;};
	@External
	public MetaVar CenterVertical(MetaVarNumber fractionVar){return null;};
	@External
	public MetaVarNumber ChildCount(){return null;};
	@External
	public MetaVar Clear(){return null;};
	@External
	public MetaVar CopyBounds(MetaVarPanel baseVar){return null;};
	@External
	public MetaVar CopyHeight(MetaVarPanel baseVar){return null;};
	@External
	public MetaVar CopyPos(MetaVarPanel baseVar){return null;};
	@External
	public MetaVar CopyWidth(MetaVarPanel baseVar){return null;};
	@External
	public MetaVarNumber CursorPos(){return null;};
	@External
	public MetaVar DoModal(MetaVarBoolean doModalVar){return null;};
	@External
	public MetaVar Dock(MetaVarNumber dockTypeVar){return null;};
	@External
	public MetaVar DockMargin(MetaVarNumber marginLeftVar,MetaVarNumber marginTopVar,MetaVarNumber marginRightVar,MetaVarNumber marginBottomVar){return null;};
	@External
	public MetaVar DockPadding(MetaVarNumber paddingLeftVar,MetaVarNumber paddingTopVar,MetaVarNumber paddingRightVar,MetaVarNumber paddingBottomVar){return null;};
	@External
	public MetaVarPanel Find(MetaVarString panelNameVar){return null;};
	@External
	public MetaVar FocusNext(){return null;};
	@External
	public MetaVar FocusPrevious(){return null;};
	@External
	public MetaVarNumber GetAlpha(){return null;};
	@External
	public MetaVarNumber GetBounds(){return null;};
	@External
	public MetaVar GetChild(MetaVarNumber childIndexVar){return null;};
	@External
	public MetaVarTable GetChildren(){return null;};
	@External
	public MetaVarString GetClassName(){return null;};
	@External
	public MetaVarString GetName(){return null;};
	@External
	public MetaVarPanel GetParent(){return null;};
	@External
	public MetaVarNumber GetPos(){return null;};
	@External
	public MetaVarNumber GetSize(){return null;};
	@External
	public MetaVarTable GetTable(){return null;};
	@External
	public MetaVarNumber GetTall(){return null;};
	@External
	public MetaVarNumber GetWide(){return null;};
	@External
	public MetaVarBoolean HasChildren(){return null;};
	@External
	public MetaVarBoolean HasParent(){return null;};
	@External
	public MetaVarBoolean HasHierarchicalFocus(){return null;};
	@External
	public MetaVar Hide(){return null;};
	@External
	public MetaVar InvalidateLayout(MetaVarBoolean layoutNowVar){return null;};
	@External
	public MetaVarBoolean IsHovered(){return null;};
	@External
	public MetaVarBoolean IsKeyboardInputEnabled(){return null;};
	@External
	public MetaVarBoolean IsMarkedForDeletion(){return null;};
	@External
	public MetaVarBoolean IsMouseInputEnabled(){return null;};
	@External
	public MetaVarBoolean IsValid(){return null;};
	@External
	public MetaVarBoolean IsVisible(){return null;};
	@External
	public MetaVar KillFocus(){return null;};
	@External
	public MetaVarNumber LocalToScreen(MetaVarNumber posXVar,MetaVarNumber posYVar){return null;};
	@External
	public MetaVar MakePopup(){return null;};
	@External
	public MetaVar MouseCapture(MetaVarBoolean doCaptureVar){return null;};
	@External
	public MetaVar MoveAbove(MetaVarPanel panelVar,MetaVarNumber offsetVar){return null;};
	@External
	public MetaVar MoveBelow(MetaVarPanel panelVar,MetaVarNumber offsetVar){return null;};
	@External
	public MetaVar MoveLeftOf(MetaVarPanel panelVar,MetaVarNumber offsetVar){return null;};
	@External
	public MetaVar MoveRightOf(MetaVarPanel panelVar,MetaVarNumber offsetVar){return null;};
	@External
	public MetaVar NoClipping(MetaVarBoolean clipVar){return null;};
	@External
	public MetaVar PaintAt(MetaVarNumber posXVar,MetaVarNumber posYVar,MetaVarNumber widthVar,MetaVarNumber heightVar){return null;};
	@External
	public MetaVar PaintManual(){return null;};
	@External
	public MetaVar ParentToHUD(){return null;};
	@External
	public MetaVar PostMessage(MetaVarString messageNameVar){return null;};
	@External
	public MetaVar Remove(){return null;};
	@External
	public MetaVar RequestFocus(){return null;};
	@External
	public MetaVarNumber ScreenToLocal(MetaVarNumber screenXVar,MetaVarNumber screenYVar){return null;};
	@External
	public MetaVar SetAlpha(MetaVarNumber alphaVar){return null;};
	@External
	public MetaVar SetAutoDelete(MetaVarBoolean autoDeleteVar){return null;};
	@External
	public MetaVar SetBGColor(MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){return null;};
	@External
	public MetaVar SetBGColorEx(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){return null;};
	@External
	public MetaVar SetCursor(MetaVarString cursorVar){return null;};
	@External
	public MetaVar SetFGColor(MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){return null;};
	@External
	public MetaVar SetFGColorEx(MetaVarNumber rVar,MetaVarNumber gVar,MetaVarNumber bVar,MetaVarNumber aVar){return null;};
	@External
	public MetaVar SetHeight(MetaVarNumber heightVar){return null;};
	@External
	public MetaVar SetKeyBoardInputEnabled(MetaVarBoolean keyboardInputVar){return null;};
	@External
	public MetaVar SetMouseInputEnabled(MetaVarBoolean mouseInputVar){return null;};
	@External
	public MetaVar SetPaintBackgroundEnabled(MetaVarBoolean paintBackgroundVar){return null;};
	@External
	public MetaVar SetPaintBorderEnabled(MetaVarBoolean paintBorderVar){return null;};
	@External
	public MetaVar SetPaintedManually(MetaVarBoolean paintedManuallyVar){return null;};
	@External
	public MetaVar SetParent(MetaVarPanel parentVar){return null;};
	@External
	public MetaVar SetPos(MetaVarNumber posXVar,MetaVarNumber posYVar){return null;};
	@External
	public MetaVar SetRenderInScreenshots(MetaVarBoolean renderInScreenshotVar){return null;};
	@External
	public MetaVar SetSize(MetaVarNumber widthVar,MetaVarNumber heightVar){return null;};
	@External
	public MetaVar SetVisible(MetaVarBoolean visibleVar){return null;};
	@External
	public MetaVar SetWidth(MetaVarNumber widthVar){return null;};
	@External
	public MetaVar SetZPos(MetaVarNumber zIndexVar){return null;};
	@External
	public MetaVar SizeToChildren(MetaVarBoolean sizeWVar,MetaVarBoolean sizeHVar){return null;};
	@External
	public MetaVar StretchToParent(MetaVarNumber offsetLeftVar,MetaVarNumber offsetTopVar,MetaVarNumber offsetRightVar,MetaVarNumber offsetBottomVar){return null;};
}
