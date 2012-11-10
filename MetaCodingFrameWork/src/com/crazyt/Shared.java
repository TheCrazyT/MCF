package com.crazyt;
import com.crazyt.gmod.GMODBuilder;
import com.crazyt.mcf.BuildClass;
import com.crazyt.mcf.Builder;
import com.crazyt.mcf.MetaCommand;
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
	
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	}
}
