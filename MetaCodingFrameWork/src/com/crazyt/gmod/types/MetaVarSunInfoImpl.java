package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("SunInfo")
public class MetaVarSunInfoImpl extends MetaVarImpl implements MetaVarSunInfo{
	private MetaVarVector direction;
	@SimpleName("direction")
	public MetaVarVector getDirection(){ return direction;}
	@SimpleName("direction")
	public void setDirection(MetaVarVector value){ direction=value;}
	private MetaVarNumber obstruction;
	@SimpleName("obstruction")
	public MetaVarNumber getObstruction(){ return obstruction;}
	@SimpleName("obstruction")
	public void setObstruction(MetaVarNumber value){ obstruction=value;}
	public MetaVarSunInfoImpl(String n) {
		super(n);
	}
}
