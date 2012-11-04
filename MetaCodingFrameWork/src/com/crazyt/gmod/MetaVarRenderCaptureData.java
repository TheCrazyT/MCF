package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("RenderCaptureData")
public class MetaVarRenderCaptureData extends MetaVarImpl implements IMetaVarAny{
	private MetaVarString format;
	@SimpleName("format")
	public MetaVarString getFormat(){ return format;}
	@SimpleName("format")
	public void setFormat(MetaVarString value){ format=value;}
	private MetaVarNumber h;
	@SimpleName("h")
	public MetaVarNumber getH(){ return h;}
	@SimpleName("h")
	public void setH(MetaVarNumber value){ h=value;}
	private MetaVarNumber w;
	@SimpleName("w")
	public MetaVarNumber getW(){ return w;}
	@SimpleName("w")
	public void setW(MetaVarNumber value){ w=value;}
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
	public MetaVarRenderCaptureData(String n) {
		super(n);
	}
}
