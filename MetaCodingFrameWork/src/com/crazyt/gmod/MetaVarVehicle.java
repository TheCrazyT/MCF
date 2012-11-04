package com.crazyt.gmod;
import com.crazyt.gmod.IMetaVarAny;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("Vehicle")
public class MetaVarVehicle extends MetaVarImpl implements IMetaVarAny{
	public MetaVarVehicle(String n) {
		super(n);
	}
	/**
	Gets the driver of the vehicle, returns NULL if no drivers is present.
	*/
	@External
	@ServerFunc
	public MetaVarEntity GetDriver(){return null;};
	/**
	Gets the passenger of the vehicle, returns NULL if no drivers is present.
	*/
	@External
	@ServerFunc
	public MetaVarEntity GetPassenger(){return null;};
	/**
	Always returns true, as this overrides <a href="http://wiki.garrysmod.com/page/Classes/Entity" title="Classes/Entity">Entity</a>:<a href="http://wiki.garrysmod.com/page/Classes/Entity/IsVehicle" title="Classes/Entity/IsVehicle">IsVehicle</a>.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsVehicle(){return null;};
	/**
	Sets the animation which the camera follows when entering this vehicle.
	*/
	@External
	@ServerFunc
	public MetaVar SetVehicleEntryAnim(MetaVarString animNameVar){return null;};
}
