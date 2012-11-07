package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarVMatrixImpl.class)
public interface MetaVarVMatrix extends MetaVar,IMetaVarAny{
	/**
	Returns the absolute rotation of the matrix.
	*/
	@External
	@SharedFunc
	public MetaVarAngle GetAngles();
	/**
	Returns the absolute scale of the matrix.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetScale();
	/**
	Returns the absolute translation of the matrix.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetTranslation();
	/**
	Rotates the matrix by the given angle.
	*/
	@External
	@SharedFunc
	public MetaVar Rotate(MetaVarAngle rotationVar);
	/**
	Scales the matrix by the given vector.
	*/
	@External
	@SharedFunc
	public MetaVar Scale(MetaVarVector scaleVar);
	/**
	Scales the absolute translation with the given value.
	*/
	@External
	@SharedFunc
	public MetaVar ScaleTranslation(MetaVarNumber scaleVar);
	/**
	Sets the absolute rotation of the matrix.
	*/
	@External
	@SharedFunc
	public MetaVar SetAngles(MetaVarAngle angleVar);
	/**
	Sets the absolute translation of the matrix.
	*/
	@External
	@SharedFunc
	public MetaVar SetTranslation(MetaVarVector translationVar);
	/**
	Translates the matrix by the given vector aka. adds the vector to the translation.
	*/
	@External
	@SharedFunc
	public MetaVar Translate(MetaVarVector translationVar);
	/**
	Performs a matrix multiplication and return the result matrix.
	*/
	@External
	@SharedFunc
	public MetaVarVMatrix __mul(MetaVarVMatrix rhsVar);
}
