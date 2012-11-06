package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("HullTrace")
public class MetaVarHullTrace extends MetaVarImpl implements IMetaVarAny{
	private MetaVarVector endpos;
	@SimpleName("endpos")
	public MetaVarVector getEndpos(){ return endpos;}
	@SimpleName("endpos")
	public void setEndpos(MetaVarVector value){ endpos=value;}
	private MetaVarNumber mask;
	@SimpleName("mask")
	public MetaVarNumber getMask(){ return mask;}
	@SimpleName("mask")
	public void setMask(MetaVarNumber value){ mask=value;}
	private MetaVarVector maxs;
	@SimpleName("maxs")
	public MetaVarVector getMaxs(){ return maxs;}
	@SimpleName("maxs")
	public void setMaxs(MetaVarVector value){ maxs=value;}
	private MetaVarVector mins;
	@SimpleName("mins")
	public MetaVarVector getMins(){ return mins;}
	@SimpleName("mins")
	public void setMins(MetaVarVector value){ mins=value;}
	private MetaVarVector start;
	@SimpleName("start")
	public MetaVarVector getStart(){ return start;}
	@SimpleName("start")
	public void setStart(MetaVarVector value){ start=value;}
	public MetaVarHullTrace(String n) {
		super(n);
	}
}
