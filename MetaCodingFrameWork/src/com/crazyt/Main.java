package com.crazyt;
import com.crazyt.gmod.ClientFunc;
import com.crazyt.gmod.GMODBuilder;
import com.crazyt.gmod.SharedFunc;
import com.crazyt.gmod.hooks.HookGAMEMODE_AddDeathNotice;
import com.crazyt.gmod.hooks.HookGAMEMODE_OnPlayerChat;
import com.crazyt.gmod.types.MetaVarBoolean;
import com.crazyt.gmod.types.MetaVarEntity;
import com.crazyt.gmod.types.MetaVarFunction;
import com.crazyt.gmod.types.MetaVarNumber;
import com.crazyt.gmod.types.MetaVarPlayer;
import com.crazyt.gmod.types.MetaVarString;
import com.crazyt.gmod.types.MetaVarWeapon;
import com.crazyt.mcf.BuildClass;
import com.crazyt.mcf.Builder;
import com.crazyt.mcf.CustomMetaCommand;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarInt;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.SourceInfo;

@SourceInfo(
		folder = "gamemode",
		info = "info.txt")
@SimpleName("init")
public class Main extends GMODBuilder implements Builder{
	@BuildClass
	public MetaCommand metaCommand;
	
	/**
	 * @param args
	 */
	public void build() {
		super.build();
		
		MetaVarString hook = new MetaVarString("hook");
		MetaVarFunction funcVar = new HookGAMEMODE_OnPlayerChat("hookFunc") {
			@Override
			@SharedFunc
			public MetaVar GAMEMODE_OnPlayerChat(
					@SimpleName("playerVar") MetaVarEntity playerVar,
					@SimpleName("textVar") MetaVarString textVar,
					@SimpleName("teamOnlyVar") MetaVarBoolean teamOnlyVar,
					@SimpleName("playerIsDeadVar") MetaVarBoolean playerIsDeadVar) {
				MetaVarInt i = new MetaVarInt("i");
				
				print(TEXT("Repeater"))
				.print(textVar)
				.cond(textVar,"test").e()
					.print("hello there!")
				.end()
				.cond(textVar,"count").e()
					.forCmd(i, 0, 10)
						.print(i)
					.end()
				.end();
				
				return null;
			}
		};
		
			call(AddConsoleCommand(TEXT("test"), TEXT("test"), NUM(1)))
			.call(getHook().Add(hook, hook, funcVar))
			.call(blah2(null));
	}
	
	public MetaVarString TEXT(String v){
		return new MetaVarString("\""+v+"\"");
	}
	public MetaVarNumber NUM(int v){
		return new MetaVarNumber(String.valueOf(v));
	}

	@CustomMetaCommand
	public MetaVarString blah2(MetaVarString blah){
		return null;
	}

	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	}
}
