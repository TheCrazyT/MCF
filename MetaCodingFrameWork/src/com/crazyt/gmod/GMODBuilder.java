package com.crazyt.gmod;


import com.crazyt.gmod.types.MetaVarBoolean;
import com.crazyt.gmod.types.MetaVarBooleanImpl;
import com.crazyt.gmod.types.MetaVarString;
import com.crazyt.gmod.types.MetaVarStringImpl;
import com.crazyt.gmod.types.MetaVarTable;
import com.crazyt.gmod.types.MetaVarTableImpl;
import com.crazyt.mcf.Builder;

public abstract class GMODBuilder extends Functions implements Builder{
	private MetaVarBoolean CLIENT = new MetaVarBooleanImpl("CLIENT");
	private MetaVarBoolean SERVER = new MetaVarBooleanImpl("SERVER");
	private MetaVarString GAMEMODE_NAME = new MetaVarStringImpl("GAMEMODE_NAME");
	private MetaVarTable GAMEMODE = new MetaVarTableImpl("GAMEMODE");
	private MetaVarTable _ENT = new MetaVarTableImpl("_ENT");
	private MetaVarTable _MODULES = new MetaVarTableImpl("_MODULES"); 
	public void build() {
	}
}
