package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("Player")
public class MetaVarPlayer extends MetaVarImpl implements IMetaVarAny{
	public MetaVarPlayer(String n) {
		super(n);
	}
	/**
	Add a certain amount to the player's death count
	*/
	@External
	@ServerFunc
	public MetaVar AddDeaths(MetaVarNumber countVar){return null;};
	/**
	Add a certain amount to the player's frag count (or kills count)
	*/
	@External
	@ServerFunc
	public MetaVar AddFrags(MetaVarNumber countVar){return null;};
	/**
	Checks if the player is alive.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean Alive(){return null;};
	/**
	Sets if the player can toggle his flashlight
	*/
	@External
	@SharedFunc
	public MetaVar AllowFlashlight(MetaVarBoolean canFlashlightVar){return null;};
	/**
	Returns the player armor.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Armor(){return null;};
	/**
	Bans the player from the server
	*/
	@External
	@ServerFunc
	public MetaVar Ban(MetaVarNumber minutesVar,MetaVarString reasonVar){return null;};
	/**
	Returns true if the player's flashlight hasn't been disabled by <a href="http://wiki.garrysmod.com/page/Classes/Player" title="Classes/Player">Player</a>:<a href="http://wiki.garrysmod.com/page/Classes/Player/AllowFlashlight" title="Classes/Player/AllowFlashlight">AllowFlashlight</a>
	*/
	@External
	@SharedFunc
	public MetaVarBoolean CanUseFlashlight(){return null;};
	/**
	Prints a string to the chatbox of the client
	*/
	@External
	@SharedFunc
	public MetaVar ChatPrint(MetaVarString messageVar){return null;};
	/**
	Runs the concommand on the player
	*/
	@External
	@SharedFunc
	public MetaVar ConCommand(MetaVarString commandVar){return null;};
	/**
	Disables a players crosshair.
	*/
	@External
	@ServerFunc
	public MetaVar CrosshairDisable(){return null;};
	/**
	Enables crosshair of player.
	*/
	@External
	@ServerFunc
	public MetaVar CrosshairEnable(){return null;};
	/**
	Returns whether the player is crouching or not
	*/
	@External
	@SharedFunc
	public MetaVarBoolean Crouching(){return null;};
	/**
	Returns the player's death count
	*/
	@External
	@SharedFunc
	public MetaVarNumber Deaths(){return null;};
	/**
	Forces the player to drop the specified weapon
	*/
	@External
	@ServerFunc
	public MetaVar DropWeapon(MetaVarWeapon weaponVar){return null;};
	/**
	Enters the player into specified vehicle
	*/
	@External
	@ServerFunc
	public MetaVar EnterVehicle(MetaVarVehicle vehicleVar){return null;};
	/**
	Makes the player leave the vehicle
	*/
	@External
	@ServerFunc
	public MetaVar ExitVehicle(){return null;};
	/**
	Enables/Disables the player's flashlight
	*/
	@External
	@ServerFunc
	public MetaVar Flashlight(MetaVarBoolean isOnVar){return null;};
	/**
	Returns if the player's flashlight is on/off.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean FlashlightIsOn(){return null;};
	/**
	Returns the amount of kills a player has.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Frags(){return null;};
	/**
	Freeze/Unfreezes the player
	*/
	@External
	@SharedFunc
	public MetaVar Freeze(MetaVarBoolean stateVar){return null;};
	/**
	Returns the player's active weapon
	*/
	@External
	@SharedFunc
	public MetaVarWeapon GetActiveWeapon(){return null;};
	/**
	Returns the direction that the player is aiming.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetAimVector(){return null;};
	/**
	Returns a player's duck speed (in seconds)
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetDuckSpeed(){return null;};
	/**
	Returns a table with information of what the player is looking at.
	*/
	@External
	@SharedFunc
	public MetaVar GetEyeTrace(){return null;};
	/**
	Returns the FOV of the player.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetFOV(){return null;};
	/**
	Returns if the player is a steam friend
	*/
	@External
	@ClientFunc
	public MetaVarString GetFriendStatus(){return null;};
	/**
	Returns the jump power of the player
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetJumpPower(){return null;};
	/**
	Returns the player's maximum movement speed
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMaxSpeed(){return null;};
	/**
	Returns the player's name
	*/
	//public MetaVarString GetName(){return null;};
	/**
	Gets a player's PData from the server's database
	*/
	@External
	@SharedFunc
	public com.crazyt.gmod.IMetaVarAny GetPData(com.crazyt.gmod.IMetaVarAny nameVar,com.crazyt.gmod.IMetaVarAny defaultVar){return null;};
	/**
	Returns a player model's color. The part of the model that is colored is determined by the model itself, and is different for each model. The format is Vector(r,g,b), and each color should be between 0 and 1.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetPlayerColor(){return null;};
	/**
	Returns the amount of speed the player runs at.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetRunSpeed(){return null;};
	/**
	Returns a vector of the player's current aim position.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetShootPos(){return null;};
	/**
	Returns a player's unduck speed (in seconds)
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetUnDuckSpeed(){return null;};
	/**
	Gets the vehicle the player is driving, returns nil if the player is not driving.
	*/
	@External
	@SharedFunc
	public MetaVarVehicle GetVehicle(){return null;};
	/**
	Returns the player's view model entity (just the weapon arms)
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetViewModel(){return null;};
	/**
	Returns a player's walk speed
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetWalkSpeed(){return null;};
	/**
	Returns the weapon for the specified class
	*/
	@External
	@ServerFunc
	public MetaVarWeapon GetWeapon(MetaVarString classNameVar){return null;};
	/**
	Returns a player's weapon color. The part of the model that is colored is determined by the model itself, and is different for each model. The format is Vector(r,g,b), and each color should be between 0 and 1.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetWeaponColor(){return null;};
	/**
	Returns a table of the player's weapons
	*/
	@External
	@SharedFunc
	public MetaVarTable GetWeapons(){return null;};
	/**
	Give the player a weapon
	*/
	@External
	@ServerFunc
	public MetaVar Give(MetaVarString weaponClassNameVar){return null;};
	/**
	Gives ammo to a player
	*/
	@External
	@ServerFunc
	public MetaVar GiveAmmo(MetaVarNumber amountVar,MetaVarString typeVar,MetaVarBoolean displayPopupVar){return null;};
	/**
	Disable god mode on the player
	*/
	@External
	@ServerFunc
	public MetaVar GodDisable(){return null;};
	/**
	Enable god mode on the player
	*/
	@External
	@ServerFunc
	public MetaVar GodEnable(){return null;};
	/**
	Returns if the player has the specified weapon
	*/
	@External
	@ServerFunc
	public MetaVarBoolean HasWeapon(MetaVarString classNameVar){return null;};
	/**
	Returns the player's IP Address
	*/
	@External
	@ServerFunc
	public MetaVarString IPAddress(){return null;};
	/**
	Returns if the player is in a vehicle
	*/
	@External
	@SharedFunc
	public MetaVarBoolean InVehicle(){return null;};
	/**
	Returns if the player is an admin
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsAdmin(){return null;};
	/**
	Returns if the player is an bot or not
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsBot(){return null;};
	/**
	Returns whenever the player is fully connected.
	*/
	@External
	@ServerFunc
	public MetaVarBoolean IsConnected(){return null;};
	/**
	Checks whenever the entity is a player or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsPlayer(){return null;};
	/**
	Returns whenever the player is heard by the local player.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsSpeaking(){return null;};
	/**
	Returns true if the player is a superadmin, false if not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsSuperAdmin(){return null;};
	/**
	Returns true/false if the player is in specified group or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsUserGroup(MetaVarString groupnameVar){return null;};
	/**
	Gets whether a key is down
	*/
	@External
	@SharedFunc
	public MetaVarBoolean KeyDown(MetaVarNumber keyVar){return null;};
	/**
	Gets whether a key was down one tick ago
	*/
	@External
	@SharedFunc
	public MetaVarBoolean KeyDownLast(MetaVarNumber keyVar){return null;};
	/**
	Gets whether a key was just pressed this tick
	*/
	@External
	@SharedFunc
	public MetaVarBoolean KeyPressed(MetaVarNumber keyVar){return null;};
	/**
	Gets whether a key was just released this tick
	*/
	@External
	@SharedFunc
	public MetaVarBoolean KeyReleased(MetaVarNumber keyVar){return null;};
	/**
	Kicks the player from the server
	*/
	@External
	@ServerFunc
	public MetaVar Kick(MetaVarString reasonVar){return null;};
	/**
	Kills the player
	*/
	@External
	@ServerFunc
	public MetaVar Kill(){return null;};
	/**
	Kills a player without notifying the rest of the server.
	*/
	@External
	@ServerFunc
	public MetaVar KillSilent(){return null;};
	/**
	Sets the state of the lag compensation.
	*/
	@External
	@SharedFunc
	public MetaVar LagCompensation(MetaVarBoolean lagCompensationVar){return null;};
	/**
	Stops a player from moving
	*/
	@External
	@ServerFunc
	public MetaVar Lock(){return null;};
	/**
	Returns the players name. Identical to <a href="http://wiki.garrysmod.com/page/Classes/Player" title="Classes/Player">Player</a>:<a href="http://wiki.garrysmod.com/page/Classes/Player/Nick" title="Classes/Player/Nick">Nick</a> and <a href="http://wiki.garrysmod.com/page/Classes/Player" title="Classes/Player">Player</a>:<a href="http://wiki.garrysmod.com/page/Classes/Player/GetName" title="Classes/Player/GetName">GetName</a>
	*/
	@External
	@SharedFunc
	public MetaVarString Name(){return null;};
	/**
	Returns the player's nickname
	*/
	@External
	@SharedFunc
	public MetaVarString Nick(){return null;};
	/**
	Returns the packet loss of the client.
	*/
	@External
	@SharedFunc
	public MetaVarNumber PacketLoss(){return null;};
	/**
	Returns the player's ping to server
	*/
	@External
	@SharedFunc
	public MetaVarNumber Ping(){return null;};
	/**
	Displays a message either in their chat, console, or center of screen.
	*/
	@External
	@SharedFunc
	public MetaVar PrintMessage(MetaVarNumber typeVar,MetaVarString messageVar){return null;};
	/**
	Removes all ammo from a certain player
	*/
	@External
	@SharedFunc
	public MetaVar RemoveAllAmmo(){return null;};
	/**
	Deletes a key from a player's data
	*/
	@External
	@SharedFunc
	public MetaVarBoolean RemovePData(com.crazyt.gmod.IMetaVarAny keyVar){return null;};
	/**
	Execute a Lua script on the player.
	*/
	@External
	@ServerFunc
	public MetaVar SendLua(MetaVarString scriptVar){return null;};
	/**
	Sets the player armor to the argument.
	*/
	@External
	@ServerFunc
	public MetaVar SetArmor(MetaVarNumber AmountVar){return null;};
	/**
	Sets a player's death count
	*/
	@External
	@ServerFunc
	public MetaVar SetDeaths(MetaVarNumber deathcountVar){return null;};
	/**
	Sets the angle of the player's view (may rotate body too if angular difference is large)
	*/
	@External
	@SharedFunc
	public MetaVar SetEyeAngles(MetaVarAngle angVar){return null;};
	/**
	Set a player's fov (field of view) over a certain amount of time
	*/
	@External
	@SharedFunc
	public MetaVar SetFOV(MetaVarNumber fovVar,MetaVarNumber timeVar){return null;};
	/**
	Sets a player's frags (kills)
	*/
	@External
	@ServerFunc
	public MetaVar SetFrags(MetaVarNumber fragcountVar){return null;};
	/**
	Sets if the player should be muted locally.
	*/
	@External
	@ClientFunc
	public MetaVar SetMuted(MetaVarBoolean muteVar){return null;};
	/**
	Sets the players visibility towards NPCs.
	*/
	@External
	@ServerFunc
	public MetaVar SetNoTarget(MetaVarBoolean visibilityVar){return null;};
	/**
	Sets a player's PData from the server's database
	*/
	@External
	@SharedFunc
	public MetaVarBoolean SetPData(com.crazyt.gmod.IMetaVarAny keyVar,com.crazyt.gmod.IMetaVarAny valueVar){return null;};
	/**
	Sets the player model's color.  The part of the model that is colored is determined by the model itself, and is different for each model.
	*/
	@External
	@SharedFunc
	public MetaVar SetPlayerColor(MetaVarVector ColorVar){return null;};
	/**
	Sets the player to the chosen team.
	*/
	@External
	@ServerFunc
	public MetaVar SetTeam(MetaVarNumber TeamVar){return null;};
	/**
	Sets the player weapon's color.  The part of the model that is colored is determined by the model itself, and is different for each model.
	*/
	@External
	@SharedFunc
	public MetaVar SetWeaponColor(MetaVarVector ColorVar){return null;};
	/**
	Sets the spectate mode of the player.
	*/
	@External
	@ServerFunc
	public MetaVar Spectate(MetaVarNumber spectateModeVar){return null;};
	/**
	Makes the player spectate the entity
	*/
	@External
	@ServerFunc
	public MetaVar SpectateEntity(MetaVarEntity entityVar){return null;};
	/**
	Makes a player spray their decal.
	*/
	@External
	@ServerFunc
	public MetaVar SprayDecal(MetaVarVector sprayOriginVar,MetaVarVector sprayNormalVar){return null;};
	/**
	Disables the sprint on the player
	*/
	@External
	@ServerFunc
	public MetaVar SprintDisable(){return null;};
	/**
	Enables the sprint on the player
	*/
	@External
	@ServerFunc
	public MetaVar SprintEnable(){return null;};
	/**
	Returns the player SteamID.
	*/
	@External
	@SharedFunc
	public MetaVarString SteamID(){return null;};
	/**
	Returns the players 64bit SteamID.
	*/
	@External
	@SharedFunc
	public MetaVarString SteamID64(){return null;};
	/**
	Removes the specified weapon class from a certain player
	*/
	@External
	@ServerFunc
	public MetaVar StripWeapon(MetaVarString weaponVar){return null;};
	/**
	Removes all weapons from a certain player
	*/
	@External
	@ServerFunc
	public MetaVar StripWeapons(){return null;};
	/**
	Returns the player's team ID
	*/
	@External
	@SharedFunc
	public MetaVarNumber Team(){return null;};
	/**
	Returns the player's UniqueID
	*/
	@External
	@SharedFunc
	public MetaVarNumber UniqueID(){return null;};
	/**
	Returns the player's ID
	*/
	@External
	@SharedFunc
	public MetaVarNumber UserID(){return null;};
	/**
	Simulates a push on the client's screen.
	*/
	@External
	@SharedFunc
	public MetaVar ViewPunch(MetaVarAngle PunchAngleVar){return null;};
}
