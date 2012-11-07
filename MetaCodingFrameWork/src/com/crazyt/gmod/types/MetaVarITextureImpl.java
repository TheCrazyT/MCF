package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("ITexture")
public class MetaVarITextureImpl extends MetaVarImpl implements MetaVarITexture{
	/**
	Invokes the generator of the texture.
	*/
	@External
	@SharedFunc
	public MetaVar Download(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the color of the specified pixel, only works for textures created from PNG files.
	*/
	@External
	@SharedFunc
	public MetaVar GetColor(MetaVarNumber xVar,MetaVarNumber yVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the true unmodified height of the texture.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMappingHeight(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the true unmodified width of the texture.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMappingWidth(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the name of the texture, in most cases the path.
	*/
	//public MetaVarString GetName(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the modified height of the texture, this value may be affected by mipmapping and other factors.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Height(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the texture is invalid or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsError(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the modified width of the texture, this value may be affected by mipmapping and other factors.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Width(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarITextureImpl(String n) {
		super(n);
	}
}
