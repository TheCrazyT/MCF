package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Library;
import com.crazyt.mcf.BasicFunctions;
import com.crazyt.mcf.BuildClass;
@External
@Library("GWEN")
public class LibGWEN extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibGWEN(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	When used in a material skin, it returns a color value from a point in the skin image.
	*/
	@External
	@ClientFunc
	public MetaVar TextureColor(MetaVarNumber xVar,MetaVarNumber yVar){return null;};
}
