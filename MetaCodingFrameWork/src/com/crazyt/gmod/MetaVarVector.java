package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("Vector")
public class MetaVarVector extends MetaVarImpl implements IMetaVarAny{
	public MetaVarVector(String n) {
		super(n);
	}
	@External
	public MetaVar ToScreen(){return null;};
	@External
	public MetaVar Add(MetaVarVector vectorVar){return null;};
	@External
	public MetaVarAngle Angle(){return null;};
	@External
	public MetaVarVector Cross(MetaVarVector otherVectorVar){return null;};
	@External
	public MetaVarNumber DistToSqr(MetaVarVector otherVecVar){return null;};
	@External
	public MetaVarBoolean Distance(MetaVarVector otherVectorVar){return null;};
	@External
	public MetaVarNumber DotProduct(MetaVarVector VectorVar){return null;};
	@External
	public MetaVarVector GetNormalized(){return null;};
	@External
	public MetaVarVector GetNormal(){return null;};
	@External
	public MetaVarBoolean IsEqualTol(MetaVarVector compareVar,MetaVarNumber toleranceVar){return null;};
	@External
	public MetaVarBoolean IsZero(){return null;};
	@External
	public MetaVarNumber Length2DSqr(){return null;};
	@External
	public MetaVarNumber Length2D(){return null;};
	@External
	public MetaVarNumber LengthSqr(){return null;};
	@External
	public MetaVarNumber Length(){return null;};
	@External
	public MetaVar Mul(MetaVarNumber multiplierVar){return null;};
	@External
	public MetaVar Normalize(){return null;};
	@External
	public MetaVarVector Rotate(MetaVarAngle rotationVar){return null;};
	@External
	public MetaVar Set(MetaVarVector vectorVar){return null;};
	@External
	public MetaVar Sub(MetaVarVector vectorVar){return null;};
	@External
	public MetaVarBoolean WithinAABox(MetaVarVector boxStartVar,MetaVarVector boxEndVar){return null;};
	@External
	public MetaVar Zero(){return null;};
	@External
	public MetaVarVector __add(MetaVarVector rhsVar){return null;};
	@External
	public MetaVarVector __div(MetaVarNumber rhsVar){return null;};
	@External
	public MetaVarBoolean __eq(MetaVarVector rhsVar){return null;};
	@External
	public MetaVar __gc(){return null;};
	@External
	public MetaVarNumber __index(MetaVarString memberVar){return null;};
	@External
	public MetaVarVector __mul(){return null;};
	@External
	public MetaVar __newindex(MetaVarNumber valueVar){return null;};
	@External
	public MetaVarVector __sub(MetaVarVector rhsVar){return null;};
	@External
	public MetaVar __tostring(){return null;};
	@External
	public MetaVarVector __unm(){return null;};
}
