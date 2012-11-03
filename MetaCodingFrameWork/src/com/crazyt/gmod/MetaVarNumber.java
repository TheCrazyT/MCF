package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("number")
public class MetaVarNumber extends com.crazyt.mcf.MetaVarInt implements IMetaVarAny{
	public MetaVarNumber(String n) {
		super(n);
	}
}
