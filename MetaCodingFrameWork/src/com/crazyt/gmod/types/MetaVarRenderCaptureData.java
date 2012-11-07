package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarRenderCaptureDataImpl.class)
public interface MetaVarRenderCaptureData extends MetaVar,IMetaVarAny{
	@SimpleName("format")
	public MetaVarString getFormat();
	@SimpleName("format")
	public void setFormat(MetaVarString value);
	@SimpleName("h")
	public MetaVarNumber getH();
	@SimpleName("h")
	public void setH(MetaVarNumber value);
	@SimpleName("w")
	public MetaVarNumber getW();
	@SimpleName("w")
	public void setW(MetaVarNumber value);
	@SimpleName("x")
	public MetaVarNumber getX();
	@SimpleName("x")
	public void setX(MetaVarNumber value);
	@SimpleName("y")
	public MetaVarNumber getY();
	@SimpleName("y")
	public void setY(MetaVarNumber value);
}
