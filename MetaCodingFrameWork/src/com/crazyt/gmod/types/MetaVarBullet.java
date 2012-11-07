package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarBulletImpl.class)
public interface MetaVarBullet extends MetaVar,IMetaVarAny{
	@SimpleName("Attacker")
	public MetaVarEntity getAttacker();
	@SimpleName("Attacker")
	public void setAttacker(MetaVarEntity value);
	@SimpleName("Inflictor")
	public MetaVarEntity getInflictor();
	@SimpleName("Inflictor")
	public void setInflictor(MetaVarEntity value);
	@SimpleName("Callback")
	public MetaVarFunction getCallback();
	@SimpleName("Callback")
	public void setCallback(MetaVarFunction value);
	@SimpleName("Damage")
	public MetaVarNumber getDamage();
	@SimpleName("Damage")
	public void setDamage(MetaVarNumber value);
	@SimpleName("Force")
	public MetaVarNumber getForce();
	@SimpleName("Force")
	public void setForce(MetaVarNumber value);
	@SimpleName("Hull")
	public MetaVarNumber getHull();
	@SimpleName("Hull")
	public void setHull(MetaVarNumber value);
	@SimpleName("Num")
	public MetaVarNumber getNum();
	@SimpleName("Num")
	public void setNum(MetaVarNumber value);
	@SimpleName("Tracer")
	public MetaVarNumber getTracer();
	@SimpleName("Tracer")
	public void setTracer(MetaVarNumber value);
	@SimpleName("AmmoType")
	public MetaVarString getAmmoType();
	@SimpleName("AmmoType")
	public void setAmmoType(MetaVarString value);
	@SimpleName("TracerName")
	public MetaVarString getTracerName();
	@SimpleName("TracerName")
	public void setTracerName(MetaVarString value);
	@SimpleName("Dir")
	public MetaVarVector getDir();
	@SimpleName("Dir")
	public void setDir(MetaVarVector value);
	@SimpleName("Spread")
	public MetaVarVector getSpread();
	@SimpleName("Spread")
	public void setSpread(MetaVarVector value);
	@SimpleName("Src")
	public MetaVarVector getSrc();
	@SimpleName("Src")
	public void setSrc(MetaVarVector value);
}
