package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("Angle")
public class MetaVarAngle extends MetaVarImpl implements IMetaVarAny{
	public MetaVarAngle(String n) {
		super(n);
	}
	@External
	public MetaVarVector Forward(){return null;};
	@External
	public MetaVarBoolean IsZero(){return null;};
	@External
	public MetaVar Normalize(){return null;};
	@External
	public MetaVarVector Right(){return null;};
	@External
	public MetaVar RotateAroundAxis(MetaVarVector axisVar,MetaVarNumber rotationVar){return null;};
	@External
	public MetaVar Set(MetaVarAngle originalAngleVar){return null;};
	@External
	public MetaVarVector Up(){return null;};
	@External
	public MetaVar Zero(){return null;};
	@External
	public MetaVarAngle __add(MetaVarAngle rhsVar){return null;};
	@External
	public MetaVarBoolean __eq(MetaVarAngle rhsVar){return null;};
	@External
	public MetaVar __gc(){return null;};
	@External
	public MetaVarNumber __index(MetaVarString memberVar){return null;};
	@External
	public MetaVarAngle __mul(MetaVarNumber rhsVar){return null;};
	@External
	public MetaVar __newindex(MetaVarString memberVar,MetaVarNumber valueVar){return null;};
	@External
	public MetaVarAngle __sub(MetaVarAngle rhsVar){return null;};
	@External
	public MetaVarString __tostring(){return null;};
	@External
	public MetaVarAngle __unm(){return null;};
}
