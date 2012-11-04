package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("sound")
public class LibSound{
	/**
	Creates a sound.
	*/
	//public MetaVar Add(MetaVarSoundData sound_dataVar){return null;};
	/**
	Plays a sound from the specified position in the world.
	*/
	@External
	@SharedFunc
	public MetaVar Play(MetaVarString NameVar,MetaVarVector PosVar,MetaVarNumber LevelVar,MetaVarNumber PitchVar,MetaVarNumber VolumeVar){return null;};
}
