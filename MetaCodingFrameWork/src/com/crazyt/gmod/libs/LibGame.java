package com.crazyt.gmod.libs;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.gmod.types.*;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Library;
import com.crazyt.mcf.BasicFunctions;
import com.crazyt.mcf.BuildClass;
@External
@Library("game")
public class LibGame extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibGame(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Adds a new ammo type to the game.
	*/
	@External
	@SharedFunc
	public MetaVar AddAmmoType(MetaVarAmmoData ammoDataVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Adds a new decal.
	*/
	@External
	@SharedFunc
	public MetaVar AddDecal(MetaVarString decalNameVar,MetaVarString fileNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Loads a particle file.
	*/
	@External
	@SharedFunc
	public MetaVar AddParticles(MetaVarString particleFileNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a table containing all ammo types added via <a href="http://wiki.garrysmod.com/page/Libraries/game" title="Libraries/game">game</a>.<a href="http://wiki.garrysmod.com/page/Libraries/game/AddAmmoType" title="Libraries/game/AddAmmoType">AddAmmoType</a> sorted by it's name value.
	*/
	@External
	@SharedFunc
	public MetaVarTable BuildAmmoTypes(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	If called serverside it will remove ALL entities which were not created by the map(not players or weapons held by players).
On the client it will ONLY remove entities created via <a href="http://wiki.garrysmod.com/page/Libraries/ents" title="Libraries/ents">ents</a>.<a href="http://wiki.garrysmod.com/page/Libraries/ents/CreateClientProp" title="Libraries/ents/CreateClientProp">CreateClientProp</a>.
	*/
	@External
	@SharedFunc
	public MetaVar CleanUpMap(MetaVarBoolean dontSendToClientsVar,MetaVarTable ExtraFiltersVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Runs a console command.
	*/
	@External
	@ServerFunc
	public MetaVar ConsoleCommand(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the name of the current map.
	*/
	@External
	@SharedFunc
	public MetaVarString GetMap(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the next map that would be loaded according to the file that is set by the mapcyclefile convar.
	*/
	@External
	@ServerFunc
	public MetaVarString GetMapNext(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the VBSP version of the current map.
	*/
	@External
	@ServerFunc
	public MetaVarNumber GetMapVersion(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the timescale of the game
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetTimeScale(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns Entity[0] worldspawn
	*/
	@External
	@ServerFunc
	public MetaVarEntity GetWorld(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the server or the server we are connected to is a dedicated server.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsDedicated(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Loads the next map according to the file that is set by the mapcyclefile convar.
	*/
	@External
	@ServerFunc
	public MetaVar LoadNextMap(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the map load type of the current map.
	*/
	@External
	@ServerFunc
	public MetaVarString MapLoadType(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the maximum number of players for this server.
	*/
	@External
	@SharedFunc
	public MetaVarNumber MaxPlayers(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the time scale of the game.
	*/
	@External
	@ServerFunc
	public MetaVar SetTimeScale(MetaVarNumber timeScaleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the current session is a single player game.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean SinglePlayer(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns position the player should start from, this is not the same thing as spawn points, it is used to properly transit the player between maps.
	*/
	@External
	@ServerFunc
	public MetaVarVector StartSpot(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
