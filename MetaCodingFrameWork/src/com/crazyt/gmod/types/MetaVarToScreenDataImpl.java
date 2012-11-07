package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("ToScreenData")
public class MetaVarToScreenDataImpl extends MetaVarImpl implements MetaVarToScreenData{
	private MetaVarNumber x;
	@SimpleName("x")
	public MetaVarNumber getX(){ return x;}
	@SimpleName("x")
	public void setX(MetaVarNumber value){ x=value;}
	private MetaVarNumber y;
	@SimpleName("y")
	public MetaVarNumber getY(){ return y;}
	@SimpleName("y")
	public void setY(MetaVarNumber value){ y=value;}
	private MetaVarBoolean visible;
	@SimpleName("visible")
	public MetaVarBoolean getVisible(){ return visible;}
	@SimpleName("visible")
	public void setVisible(MetaVarBoolean value){ visible=value;}
	public MetaVarToScreenDataImpl(String n) {
		super(n);
	}
}
