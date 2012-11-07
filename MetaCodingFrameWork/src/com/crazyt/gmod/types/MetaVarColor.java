package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarColorImpl.class)
public interface MetaVarColor extends MetaVar,IMetaVarAny{
	@SimpleName("r")
	public MetaVarNumber getR();
	@SimpleName("r")
	public void setR(MetaVarNumber value);
	@SimpleName("g")
	public MetaVarNumber getG();
	@SimpleName("g")
	public void setG(MetaVarNumber value);
	@SimpleName("b")
	public MetaVarNumber getB();
	@SimpleName("b")
	public void setB(MetaVarNumber value);
	@SimpleName("a")
	public MetaVarNumber getA();
	@SimpleName("a")
	public void setA(MetaVarNumber value);
}
