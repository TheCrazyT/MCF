package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("VMatrix")
public class MetaVarVMatrixImpl extends MetaVarImpl implements MetaVarVMatrix{
	/**
	Returns the absolute rotation of the matrix.
	*/
	@External
	@SharedFunc
	public MetaVarAngle GetAngles(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the absolute scale of the matrix.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetScale(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the absolute translation of the matrix.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetTranslation(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Rotates the matrix by the given angle.
	*/
	@External
	@SharedFunc
	public MetaVar Rotate(MetaVarAngle rotationVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Scales the matrix by the given vector.
	*/
	@External
	@SharedFunc
	public MetaVar Scale(MetaVarVector scaleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Scales the absolute translation with the given value.
	*/
	@External
	@SharedFunc
	public MetaVar ScaleTranslation(MetaVarNumber scaleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the absolute rotation of the matrix.
	*/
	@External
	@SharedFunc
	public MetaVar SetAngles(MetaVarAngle angleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the absolute translation of the matrix.
	*/
	@External
	@SharedFunc
	public MetaVar SetTranslation(MetaVarVector translationVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Translates the matrix by the given vector aka. adds the vector to the translation.
	*/
	@External
	@SharedFunc
	public MetaVar Translate(MetaVarVector translationVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Performs a matrix multiplication and return the result matrix.
	*/
	@External
	@SharedFunc
	public MetaVarVMatrix __mul(MetaVarVMatrix rhsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarVMatrixImpl(String n) {
		super(n);
	}
}
