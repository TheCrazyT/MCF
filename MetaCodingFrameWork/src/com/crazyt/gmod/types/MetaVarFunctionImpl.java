package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("function")
public class MetaVarFunctionImpl extends MetaVarImpl implements MetaVarFunction{
	public MetaVarFunctionImpl(String n) {
		super(n);
	}
}
