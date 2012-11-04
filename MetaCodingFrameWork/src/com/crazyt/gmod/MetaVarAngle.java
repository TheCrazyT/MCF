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
	private MetaVarNumber p;
	public MetaVarNumber getP(){ return p;}
	public void setP(MetaVarNumber value){ p=value;}
	private MetaVarNumber r;
	public MetaVarNumber getR(){ return r;}
	public void setR(MetaVarNumber value){ r=value;}
	private MetaVarNumber y;
	public MetaVarNumber getY(){ return y;}
	public void setY(MetaVarNumber value){ y=value;}
	public MetaVarAngle(String n) {
		super(n);
	}
	/**
	Returns a normal vector facing in the direction that the angle points.
	*/
	@External
	@SharedFunc
	public MetaVarVector Forward(){return null;};
	/**
	Returns of the pitch, yaw and roll are 0.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsZero(){return null;};
	/**
	Normalizes the angles by applying a module with 360 to pitch, yaw and roll.
	*/
	@External
	@SharedFunc
	public MetaVar Normalize(){return null;};
	/**
	Returns a normal vector facing in the direction that points right relative to the angle's direction.
	*/
	@External
	@SharedFunc
	public MetaVarVector Right(){return null;};
	/**
	Rotates the angle around the specified axis by the specified degrees.
	*/
	@External
	@SharedFunc
	public MetaVar RotateAroundAxis(MetaVarVector axisVar,MetaVarNumber rotationVar){return null;};
	/**
	Copies pitch, yaw and roll from the second angle to the first.
	*/
	@External
	@SharedFunc
	public MetaVar Set(MetaVarAngle originalAngleVar){return null;};
	/**
	Returns a normal vector facing in the direction that points up relative to the angle's direction.
	*/
	@External
	@SharedFunc
	public MetaVarVector Up(){return null;};
	/**
	Sets pitch, yaw and roll to 0, this function is faster than doing it manually.
	*/
	@External
	@SharedFunc
	public MetaVar Zero(){return null;};
	/**
	Adds 2 angles and returns the result as a new angle.
	*/
	@External
	@SharedFunc
	public MetaVarAngle __add(MetaVarAngle rhsVar){return null;};
	/**
	Compares the 2 angles and returns whenever pitch, yaw and roll are equal.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean __eq(MetaVarAngle rhsVar){return null;};
	/**
	Overridden by the engine in order to clean up the angle object.
	*/
	@External
	@SharedFunc
	public MetaVar __gc(){return null;};
	/**
	Overridden by the engine in order to let you access the p, y and r members, it returns nil for any other index.
	*/
	@External
	@SharedFunc
	public MetaVarNumber __index(MetaVarString memberVar){return null;};
	/**
	Multiplies pitch, yaw and roll with the given value and returns a new angle as result, any other type will cause the resulting angle to have pitch, yaw and roll to be set to 0.
	*/
	@External
	@SharedFunc
	public MetaVarAngle __mul(MetaVarNumber rhsVar){return null;};
	/**
	Overridden by the engine in order to let you access the p, y and r members.
	*/
	@External
	@SharedFunc
	public MetaVar __newindex(MetaVarString memberVar,MetaVarNumber valueVar){return null;};
	/**
	Subtracts the rhs's value from the first angle, returns the result angle.
	*/
	@External
	@SharedFunc
	public MetaVarAngle __sub(MetaVarAngle rhsVar){return null;};
	/**
	Called whenever <a href="http://wiki.garrysmod.com/page/Global/tostring" title="Global/tostring">tostring</a> is used on an angle object, the output form is as following: "%.3f&#160;%.3f&#160;%.3f".
	*/
	@External
	@SharedFunc
	public MetaVarString __tostring(){return null;};
	/**
	Returns a new angle with all pitch, yaw and roll being negated.
	*/
	@External
	@SharedFunc
	public MetaVarAngle __unm(){return null;};
}
