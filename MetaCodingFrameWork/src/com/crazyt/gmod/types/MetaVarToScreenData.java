package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarToScreenDataImpl.class)
public interface MetaVarToScreenData extends MetaVar,IMetaVarAny{
	@SimpleName("x")
	public MetaVarNumber getX();
	@SimpleName("x")
	public void setX(MetaVarNumber value);
	@SimpleName("y")
	public MetaVarNumber getY();
	@SimpleName("y")
	public void setY(MetaVarNumber value);
	@SimpleName("visible")
	public MetaVarBoolean getVisible();
	@SimpleName("visible")
	public void setVisible(MetaVarBoolean value);
}
