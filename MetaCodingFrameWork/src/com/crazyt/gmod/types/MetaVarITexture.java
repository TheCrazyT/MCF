package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarITextureImpl.class)
public interface MetaVarITexture extends MetaVar,IMetaVarAny{
	/**
	Invokes the generator of the texture.
	*/
	@External
	@SharedFunc
	public MetaVar Download();
	/**
	Returns the color of the specified pixel, only works for textures created from PNG files.
	*/
	@External
	@SharedFunc
	public MetaVarColor GetColor(MetaVarNumber xVar,MetaVarNumber yVar);
	/**
	Returns the true unmodified height of the texture.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMappingHeight();
	/**
	Returns the true unmodified width of the texture.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMappingWidth();
	/**
	Returns the name of the texture, in most cases the path.
	*/
	//public MetaVarString GetName();
	/**
	Returns the modified height of the texture, this value may be affected by mipmapping and other factors.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Height();
	/**
	Returns whenever the texture is invalid or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsError();
	/**
	Returns the modified width of the texture, this value may be affected by mipmapping and other factors.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Width();
}
