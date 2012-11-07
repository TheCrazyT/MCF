package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarAmmoDataImpl.class)
public interface MetaVarAmmoData extends MetaVar,IMetaVarAny{
	@SimpleName("dmgtype")
	public MetaVarNumber getDmgtype();
	@SimpleName("dmgtype")
	public void setDmgtype(MetaVarNumber value);
	@SimpleName("force")
	public MetaVarNumber getForce();
	@SimpleName("force")
	public void setForce(MetaVarNumber value);
	@SimpleName("maxsplash")
	public MetaVarNumber getMaxsplash();
	@SimpleName("maxsplash")
	public void setMaxsplash(MetaVarNumber value);
	@SimpleName("minsplash")
	public MetaVarNumber getMinsplash();
	@SimpleName("minsplash")
	public void setMinsplash(MetaVarNumber value);
	@SimpleName("name")
	public MetaVarString getName();
	@SimpleName("name")
	public void setName(MetaVarString value);
	@SimpleName("npcdmg")
	public MetaVarNumber getNpcdmg();
	@SimpleName("npcdmg")
	public void setNpcdmg(MetaVarNumber value);
	@SimpleName("plydmg")
	public MetaVarNumber getPlydmg();
	@SimpleName("plydmg")
	public void setPlydmg(MetaVarNumber value);
	@SimpleName("tracer")
	public MetaVarNumber getTracer();
	@SimpleName("tracer")
	public void setTracer(MetaVarNumber value);
}
