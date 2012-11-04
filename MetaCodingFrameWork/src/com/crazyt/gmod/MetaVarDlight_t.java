package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("dlight_t")
public class MetaVarDlight_t extends MetaVarImpl implements IMetaVarAny{
	private MetaVarNumber Brightness;
	@SimpleName("Brightness")
	public MetaVarNumber getBrightness(){ return Brightness;}
	@SimpleName("Brightness")
	public void setBrightness(MetaVarNumber value){ Brightness=value;}
	private MetaVarNumber Decay;
	@SimpleName("Decay")
	public MetaVarNumber getDecay(){ return Decay;}
	@SimpleName("Decay")
	public void setDecay(MetaVarNumber value){ Decay=value;}
	private MetaVarNumber DieTime;
	@SimpleName("DieTime")
	public MetaVarNumber getDieTime(){ return DieTime;}
	@SimpleName("DieTime")
	public void setDieTime(MetaVarNumber value){ DieTime=value;}
	private MetaVarNumber Dir;
	@SimpleName("Dir")
	public MetaVarNumber getDir(){ return Dir;}
	@SimpleName("Dir")
	public void setDir(MetaVarNumber value){ Dir=value;}
	private MetaVarNumber InnerAngle;
	@SimpleName("InnerAngle")
	public MetaVarNumber getInnerAngle(){ return InnerAngle;}
	@SimpleName("InnerAngle")
	public void setInnerAngle(MetaVarNumber value){ InnerAngle=value;}
	private MetaVarNumber Key;
	@SimpleName("Key")
	public MetaVarNumber getKey(){ return Key;}
	@SimpleName("Key")
	public void setKey(MetaVarNumber value){ Key=value;}
	private MetaVarNumber MinLight;
	@SimpleName("MinLight")
	public MetaVarNumber getMinLight(){ return MinLight;}
	@SimpleName("MinLight")
	public void setMinLight(MetaVarNumber value){ MinLight=value;}
	private MetaVarBoolean NoWorld;
	@SimpleName("NoWorld")
	public MetaVarBoolean getNoWorld(){ return NoWorld;}
	@SimpleName("NoWorld")
	public void setNoWorld(MetaVarBoolean value){ NoWorld=value;}
	private MetaVarBoolean NoModel;
	@SimpleName("NoModel")
	public MetaVarBoolean getNoModel(){ return NoModel;}
	@SimpleName("NoModel")
	public void setNoModel(MetaVarBoolean value){ NoModel=value;}
	private MetaVarNumber OuterAngle;
	@SimpleName("OuterAngle")
	public MetaVarNumber getOuterAngle(){ return OuterAngle;}
	@SimpleName("OuterAngle")
	public void setOuterAngle(MetaVarNumber value){ OuterAngle=value;}
	private MetaVarVector Pos;
	@SimpleName("Pos")
	public MetaVarVector getPos(){ return Pos;}
	@SimpleName("Pos")
	public void setPos(MetaVarVector value){ Pos=value;}
	private MetaVarNumber Size;
	@SimpleName("Size")
	public MetaVarNumber getSize(){ return Size;}
	@SimpleName("Size")
	public void setSize(MetaVarNumber value){ Size=value;}
	private MetaVarNumber Style;
	@SimpleName("Style")
	public MetaVarNumber getStyle(){ return Style;}
	@SimpleName("Style")
	public void setStyle(MetaVarNumber value){ Style=value;}
	private MetaVarNumber b;
	@SimpleName("b")
	public MetaVarNumber getB(){ return b;}
	@SimpleName("b")
	public void setB(MetaVarNumber value){ b=value;}
	private MetaVarNumber g;
	@SimpleName("g")
	public MetaVarNumber getG(){ return g;}
	@SimpleName("g")
	public void setG(MetaVarNumber value){ g=value;}
	private MetaVarNumber r;
	@SimpleName("r")
	public MetaVarNumber getR(){ return r;}
	@SimpleName("r")
	public void setR(MetaVarNumber value){ r=value;}
	public MetaVarDlight_t(String n) {
		super(n);
	}
}
