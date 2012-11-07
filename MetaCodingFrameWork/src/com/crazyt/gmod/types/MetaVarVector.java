package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarVectorImpl.class)
public interface MetaVarVector extends MetaVar,IMetaVarAny{
	@SimpleName("x")
	public MetaVarNumber getX();
	@SimpleName("x")
	public void setX(MetaVarNumber value);
	@SimpleName("y")
	public MetaVarNumber getY();
	@SimpleName("y")
	public void setY(MetaVarNumber value);
	@SimpleName("z")
	public MetaVarNumber getZ();
	@SimpleName("z")
	public void setZ(MetaVarNumber value);
	/**
	Translates the vectors position into 2D user screen coordinates.
	*/
	@External
	@ClientFunc
	public MetaVar ToScreen();
	/**
	Adds the values of the second vector to the orignal vector, this function can be used to avoid garbage collection.
	*/
	@External
	@SharedFunc
	public MetaVar Add(MetaVarVector vectorVar);
	/**
	Returns an angle representing the normal of the vector.
	*/
	@External
	@SharedFunc
	public MetaVarAngle Angle();
	/**
	Calculates the cross product of the 2 vectors(the vectors that defined the normal created by the 2 vectors).
	*/
	@External
	@SharedFunc
	public MetaVarVector Cross(MetaVarVector otherVectorVar);
	/**
	Returns the squared distance of 2 vectors, this is faster as calculating the square root is an expensive process.
	*/
	@External
	@SharedFunc
	public MetaVarNumber DistToSqr(MetaVarVector otherVecVar);
	/**
	Returns the pythagorean distance between the vector and the other vector.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean Distance(MetaVarVector otherVectorVar);
	/**
	Returns the dot product of the two vectors.
	*/
	@External
	@SharedFunc
	public MetaVarNumber DotProduct(MetaVarVector VectorVar);
	/**
	Returns a normalized version of the vector.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetNormalized();
	/**
	Returns a normalized version of the vector.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetNormal();
	/**
	Returns if the vector is equal to another vector with the given tolerance.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsEqualTol(MetaVarVector compareVar,MetaVarNumber toleranceVar);
	/**
	Checks whenever all fields of the vector are 0.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsZero();
	/**
	Returns the squared length of the vectors x and y value, this is faster as calculating the square root is an expensive process.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Length2DSqr();
	/**
	Returns the length of the vector.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Length2D();
	/**
	Returns the squared length of the vector, this is faster than <a href="http://wiki.garrysmod.com/page/Classes/Vector" title="Classes/Vector">Vector</a>:<a href="http://wiki.garrysmod.com/page/Classes/Vector/Length" title="Classes/Vector/Length">Length</a> as calculating the square root is an expensive process.
	*/
	@External
	@SharedFunc
	public MetaVarNumber LengthSqr();
	/**
	Returns the pythagorean length of the vector.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Length();
	/**
	Scales the vector by the given number, that means x, y and z are multiplied by that value.
	*/
	@External
	@SharedFunc
	public MetaVar Mul(MetaVarNumber multiplierVar);
	/**
	Normalizes the given vector.
	*/
	@External
	@SharedFunc
	public MetaVar Normalize();
	/**
	Returns a the vector rotated by the given angle.
	*/
	@External
	@SharedFunc
	public MetaVarVector Rotate(MetaVarAngle rotationVar);
	/**
	Copies the values from the second vector to the first vector.
	*/
	@External
	@SharedFunc
	public MetaVar Set(MetaVarVector vectorVar);
	/**
	Substracts the values of the second vector from the orignal vector, this function can be used to avoid garbage collection.
	*/
	@External
	@SharedFunc
	public MetaVar Sub(MetaVarVector vectorVar);
	/**
	Returns whenever the given vector is in a box created by the 2 other vectors.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean WithinAABox(MetaVarVector boxStartVar,MetaVarVector boxEndVar);
	/**
	Sets x, y and z to 0.
	*/
	@External
	@SharedFunc
	public MetaVar Zero();
	/**
	Adds 2 vectors and returns the result as a new vector.
	*/
	@External
	@SharedFunc
	public MetaVarVector __add(MetaVarVector rhsVar);
	/**
	Divides the vectors values by the given divisor and returns the result as a new vector.
	*/
	@External
	@SharedFunc
	public MetaVarVector __div(MetaVarNumber rhsVar);
	/**
	Checks if x, y and z of both vectors match, returns false for everything else.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean __eq(MetaVarVector rhsVar);
	/**
	Overridden by the engine in order to clean up the vector object.
	*/
	@External
	@SharedFunc
	public MetaVar __gc();
	/**
	Overridden by the engine in order to let you access the x, y and z members, it returns nil for any other index.
	*/
	@External
	@SharedFunc
	public MetaVarNumber __index(MetaVarString memberVar);
	/**
	Multiplies x, y and z with the given value and returns a new vector as result, you can also multiply with a vector, in that case each member will be multiplied with the fitting member.
	*/
	@External
	@SharedFunc
	public MetaVarVector __mul();
	/**
	Overridden by the engine in order to let you access the x, y and z members.
	*/
	@External
	@SharedFunc
	public MetaVar __newindex(MetaVarNumber valueVar);
	/**
	Subtracts the rhs's value from the first vector, returns the result vector.
	*/
	@External
	@SharedFunc
	public MetaVarVector __sub(MetaVarVector rhsVar);
	/**
	Called whenever <a href="http://wiki.garrysmod.com/page/Global/tostring" title="Global/tostring">tostring</a> is used on a vector object, the output form is as following: "%.6f&#160;%.6f&#160;%.6f".
	*/
	@External
	@SharedFunc
	public MetaVar __tostring();
	/**
	Returns a new vector with all x, y and z being negated.
	*/
	@External
	@SharedFunc
	public MetaVarVector __unm();
}
