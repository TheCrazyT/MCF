package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum MOVECOLLIDE implements MetaVar {
MOVECOLLIDE_COUNT("MOVECOLLIDE_COUNT"),
MOVECOLLIDE_DEFAULT("MOVECOLLIDE_DEFAULT"),
MOVECOLLIDE_FLY_BOUNCE("MOVECOLLIDE_FLY_BOUNCE"),
MOVECOLLIDE_FLY_CUSTOM("MOVECOLLIDE_FLY_CUSTOM"),
MOVECOLLIDE_FLY_SLIDE("MOVECOLLIDE_FLY_SLIDE"),
;
	private String name;
	private MOVECOLLIDE(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
