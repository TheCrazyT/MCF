package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("SoundData")
public class MetaVarSoundDataImpl extends MetaVarImpl implements MetaVarSoundData{
	public MetaVarSoundDataImpl(String n) {
		super(n);
	}
}
