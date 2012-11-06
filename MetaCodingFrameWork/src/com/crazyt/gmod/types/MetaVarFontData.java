package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("FontData")
public class MetaVarFontData extends MetaVarImpl implements IMetaVarAny{
	private MetaVarString font;
	@SimpleName("font")
	public MetaVarString getFont(){ return font;}
	@SimpleName("font")
	public void setFont(MetaVarString value){ font=value;}
	private MetaVarNumber size;
	@SimpleName("size")
	public MetaVarNumber getSize(){ return size;}
	@SimpleName("size")
	public void setSize(MetaVarNumber value){ size=value;}
	private MetaVarNumber weight;
	@SimpleName("weight")
	public MetaVarNumber getWeight(){ return weight;}
	@SimpleName("weight")
	public void setWeight(MetaVarNumber value){ weight=value;}
	private MetaVarNumber blursize;
	@SimpleName("blursize")
	public MetaVarNumber getBlursize(){ return blursize;}
	@SimpleName("blursize")
	public void setBlursize(MetaVarNumber value){ blursize=value;}
	private MetaVarNumber scanlines;
	@SimpleName("scanlines")
	public MetaVarNumber getScanlines(){ return scanlines;}
	@SimpleName("scanlines")
	public void setScanlines(MetaVarNumber value){ scanlines=value;}
	private MetaVarBoolean antialias;
	@SimpleName("antialias")
	public MetaVarBoolean getAntialias(){ return antialias;}
	@SimpleName("antialias")
	public void setAntialias(MetaVarBoolean value){ antialias=value;}
	private MetaVarBoolean underline;
	@SimpleName("underline")
	public MetaVarBoolean getUnderline(){ return underline;}
	@SimpleName("underline")
	public void setUnderline(MetaVarBoolean value){ underline=value;}
	private MetaVarBoolean italic;
	@SimpleName("italic")
	public MetaVarBoolean getItalic(){ return italic;}
	@SimpleName("italic")
	public void setItalic(MetaVarBoolean value){ italic=value;}
	private MetaVarBoolean strikeout;
	@SimpleName("strikeout")
	public MetaVarBoolean getStrikeout(){ return strikeout;}
	@SimpleName("strikeout")
	public void setStrikeout(MetaVarBoolean value){ strikeout=value;}
	private MetaVarBoolean symbol;
	@SimpleName("symbol")
	public MetaVarBoolean getSymbol(){ return symbol;}
	@SimpleName("symbol")
	public void setSymbol(MetaVarBoolean value){ symbol=value;}
	private MetaVarBoolean rotary;
	@SimpleName("rotary")
	public MetaVarBoolean getRotary(){ return rotary;}
	@SimpleName("rotary")
	public void setRotary(MetaVarBoolean value){ rotary=value;}
	private MetaVarBoolean shadow;
	@SimpleName("shadow")
	public MetaVarBoolean getShadow(){ return shadow;}
	@SimpleName("shadow")
	public void setShadow(MetaVarBoolean value){ shadow=value;}
	private MetaVarBoolean additive;
	@SimpleName("additive")
	public MetaVarBoolean getAdditive(){ return additive;}
	@SimpleName("additive")
	public void setAdditive(MetaVarBoolean value){ additive=value;}
	private MetaVarBoolean outline;
	@SimpleName("outline")
	public MetaVarBoolean getOutline(){ return outline;}
	@SimpleName("outline")
	public void setOutline(MetaVarBoolean value){ outline=value;}
	public MetaVarFontData(String n) {
		super(n);
	}
}
