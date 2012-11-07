package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarSunInfoImpl.class)
public interface MetaVarSunInfo extends MetaVar,IMetaVarAny{
	@SimpleName("direction")
	public MetaVarVector getDirection();
	@SimpleName("direction")
	public void setDirection(MetaVarVector value);
	@SimpleName("obstruction")
	public MetaVarNumber getObstruction();
	@SimpleName("obstruction")
	public void setObstruction(MetaVarNumber value);
}
