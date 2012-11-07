package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarViewDataImpl.class)
public interface MetaVarViewData extends MetaVar,IMetaVarAny{
	@SimpleName("origin")
	public MetaVarVector getOrigin();
	@SimpleName("origin")
	public void setOrigin(MetaVarVector value);
	@SimpleName("angles")
	public MetaVarAngle getAngles();
	@SimpleName("angles")
	public void setAngles(MetaVarAngle value);
	@SimpleName("aspectratio")
	public MetaVarNumber getAspectratio();
	@SimpleName("aspectratio")
	public void setAspectratio(MetaVarNumber value);
	@SimpleName("x")
	public MetaVarNumber getX();
	@SimpleName("x")
	public void setX(MetaVarNumber value);
	@SimpleName("y")
	public MetaVarNumber getY();
	@SimpleName("y")
	public void setY(MetaVarNumber value);
	@SimpleName("w")
	public MetaVarNumber getW();
	@SimpleName("w")
	public void setW(MetaVarNumber value);
	@SimpleName("h")
	public MetaVarNumber getH();
	@SimpleName("h")
	public void setH(MetaVarNumber value);
	@SimpleName("dopostprocess")
	public MetaVarBoolean getDopostprocess();
	@SimpleName("dopostprocess")
	public void setDopostprocess(MetaVarBoolean value);
	@SimpleName("drawhud")
	public MetaVarBoolean getDrawhud();
	@SimpleName("drawhud")
	public void setDrawhud(MetaVarBoolean value);
	@SimpleName("drawmonitors")
	public MetaVarBoolean getDrawmonitors();
	@SimpleName("drawmonitors")
	public void setDrawmonitors(MetaVarBoolean value);
	@SimpleName("drawviewmodel")
	public MetaVarBoolean getDrawviewmodel();
	@SimpleName("drawviewmodel")
	public void setDrawviewmodel(MetaVarBoolean value);
	@SimpleName("viewmodelfov")
	public MetaVarNumber getViewmodelfov();
	@SimpleName("viewmodelfov")
	public void setViewmodelfov(MetaVarNumber value);
	@SimpleName("fov")
	public MetaVarNumber getFov();
	@SimpleName("fov")
	public void setFov(MetaVarNumber value);
	@SimpleName("ortho")
	public MetaVarBoolean getOrtho();
	@SimpleName("ortho")
	public void setOrtho(MetaVarBoolean value);
	@SimpleName("ortholeft")
	public MetaVarNumber getOrtholeft();
	@SimpleName("ortholeft")
	public void setOrtholeft(MetaVarNumber value);
	@SimpleName("orthoright")
	public MetaVarNumber getOrthoright();
	@SimpleName("orthoright")
	public void setOrthoright(MetaVarNumber value);
	@SimpleName("orthotop")
	public MetaVarNumber getOrthotop();
	@SimpleName("orthotop")
	public void setOrthotop(MetaVarNumber value);
	@SimpleName("orthobottom")
	public MetaVarNumber getOrthobottom();
	@SimpleName("orthobottom")
	public void setOrthobottom(MetaVarNumber value);
	@SimpleName("znear")
	public MetaVarNumber getZnear();
	@SimpleName("znear")
	public void setZnear(MetaVarNumber value);
	@SimpleName("zfar")
	public MetaVarNumber getZfar();
	@SimpleName("zfar")
	public void setZfar(MetaVarNumber value);
	@SimpleName("znearviewmodel")
	public MetaVarNumber getZnearviewmodel();
	@SimpleName("znearviewmodel")
	public void setZnearviewmodel(MetaVarNumber value);
	@SimpleName("zfarviewmodel")
	public MetaVarNumber getZfarviewmodel();
	@SimpleName("zfarviewmodel")
	public void setZfarviewmodel(MetaVarNumber value);
}
