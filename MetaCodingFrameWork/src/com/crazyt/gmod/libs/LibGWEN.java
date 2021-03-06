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
@External
@Library("GWEN")
public class LibGWEN{
	/**
	When used in a material skin, it returns a color value from a point in the skin image.
	*/
	@External
	@ClientFunc
	public MetaVarColor TextureColor(MetaVarNumber xVar,MetaVarNumber yVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
