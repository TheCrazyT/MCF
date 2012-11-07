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
@Library("markup")
public class LibMarkup{
	/**
	Parses markup into a <a href="http://wiki.garrysmod.com/page/Classes/MarkupObject" title="Classes/MarkupObject">MarkupObject</a>.
	*/
	@External
	@ClientFunc
	public MetaVarMarkupObject Parse(MetaVarString markupVar,MetaVarNumber maxwidthVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
