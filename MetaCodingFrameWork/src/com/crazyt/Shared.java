package com.crazyt;
import com.crazyt.gmod.ClientFunc;
import com.crazyt.gmod.GMODBuilder;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.gmod.SharedFunc;
import com.crazyt.gmod.hooks.HookGAMEMODE_AddDeathNotice;
import com.crazyt.gmod.hooks.HookGAMEMODE_OnPlayerChat;
import com.crazyt.gmod.types.MetaVarBoolean;
import com.crazyt.gmod.types.MetaVarEntity;
import com.crazyt.gmod.types.MetaVarFunction;
import com.crazyt.gmod.types.MetaVarNumber;
import com.crazyt.gmod.types.MetaVarNumberImpl;
import com.crazyt.gmod.types.MetaVarPlayer;
import com.crazyt.gmod.types.MetaVarString;
import com.crazyt.gmod.types.MetaVarStringImpl;
import com.crazyt.gmod.types.MetaVarWeapon;
import com.crazyt.mcf.BuildClass;
import com.crazyt.mcf.Builder;
import com.crazyt.mcf.CustomMetaCommand;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarInt;
import com.crazyt.mcf.MetaVarIntImpl;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.SourceInfo;


//manually copy out/lua/GMtest folder to garrys mod gamemodes folder for testing results
@SourceInfo(
		addonFolder = "GMtest",
		subFolder = "gamemode",
		info = "GMtest.txt")
@SimpleName("shared")
public class Shared extends GMODBuilder implements Builder{
	@BuildClass
	public MetaCommand metaCommand;
	
	/**
	 * @param args
	 */
	public void build() {
		super.build();

		print("shared init");
	}
	
	public MetaVarString TEXT(String v){
		return new MetaVarStringImpl("\""+v+"\"");
	}
	public MetaVarNumber NUM(int v){
		return new MetaVarNumberImpl(String.valueOf(v));
	}

	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	}
}
