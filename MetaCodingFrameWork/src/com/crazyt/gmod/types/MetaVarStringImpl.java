package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("string")
public class MetaVarStringImpl extends com.crazyt.mcf.MetaVarStringImpl implements MetaVarString{
	public MetaVarStringImpl(String n) {
		super(n);
	}
}
