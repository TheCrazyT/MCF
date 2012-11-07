package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("table")
public class MetaVarTableImpl extends MetaVarImpl implements MetaVarTable{
	public MetaVarTableImpl(String n) {
		super(n);
	}
}
