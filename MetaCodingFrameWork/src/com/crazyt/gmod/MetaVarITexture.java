package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("ITexture")
public class MetaVarITexture extends MetaVarImpl implements IMetaVarAny{
	public MetaVarITexture(String n) {
		super(n);
	}
	/**
	Invokes the generator of the texture.
	*/
	@External
	@SharedFunc
	public MetaVar Download(){return null;};
	/**
	Returns the color of the specified pixel, only works for textures created from PNG files.
	*/
	@External
	@SharedFunc
	public MetaVar GetColor(MetaVarNumber xVar,MetaVarNumber yVar){return null;};
	/**
	Returns the true unmodified height of the texture.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMappingHeight(){return null;};
	/**
	Returns the true unmodified width of the texture.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMappingWidth(){return null;};
	/**
	Returns the name of the texture, in most cases the path.
	*/
	//public MetaVarString GetName(){return null;};
	/**
	Returns the modified height of the texture, this value may be affected by mipmapping and other factors.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Height(){return null;};
	/**
	Returns whenever the texture is invalid or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsError(){return null;};
	/**
	Returns the modified width of the texture, this value may be affected by mipmapping and other factors.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Width(){return null;};
}
