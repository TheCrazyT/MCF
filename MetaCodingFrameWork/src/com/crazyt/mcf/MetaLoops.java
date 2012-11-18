package com.crazyt.mcf;

public interface MetaLoops {
	public abstract MetaLoopDo  forCmd(MetaVarInt v, MetaVarInt from,
			MetaVarInt to);
	
	public abstract MetaLoopDo  forCmd(MetaVarInt v, Integer from,
			Integer to);

	public abstract MetaLoopDo forPair(MetaVar v1,MetaVar v2,MetaVarTable table);
}
