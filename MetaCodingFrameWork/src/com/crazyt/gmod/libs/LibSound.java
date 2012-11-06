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
import com.crazyt.mcf.BasicFunctions;
import com.crazyt.mcf.BuildClass;
@External
@Library("sound")
public class LibSound extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibSound(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Creates a sound.
	*/
	@External
	@SharedFunc
	public MetaVar Add(MetaVarSoundData sound_dataVar){return null;};
	/**
	Plays a sound from the specified position in the world.
	*/
	@External
	@SharedFunc
	public MetaVar Play(MetaVarString NameVar,MetaVarVector PosVar,MetaVarNumber LevelVar,MetaVarNumber PitchVar,MetaVarNumber VolumeVar){return null;};
}
