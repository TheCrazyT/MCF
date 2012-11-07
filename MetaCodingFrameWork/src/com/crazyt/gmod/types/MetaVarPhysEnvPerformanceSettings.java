package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.Implementation;
@External
@Implementation(MetaVarPhysEnvPerformanceSettingsImpl.class)
public interface MetaVarPhysEnvPerformanceSettings extends MetaVar,IMetaVarAny{
	@SimpleName("LookAheadTimeObjectsVsObject")
	public MetaVarNumber getLookAheadTimeObjectsVsObject();
	@SimpleName("LookAheadTimeObjectsVsObject")
	public void setLookAheadTimeObjectsVsObject(MetaVarNumber value);
	@SimpleName("LookAheadTimeObjectsVsWorld")
	public MetaVarNumber getLookAheadTimeObjectsVsWorld();
	@SimpleName("LookAheadTimeObjectsVsWorld")
	public void setLookAheadTimeObjectsVsWorld(MetaVarNumber value);
	@SimpleName("MaxAngularVelocity")
	public MetaVarNumber getMaxAngularVelocity();
	@SimpleName("MaxAngularVelocity")
	public void setMaxAngularVelocity(MetaVarNumber value);
	@SimpleName("MaxCollisionChecksPerTimestep")
	public MetaVarNumber getMaxCollisionChecksPerTimestep();
	@SimpleName("MaxCollisionChecksPerTimestep")
	public void setMaxCollisionChecksPerTimestep(MetaVarNumber value);
	@SimpleName("MaxCollisionsPerObjectPerTimestep")
	public MetaVarNumber getMaxCollisionsPerObjectPerTimestep();
	@SimpleName("MaxCollisionsPerObjectPerTimestep")
	public void setMaxCollisionsPerObjectPerTimestep(MetaVarNumber value);
	@SimpleName("MaxFrictionMass")
	public MetaVarNumber getMaxFrictionMass();
	@SimpleName("MaxFrictionMass")
	public void setMaxFrictionMass(MetaVarNumber value);
	@SimpleName("MaxVelocity")
	public MetaVarNumber getMaxVelocity();
	@SimpleName("MaxVelocity")
	public void setMaxVelocity(MetaVarNumber value);
	@SimpleName("MinFrictionMass")
	public MetaVarNumber getMinFrictionMass();
	@SimpleName("MinFrictionMass")
	public void setMinFrictionMass(MetaVarNumber value);
}
