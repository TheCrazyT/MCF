package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarPlayerImpl.class)
public interface MetaVarPlayer extends MetaVar,IMetaVarAny{
	/**
	Add a certain amount to the player's death count
	*/
	@External
	@ServerFunc
	public MetaVar AddDeaths(MetaVarNumber countVar);
	/**
	Add a certain amount to the player's frag count (or kills count)
	*/
	@External
	@ServerFunc
	public MetaVar AddFrags(MetaVarNumber countVar);
	/**
	Checks if the player is alive.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean Alive();
	/**
	Sets if the player can toggle his flashlight
	*/
	@External
	@SharedFunc
	public MetaVar AllowFlashlight(MetaVarBoolean canFlashlightVar);
	/**
	Returns the player armor.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Armor();
	/**
	Bans the player from the server
	*/
	@External
	@ServerFunc
	public MetaVar Ban(MetaVarNumber minutesVar,MetaVarString reasonVar);
	/**
	Returns true if the player's flashlight hasn't been disabled by <a href="http://wiki.garrysmod.com/page/Classes/Player" title="Classes/Player">Player</a>:<a href="http://wiki.garrysmod.com/page/Classes/Player/AllowFlashlight" title="Classes/Player/AllowFlashlight">AllowFlashlight</a>
	*/
	@External
	@SharedFunc
	public MetaVarBoolean CanUseFlashlight();
	/**
	Prints a string to the chatbox of the client
	*/
	@External
	@SharedFunc
	public MetaVar ChatPrint(MetaVarString messageVar);
	/**
	Runs the concommand on the player
	*/
	@External
	@SharedFunc
	public MetaVar ConCommand(MetaVarString commandVar);
	/**
	Disables a players crosshair.
	*/
	@External
	@ServerFunc
	public MetaVar CrosshairDisable();
	/**
	Enables crosshair of player.
	*/
	@External
	@ServerFunc
	public MetaVar CrosshairEnable();
	/**
	Returns whether the player is crouching or not
	*/
	@External
	@SharedFunc
	public MetaVarBoolean Crouching();
	/**
	Returns the player's death count
	*/
	@External
	@SharedFunc
	public MetaVarNumber Deaths();
	/**
	Forces the player to drop the specified weapon
	*/
	@External
	@ServerFunc
	public MetaVar DropWeapon(MetaVarWeapon weaponVar);
	/**
	Enters the player into specified vehicle
	*/
	@External
	@ServerFunc
	public MetaVar EnterVehicle(MetaVarVehicle vehicleVar);
	/**
	Makes the player leave the vehicle
	*/
	@External
	@ServerFunc
	public MetaVar ExitVehicle();
	/**
	Enables/Disables the player's flashlight
	*/
	@External
	@ServerFunc
	public MetaVar Flashlight(MetaVarBoolean isOnVar);
	/**
	Returns if the player's flashlight is on/off.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean FlashlightIsOn();
	/**
	Returns the amount of kills a player has.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Frags();
	/**
	Freeze/Unfreezes the player
	*/
	@External
	@SharedFunc
	public MetaVar Freeze(MetaVarBoolean stateVar);
	/**
	Returns the player's active weapon
	*/
	@External
	@SharedFunc
	public MetaVarWeapon GetActiveWeapon();
	/**
	Returns the direction that the player is aiming.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetAimVector();
	/**
	Returns a player's duck speed (in seconds)
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetDuckSpeed();
	/**
	Returns a table with information of what the player is looking at.
	*/
	@External
	@SharedFunc
	public MetaVar GetEyeTrace();
	/**
	Returns the FOV of the player.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetFOV();
	/**
	Returns if the player is a steam friend
	*/
	@External
	@ClientFunc
	public MetaVarString GetFriendStatus();
	/**
	Returns the jump power of the player
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetJumpPower();
	/**
	Returns the player's maximum movement speed
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMaxSpeed();
	/**
	Returns the player's name
	*/
	//public MetaVarString GetName();
	/**
	Gets a player's PData from the server's database
	*/
	@External
	@SharedFunc
	public com.crazyt.gmod.IMetaVarAny GetPData(com.crazyt.gmod.IMetaVarAny nameVar,com.crazyt.gmod.IMetaVarAny defaultVar);
	/**
	Returns a player model's color. The part of the model that is colored is determined by the model itself, and is different for each model. The format is Vector(r,g,b), and each color should be between 0 and 1.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetPlayerColor();
	/**
	Returns the amount of speed the player runs at.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetRunSpeed();
	/**
	Returns a vector of the player's current aim position.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetShootPos();
	/**
	Returns a player's unduck speed (in seconds)
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetUnDuckSpeed();
	/**
	Gets the vehicle the player is driving, returns nil if the player is not driving.
	*/
	@External
	@SharedFunc
	public MetaVarVehicle GetVehicle();
	/**
	Returns the player's view model entity (just the weapon arms)
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetViewModel();
	/**
	Returns a player's walk speed
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetWalkSpeed();
	/**
	Returns the weapon for the specified class
	*/
	@External
	@ServerFunc
	public MetaVarWeapon GetWeapon(MetaVarString classNameVar);
	/**
	Returns a player's weapon color. The part of the model that is colored is determined by the model itself, and is different for each model. The format is Vector(r,g,b), and each color should be between 0 and 1.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetWeaponColor();
	/**
	Returns a table of the player's weapons
	*/
	@External
	@SharedFunc
	public MetaVarTable GetWeapons();
	/**
	Give the player a weapon
	*/
	@External
	@ServerFunc
	public MetaVar Give(MetaVarString weaponClassNameVar);
	/**
	Gives ammo to a player
	*/
	@External
	@ServerFunc
	public MetaVar GiveAmmo(MetaVarNumber amountVar,MetaVarString typeVar,MetaVarBoolean displayPopupVar);
	/**
	Disable god mode on the player
	*/
	@External
	@ServerFunc
	public MetaVar GodDisable();
	/**
	Enable god mode on the player
	*/
	@External
	@ServerFunc
	public MetaVar GodEnable();
	/**
	Returns if the player has the specified weapon
	*/
	@External
	@ServerFunc
	public MetaVarBoolean HasWeapon(MetaVarString classNameVar);
	/**
	Returns the player's IP Address
	*/
	@External
	@ServerFunc
	public MetaVarString IPAddress();
	/**
	Returns if the player is in a vehicle
	*/
	@External
	@SharedFunc
	public MetaVarBoolean InVehicle();
	/**
	Returns if the player is an admin
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsAdmin();
	/**
	Returns if the player is an bot or not
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsBot();
	/**
	Returns whenever the player is fully connected.
	*/
	@External
	@ServerFunc
	public MetaVarBoolean IsConnected();
	/**
	Checks whenever the entity is a player or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsPlayer();
	/**
	Returns whenever the player is heard by the local player.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsSpeaking();
	/**
	Returns true if the player is a superadmin, false if not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsSuperAdmin();
	/**
	Returns true/false if the player is in specified group or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsUserGroup(MetaVarString groupnameVar);
	/**
	Gets whether a key is down
	*/
	@External
	@SharedFunc
	public MetaVarBoolean KeyDown(MetaVarNumber keyVar);
	/**
	Gets whether a key was down one tick ago
	*/
	@External
	@SharedFunc
	public MetaVarBoolean KeyDownLast(MetaVarNumber keyVar);
	/**
	Gets whether a key was just pressed this tick
	*/
	@External
	@SharedFunc
	public MetaVarBoolean KeyPressed(MetaVarNumber keyVar);
	/**
	Gets whether a key was just released this tick
	*/
	@External
	@SharedFunc
	public MetaVarBoolean KeyReleased(MetaVarNumber keyVar);
	/**
	Kicks the player from the server
	*/
	@External
	@ServerFunc
	public MetaVar Kick(MetaVarString reasonVar);
	/**
	Kills the player
	*/
	@External
	@ServerFunc
	public MetaVar Kill();
	/**
	Kills a player without notifying the rest of the server.
	*/
	@External
	@ServerFunc
	public MetaVar KillSilent();
	/**
	Sets the state of the lag compensation.
	*/
	@External
	@SharedFunc
	public MetaVar LagCompensation(MetaVarBoolean lagCompensationVar);
	/**
	Stops a player from moving
	*/
	@External
	@ServerFunc
	public MetaVar Lock();
	/**
	Returns the players name. Identical to <a href="http://wiki.garrysmod.com/page/Classes/Player" title="Classes/Player">Player</a>:<a href="http://wiki.garrysmod.com/page/Classes/Player/Nick" title="Classes/Player/Nick">Nick</a> and <a href="http://wiki.garrysmod.com/page/Classes/Player" title="Classes/Player">Player</a>:<a href="http://wiki.garrysmod.com/page/Classes/Player/GetName" title="Classes/Player/GetName">GetName</a>
	*/
	@External
	@SharedFunc
	public MetaVarString Name();
	/**
	Returns the player's nickname
	*/
	@External
	@SharedFunc
	public MetaVarString Nick();
	/**
	Returns the packet loss of the client.
	*/
	@External
	@SharedFunc
	public MetaVarNumber PacketLoss();
	/**
	Returns the player's ping to server
	*/
	@External
	@SharedFunc
	public MetaVarNumber Ping();
	/**
	Displays a message either in their chat, console, or center of screen.
	*/
	@External
	@SharedFunc
	public MetaVar PrintMessage(MetaVarNumber typeVar,MetaVarString messageVar);
	/**
	Removes all ammo from a certain player
	*/
	@External
	@SharedFunc
	public MetaVar RemoveAllAmmo();
	/**
	Deletes a key from a player's data
	*/
	@External
	@SharedFunc
	public MetaVarBoolean RemovePData(com.crazyt.gmod.IMetaVarAny keyVar);
	/**
	Execute a Lua script on the player.
	*/
	@External
	@ServerFunc
	public MetaVar SendLua(MetaVarString scriptVar);
	/**
	Sets the player armor to the argument.
	*/
	@External
	@ServerFunc
	public MetaVar SetArmor(MetaVarNumber AmountVar);
	/**
	Sets a player's death count
	*/
	@External
	@ServerFunc
	public MetaVar SetDeaths(MetaVarNumber deathcountVar);
	/**
	Sets the angle of the player's view (may rotate body too if angular difference is large)
	*/
	@External
	@SharedFunc
	public MetaVar SetEyeAngles(MetaVarAngle angVar);
	/**
	Set a player's fov (field of view) over a certain amount of time
	*/
	@External
	@SharedFunc
	public MetaVar SetFOV(MetaVarNumber fovVar,MetaVarNumber timeVar);
	/**
	Sets a player's frags (kills)
	*/
	@External
	@ServerFunc
	public MetaVar SetFrags(MetaVarNumber fragcountVar);
	/**
	Sets if the player should be muted locally.
	*/
	@External
	@ClientFunc
	public MetaVar SetMuted(MetaVarBoolean muteVar);
	/**
	Sets the players visibility towards NPCs.
	*/
	@External
	@ServerFunc
	public MetaVar SetNoTarget(MetaVarBoolean visibilityVar);
	/**
	Sets a player's PData from the server's database
	*/
	@External
	@SharedFunc
	public MetaVarBoolean SetPData(com.crazyt.gmod.IMetaVarAny keyVar,com.crazyt.gmod.IMetaVarAny valueVar);
	/**
	Sets the player model's color.  The part of the model that is colored is determined by the model itself, and is different for each model.
	*/
	@External
	@SharedFunc
	public MetaVar SetPlayerColor(MetaVarVector ColorVar);
	/**
	Sets the player to the chosen team.
	*/
	@External
	@ServerFunc
	public MetaVar SetTeam(MetaVarNumber TeamVar);
	/**
	Sets the player weapon's color.  The part of the model that is colored is determined by the model itself, and is different for each model.
	*/
	@External
	@SharedFunc
	public MetaVar SetWeaponColor(MetaVarVector ColorVar);
	/**
	Sets the spectate mode of the player.
	*/
	@External
	@ServerFunc
	public MetaVar Spectate(MetaVarNumber spectateModeVar);
	/**
	Makes the player spectate the entity
	*/
	@External
	@ServerFunc
	public MetaVar SpectateEntity(MetaVarEntity entityVar);
	/**
	Makes a player spray their decal.
	*/
	@External
	@ServerFunc
	public MetaVar SprayDecal(MetaVarVector sprayOriginVar,MetaVarVector sprayNormalVar);
	/**
	Disables the sprint on the player
	*/
	@External
	@ServerFunc
	public MetaVar SprintDisable();
	/**
	Enables the sprint on the player
	*/
	@External
	@ServerFunc
	public MetaVar SprintEnable();
	/**
	Returns the player SteamID.
	*/
	@External
	@SharedFunc
	public MetaVarString SteamID();
	/**
	Returns the players 64bit SteamID.
	*/
	@External
	@SharedFunc
	public MetaVarString SteamID64();
	/**
	Removes the specified weapon class from a certain player
	*/
	@External
	@ServerFunc
	public MetaVar StripWeapon(MetaVarString weaponVar);
	/**
	Removes all weapons from a certain player
	*/
	@External
	@ServerFunc
	public MetaVar StripWeapons();
	/**
	Returns the player's team ID
	*/
	@External
	@SharedFunc
	public MetaVarNumber Team();
	/**
	Returns the player's UniqueID
	*/
	@External
	@SharedFunc
	public MetaVarNumber UniqueID();
	/**
	Returns the player's ID
	*/
	@External
	@SharedFunc
	public MetaVarNumber UserID();
	/**
	Simulates a push on the client's screen.
	*/
	@External
	@SharedFunc
	public MetaVar ViewPunch(MetaVarAngle PunchAngleVar);
}
