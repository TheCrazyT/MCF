package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarMatProxyDataImpl.class)
public interface MetaVarMatProxyData extends MetaVar,IMetaVarAny{
	@SimpleName("name")
	public MetaVarString getName();
	@SimpleName("name")
	public void setName(MetaVarString value);
	@SimpleName("init")
	public MetaVarFunction getInit();
	@SimpleName("init")
	public void setInit(MetaVarFunction value);
	@SimpleName("bind")
	public MetaVarFunction getBind();
	@SimpleName("bind")
	public void setBind(MetaVarFunction value);
}
