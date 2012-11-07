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
@External
@Library("system")
public class LibSystem{
	/**
	Returns the total uptime of the current application.
	*/
	@External
	@SharedFunc
	public MetaVarNumber AppTime(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the current battery power.
	*/
	@External
	@SharedFunc
	public MetaVarNumber BatteryPower(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the country determined by the localisation settings of the OS.
	*/
	@External
	@SharedFunc
	public MetaVarString GetCountry(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the whether the game window has focus.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean HasFocus(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whether the current OS is Linux.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsLinux(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whether the current OS is OSX.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsOSX(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns whether the current OS is Windows.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsWindows(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the synchronized steam time.
	*/
	@External
	@SharedFunc
	public MetaVarNumber SteamTime(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the total uptime of operating system.
	*/
	@External
	@SharedFunc
	public MetaVarNumber UpTime(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
