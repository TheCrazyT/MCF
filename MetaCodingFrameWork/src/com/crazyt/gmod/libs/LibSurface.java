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
@Library("surface")
public class LibSurface extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibSurface(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Creates a new font.
	*/
	@External
	@ClientFunc
	public MetaVar CreateFont(MetaVarString fontNameVar,MetaVarFontData fontDataVar){return null;};
	/**
	Draws a hollow circle, made of dots.
	*/
	@External
	@ClientFunc
	public MetaVar DrawCircle(MetaVarNumber originXVar,MetaVarNumber originYVar,MetaVarNumber radiusVar,MetaVarColor colorVar){return null;};
	/**
	Draws a line from one point to another.
	*/
	@External
	@ClientFunc
	public MetaVar DrawLine(MetaVarNumber startXVar,MetaVarNumber startYVar,MetaVarNumber endXVar,MetaVarNumber endYVar){return null;};
	/**
	Draws a hollow box with a border width of 1 px.
	*/
	@External
	@ClientFunc
	public MetaVar DrawOutlinedRect(MetaVarNumber xVar,MetaVarNumber yVar,MetaVarNumber wVar,MetaVarNumber hVar){return null;};
	/**
	Draws a polygon with a maximum of 256 vertices.
	*/
	@External
	@ClientFunc
	public MetaVar DrawPoly(MetaVarTable vertexesVar){return null;};
	/**
	Draws a solid rectangle on the screen.
	*/
	@External
	@ClientFunc
	public MetaVar DrawRect(MetaVarNumber xVar,MetaVarNumber yVar,MetaVarNumber widthVar,MetaVarNumber heightVar){return null;};
	/**
	Draw the specified text on the screen, using the previously set position.
	*/
	@External
	@ClientFunc
	public MetaVar DrawText(MetaVarString textVar){return null;};
	/**
	Draw a textured rectangle with the given position and dimensions on the screen, using the current active texture.
	*/
	@External
	@ClientFunc
	public MetaVar DrawTexturedRect(MetaVarNumber xVar,MetaVarNumber yVar,MetaVarNumber widthVar,MetaVarNumber heightVar){return null;};
	/**
	Draw a textured rotated rectangle with the given position and dimensions and angle on the screen, using the current active texture.
	*/
	@External
	@ClientFunc
	public MetaVar DrawTexturedRectRotated(MetaVarNumber xVar,MetaVarNumber yVar,MetaVarNumber widthVar,MetaVarNumber heightVar,MetaVarNumber rotationVar){return null;};
	/**
	Draws a textured rectangle with a repeated or partial texture.
	*/
	//public MetaVar DrawTexturedRectUV(MetaVarNumber xVar,MetaVarNumber yVar,MetaVarNumber widthVar,MetaVarNumber heightVar,MetaVarNumber startUVar,MetaVarNumber startVVar,MetaVarNumber endUVar,MetaVarNumber endUVar){return null;};
	/**
	Gets the HUD texture with the specified name.
	*/
	@External
	@ClientFunc
	public MetaVarITexture GetHUDTexture(MetaVarString nameVar){return null;};
	/**
	Returns the width and height (in pixels) of the given text, but only if the font has been set with <a href="http://wiki.garrysmod.com/page/Libraries/surface/SetFont" title="Libraries/surface/SetFont">surface/SetFont</a>.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetTextSize(MetaVarString textVar){return null;};
	/**
	Returns the texture id of the texture with the given name/path.
	*/
	//public MetaVarNumber GetTextureID(MetaVarString name/pathVar){return null;};
	/**
	Returns the size of the texture with the associated texture id.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetTextureSize(MetaVarNumber textureIDVar){return null;};
	/**
	Play a sound file directly on the client (such as UI sounds, etc).
	*/
	@External
	@ClientFunc
	public MetaVar PlaySound(MetaVarString soundfileVar){return null;};
	/**
	Returns the height of the current client's screen.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ScreenHeight(){return null;};
	/**
	Returns the width of the current client's screen.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ScreenWidth(){return null;};
	/**
	Sets a multiplier that will influence all upcoming drawing operations.
	*/
	@External
	@ClientFunc
	public MetaVar SetAlphaMultiplier(MetaVarNumber multiplierVar){return null;};
	/**
	Set the colour of any future shapes to be drawn, can be set by either using r, g, b, a as seperate values or by a <a href="http://wiki.garrysmod.com/page/Classes/Color" title="Classes/Color" class="mw-redirect">Color</a> object, using a color object is not recommended to be created prodecural.
	*/
	@External
	@ClientFunc
	public MetaVar SetDrawColor(MetaVarColor gVar,MetaVarColor bVar,MetaVarColor aVar){return null;};
	/**
	Set the current font to be used for text operations later.
	*/
	@External
	@ClientFunc
	public MetaVar SetFont(MetaVarString fontNameVar){return null;};
	/**
	Sets the material to be used in all upcoming surface draw operations.
	*/
	@External
	@ClientFunc
	public MetaVar SetMaterial(MetaVarIMaterial materialVar){return null;};
	/**
	Set the colour of any future text to be drawn, can be set by either using r, g, b, a as seperate values or by a <a href="http://wiki.garrysmod.com/page/Classes/Color" title="Classes/Color" class="mw-redirect">Color</a> object, using a color object is not recommended to be created prodecural.
	*/
	@External
	@ClientFunc
	public MetaVar SetTextColor(MetaVarColor gVar,MetaVarColor bVar,MetaVarColor aVar){return null;};
	/**
	Set the position to draw any future text.
	*/
	@External
	@ClientFunc
	public MetaVar SetTextPos(MetaVarNumber xVar,MetaVarNumber yVar){return null;};
	/**
	Sets the texture to be used in all upcoming surface draw operations.
	*/
	@External
	@ClientFunc
	public MetaVar SetTexture(MetaVarNumber textureIDVar){return null;};
}
