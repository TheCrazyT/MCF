package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarIVideoWriterImpl.class)
public interface MetaVarIVideoWriter extends MetaVar,IMetaVarAny{
	/**
	Adds the current framebuffer to the video stream.
	*/
	@External
	@ClientFunc
	public MetaVar Add(MetaVarNumber frameTimeVar,MetaVarBoolean downsampleVar);
	/**
	Ends the video recording and dumps it to disk.
	*/
	@External
	@ClientFunc
	public MetaVar Finish();
	/**
	Returns the height of the video stream.
	*/
	@External
	@ClientFunc
	public MetaVarNumber Height();
	/**
	Sets whenever to record sound or not.
	*/
	@External
	@ClientFunc
	public MetaVar SetRecordSound(MetaVarBoolean recordVar);
	/**
	Returns the width of the video stream.
	*/
	@External
	@ClientFunc
	public MetaVarNumber Width();
	/**
	Overridden by the engine in order to clean up the IVideoWriter object, if the writes gets garbage collected the video recording will be aborted.
	*/
	@External
	@ClientFunc
	public MetaVar __gc();
}
