package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("markup")
public class LibMarkup{
	/**
	Parses markup into a <a href="http://wiki.garrysmod.com/page/Classes/MarkupObject" title="Classes/MarkupObject">MarkupObject</a>.
	*/
	@External
	@ClientFunc
	public MetaVarMarkupObject Parse(MetaVarString markupVar,MetaVarNumber maxwidthVar){return null;};
}
