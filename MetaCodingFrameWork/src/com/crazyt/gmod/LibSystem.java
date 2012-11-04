package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("system")
public class LibSystem{
	/**
	Returns the total uptime of the current application.
	*/
	@External
	@SharedFunc
	public MetaVarNumber AppTime(){return null;};
	/**
	Returns the current battery power.
	*/
	@External
	@SharedFunc
	public MetaVarNumber BatteryPower(){return null;};
	/**
	Returns the country determined by the localisation settings of the OS.
	*/
	@External
	@SharedFunc
	public MetaVarString GetCountry(){return null;};
	/**
	Returns the whether the game window has focus.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean HasFocus(){return null;};
	/**
	Returns whether the current OS is Linux.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsLinux(){return null;};
	/**
	Returns whether the current OS is OSX.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsOSX(){return null;};
	/**
	Returns whether the current OS is Windows.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsWindows(){return null;};
	/**
	Returns the synchronized steam time.
	*/
	@External
	@SharedFunc
	public MetaVarNumber SteamTime(){return null;};
	/**
	Returns the total uptime of operating system.
	*/
	@External
	@SharedFunc
	public MetaVarNumber UpTime(){return null;};
}