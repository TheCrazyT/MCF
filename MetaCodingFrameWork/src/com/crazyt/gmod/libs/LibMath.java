package com.crazyt.gmod.libs;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Library;
import com.crazyt.mcf.BasicFunctions;
import com.crazyt.mcf.BuildClass;
@External
@Library("math")
public class LibMath extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibMath(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Calculates the absolute value of a number (effectively removes any negative sign).
	*/
	@External
	@SharedFunc
	public MetaVarNumber abs(MetaVarNumber xVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the arc cosine of the given number.
	*/
	@External
	@SharedFunc
	public MetaVarNumber acos(MetaVarNumber normalVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Calculates the difference between two angles
	*/
	@External
	@SharedFunc
	public MetaVarNumber AngleDifference(MetaVarNumber aVar,MetaVarNumber bVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Increments a value from a start point by the given amount, up to a given upper limit.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Approach(MetaVarNumber startVar,MetaVarNumber endVar,MetaVarNumber amountVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the arc sine of the given number.
	*/
	@External
	@SharedFunc
	public MetaVarNumber asin(MetaVarNumber normalVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the atan2 of the specified values.
	*/
	@External
	@SharedFunc
	public MetaVarNumber atan2(MetaVarNumber xVar,MetaVarNumber yVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the arc tangents of the given number.
	*/
	@External
	@SharedFunc
	public MetaVarNumber atan(MetaVarNumber normalVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Ceils or rounds a number up.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ceil(MetaVarNumber numberVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Clamps a number between a minimum and maximum value
	*/
	@External
	@SharedFunc
	public MetaVarNumber Clamp(MetaVarNumber inputVar,MetaVarNumber minVar,MetaVarNumber maxVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns hyperbolic cosine of the given number.
	*/
	@External
	@SharedFunc
	public MetaVarNumber cosh(MetaVarNumber numberVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns cosine of given angle.
	*/
	@External
	@SharedFunc
	public MetaVarNumber cos(MetaVarNumber numberVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Converts radians to degrees.
	*/
	@External
	@SharedFunc
	public MetaVarNumber deg(MetaVarNumber radiansVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Calculates the distance between two points in 2D.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Distance(MetaVarNumber x1Var,MetaVarNumber y1Var,MetaVarNumber x2Var,MetaVarNumber y2Var){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the x power of the euler constant.
	*/
	@External
	@SharedFunc
	public MetaVarNumber exp(MetaVarNumber exponentVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Floors or rounds a number down.
	*/
	@External
	@SharedFunc
	public MetaVarNumber floor(MetaVarNumber numberVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the modulus of the specified values.
	*/
	@External
	@SharedFunc
	public MetaVarNumber fmod(MetaVarNumber lhsVar,MetaVarNumber rhsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	used to split the number value into a normalized fraction and an exponent. Two values are returned: the first is a value always in the range 1/2 (inclusive) to 1 (exclusive) and the second is an exponent.
	*/
	@External
	@SharedFunc
	public MetaVarNumber frexp(MetaVarNumber inputValueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Takes a normalised number and returns the floating point representation.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ldexp(MetaVarNumber normalizedFractionVar,MetaVarNumber exponentVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the the given exponent for the base 10.
	*/
	@External
	@SharedFunc
	public MetaVar log10(MetaVarNumber valueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the the given exponent for the base e.
	*/
	@External
	@SharedFunc
	public MetaVar log(MetaVarNumber valueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the largest value of all arguments.
	*/
	@External
	@SharedFunc
	public MetaVarNumber max(MetaVarVararg numbersVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the smallest value of all arguments.
	*/
	@External
	@SharedFunc
	public MetaVarNumber min(MetaVarVararg numbersVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the integral and fractional component of the modulo operation.
	*/
	@External
	@SharedFunc
	public MetaVarNumber modf(MetaVarNumber baseVar,MetaVarNumber modulatorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the y power of x.
	*/
	@External
	@SharedFunc
	public MetaVarNumber pow(MetaVarNumber xVar,MetaVarNumber yVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Converts an angle in degrees to it's equivalent in radians.
	*/
	@External
	@SharedFunc
	public MetaVarNumber rad(MetaVarNumber degreesVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Seeds the "seed" for the random generator, which will cause <a href="http://wiki.garrysmod.com/page/Libraries/math" title="Libraries/math">math</a>.<a href="http://wiki.garrysmod.com/page/Libraries/math/random" title="Libraries/math/random">random</a> to return the same sequence of numbers.
	*/
	@External
	@SharedFunc
	public MetaVar randomseed(MetaVarNumber seedVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	If no value is specified, a random float value between 0-1 will be returned, if the first value is specified, a integer value between 1 and the specified value will be returned, if both values are specified, a integer value between the first and the second value will be returned, all inputs are rounded.
If the first value is larger as the second value an error like:
<b>bad argument #2 to 'random' (interval is empty)</b>
will be thrown.
	*/
	@External
	@SharedFunc
	public MetaVarNumber random(MetaVarNumber limitOrLimitStartVar,MetaVarNumber limitVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a random float between min and max
	*/
	@External
	@SharedFunc
	public MetaVarNumber Rand(MetaVarNumber minVar,MetaVarNumber maxVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns hyperbolic sine of the given number.
	*/
	@External
	@SharedFunc
	public MetaVarNumber sinh(MetaVarNumber numberVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns sine of given angle.
	*/
	@External
	@SharedFunc
	public MetaVarNumber sin(MetaVarNumber numberVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the square root of the number.
	*/
	@External
	@SharedFunc
	public MetaVarNumber sqrt(MetaVarNumber valueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns hyperbolic tangents of the given number.
	*/
	@External
	@SharedFunc
	public MetaVarNumber tanh(MetaVarNumber numberVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns tangents of given angle.
	*/
	@External
	@SharedFunc
	public MetaVarNumber tan(MetaVarNumber valueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
