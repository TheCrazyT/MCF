package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("VideoData")
public class MetaVarVideoData extends MetaVarImpl implements IMetaVarAny{
	private MetaVarString container;
	@SimpleName("container")
	public MetaVarString getContainer(){ return container;}
	@SimpleName("container")
	public void setContainer(MetaVarString value){ container=value;}
	private MetaVarString video;
	@SimpleName("video")
	public MetaVarString getVideo(){ return video;}
	@SimpleName("video")
	public void setVideo(MetaVarString value){ video=value;}
	private MetaVarString audio;
	@SimpleName("audio")
	public MetaVarString getAudio(){ return audio;}
	@SimpleName("audio")
	public void setAudio(MetaVarString value){ audio=value;}
	private MetaVarNumber quality;
	@SimpleName("quality")
	public MetaVarNumber getQuality(){ return quality;}
	@SimpleName("quality")
	public void setQuality(MetaVarNumber value){ quality=value;}
	private MetaVarNumber bitrate;
	@SimpleName("bitrate")
	public MetaVarNumber getBitrate(){ return bitrate;}
	@SimpleName("bitrate")
	public void setBitrate(MetaVarNumber value){ bitrate=value;}
	private MetaVarNumber fps;
	@SimpleName("fps")
	public MetaVarNumber getFps(){ return fps;}
	@SimpleName("fps")
	public void setFps(MetaVarNumber value){ fps=value;}
	private MetaVarString name;
	@SimpleName("name")
	public MetaVarString getName(){ return name;}
	@SimpleName("name")
	public void setName(MetaVarString value){ name=value;}
	private MetaVarNumber width;
	@SimpleName("width")
	public MetaVarNumber getWidth(){ return width;}
	@SimpleName("width")
	public void setWidth(MetaVarNumber value){ width=value;}
	private MetaVarNumber height;
	@SimpleName("height")
	public MetaVarNumber getHeight(){ return height;}
	@SimpleName("height")
	public void setHeight(MetaVarNumber value){ height=value;}
	public MetaVarVideoData(String n) {
		super(n);
	}
}
