package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarFontDataImpl.class)
public interface MetaVarFontData extends MetaVar,IMetaVarAny{
	@SimpleName("font")
	public MetaVarString getFont();
	@SimpleName("font")
	public void setFont(MetaVarString value);
	@SimpleName("size")
	public MetaVarNumber getSize();
	@SimpleName("size")
	public void setSize(MetaVarNumber value);
	@SimpleName("weight")
	public MetaVarNumber getWeight();
	@SimpleName("weight")
	public void setWeight(MetaVarNumber value);
	@SimpleName("blursize")
	public MetaVarNumber getBlursize();
	@SimpleName("blursize")
	public void setBlursize(MetaVarNumber value);
	@SimpleName("scanlines")
	public MetaVarNumber getScanlines();
	@SimpleName("scanlines")
	public void setScanlines(MetaVarNumber value);
	@SimpleName("antialias")
	public MetaVarBoolean getAntialias();
	@SimpleName("antialias")
	public void setAntialias(MetaVarBoolean value);
	@SimpleName("underline")
	public MetaVarBoolean getUnderline();
	@SimpleName("underline")
	public void setUnderline(MetaVarBoolean value);
	@SimpleName("italic")
	public MetaVarBoolean getItalic();
	@SimpleName("italic")
	public void setItalic(MetaVarBoolean value);
	@SimpleName("strikeout")
	public MetaVarBoolean getStrikeout();
	@SimpleName("strikeout")
	public void setStrikeout(MetaVarBoolean value);
	@SimpleName("symbol")
	public MetaVarBoolean getSymbol();
	@SimpleName("symbol")
	public void setSymbol(MetaVarBoolean value);
	@SimpleName("rotary")
	public MetaVarBoolean getRotary();
	@SimpleName("rotary")
	public void setRotary(MetaVarBoolean value);
	@SimpleName("shadow")
	public MetaVarBoolean getShadow();
	@SimpleName("shadow")
	public void setShadow(MetaVarBoolean value);
	@SimpleName("additive")
	public MetaVarBoolean getAdditive();
	@SimpleName("additive")
	public void setAdditive(MetaVarBoolean value);
	@SimpleName("outline")
	public MetaVarBoolean getOutline();
	@SimpleName("outline")
	public void setOutline(MetaVarBoolean value);
}
