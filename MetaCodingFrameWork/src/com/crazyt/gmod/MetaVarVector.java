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
	private MetaVarNumber z;
	@SimpleName("z")
	public MetaVarNumber getZ(){ return z;}
	@SimpleName("z")
	public void setZ(MetaVarNumber value){ z=value;}
	public MetaVarVector(String n) {
		super(n);
	}
	/**
	Translates the vectors position into 2D user screen coordinates.
	*/
	@External
	@ClientFunc
	public MetaVar ToScreen(){return null;};
	/**
	Adds the values of the second vector to the orignal vector, this function can be used to avoid garbage collection.
	*/
	//public MetaVar Add(MetaVarVector vectorVar){return null;};
	/**
	Returns an angle representing the normal of the vector.
	*/
	@External
	@SharedFunc
	public MetaVarAngle Angle(){return null;};
	/**
	Calculates the cross product of the 2 vectors(the vectors that defined the normal created by the 2 vectors).
	*/
	@External
	@SharedFunc
	public MetaVarVector Cross(MetaVarVector otherVectorVar){return null;};
	/**
	Returns the squared distance of 2 vectors, this is faster as calculating the square root is an expensive process.
	*/
	@External
	@SharedFunc
	public MetaVarNumber DistToSqr(MetaVarVector otherVecVar){return null;};
	/**
	Returns the pythagorean distance between the vector and the other vector.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean Distance(MetaVarVector otherVectorVar){return null;};
	/**
	Returns the dot product of the two vectors.
	*/
	@External
	@SharedFunc
	public MetaVarNumber DotProduct(MetaVarVector VectorVar){return null;};
	/**
	Returns a normalized version of the vector.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetNormalized(){return null;};
	/**
	Returns a normalized version of the vector.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetNormal(){return null;};
	/**
	Returns if the vector is equal to another vector with the given tolerance.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsEqualTol(MetaVarVector compareVar,MetaVarNumber toleranceVar){return null;};
	/**
	Checks whenever all fields of the vector are 0.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsZero(){return null;};
	/**
	Returns the squared length of the vectors x and y value, this is faster as calculating the square root is an expensive process.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Length2DSqr(){return null;};
	/**
	Returns the length of the vector.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Length2D(){return null;};
	/**
	Returns the squared length of the vector, this is faster than <a href="http://wiki.garrysmod.com/page/Classes/Vector" title="Classes/Vector">Vector</a>:<a href="http://wiki.garrysmod.com/page/Classes/Vector/Length" title="Classes/Vector/Length">Length</a> as calculating the square root is an expensive process.
	*/
	@External
	@SharedFunc
	public MetaVarNumber LengthSqr(){return null;};
	/**
	Returns the pythagorean length of the vector.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Length(){return null;};
	/**
	Scales the vector by the given number, that means x, y and z are multiplied by that value.
	*/
	@External
	@SharedFunc
	public MetaVar Mul(MetaVarNumber multiplierVar){return null;};
	/**
	Normalizes the given vector.
	*/
	@External
	@SharedFunc
	public MetaVar Normalize(){return null;};
	/**
	Returns a the vector rotated by the given angle.
	*/
	@External
	@SharedFunc
	public MetaVarVector Rotate(MetaVarAngle rotationVar){return null;};
	/**
	Copies the values from the second vector to the first vector.
	*/
	@External
	@SharedFunc
	public MetaVar Set(MetaVarVector vectorVar){return null;};
	/**
	Substracts the values of the second vector from the orignal vector, this function can be used to avoid garbage collection.
	*/
	@External
	@SharedFunc
	public MetaVar Sub(MetaVarVector vectorVar){return null;};
	/**
	Returns whenever the given vector is in a box created by the 2 other vectors.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean WithinAABox(MetaVarVector boxStartVar,MetaVarVector boxEndVar){return null;};
	/**
	Sets x, y and z to 0.
	*/
	@External
	@SharedFunc
	public MetaVar Zero(){return null;};
	/**
	Adds 2 vectors and returns the result as a new vector.
	*/
	@External
	@SharedFunc
	public MetaVarVector __add(MetaVarVector rhsVar){return null;};
	/**
	Divides the vectors values by the given divisor and returns the result as a new vector.
	*/
	@External
	@SharedFunc
	public MetaVarVector __div(MetaVarNumber rhsVar){return null;};
	/**
	Checks if x, y and z of both vectors match, returns false for everything else.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean __eq(MetaVarVector rhsVar){return null;};
	/**
	Overridden by the engine in order to clean up the vector object.
	*/
	@External
	@SharedFunc
	public MetaVar __gc(){return null;};
	/**
	Overridden by the engine in order to let you access the x, y and z members, it returns nil for any other index.
	*/
	@External
	@SharedFunc
	public MetaVarNumber __index(MetaVarString memberVar){return null;};
	/**
	Multiplies x, y and z with the given value and returns a new vector as result, you can also multiply with a vector, in that case each member will be multiplied with the fitting member.
	*/
	@External
	@SharedFunc
	public MetaVarVector __mul(){return null;};
	/**
	Overridden by the engine in order to let you access the x, y and z members.
	*/
	@External
	@SharedFunc
	public MetaVar __newindex(MetaVarNumber valueVar){return null;};
	/**
	Subtracts the rhs's value from the first vector, returns the result vector.
	*/
	@External
	@SharedFunc
	public MetaVarVector __sub(MetaVarVector rhsVar){return null;};
	/**
	Called whenever <a href="http://wiki.garrysmod.com/page/Global/tostring" title="Global/tostring">tostring</a> is used on a vector object, the output form is as following: "%.6f&#160;%.6f&#160;%.6f".
	*/
	@External
	@SharedFunc
	public MetaVar __tostring(){return null;};
	/**
	Returns a new vector with all x, y and z being negated.
	*/
	@External
	@SharedFunc
	public MetaVarVector __unm(){return null;};
}
