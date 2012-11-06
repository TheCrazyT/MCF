package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("boolean")
public class MetaVarBoolean extends com.crazyt.mcf.MetaVarBooleanImpl implements IMetaVarAny{
	public MetaVarBoolean(String n) {
		super(n);
	}
}
