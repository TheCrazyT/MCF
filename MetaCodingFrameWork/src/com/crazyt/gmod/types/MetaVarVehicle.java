package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarVehicleImpl.class)
public interface MetaVarVehicle extends MetaVar,IMetaVarAny{
	/**
	Gets the driver of the vehicle, returns NULL if no drivers is present.
	*/
	@External
	@ServerFunc
	public MetaVarEntity GetDriver();
	/**
	Gets the passenger of the vehicle, returns NULL if no drivers is present.
	*/
	@External
	@ServerFunc
	public MetaVarEntity GetPassenger();
	/**
	Always returns true, as this overrides <a href="http://wiki.garrysmod.com/page/Classes/Entity" title="Classes/Entity">Entity</a>:<a href="http://wiki.garrysmod.com/page/Classes/Entity/IsVehicle" title="Classes/Entity/IsVehicle">IsVehicle</a>.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsVehicle();
	/**
	Sets the animation which the camera follows when entering this vehicle.
	*/
	@External
	@ServerFunc
	public MetaVar SetVehicleEntryAnim(MetaVarString animNameVar);
}
