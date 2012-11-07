package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarHullTraceImpl.class)
public interface MetaVarHullTrace extends MetaVar,IMetaVarAny{
	@SimpleName("endpos")
	public MetaVarVector getEndpos();
	@SimpleName("endpos")
	public void setEndpos(MetaVarVector value);
	@SimpleName("mask")
	public MetaVarNumber getMask();
	@SimpleName("mask")
	public void setMask(MetaVarNumber value);
	@SimpleName("maxs")
	public MetaVarVector getMaxs();
	@SimpleName("maxs")
	public void setMaxs(MetaVarVector value);
	@SimpleName("mins")
	public MetaVarVector getMins();
	@SimpleName("mins")
	public void setMins(MetaVarVector value);
	@SimpleName("start")
	public MetaVarVector getStart();
	@SimpleName("start")
	public void setStart(MetaVarVector value);
}
