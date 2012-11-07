package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("CSEnt")
public class MetaVarCSEntImpl extends MetaVarImpl implements MetaVarCSEnt{
	public MetaVarCSEntImpl(String n) {
		super(n);
	}
}
