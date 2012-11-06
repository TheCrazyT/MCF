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
import com.crazyt.mcf.BasicFunctions;
import com.crazyt.mcf.BuildClass;
@External
@Library("draw")
public class LibDraw extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibDraw(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Creates a simple text
	*/
	@External
	@ClientFunc
	public MetaVar SimpleText(MetaVarString TextVar,MetaVarString fontVar,MetaVarNumber xVar,MetaVarNumber yVar,MetaVarColor colorVar,MetaVarNumber alignXVar,MetaVarNumber alignYVar){return null;};
}
