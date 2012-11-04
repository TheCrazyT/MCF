package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("IMaterial")
public class MetaVarIMaterial extends MetaVarImpl implements IMetaVarAny{
	public MetaVarIMaterial(String n) {
		super(n);
	}
	/**
	Returns the color of the specified pixel, only works for materials created from PNG files.
	*/
	@External
	@SharedFunc
	public MetaVar GetColor(MetaVarNumber xVar,MetaVarNumber yVar){return null;};
	/**
	Returns the specified material value as a float, or nil if the value is not set.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetFloat(MetaVarString materialFloatVar){return null;};
	/**
	Returns the specified material value as a int, rounds the value if its a float, or nil if the value is not set.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetInt(MetaVarString materialIntVar){return null;};
	/**
	Returns the specified material matrix as a int, or nil if the value is not set or is not a matrix.
	*/
	@External
	@SharedFunc
	public MetaVarVMatrix GetMatrix(MetaVarString materialMatrixVar){return null;};
	/**
	Returns the specified material string, or nil if the value is not set or if the value can not be converted to a string.
	*/
	@External
	@SharedFunc
	public MetaVarString GetString(MetaVarString materialStringVar){return null;};
	/**
	Returns the specified material string, or nil if the value is not set.
	*/
	@External
	@SharedFunc
	public MetaVarITexture GetTexture(MetaVarString materialTextureVar){return null;};
	/**
	Returns the specified material vector, or nil if the value is not set.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetVector(MetaVarString materialVectorVar){return null;};
	/**
	Returns the name of the material, in most cases the path.
	*/
	//public MetaVarString GetName(){return null;};
	/**
	Returns the name of the materials shader.
	*/
	@External
	@SharedFunc
	public MetaVarString GetShader(){return null;};
	/**
	Returns the height of the member texture set for $basetexture.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Height(){return null;};
	/**
	Returns whenever the material was not loaded successfully.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean SetUndefined(){return null;};
	/**
	Sets the specified material float to the specified float, does nothing on a type mismatch.
	*/
	@External
	@SharedFunc
	public MetaVar SetFloat(MetaVarString materialFloatVar,MetaVarNumber floatVar){return null;};
	/**
	Sets the specified material value to the specified int, does nothing on a type mismatch.
	*/
	@External
	@SharedFunc
	public MetaVar SetInt(MetaVarString materialIntVar,MetaVarNumber intVar){return null;};
	/**
	Sets the specified material value to the specified matrix, does nothing on a type mismatch.
	*/
	@External
	@SharedFunc
	public MetaVar SetMatrix(MetaVarString materialMatrixVar,MetaVarVMatrix matrixVar){return null;};
	/**
	Sets the specified material value to the specified string, does nothing on a type mismatch.
	*/
	@External
	@SharedFunc
	public MetaVar SetString(MetaVarString materialStringVar,MetaVarString stringVar){return null;};
	/**
	Sets the specified material texture to the specified texture, does nothing on a type mismatch.
	*/
	@External
	@SharedFunc
	public MetaVar SetTexture(MetaVarString materialTextureVar,MetaVarITexture textureVar){return null;};
	/**
	Sets the specified material vector to the specified vector, does nothing on a type mismatch.
	*/
	@External
	@SharedFunc
	public MetaVar SetVector(MetaVarString MaterialVectorVar,MetaVarVector vecVar){return null;};
	/**
	Sets the shader of the material to the specified value, uses fallback if shader does not exist.
	*/
	@External
	@SharedFunc
	public MetaVar SetShader(MetaVarString shaderNameVar){return null;};
	/**
	Returns the width of the member texture set for $basetexture.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Width(){return null;};
	/**
	Called whenever <a href="http://wiki.garrysmod.com/page/Global/tostring" title="Global/tostring">tostring</a> is used on an IMaterial object, the returned value will equal the name of the material or, ___error if the IMaterial is invalid.
	*/
	@External
	@SharedFunc
	public MetaVarString __tostring(){return null;};
}
