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
@Library("markup")
public class LibMarkup extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibMarkup(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Parses markup into a <a href="http://wiki.garrysmod.com/page/Classes/MarkupObject" title="Classes/MarkupObject">MarkupObject</a>.
	*/
	@External
	@ClientFunc
	public MetaVarMarkupObject Parse(MetaVarString markupVar,MetaVarNumber maxwidthVar){return null;};
}
