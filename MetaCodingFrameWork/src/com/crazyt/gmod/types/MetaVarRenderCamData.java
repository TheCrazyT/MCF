package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarRenderCamDataImpl.class)
public interface MetaVarRenderCamData extends MetaVar,IMetaVarAny{
	@SimpleName("angles")
	public MetaVarAngle getAngles();
	@SimpleName("angles")
	public void setAngles(MetaVarAngle value);
	@SimpleName("fov")
	public MetaVarNumber getFov();
	@SimpleName("fov")
	public void setFov(MetaVarNumber value);
	@SimpleName("origin")
	public MetaVarVector getOrigin();
	@SimpleName("origin")
	public void setOrigin(MetaVarVector value);
	@SimpleName("type")
	public MetaVarNumber getType();
	@SimpleName("type")
	public void setType(MetaVarNumber value);
	@SimpleName("w")
	public MetaVarNumber getW();
	@SimpleName("w")
	public void setW(MetaVarNumber value);
	@SimpleName("h")
	public MetaVarNumber getH();
	@SimpleName("h")
	public void setH(MetaVarNumber value);
	@SimpleName("aspect")
	public MetaVarNumber getAspect();
	@SimpleName("aspect")
	public void setAspect(MetaVarNumber value);
	@SimpleName("x")
	public MetaVarNumber getX();
	@SimpleName("x")
	public void setX(MetaVarNumber value);
	@SimpleName("y")
	public MetaVarNumber getY();
	@SimpleName("y")
	public void setY(MetaVarNumber value);
	@SimpleName("zfar")
	public MetaVarNumber getZfar();
	@SimpleName("zfar")
	public void setZfar(MetaVarNumber value);
	@SimpleName("znear")
	public MetaVarNumber getZnear();
	@SimpleName("znear")
	public void setZnear(MetaVarNumber value);
}
