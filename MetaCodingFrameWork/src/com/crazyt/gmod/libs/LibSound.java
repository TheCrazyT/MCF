package com.crazyt.gmod.libs;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Library;
@External
@Library("sound")
public class LibSound{
	/**
	Creates a sound.
	*/
	@External
	@SharedFunc
	public MetaVar Add(MetaVarSoundData sound_dataVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Plays a sound from the specified position in the world.
	*/
	@External
	@SharedFunc
	public MetaVar Play(MetaVarString NameVar,MetaVarVector PosVar,MetaVarNumber LevelVar,MetaVarNumber PitchVar,MetaVarNumber VolumeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
