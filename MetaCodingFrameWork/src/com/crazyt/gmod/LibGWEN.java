package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("GWEN")
public class LibGWEN{
	/**
	When used in a material skin, it returns a color value from a point in the skin image.
	*/
	@External
	@ClientFunc
	public MetaVar TextureColor(MetaVarNumber xVar,MetaVarNumber yVar){return null;};
}
