package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("AngPos")
public class MetaVarAngPosImpl extends MetaVarImpl implements MetaVarAngPos{
	private MetaVarAngle Ang;
	@SimpleName("Ang")
	public MetaVarAngle getAng(){ return Ang;}
	@SimpleName("Ang")
	public void setAng(MetaVarAngle value){ Ang=value;}
	private MetaVarVector Pos;
	@SimpleName("Pos")
	public MetaVarVector getPos(){ return Pos;}
	@SimpleName("Pos")
	public void setPos(MetaVarVector value){ Pos=value;}
	public MetaVarAngPosImpl(String n) {
		super(n);
	}
}
