package com.crazyt.gmod;


import com.crazyt.gmod.types.MetaVarBoolean;
import com.crazyt.gmod.types.MetaVarString;
import com.crazyt.gmod.types.MetaVarTable;
import com.crazyt.mcf.Builder;

public abstract class GMODBuilder extends Functions implements Builder{
	private MetaVarBoolean CLIENT = new MetaVarBoolean("CLIENT");
	private MetaVarBoolean SERVER = new MetaVarBoolean("SERVER");
	private MetaVarString GAMEMODE_NAME = new MetaVarString("GAMEMODE_NAME");
	private MetaVarTable GAMEMODE = new MetaVarTable("GAMEMODE");
	private MetaVarTable _ENT = new MetaVarTable("_ENT");
	private MetaVarTable _MODULES = new MetaVarTable("_MODULES"); 
	public void build() {
	}
}
