package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("color")
public class MetaVarColorImpl extends MetaVarImpl implements MetaVarColor{
	private MetaVarNumber r;
	@SimpleName("r")
	public MetaVarNumber getR(){ return r;}
	@SimpleName("r")
	public void setR(MetaVarNumber value){ r=value;}
	private MetaVarNumber g;
	@SimpleName("g")
	public MetaVarNumber getG(){ return g;}
	@SimpleName("g")
	public void setG(MetaVarNumber value){ g=value;}
	private MetaVarNumber b;
	@SimpleName("b")
	public MetaVarNumber getB(){ return b;}
	@SimpleName("b")
	public void setB(MetaVarNumber value){ b=value;}
	private MetaVarNumber a;
	@SimpleName("a")
	public MetaVarNumber getA(){ return a;}
	@SimpleName("a")
	public void setA(MetaVarNumber value){ a=value;}
	public MetaVarColorImpl(String n) {
		super(n);
	}
}
