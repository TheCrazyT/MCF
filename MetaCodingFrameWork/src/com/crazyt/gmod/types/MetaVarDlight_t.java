package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarDlight_tImpl.class)
public interface MetaVarDlight_t extends MetaVar,IMetaVarAny{
	@SimpleName("Brightness")
	public MetaVarNumber getBrightness();
	@SimpleName("Brightness")
	public void setBrightness(MetaVarNumber value);
	@SimpleName("Decay")
	public MetaVarNumber getDecay();
	@SimpleName("Decay")
	public void setDecay(MetaVarNumber value);
	@SimpleName("DieTime")
	public MetaVarNumber getDieTime();
	@SimpleName("DieTime")
	public void setDieTime(MetaVarNumber value);
	@SimpleName("Dir")
	public MetaVarNumber getDir();
	@SimpleName("Dir")
	public void setDir(MetaVarNumber value);
	@SimpleName("InnerAngle")
	public MetaVarNumber getInnerAngle();
	@SimpleName("InnerAngle")
	public void setInnerAngle(MetaVarNumber value);
	@SimpleName("Key")
	public MetaVarNumber getKey();
	@SimpleName("Key")
	public void setKey(MetaVarNumber value);
	@SimpleName("MinLight")
	public MetaVarNumber getMinLight();
	@SimpleName("MinLight")
	public void setMinLight(MetaVarNumber value);
	@SimpleName("NoWorld")
	public MetaVarBoolean getNoWorld();
	@SimpleName("NoWorld")
	public void setNoWorld(MetaVarBoolean value);
	@SimpleName("NoModel")
	public MetaVarBoolean getNoModel();
	@SimpleName("NoModel")
	public void setNoModel(MetaVarBoolean value);
	@SimpleName("OuterAngle")
	public MetaVarNumber getOuterAngle();
	@SimpleName("OuterAngle")
	public void setOuterAngle(MetaVarNumber value);
	@SimpleName("Pos")
	public MetaVarVector getPos();
	@SimpleName("Pos")
	public void setPos(MetaVarVector value);
	@SimpleName("Size")
	public MetaVarNumber getSize();
	@SimpleName("Size")
	public void setSize(MetaVarNumber value);
	@SimpleName("Style")
	public MetaVarNumber getStyle();
	@SimpleName("Style")
	public void setStyle(MetaVarNumber value);
	@SimpleName("b")
	public MetaVarNumber getB();
	@SimpleName("b")
	public void setB(MetaVarNumber value);
	@SimpleName("g")
	public MetaVarNumber getG();
	@SimpleName("g")
	public void setG(MetaVarNumber value);
	@SimpleName("r")
	public MetaVarNumber getR();
	@SimpleName("r")
	public void setR(MetaVarNumber value);
}
