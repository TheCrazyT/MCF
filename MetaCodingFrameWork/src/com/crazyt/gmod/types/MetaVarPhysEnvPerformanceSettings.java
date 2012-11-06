package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("PhysEnvPerformanceSettings")
public class MetaVarPhysEnvPerformanceSettings extends MetaVarImpl implements IMetaVarAny{
	private MetaVarNumber LookAheadTimeObjectsVsObject;
	@SimpleName("LookAheadTimeObjectsVsObject")
	public MetaVarNumber getLookAheadTimeObjectsVsObject(){ return LookAheadTimeObjectsVsObject;}
	@SimpleName("LookAheadTimeObjectsVsObject")
	public void setLookAheadTimeObjectsVsObject(MetaVarNumber value){ LookAheadTimeObjectsVsObject=value;}
	private MetaVarNumber LookAheadTimeObjectsVsWorld;
	@SimpleName("LookAheadTimeObjectsVsWorld")
	public MetaVarNumber getLookAheadTimeObjectsVsWorld(){ return LookAheadTimeObjectsVsWorld;}
	@SimpleName("LookAheadTimeObjectsVsWorld")
	public void setLookAheadTimeObjectsVsWorld(MetaVarNumber value){ LookAheadTimeObjectsVsWorld=value;}
	private MetaVarNumber MaxAngularVelocity;
	@SimpleName("MaxAngularVelocity")
	public MetaVarNumber getMaxAngularVelocity(){ return MaxAngularVelocity;}
	@SimpleName("MaxAngularVelocity")
	public void setMaxAngularVelocity(MetaVarNumber value){ MaxAngularVelocity=value;}
	private MetaVarNumber MaxCollisionChecksPerTimestep;
	@SimpleName("MaxCollisionChecksPerTimestep")
	public MetaVarNumber getMaxCollisionChecksPerTimestep(){ return MaxCollisionChecksPerTimestep;}
	@SimpleName("MaxCollisionChecksPerTimestep")
	public void setMaxCollisionChecksPerTimestep(MetaVarNumber value){ MaxCollisionChecksPerTimestep=value;}
	private MetaVarNumber MaxCollisionsPerObjectPerTimestep;
	@SimpleName("MaxCollisionsPerObjectPerTimestep")
	public MetaVarNumber getMaxCollisionsPerObjectPerTimestep(){ return MaxCollisionsPerObjectPerTimestep;}
	@SimpleName("MaxCollisionsPerObjectPerTimestep")
	public void setMaxCollisionsPerObjectPerTimestep(MetaVarNumber value){ MaxCollisionsPerObjectPerTimestep=value;}
	private MetaVarNumber MaxFrictionMass;
	@SimpleName("MaxFrictionMass")
	public MetaVarNumber getMaxFrictionMass(){ return MaxFrictionMass;}
	@SimpleName("MaxFrictionMass")
	public void setMaxFrictionMass(MetaVarNumber value){ MaxFrictionMass=value;}
	private MetaVarNumber MaxVelocity;
	@SimpleName("MaxVelocity")
	public MetaVarNumber getMaxVelocity(){ return MaxVelocity;}
	@SimpleName("MaxVelocity")
	public void setMaxVelocity(MetaVarNumber value){ MaxVelocity=value;}
	private MetaVarNumber MinFrictionMass;
	@SimpleName("MinFrictionMass")
	public MetaVarNumber getMinFrictionMass(){ return MinFrictionMass;}
	@SimpleName("MinFrictionMass")
	public void setMinFrictionMass(MetaVarNumber value){ MinFrictionMass=value;}
	public MetaVarPhysEnvPerformanceSettings(String n) {
		super(n);
	}
}
