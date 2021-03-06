package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("AmmoData")
public class MetaVarAmmoDataImpl extends MetaVarImpl implements MetaVarAmmoData{
	private MetaVarNumber dmgtype;
	@SimpleName("dmgtype")
	public MetaVarNumber getDmgtype(){ return dmgtype;}
	@SimpleName("dmgtype")
	public void setDmgtype(MetaVarNumber value){ dmgtype=value;}
	private MetaVarNumber force;
	@SimpleName("force")
	public MetaVarNumber getForce(){ return force;}
	@SimpleName("force")
	public void setForce(MetaVarNumber value){ force=value;}
	private MetaVarNumber maxsplash;
	@SimpleName("maxsplash")
	public MetaVarNumber getMaxsplash(){ return maxsplash;}
	@SimpleName("maxsplash")
	public void setMaxsplash(MetaVarNumber value){ maxsplash=value;}
	private MetaVarNumber minsplash;
	@SimpleName("minsplash")
	public MetaVarNumber getMinsplash(){ return minsplash;}
	@SimpleName("minsplash")
	public void setMinsplash(MetaVarNumber value){ minsplash=value;}
	private MetaVarString name;
	@SimpleName("name")
	public MetaVarString getName(){ return name;}
	@SimpleName("name")
	public void setName(MetaVarString value){ name=value;}
	private MetaVarNumber npcdmg;
	@SimpleName("npcdmg")
	public MetaVarNumber getNpcdmg(){ return npcdmg;}
	@SimpleName("npcdmg")
	public void setNpcdmg(MetaVarNumber value){ npcdmg=value;}
	private MetaVarNumber plydmg;
	@SimpleName("plydmg")
	public MetaVarNumber getPlydmg(){ return plydmg;}
	@SimpleName("plydmg")
	public void setPlydmg(MetaVarNumber value){ plydmg=value;}
	private MetaVarNumber tracer;
	@SimpleName("tracer")
	public MetaVarNumber getTracer(){ return tracer;}
	@SimpleName("tracer")
	public void setTracer(MetaVarNumber value){ tracer=value;}
	public MetaVarAmmoDataImpl(String n) {
		super(n);
	}
}
