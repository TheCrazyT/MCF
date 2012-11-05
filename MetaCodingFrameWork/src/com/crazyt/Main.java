package com.crazyt;
import com.crazyt.gmod.GMODBuilder;
import com.crazyt.gmod.MetaVarNumber;
import com.crazyt.gmod.MetaVarPlayer;
import com.crazyt.gmod.MetaVarString;
import com.crazyt.gmod.MetaVarWeapon;
import com.crazyt.gmod.SourceInfo;
import com.crazyt.mcf.BuildClass;
import com.crazyt.mcf.Builder;
import com.crazyt.mcf.CustomMetaCommand;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarInt;
import com.crazyt.mcf.SimpleName;

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
		
		MetaVarString v1 = new MetaVarString("v1");
		MetaVarInt from = new MetaVarInt("from");
		MetaVarInt to = new MetaVarInt("to");
		MetaVarInt v2 = new MetaVarInt("v2");
		MetaVarInt v3 = new MetaVarInt("v3");
		MetaVarString key = new MetaVarString("key");
		MetaVarPlayer value = new MetaVarPlayer("value");
		MetaVarString key2 = new MetaVarString("key2");
		MetaVarWeapon value2 = new MetaVarWeapon("value2");
		
		
		forPair(key, value, getPlayer().GetBots())
			.call(EyeAngles())
			.call(AddConsoleCommand(TEXT("test"), TEXT("test"), NUM(1)))
			.set(v1,"test")
			.set(v3,1)
			.set(v2,1)
			.set(from,1)
			.set(to,10)
			.forPair(key2, value2, value.GetWeapons())
				.print(value2.GetPrintName())
				.forCmd(v2, from, to)
					.print(blah())
					.print(blah())
					.cond
						(cond(v2, v3).e(),cond(v3, v2).g()).and()
						.print(blah2(TEXT("BLAH")))
					.end();
					cond(v2, v3).e()
						.print(blah2(TEXT("BLAH2")))			
					.end()
					.print(blah3(v1))
					.call(blah())
				.end()
			.end()
		.end();
		

	}
	
	public MetaVarString TEXT(String v){
		return new MetaVarString("\""+v+"\"");
	}
	public MetaVarNumber NUM(int v){
		return new MetaVarNumber(String.valueOf(v));
	}

	@CustomMetaCommand
	public MetaVar blah(){
		call(blah2(TEXT("blah")));
		return null;
	}

	@CustomMetaCommand
	public MetaVarString blah2(MetaVarString blah){
		return null;
	}

	
	@CustomMetaCommand
	public MetaVar blah3(MetaVarString blah){
		MetaVarString v = new MetaVarString("v");

		var(v, "test")
		.print(v);
		return null;
	}

	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	}
}
