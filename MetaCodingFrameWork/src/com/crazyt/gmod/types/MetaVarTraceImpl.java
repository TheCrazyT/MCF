package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("Trace")
public class MetaVarTraceImpl extends MetaVarImpl implements MetaVarTrace{
	private MetaVarVector start;
	@SimpleName("start")
	public MetaVarVector getStart(){ return start;}
	@SimpleName("start")
	public void setStart(MetaVarVector value){ start=value;}
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
	public MetaVarTraceImpl(String n) {
		super(n);
	}
}
