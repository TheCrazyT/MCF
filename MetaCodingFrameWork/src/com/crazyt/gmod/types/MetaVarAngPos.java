package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarAngPosImpl.class)
public interface MetaVarAngPos extends MetaVar,IMetaVarAny{
	@SimpleName("Ang")
	public MetaVarAngle getAng();
	@SimpleName("Ang")
	public void setAng(MetaVarAngle value);
	@SimpleName("Pos")
	public MetaVarVector getPos();
	@SimpleName("Pos")
	public void setPos(MetaVarVector value);
}
