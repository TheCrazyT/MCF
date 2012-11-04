package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum MAT implements MetaVar {
MAT_ALIENFLESH("MAT_ALIENFLESH"),
MAT_ANTLION("MAT_ANTLION"),
MAT_BLOODYFLESH("MAT_BLOODYFLESH"),
MAT_CLIP("MAT_CLIP"),
MAT_COMPUTER("MAT_COMPUTER"),
MAT_CONCRETE("MAT_CONCRETE"),
MAT_DIRT("MAT_DIRT"),
MAT_EGGSHELL("MAT_EGGSHELL"),
MAT_FLESH("MAT_FLESH"),
MAT_FOLIAGE("MAT_FOLIAGE"),
MAT_GLASS("MAT_GLASS"),
MAT_GRATE("MAT_GRATE"),
MAT_METAL("MAT_METAL"),
MAT_PLASTIC("MAT_PLASTIC"),
MAT_SAND("MAT_SAND"),
MAT_SLOSH("MAT_SLOSH"),
MAT_TILE("MAT_TILE"),
MAT_VENT("MAT_VENT"),
MAT_WARPSHIELD("MAT_WARPSHIELD"),
MAT_WOOD("MAT_WOOD"),
;
	private String name;
	private MAT(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
