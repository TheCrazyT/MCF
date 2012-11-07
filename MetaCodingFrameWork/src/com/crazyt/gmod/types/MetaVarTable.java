package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarTableImpl.class)
public interface MetaVarTable extends com.crazyt.mcf.MetaVarTable,IMetaVarAny{
}
