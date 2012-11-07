package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarStringImpl.class)
public interface MetaVarString extends com.crazyt.mcf.MetaVar,com.crazyt.mcf.MetaVarString,com.crazyt.gmod.types.MetaVarVararg,IMetaVarAny{ //,IMetaVarAny{
}
