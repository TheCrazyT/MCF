package com.crazyt.gmod.types;
import com.crazyt.gmod.*;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.MetaVarImpl;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.External;
import com.crazyt.mcf.SimpleName;
@External
@SimpleName("CLuaEmitter")
public class MetaVarCLuaEmitter extends MetaVarImpl implements IMetaVarAny{
	public MetaVarCLuaEmitter(String n) {
		super(n);
	}
	/**
	Creates a new <a href="http://wiki.garrysmod.com/page/Classes/CLuaParticle" title="Classes/CLuaParticle">CLuaParticle</a> with the given material and position.
	*/
	//public MetaVarCLuaParticle Add(MetaVarString materialVar,MetaVarVector positionVar){return null;};
	/**
	Manually renders all particles which parent is the current emitter.
	*/
	@External
	@ClientFunc
	public MetaVar Draw(){return null;};
	/**
	Removes the emitter and all its particles.
	*/
	@External
	@ClientFunc
	public MetaVar Finish(){return null;};
	/**
	Returns the amount of active particles of the emitter.
	*/
	@External
	@ClientFunc
	public MetaVarNumber GetNumActiveParticles(){return null;};
	/**
	Usually the bounding box is automatically determined by the particles, this function overrides it.
	*/
	@External
	@ClientFunc
	public MetaVar SetBBox(MetaVarVector boxMinVar,MetaVarVector boxMaxVar){return null;};
	/**
	This function sets the the distance between the render cam and the emitter at which the particles should start fading and at which distance fade ends(alpha becomes 0).
	*/
	@External
	@ClientFunc
	public MetaVar SetNearClip(MetaVarNumber distanceMinVar,MetaVarNumber distanceMaxVar){return null;};
	/**
	If NoDraw is enabled the emitter and all its particles will not be automatically drawn every frame.
	*/
	@External
	@ClientFunc
	public MetaVar SetNoDraw(MetaVarBoolean noDrawVar){return null;};
	/**
	The function name has not much in common with its actual function, it applies a radius to every particles that affects the building of the bounding box, as it, usually is constructed by the particle that has the lowest x, y and z and the highest x, y and z, this function just adds/subtracts the radius and inflates the bounding box.
	*/
	@External
	@ClientFunc
	public MetaVar SetParticleCullRadius(MetaVarNumber radiusVar){return null;};
	/**
	Sets the position of the particle emitter.
	*/
	@External
	@ClientFunc
	public MetaVar SetPos(MetaVarVector positionVar){return null;};
	/**
	Overridden by the engine in order to clean up the CLuaEmitterobject, if the emitter gets garbage collected all active particles will vanish.
	*/
	@External
	@ClientFunc
	public MetaVar __gc(){return null;};
}
