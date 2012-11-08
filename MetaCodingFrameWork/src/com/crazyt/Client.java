package com.crazyt;
import com.crazyt.gmod.GMODBuilder;
import com.crazyt.gmod.SharedFunc;
import com.crazyt.gmod.hooks.HookGAMEMODE_OnPlayerChat;
import com.crazyt.gmod.types.MetaVarBoolean;
import com.crazyt.gmod.types.MetaVarBooleanImpl;
import com.crazyt.gmod.types.MetaVarEntity;
import com.crazyt.gmod.types.MetaVarEntityImpl;
import com.crazyt.gmod.types.MetaVarNumber;
import com.crazyt.gmod.types.MetaVarNumberImpl;
import com.crazyt.gmod.types.MetaVarPlayer;
import com.crazyt.gmod.types.MetaVarPlayerImpl;
import com.crazyt.gmod.types.MetaVarString;
import com.crazyt.gmod.types.MetaVarStringImpl;
import com.crazyt.gmod.types.MetaVarTable;
import com.crazyt.gmod.types.MetaVarTableImpl;
import com.crazyt.mcf.BuildClass;
import com.crazyt.mcf.Builder;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarInt;
import com.crazyt.mcf.MetaVarIntImpl;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.SourceInfo;


//manually copy out/lua/GMtest folder to garrys mod gamemodes folder for testing results
//Build project to create all 3 lua files!
@SourceInfo(
		addonFolder = "GMtest",
		subFolder = "gamemode",
		info = "GMtest.txt")
@SimpleName("cl_init")
public class Client extends GMODBuilder implements Builder{
	@BuildClass
	public MetaCommand metaCommand;
	
	/**
	 * @param args
	 */
	public void build() {
		super.build();

		print("init");
		call(AddConsoleCommand(TEXT("test"), TEXT("test"), NUM(1)))
		.call(getHook().Add(TEXT(HookGAMEMODE_OnPlayerChat.INTERNAL_HOOK_NAME), TEXT("hook"), new HookGAMEMODE_OnPlayerChat("hookFunc") {
			@Override
			@SharedFunc
			public MetaVar GAMEMODE_OnPlayerChat(
					@SimpleName("playerVar") MetaVarEntity playerVar,
					@SimpleName("textVar") MetaVarString textVar,
					@SimpleName("teamOnlyVar") MetaVarBoolean teamOnlyVar,
					@SimpleName("playerIsDeadVar") MetaVarBoolean playerIsDeadVar) {
				MetaVarInt i = new MetaVarIntImpl("i");
				MetaVarString v1 = new MetaVarStringImpl("v1");
				MetaVarPlayer v2 = new MetaVarPlayerImpl("p");
				
				cond(textVar,"test").e();
					print("hello there!");
				end();
				cond(textVar,"players").e();
				{
					forPair(v1,v2,getPlayer().GetHumans());
					{
						call(getChat().AddText(v2.Name()));
					}
					end();
				}
				end();
				cond(textVar,"test2").e()
					.print("hello there!")
				.end();
				cond(cond(textVar,"test2").e(),cond(textVar,"test3").e()).and()
					.print("hello there!")
				.end();
				cond(textVar,"count").e();
				{
					forCmd(i, 0, 10);
					{
						print(i);
					}
					end();
				}
				end();
				
				return null;
			}
		}));
	}

//	@CustomMetaCommand
//	public MetaVarString blah2(MetaVarString blah){
//		return null;
//	}

	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	}
}
