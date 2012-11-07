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
@Library("surface")
public class LibSurface{
	/**
	Creates a new font.
	*/
	@External
	@ClientFunc
	public MetaVar CreateFont(MetaVarString fontNameVar,MetaVarFontData fontDataVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws a hollow circle, made of dots.
	*/
	@External
	@ClientFunc
	public MetaVar DrawCircle(MetaVarNumber originXVar,MetaVarNumber originYVar,MetaVarNumber radiusVar,MetaVarColor colorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws a line from one point to another.
	*/
	@External
	@ClientFunc
	public MetaVar DrawLine(MetaVarNumber startXVar,MetaVarNumber startYVar,MetaVarNumber endXVar,MetaVarNumber endYVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws a hollow box with a border width of 1 px.
	*/
	@External
	@ClientFunc
	public MetaVar DrawOutlinedRect(MetaVarNumber xVar,MetaVarNumber yVar,MetaVarNumber wVar,MetaVarNumber hVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws a polygon with a maximum of 256 vertices.
	*/
	@External
	@ClientFunc
	public MetaVar DrawPoly(MetaVarTable vertexesVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws a solid rectangle on the screen.
	*/
	@External
	@ClientFunc
	public MetaVar DrawRect(MetaVarNumber xVar,MetaVarNumber yVar,MetaVarNumber widthVar,MetaVarNumber heightVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draw the specified text on the screen, using the previously set position.
	*/
	@External
	@ClientFunc
	public MetaVar DrawText(MetaVarString textVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draw a textured rectangle with the given position and dimensions on the screen, using the current active texture.
	*/
	@External
	@ClientFunc
	public MetaVar DrawTexturedRect(MetaVarNumber xVar,MetaVarNumber yVar,MetaVarNumber widthVar,MetaVarNumber heightVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draw a textured rotated rectangle with the given position and dimensions and angle on the screen, using the current active texture.
	*/
	@External
	@ClientFunc
	public MetaVar DrawTexturedRectRotated(MetaVarNumber xVar,MetaVarNumber yVar,MetaVarNumber widthVar,MetaVarNumber heightVar,MetaVarNumber rotationVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Draws a textured rectangle with a repeated or partial texture.
	*/
	//public MetaVar DrawTexturedRectUV(MetaVarNumber xVar,MetaVarNumber yVar,MetaVarNumber widthVar,MetaVarNumber heightVar,MetaVarNumber startUVar,MetaVarNumber startVVar,MetaVarNumber endUVar,MetaVarNumber endUVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the HUD texture with the specified name.
	*/
	@External
	@ClientFunc
	public MetaVarITexture GetHUDTexture(MetaVarString nameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the width and height (in pixels) of the given text, but only if the font has been set with <a href="http://wiki.garrysmod.com/page/Libraries/surface/SetFont" title="Libraries/surface/SetFont">surface/SetFont</a>.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetTextSize(MetaVarString textVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the texture id of the texture with the given name/path.
	*/
	//public MetaVarNumber GetTextureID(MetaVarString name/pathVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the size of the texture with the associated texture id.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetTextureSize(MetaVarNumber textureIDVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Play a sound file directly on the client (such as UI sounds, etc).
	*/
	@External
	@ClientFunc
	public MetaVar PlaySound(MetaVarString soundfileVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the height of the current client's screen.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ScreenHeight(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the width of the current client's screen.
	*/
	@External
	@ClientFunc
	public MetaVarNumber ScreenWidth(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets a multiplier that will influence all upcoming drawing operations.
	*/
	@External
	@ClientFunc
	public MetaVar SetAlphaMultiplier(MetaVarNumber multiplierVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Set the colour of any future shapes to be drawn, can be set by either using r, g, b, a as seperate values or by a <a href="http://wiki.garrysmod.com/page/Classes/Color" title="Classes/Color" class="mw-redirect">Color</a> object, using a color object is not recommended to be created prodecural.
	*/
	@External
	@ClientFunc
	public MetaVar SetDrawColor(MetaVarColor gVar,MetaVarColor bVar,MetaVarColor aVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Set the current font to be used for text operations later.
	*/
	@External
	@ClientFunc
	public MetaVar SetFont(MetaVarString fontNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the material to be used in all upcoming surface draw operations.
	*/
	@External
	@ClientFunc
	public MetaVar SetMaterial(MetaVarIMaterial materialVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Set the colour of any future text to be drawn, can be set by either using r, g, b, a as seperate values or by a <a href="http://wiki.garrysmod.com/page/Classes/Color" title="Classes/Color" class="mw-redirect">Color</a> object, using a color object is not recommended to be created prodecural.
	*/
	@External
	@ClientFunc
	public MetaVar SetTextColor(MetaVarColor gVar,MetaVarColor bVar,MetaVarColor aVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Set the position to draw any future text.
	*/
	@External
	@ClientFunc
	public MetaVar SetTextPos(MetaVarNumber xVar,MetaVarNumber yVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the texture to be used in all upcoming surface draw operations.
	*/
	@External
	@ClientFunc
	public MetaVar SetTexture(MetaVarNumber textureIDVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
