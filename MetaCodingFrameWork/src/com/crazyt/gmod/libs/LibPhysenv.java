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
@Library("physenv")
public class LibPhysenv{
	/**
	Loads the given surface properties as a string, follows the file format.
	*/
	@External
	@SharedFunc
	public MetaVar AddSurfaceData(MetaVarString propertiesVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the air density.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetAirDensity(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the global gravity.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetGravity(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the current performance settings in table form.
	*/
	@External
	@SharedFunc
	public MetaVarPhysEnvPerformanceSettings GetPerformanceSettings(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the air density.
	*/
	@External
	@SharedFunc
	public MetaVar SetAirDensity(MetaVarNumber airDensityVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the directional gravity, does not work on players.
	*/
	@External
	@SharedFunc
	public MetaVar SetGravity(MetaVarVector gravityVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the performance settings.
	*/
	@External
	@SharedFunc
	public MetaVar SetPerformanceSettings(MetaVarPhysEnvPerformanceSettings performanceSettingsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
