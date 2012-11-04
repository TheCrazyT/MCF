package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("VMatrix")
public class MetaVarVMatrix extends MetaVarImpl implements IMetaVarAny{
	public MetaVarVMatrix(String n) {
		super(n);
	}
	/**
	Returns the absolute rotation of the matrix.
	*/
	@External
	@SharedFunc
	public MetaVarAngle GetAngles(){return null;};
	/**
	Returns the absolute scale of the matrix.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetScale(){return null;};
	/**
	Returns the absolute translation of the matrix.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetTranslation(){return null;};
	/**
	Rotates the matrix by the given angle.
	*/
	@External
	@SharedFunc
	public MetaVar Rotate(MetaVarAngle rotationVar){return null;};
	/**
	Scales the matrix by the given vector.
	*/
	@External
	@SharedFunc
	public MetaVar Scale(MetaVarVector scaleVar){return null;};
	/**
	Scales the absolute translation with the given value.
	*/
	@External
	@SharedFunc
	public MetaVar ScaleTranslation(MetaVarNumber scaleVar){return null;};
	/**
	Sets the absolute rotation of the matrix.
	*/
	@External
	@SharedFunc
	public MetaVar SetAngles(MetaVarAngle angleVar){return null;};
	/**
	Sets the absolute translation of the matrix.
	*/
	@External
	@SharedFunc
	public MetaVar SetTranslation(MetaVarVector translationVar){return null;};
	/**
	Translates the matrix by the given vector aka. adds the vector to the translation.
	*/
	@External
	@SharedFunc
	public MetaVar Translate(MetaVarVector translationVar){return null;};
	/**
	Performs a matrix multiplication and return the result matrix.
	*/
	@External
	@SharedFunc
	public MetaVarVMatrix __mul(MetaVarVMatrix rhsVar){return null;};
}
