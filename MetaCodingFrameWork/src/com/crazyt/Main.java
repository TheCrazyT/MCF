package com.crazyt;
import com.crazyt.gmod.Functions;
import com.crazyt.gmod.MetaVarNumber;
import com.crazyt.gmod.MetaVarString;
import com.crazyt.mcf.BuildClass;
import com.crazyt.mcf.Builder;
import com.crazyt.mcf.CustomMetaCommand;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.MetaCondMode;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarInt;
import com.crazyt.mcf.SimpleName;

@SimpleName("init")
public class Main extends Functions implements Builder{
	@BuildClass
	public MetaCommand metaCommand;
	
	/**
	 * @param args
	 */
	public void build() {
		MetaVarString v1 = new MetaVarString("v1");
		MetaVarInt from = new MetaVarInt("from");
		MetaVarInt to = new MetaVarInt("to");
		MetaVarInt v2 = new MetaVarInt("v2");
		MetaVarInt v3 = new MetaVarInt("v3");
		
		
		
		metaCommand
		.call(EyeAngles())
		.call(AddConsoleCommand(TEXT("test"), TEXT("test"), NUM(1)))
		.set(v1,"test")
		.set(v3,1)
		.set(v2,1)
		.set(from,1)
		.set(to,10)
		.forCmd(v2, from, to)
			.print(blah())
			.cond(v2, v3, MetaCondMode.EQUALS)
				.print(blah2(TEXT("BLAH")))
			.end()
			.print(blah3(v1))
			.call(blah())
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
		
		metaCommand.
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
		
		metaCommand
		.var(v, "test")
		.print(v);
		return null;
	}
}
