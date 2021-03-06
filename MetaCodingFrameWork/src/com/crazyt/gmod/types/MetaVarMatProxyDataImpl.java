package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("MatProxyData")
public class MetaVarMatProxyDataImpl extends MetaVarImpl implements MetaVarMatProxyData{
	private MetaVarString name;
	@SimpleName("name")
	public MetaVarString getName(){ return name;}
	@SimpleName("name")
	public void setName(MetaVarString value){ name=value;}
	private MetaVarFunction init;
	@SimpleName("init")
	public MetaVarFunction getInit(){ return init;}
	@SimpleName("init")
	public void setInit(MetaVarFunction value){ init=value;}
	private MetaVarFunction bind;
	@SimpleName("bind")
	public MetaVarFunction getBind(){ return bind;}
	@SimpleName("bind")
	public void setBind(MetaVarFunction value){ bind=value;}
	public MetaVarMatProxyDataImpl(String n) {
		super(n);
	}
}
