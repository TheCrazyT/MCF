package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("SoundData")
public class MetaVarSoundData extends MetaVarImpl implements IMetaVarAny{
	public MetaVarSoundData(String n) {
		super(n);
	}
}
