package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("draw")
public class LibDraw{
	/**
	Creates a simple text
	*/
	@External
	@ClientFunc
	public MetaVar SimpleText(MetaVarString TextVar,MetaVarString fontVar,MetaVarNumber xVar,MetaVarNumber yVar,MetaVarColor colorVar,MetaVarNumber alignXVar,MetaVarNumber alignYVar){return null;};
}
