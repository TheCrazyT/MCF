package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Library;
import com.crazyt.mcf.BasicFunctions;
import com.crazyt.mcf.BuildClass;
@External
@Library("steamworks")
public class LibSteamworks extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibSteamworks(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Downloads preview image of supplied addon and saves it as a .cache file in garrysmod/cache folder.
	*/
	@External
	@ClientFunc
	public MetaVar Download(MetaVarString workshopPreviewIDVar,MetaVarBoolean unknownVar,MetaVarFunction resultCallbackVar){return null;};
	/**
	Retrieves info about supplied Steam Workshop addon.
	*/
	@External
	@ClientFunc
	public MetaVar FileInfo(MetaVarString workshopItemIDVar,MetaVarFunction resultCallbackVar){return null;};
	/**
	Retrieves a customized list of Steam Workshop addons.
	*/
	@External
	@ClientFunc
	public MetaVar GetList(MetaVarString typeVar,MetaVarTable tagsVar,MetaVarNumber offsetVar,MetaVarNumber numRetrieveVar,MetaVarNumber unknownVar,MetaVarString userIDVar,MetaVarFunction resultCallbackVar){return null;};
	/**
	Retrieves players name by his 64bit SteamID.
	*/
	@External
	@ClientFunc
	public MetaVarString GetPlayerName(MetaVarString SteamID64Var){return null;};
	/**
	Returns whenever the client is subscribed to the specified Steam Workshop item.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsSubscribed(MetaVarString workshopItemIDVar){return null;};
	/**
	Opens the workshop website in the steam overlay browser.
	*/
	@External
	@ClientFunc
	public MetaVar OpenWorkshop(){return null;};
	/**
	Requests player info by his 64bit SteamID?
	*/
	@External
	@ClientFunc
	public MetaVar RequestPlayerInfo(MetaVarString SteamID64Var){return null;};
	/**
	Returns whenever the specified Steam Workshop addon should be mounted or not.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean ShouldMountAddon(MetaVarString workshopItemIDVar){return null;};
	/**
	Opens the workshop website for specified Steam Workshop addon in the Steam overlay browser.
	*/
	@External
	@ClientFunc
	public MetaVar ViewFile(MetaVarString workshopItemIDVar){return null;};
	/**
	Retrieves vote info of supplied addon.
	*/
	@External
	@ClientFunc
	public MetaVar VoteInfo(MetaVarString workshopItemIDVar,MetaVarFunction resultCallbackVar){return null;};
}
