package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("IMaterial")
public class MetaVarIMaterialImpl extends MetaVarImpl implements MetaVarIMaterial{
	/**
	Returns the color of the specified pixel, only works for materials created from PNG files.
	*/
	@External
	@SharedFunc
	public MetaVarColor GetColor(MetaVarNumber xVar,MetaVarNumber yVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the specified material value as a float, or nil if the value is not set.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetFloat(MetaVarString materialFloatVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the specified material value as a int, rounds the value if its a float, or nil if the value is not set.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetInt(MetaVarString materialIntVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the specified material matrix as a int, or nil if the value is not set or is not a matrix.
	*/
	@External
	@SharedFunc
	public MetaVarVMatrix GetMatrix(MetaVarString materialMatrixVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the specified material string, or nil if the value is not set or if the value can not be converted to a string.
	*/
	@External
	@SharedFunc
	public MetaVarString GetString(MetaVarString materialStringVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the specified material string, or nil if the value is not set.
	*/
	@External
	@SharedFunc
	public MetaVarITexture GetTexture(MetaVarString materialTextureVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the specified material vector, or nil if the value is not set.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetVector(MetaVarString materialVectorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the name of the material, in most cases the path.
	*/
	//public MetaVarString GetName(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the name of the materials shader.
	*/
	@External
	@SharedFunc
	public MetaVarString GetShader(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the height of the member texture set for $basetexture.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Height(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the material was not loaded successfully.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean SetUndefined(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the specified material float to the specified float, does nothing on a type mismatch.
	*/
	@External
	@SharedFunc
	public MetaVar SetFloat(MetaVarString materialFloatVar,MetaVarNumber floatVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the specified material value to the specified int, does nothing on a type mismatch.
	*/
	@External
	@SharedFunc
	public MetaVar SetInt(MetaVarString materialIntVar,MetaVarNumber intVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the specified material value to the specified matrix, does nothing on a type mismatch.
	*/
	@External
	@SharedFunc
	public MetaVar SetMatrix(MetaVarString materialMatrixVar,MetaVarVMatrix matrixVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the specified material value to the specified string, does nothing on a type mismatch.
	*/
	@External
	@SharedFunc
	public MetaVar SetString(MetaVarString materialStringVar,MetaVarString stringVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the specified material texture to the specified texture, does nothing on a type mismatch.
	*/
	@External
	@SharedFunc
	public MetaVar SetTexture(MetaVarString materialTextureVar,MetaVarITexture textureVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the specified material vector to the specified vector, does nothing on a type mismatch.
	*/
	@External
	@SharedFunc
	public MetaVar SetVector(MetaVarString MaterialVectorVar,MetaVarVector vecVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the shader of the material to the specified value, uses fallback if shader does not exist.
	*/
	@External
	@SharedFunc
	public MetaVar SetShader(MetaVarString shaderNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the width of the member texture set for $basetexture.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Width(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Called whenever <a href="http://wiki.garrysmod.com/page/Global/tostring" title="Global/tostring">tostring</a> is used on an IMaterial object, the returned value will equal the name of the material or, ___error if the IMaterial is invalid.
	*/
	@External
	@SharedFunc
	public MetaVarString __tostring(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarIMaterialImpl(String n) {
		super(n);
	}
}
