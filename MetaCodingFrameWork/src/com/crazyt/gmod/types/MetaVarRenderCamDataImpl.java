package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("RenderCamData")
public class MetaVarRenderCamDataImpl extends MetaVarImpl implements MetaVarRenderCamData{
	private MetaVarAngle angles;
	@SimpleName("angles")
	public MetaVarAngle getAngles(){ return angles;}
	@SimpleName("angles")
	public void setAngles(MetaVarAngle value){ angles=value;}
	private MetaVarNumber fov;
	@SimpleName("fov")
	public MetaVarNumber getFov(){ return fov;}
	@SimpleName("fov")
	public void setFov(MetaVarNumber value){ fov=value;}
	private MetaVarVector origin;
	@SimpleName("origin")
	public MetaVarVector getOrigin(){ return origin;}
	@SimpleName("origin")
	public void setOrigin(MetaVarVector value){ origin=value;}
	private MetaVarNumber type;
	@SimpleName("type")
	public MetaVarNumber getType(){ return type;}
	@SimpleName("type")
	public void setType(MetaVarNumber value){ type=value;}
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
	private MetaVarNumber aspect;
	@SimpleName("aspect")
	public MetaVarNumber getAspect(){ return aspect;}
	@SimpleName("aspect")
	public void setAspect(MetaVarNumber value){ aspect=value;}
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
	private MetaVarNumber zfar;
	@SimpleName("zfar")
	public MetaVarNumber getZfar(){ return zfar;}
	@SimpleName("zfar")
	public void setZfar(MetaVarNumber value){ zfar=value;}
	private MetaVarNumber znear;
	@SimpleName("znear")
	public MetaVarNumber getZnear(){ return znear;}
	@SimpleName("znear")
	public void setZnear(MetaVarNumber value){ znear=value;}
	public MetaVarRenderCamDataImpl(String n) {
		super(n);
	}
}
