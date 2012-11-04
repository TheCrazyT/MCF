package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("Bullet")
public class MetaVarBullet extends MetaVarImpl implements IMetaVarAny{
	private MetaVarEntity Attacker;
	@SimpleName("Attacker")
	public MetaVarEntity getAttacker(){ return Attacker;}
	@SimpleName("Attacker")
	public void setAttacker(MetaVarEntity value){ Attacker=value;}
	private MetaVarEntity Inflictor;
	@SimpleName("Inflictor")
	public MetaVarEntity getInflictor(){ return Inflictor;}
	@SimpleName("Inflictor")
	public void setInflictor(MetaVarEntity value){ Inflictor=value;}
	private MetaVarFunction Callback;
	@SimpleName("Callback")
	public MetaVarFunction getCallback(){ return Callback;}
	@SimpleName("Callback")
	public void setCallback(MetaVarFunction value){ Callback=value;}
	private MetaVarNumber Damage;
	@SimpleName("Damage")
	public MetaVarNumber getDamage(){ return Damage;}
	@SimpleName("Damage")
	public void setDamage(MetaVarNumber value){ Damage=value;}
	private MetaVarNumber Force;
	@SimpleName("Force")
	public MetaVarNumber getForce(){ return Force;}
	@SimpleName("Force")
	public void setForce(MetaVarNumber value){ Force=value;}
	private MetaVarNumber Hull;
	@SimpleName("Hull")
	public MetaVarNumber getHull(){ return Hull;}
	@SimpleName("Hull")
	public void setHull(MetaVarNumber value){ Hull=value;}
	private MetaVarNumber Num;
	@SimpleName("Num")
	public MetaVarNumber getNum(){ return Num;}
	@SimpleName("Num")
	public void setNum(MetaVarNumber value){ Num=value;}
	private MetaVarNumber Tracer;
	@SimpleName("Tracer")
	public MetaVarNumber getTracer(){ return Tracer;}
	@SimpleName("Tracer")
	public void setTracer(MetaVarNumber value){ Tracer=value;}
	private MetaVarString AmmoType;
	@SimpleName("AmmoType")
	public MetaVarString getAmmoType(){ return AmmoType;}
	@SimpleName("AmmoType")
	public void setAmmoType(MetaVarString value){ AmmoType=value;}
	private MetaVarString TracerName;
	@SimpleName("TracerName")
	public MetaVarString getTracerName(){ return TracerName;}
	@SimpleName("TracerName")
	public void setTracerName(MetaVarString value){ TracerName=value;}
	private MetaVarVector Dir;
	@SimpleName("Dir")
	public MetaVarVector getDir(){ return Dir;}
	@SimpleName("Dir")
	public void setDir(MetaVarVector value){ Dir=value;}
	private MetaVarVector Spread;
	@SimpleName("Spread")
	public MetaVarVector getSpread(){ return Spread;}
	@SimpleName("Spread")
	public void setSpread(MetaVarVector value){ Spread=value;}
	private MetaVarVector Src;
	@SimpleName("Src")
	public MetaVarVector getSrc(){ return Src;}
	@SimpleName("Src")
	public void setSrc(MetaVarVector value){ Src=value;}
	public MetaVarBullet(String n) {
		super(n);
	}
}
