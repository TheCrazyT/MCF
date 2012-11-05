package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("table")
public class MetaVarTable extends com.crazyt.mcf.MetaVarTableImpl implements IMetaVarAny{
	public MetaVarTable(String n) {
		super(n);
	}
}
