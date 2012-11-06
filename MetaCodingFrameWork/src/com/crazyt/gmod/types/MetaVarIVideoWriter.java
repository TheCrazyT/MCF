package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("IVideoWriter")
public class MetaVarIVideoWriter extends MetaVarImpl implements IMetaVarAny{
	public MetaVarIVideoWriter(String n) {
		super(n);
	}
	/**
	Adds the current framebuffer to the video stream.
	*/
	//public MetaVar Add(MetaVarNumber frameTimeVar,MetaVarBoolean downsampleVar){return null;};
	/**
	Ends the video recording and dumps it to disk.
	*/
	@External
	@ClientFunc
	public MetaVar Finish(){return null;};
	/**
	Returns the height of the video stream.
	*/
	@External
	@ClientFunc
	public MetaVarNumber Height(){return null;};
	/**
	Sets whenever to record sound or not.
	*/
	@External
	@ClientFunc
	public MetaVar SetRecordSound(MetaVarBoolean recordVar){return null;};
	/**
	Returns the width of the video stream.
	*/
	@External
	@ClientFunc
	public MetaVarNumber Width(){return null;};
	/**
	Overridden by the engine in order to clean up the IVideoWriter object, if the writes gets garbage collected the video recording will be aborted.
	*/
	@External
	@ClientFunc
	public MetaVar __gc(){return null;};
}
