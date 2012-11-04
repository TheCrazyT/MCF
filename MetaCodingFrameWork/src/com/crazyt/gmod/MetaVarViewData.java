package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("ViewData")
public class MetaVarViewData extends MetaVarImpl implements IMetaVarAny{
	private MetaVarVector origin;
	@SimpleName("origin")
	public MetaVarVector getOrigin(){ return origin;}
	@SimpleName("origin")
	public void setOrigin(MetaVarVector value){ origin=value;}
	private MetaVarAngle angles;
	@SimpleName("angles")
	public MetaVarAngle getAngles(){ return angles;}
	@SimpleName("angles")
	public void setAngles(MetaVarAngle value){ angles=value;}
	private MetaVarNumber aspectratio;
	@SimpleName("aspectratio")
	public MetaVarNumber getAspectratio(){ return aspectratio;}
	@SimpleName("aspectratio")
	public void setAspectratio(MetaVarNumber value){ aspectratio=value;}
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
	private MetaVarNumber w;
	@SimpleName("w")
	public MetaVarNumber getW(){ return w;}
	@SimpleName("w")
	public void setW(MetaVarNumber value){ w=value;}
	private MetaVarNumber h;
	@SimpleName("h")
	public MetaVarNumber getH(){ return h;}
	@SimpleName("h")
	public void setH(MetaVarNumber value){ h=value;}
	private MetaVarBoolean dopostprocess;
	@SimpleName("dopostprocess")
	public MetaVarBoolean getDopostprocess(){ return dopostprocess;}
	@SimpleName("dopostprocess")
	public void setDopostprocess(MetaVarBoolean value){ dopostprocess=value;}
	private MetaVarBoolean drawhud;
	@SimpleName("drawhud")
	public MetaVarBoolean getDrawhud(){ return drawhud;}
	@SimpleName("drawhud")
	public void setDrawhud(MetaVarBoolean value){ drawhud=value;}
	private MetaVarBoolean drawmonitors;
	@SimpleName("drawmonitors")
	public MetaVarBoolean getDrawmonitors(){ return drawmonitors;}
	@SimpleName("drawmonitors")
	public void setDrawmonitors(MetaVarBoolean value){ drawmonitors=value;}
	private MetaVarBoolean drawviewmodel;
	@SimpleName("drawviewmodel")
	public MetaVarBoolean getDrawviewmodel(){ return drawviewmodel;}
	@SimpleName("drawviewmodel")
	public void setDrawviewmodel(MetaVarBoolean value){ drawviewmodel=value;}
	private MetaVarNumber viewmodelfov;
	@SimpleName("viewmodelfov")
	public MetaVarNumber getViewmodelfov(){ return viewmodelfov;}
	@SimpleName("viewmodelfov")
	public void setViewmodelfov(MetaVarNumber value){ viewmodelfov=value;}
	private MetaVarNumber fov;
	@SimpleName("fov")
	public MetaVarNumber getFov(){ return fov;}
	@SimpleName("fov")
	public void setFov(MetaVarNumber value){ fov=value;}
	private MetaVarBoolean ortho;
	@SimpleName("ortho")
	public MetaVarBoolean getOrtho(){ return ortho;}
	@SimpleName("ortho")
	public void setOrtho(MetaVarBoolean value){ ortho=value;}
	private MetaVarNumber ortholeft;
	@SimpleName("ortholeft")
	public MetaVarNumber getOrtholeft(){ return ortholeft;}
	@SimpleName("ortholeft")
	public void setOrtholeft(MetaVarNumber value){ ortholeft=value;}
	private MetaVarNumber orthoright;
	@SimpleName("orthoright")
	public MetaVarNumber getOrthoright(){ return orthoright;}
	@SimpleName("orthoright")
	public void setOrthoright(MetaVarNumber value){ orthoright=value;}
	private MetaVarNumber orthotop;
	@SimpleName("orthotop")
	public MetaVarNumber getOrthotop(){ return orthotop;}
	@SimpleName("orthotop")
	public void setOrthotop(MetaVarNumber value){ orthotop=value;}
	private MetaVarNumber orthobottom;
	@SimpleName("orthobottom")
	public MetaVarNumber getOrthobottom(){ return orthobottom;}
	@SimpleName("orthobottom")
	public void setOrthobottom(MetaVarNumber value){ orthobottom=value;}
	private MetaVarNumber znear;
	@SimpleName("znear")
	public MetaVarNumber getZnear(){ return znear;}
	@SimpleName("znear")
	public void setZnear(MetaVarNumber value){ znear=value;}
	private MetaVarNumber zfar;
	@SimpleName("zfar")
	public MetaVarNumber getZfar(){ return zfar;}
	@SimpleName("zfar")
	public void setZfar(MetaVarNumber value){ zfar=value;}
	private MetaVarNumber znearviewmodel;
	@SimpleName("znearviewmodel")
	public MetaVarNumber getZnearviewmodel(){ return znearviewmodel;}
	@SimpleName("znearviewmodel")
	public void setZnearviewmodel(MetaVarNumber value){ znearviewmodel=value;}
	private MetaVarNumber zfarviewmodel;
	@SimpleName("zfarviewmodel")
	public MetaVarNumber getZfarviewmodel(){ return zfarviewmodel;}
	@SimpleName("zfarviewmodel")
	public void setZfarviewmodel(MetaVarNumber value){ zfarviewmodel=value;}
	public MetaVarViewData(String n) {
		super(n);
	}
}
