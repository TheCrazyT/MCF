package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarTraceImpl.class)
public interface MetaVarTrace extends MetaVar,IMetaVarAny{
	@SimpleName("start")
	public MetaVarVector getStart();
	@SimpleName("start")
	public void setStart(MetaVarVector value);
	@SimpleName("endpos")
	public MetaVarVector getEndpos();
	@SimpleName("endpos")
	public void setEndpos(MetaVarVector value);
	@SimpleName("mask")
	public MetaVarNumber getMask();
	@SimpleName("mask")
	public void setMask(MetaVarNumber value);
}
