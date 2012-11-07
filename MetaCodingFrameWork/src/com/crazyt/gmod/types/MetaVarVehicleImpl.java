package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("Vehicle")
public class MetaVarVehicleImpl extends MetaVarImpl implements MetaVarVehicle{
	/**
	Gets the driver of the vehicle, returns NULL if no drivers is present.
	*/
	@External
	@ServerFunc
	public MetaVarEntity GetDriver(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets the passenger of the vehicle, returns NULL if no drivers is present.
	*/
	@External
	@ServerFunc
	public MetaVarEntity GetPassenger(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Always returns true, as this overrides <a href="http://wiki.garrysmod.com/page/Classes/Entity" title="Classes/Entity">Entity</a>:<a href="http://wiki.garrysmod.com/page/Classes/Entity/IsVehicle" title="Classes/Entity/IsVehicle">IsVehicle</a>.
	*/
	@External
	@SharedFunc
	public MetaVarBoolean IsVehicle(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sets the animation which the camera follows when entering this vehicle.
	*/
	@External
	@ServerFunc
	public MetaVar SetVehicleEntryAnim(MetaVarString animNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	public MetaVarVehicleImpl(String n) {
		super(n);
	}
}
