package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarVideoDataImpl.class)
public interface MetaVarVideoData extends MetaVar,IMetaVarAny{
	@SimpleName("container")
	public MetaVarString getContainer();
	@SimpleName("container")
	public void setContainer(MetaVarString value);
	@SimpleName("video")
	public MetaVarString getVideo();
	@SimpleName("video")
	public void setVideo(MetaVarString value);
	@SimpleName("audio")
	public MetaVarString getAudio();
	@SimpleName("audio")
	public void setAudio(MetaVarString value);
	@SimpleName("quality")
	public MetaVarNumber getQuality();
	@SimpleName("quality")
	public void setQuality(MetaVarNumber value);
	@SimpleName("bitrate")
	public MetaVarNumber getBitrate();
	@SimpleName("bitrate")
	public void setBitrate(MetaVarNumber value);
	@SimpleName("fps")
	public MetaVarNumber getFps();
	@SimpleName("fps")
	public void setFps(MetaVarNumber value);
	@SimpleName("name")
	public MetaVarString getName();
	@SimpleName("name")
	public void setName(MetaVarString value);
	@SimpleName("width")
	public MetaVarNumber getWidth();
	@SimpleName("width")
	public void setWidth(MetaVarNumber value);
	@SimpleName("height")
	public MetaVarNumber getHeight();
	@SimpleName("height")
	public void setHeight(MetaVarNumber value);
}
