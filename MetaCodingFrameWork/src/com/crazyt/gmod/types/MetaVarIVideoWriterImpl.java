package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("IVideoWriter")
public class MetaVarIVideoWriterImpl extends MetaVarImpl implements MetaVarIVideoWriter{
	/**
	Adds the current framebuffer to the video stream.
	*/
	@External
	@ClientFunc
	public MetaVar Add(MetaVarNumber frameTimeVar,MetaVarBoolean downsampleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Ends the video recording and dumps it to disk.
	*/
	@External
	@ClientFunc
	public MetaVar Finish(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the height of the video stream.
	*/
	@External
	@ClientFunc
	public MetaVarNumber Height(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets whenever to record sound or not.
	*/
	@External
	@ClientFunc
	public MetaVar SetRecordSound(MetaVarBoolean recordVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the width of the video stream.
	*/
	@External
	@ClientFunc
	public MetaVarNumber Width(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Overridden by the engine in order to clean up the IVideoWriter object, if the writes gets garbage collected the video recording will be aborted.
	*/
	@External
	@ClientFunc
	public MetaVar __gc(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarIVideoWriterImpl(String n) {
		super(n);
	}
}
