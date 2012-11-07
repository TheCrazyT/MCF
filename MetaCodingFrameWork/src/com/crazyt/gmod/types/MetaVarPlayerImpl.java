package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("Player")
public class MetaVarPlayerImpl extends MetaVarImpl implements MetaVarPlayer{
	/**
	Add a certain amount to the player's death count
	*/
	@External
	@ServerFunc
	public MetaVar AddDeaths(MetaVarNumber countVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Add a certain amount to the player's frag count (or kills count)
	*/
	@External
	@ServerFunc
	public MetaVar AddFrags(MetaVarNumber countVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks if the player is alive.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean Alive(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets if the player can toggle his flashlight
	*/
	@External
	@SharedFunc
	public MetaVar AllowFlashlight(MetaVarBoolean canFlashlightVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the player armor.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Armor(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Bans the player from the server
	*/
	@External
	@ServerFunc
	public MetaVar Ban(MetaVarNumber minutesVar,MetaVarString reasonVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns true if the player's flashlight hasn't been disabled by <a href="http://wiki.garrysmod.com/page/Classes/Player" title="Classes/Player">Player</a>:<a href="http://wiki.garrysmod.com/page/Classes/Player/AllowFlashlight" title="Classes/Player/AllowFlashlight">AllowFlashlight</a>
	*/
	@External
	@SharedFunc
	public MetaVarBoolean CanUseFlashlight(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Prints a string to the chatbox of the client
	*/
	@External
	@SharedFunc
	public MetaVar ChatPrint(MetaVarString messageVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Runs the concommand on the player
	*/
	@External
	@SharedFunc
	public MetaVar ConCommand(MetaVarString commandVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Disables a players crosshair.
	*/
	@External
	@ServerFunc
	public MetaVar CrosshairDisable(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Enables crosshair of player.
	*/
	@External
	@ServerFunc
	public MetaVar CrosshairEnable(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whether the player is crouching or not
	*/
	@External
	@SharedFunc
	public MetaVarBoolean Crouching(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the player's death count
	*/
	@External
	@SharedFunc
	public MetaVarNumber Deaths(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Forces the player to drop the specified weapon
	*/
	@External
	@ServerFunc
	public MetaVar DropWeapon(MetaVarWeapon weaponVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Enters the player into specified vehicle
	*/
	@External
	@ServerFunc
	public MetaVar EnterVehicle(MetaVarVehicle vehicleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Makes the player leave the vehicle
	*/
	@External
	@ServerFunc
	public MetaVar ExitVehicle(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Enables/Disables the player's flashlight
	*/
	@External
	@ServerFunc
	public MetaVar Flashlight(MetaVarBoolean isOnVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the player's flashlight is on/off.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean FlashlightIsOn(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the amount of kills a player has.
	*/
	@External
	@SharedFunc
	public MetaVarNumber Frags(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Freeze/Unfreezes the player
	*/
	@External
	@SharedFunc
	public MetaVar Freeze(MetaVarBoolean stateVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the player's active weapon
	*/
	@External
	@SharedFunc
	public MetaVarWeapon GetActiveWeapon(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the direction that the player is aiming.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetAimVector(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a player's duck speed (in seconds)
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetDuckSpeed(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a table with information of what the player is looking at.
	*/
	@External
	@SharedFunc
	public MetaVarTraceRes GetEyeTrace(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the FOV of the player.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetFOV(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the player is a steam friend
	*/
	@External
	@ClientFunc
	public MetaVarString GetFriendStatus(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the jump power of the player
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetJumpPower(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the player's maximum movement speed
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetMaxSpeed(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the player's name
	*/
	//public MetaVarString GetName(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets a player's PData from the server's database
	*/
	@External
	@SharedFunc
	public com.crazyt.gmod.IMetaVarAny GetPData(com.crazyt.gmod.IMetaVarAny nameVar,com.crazyt.gmod.IMetaVarAny defaultVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a player model's color. The part of the model that is colored is determined by the model itself, and is different for each model. The format is Vector(r,g,b), and each color should be between 0 and 1.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetPlayerColor(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the amount of speed the player runs at.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetRunSpeed(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a vector of the player's current aim position.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetShootPos(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a player's unduck speed (in seconds)
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetUnDuckSpeed(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the vehicle the player is driving, returns nil if the player is not driving.
	*/
	@External
	@SharedFunc
	public MetaVarVehicle GetVehicle(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the player's view model entity (just the weapon arms)
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetViewModel(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a player's walk speed
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetWalkSpeed(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the weapon for the specified class
	*/
	@External
	@ServerFunc
	public MetaVarWeapon GetWeapon(MetaVarString classNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a player's weapon color. The part of the model that is colored is determined by the model itself, and is different for each model. The format is Vector(r,g,b), and each color should be between 0 and 1.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetWeaponColor(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a table of the player's weapons
	*/
	@External
	@SharedFunc
	public MetaVarTable GetWeapons(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Give the player a weapon
	*/
	@External
	@ServerFunc
	public MetaVar Give(MetaVarString weaponClassNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gives ammo to a player
	*/
	@External
	@ServerFunc
	public MetaVar GiveAmmo(MetaVarNumber amountVar,MetaVarString typeVar,MetaVarBoolean displayPopupVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Disable god mode on the player
	*/
	@External
	@ServerFunc
	public MetaVar GodDisable(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Enable god mode on the player
	*/
	@External
	@ServerFunc
	public MetaVar GodEnable(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the player has the specified weapon
	*/
	@External
	@ServerFunc
	public MetaVarBoolean HasWeapon(MetaVarString classNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the player's IP Address
	*/
	@External
	@ServerFunc
	public MetaVarString IPAddress(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the player is in a vehicle
	*/
	@External
	@SharedFunc
	public MetaVarBoolean InVehicle(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the player is an admin
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsAdmin(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns if the player is an bot or not
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsBot(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the player is fully connected.
	*/
	@External
	@ServerFunc
	public MetaVarBoolean IsConnected(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Checks whenever the entity is a player or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsPlayer(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whenever the player is heard by the local player.
	*/
	@External
	@ClientFunc
	public MetaVarBoolean IsSpeaking(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns true if the player is a superadmin, false if not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsSuperAdmin(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns true/false if the player is in specified group or not.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsUserGroup(MetaVarString groupnameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets whether a key is down
	*/
	@External
	@SharedFunc
	public MetaVarBoolean KeyDown(MetaVarNumber keyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets whether a key was down one tick ago
	*/
	@External
	@SharedFunc
	public MetaVarBoolean KeyDownLast(MetaVarNumber keyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets whether a key was just pressed this tick
	*/
	@External
	@SharedFunc
	public MetaVarBoolean KeyPressed(MetaVarNumber keyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets whether a key was just released this tick
	*/
	@External
	@SharedFunc
	public MetaVarBoolean KeyReleased(MetaVarNumber keyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Kicks the player from the server
	*/
	@External
	@ServerFunc
	public MetaVar Kick(MetaVarString reasonVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Kills the player
	*/
	@External
	@ServerFunc
	public MetaVar Kill(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Kills a player without notifying the rest of the server.
	*/
	@External
	@ServerFunc
	public MetaVar KillSilent(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the state of the lag compensation.
	*/
	@External
	@SharedFunc
	public MetaVar LagCompensation(MetaVarBoolean lagCompensationVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Stops a player from moving
	*/
	@External
	@ServerFunc
	public MetaVar Lock(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the players name. Identical to <a href="http://wiki.garrysmod.com/page/Classes/Player" title="Classes/Player">Player</a>:<a href="http://wiki.garrysmod.com/page/Classes/Player/Nick" title="Classes/Player/Nick">Nick</a> and <a href="http://wiki.garrysmod.com/page/Classes/Player" title="Classes/Player">Player</a>:<a href="http://wiki.garrysmod.com/page/Classes/Player/GetName" title="Classes/Player/GetName">GetName</a>
	*/
	@External
	@SharedFunc
	public MetaVarString Name(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the player's nickname
	*/
	@External
	@SharedFunc
	public MetaVarString Nick(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the packet loss of the client.
	*/
	@External
	@SharedFunc
	public MetaVarNumber PacketLoss(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the player's ping to server
	*/
	@External
	@SharedFunc
	public MetaVarNumber Ping(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Displays a message either in their chat, console, or center of screen.
	*/
	@External
	@SharedFunc
	public MetaVar PrintMessage(MetaVarNumber typeVar,MetaVarString messageVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Removes all ammo from a certain player
	*/
	@External
	@SharedFunc
	public MetaVar RemoveAllAmmo(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Deletes a key from a player's data
	*/
	@External
	@SharedFunc
	public MetaVarBoolean RemovePData(com.crazyt.gmod.IMetaVarAny keyVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Execute a Lua script on the player.
	*/
	@External
	@ServerFunc
	public MetaVar SendLua(MetaVarString scriptVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the player armor to the argument.
	*/
	@External
	@ServerFunc
	public MetaVar SetArmor(MetaVarNumber AmountVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets a player's death count
	*/
	@External
	@ServerFunc
	public MetaVar SetDeaths(MetaVarNumber deathcountVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the angle of the player's view (may rotate body too if angular difference is large)
	*/
	@External
	@SharedFunc
	public MetaVar SetEyeAngles(MetaVarAngle angVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Set a player's fov (field of view) over a certain amount of time
	*/
	@External
	@SharedFunc
	public MetaVar SetFOV(MetaVarNumber fovVar,MetaVarNumber timeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets a player's frags (kills)
	*/
	@External
	@ServerFunc
	public MetaVar SetFrags(MetaVarNumber fragcountVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets if the player should be muted locally.
	*/
	@External
	@ClientFunc
	public MetaVar SetMuted(MetaVarBoolean muteVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the players visibility towards NPCs.
	*/
	@External
	@ServerFunc
	public MetaVar SetNoTarget(MetaVarBoolean visibilityVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets a player's PData from the server's database
	*/
	@External
	@SharedFunc
	public MetaVarBoolean SetPData(com.crazyt.gmod.IMetaVarAny keyVar,com.crazyt.gmod.IMetaVarAny valueVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the player model's color.  The part of the model that is colored is determined by the model itself, and is different for each model.
	*/
	@External
	@SharedFunc
	public MetaVar SetPlayerColor(MetaVarVector ColorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the player to the chosen team.
	*/
	@External
	@ServerFunc
	public MetaVar SetTeam(MetaVarNumber TeamVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the player weapon's color.  The part of the model that is colored is determined by the model itself, and is different for each model.
	*/
	@External
	@SharedFunc
	public MetaVar SetWeaponColor(MetaVarVector ColorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the spectate mode of the player.
	*/
	@External
	@ServerFunc
	public MetaVar Spectate(MetaVarNumber spectateModeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Makes the player spectate the entity
	*/
	@External
	@ServerFunc
	public MetaVar SpectateEntity(MetaVarEntity entityVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Makes a player spray their decal.
	*/
	@External
	@ServerFunc
	public MetaVar SprayDecal(MetaVarVector sprayOriginVar,MetaVarVector sprayNormalVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Disables the sprint on the player
	*/
	@External
	@ServerFunc
	public MetaVar SprintDisable(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Enables the sprint on the player
	*/
	@External
	@ServerFunc
	public MetaVar SprintEnable(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the player SteamID.
	*/
	@External
	@SharedFunc
	public MetaVarString SteamID(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the players 64bit SteamID.
	*/
	@External
	@SharedFunc
	public MetaVarString SteamID64(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Removes the specified weapon class from a certain player
	*/
	@External
	@ServerFunc
	public MetaVar StripWeapon(MetaVarString weaponVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Removes all weapons from a certain player
	*/
	@External
	@ServerFunc
	public MetaVar StripWeapons(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the player's team ID
	*/
	@External
	@SharedFunc
	public MetaVarNumber Team(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the player's UniqueID
	*/
	@External
	@SharedFunc
	public MetaVarNumber UniqueID(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the player's ID
	*/
	@External
	@SharedFunc
	public MetaVarNumber UserID(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Simulates a push on the client's screen.
	*/
	@External
	@SharedFunc
	public MetaVar ViewPunch(MetaVarAngle PunchAngleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarPlayerImpl(String n) {
		super(n);
	}
}
