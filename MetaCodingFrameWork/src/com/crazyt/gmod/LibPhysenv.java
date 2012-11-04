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
@Library("physenv")
public class LibPhysenv extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibPhysenv(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Loads the given surface properties as a string, follows the file format.
	*/
	@External
	@SharedFunc
	public MetaVar AddSurfaceData(MetaVarString propertiesVar){return null;};
	/**
	Returns the air density.
	*/
	@External
	@SharedFunc
	public MetaVarNumber GetAirDensity(){return null;};
	/**
	Gets the global gravity.
	*/
	@External
	@SharedFunc
	public MetaVarVector GetGravity(){return null;};
	/**
	Gets the current performance settings in table form.
	*/
	@External
	@SharedFunc
	public MetaVar GetPerformanceSettings(){return null;};
	/**
	Sets the air density.
	*/
	@External
	@SharedFunc
	public MetaVar SetAirDensity(MetaVarNumber airDensityVar){return null;};
	/**
	Sets the directional gravity, does not work on players.
	*/
	@External
	@SharedFunc
	public MetaVar SetGravity(MetaVarVector gravityVar){return null;};
	/**
	Sets the performance settings.
	*/
	@External
	@SharedFunc
	public MetaVar SetPerformanceSettings(MetaVarPhysEnvPerformanceSettings performanceSettingsVar){return null;};
}
