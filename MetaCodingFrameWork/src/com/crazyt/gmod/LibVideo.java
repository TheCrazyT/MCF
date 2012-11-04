package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("video")
public class LibVideo{
	/**
	Attempts to create an <a href="http://wiki.garrysmod.com/page/Classes/IVideoWriter" title="Classes/IVideoWriter">IVideoWriter</a>.
	*/
	@External
	@ClientFunc
	public MetaVarIVideoWriter Record(MetaVarVideoData configVar){return null;};
}
