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
import com.crazyt.mcf.BasicFunctions;
import com.crazyt.mcf.BuildClass;
@External
@Library("ents")
public class LibEnts extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibEnts(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Starts creating an entity
	*/
	@External
	@ServerFunc
	public MetaVarEntity Create(MetaVarString classVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a clientside only prop
	*/
	@External
	@ClientFunc
	public MetaVarEntity CreateClientProp(MetaVarString modelVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets all entities with the given class, supports wildcards.
	*/
	@External
	@SharedFunc
	public MetaVarTable FindByClass(MetaVarString classVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets all entities with the given model, supports wildcards.
	*/
	@External
	@SharedFunc
	public MetaVarTable FindByModel(MetaVarString modelVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets all entities with the given hammer targetname
	*/
	@External
	@SharedFunc
	public MetaVarTable FindByName(MetaVarString nameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets all entities within the specified box.
	*/
	@External
	@SharedFunc
	public MetaVarTable FindInBox(MetaVarVector boxMinsVar,MetaVarVector boxMaxsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets all entities within the specified cone.
	*/
	@External
	@SharedFunc
	public MetaVarTable FindInCone(MetaVarVector originVar,MetaVarVector normalVar,MetaVarNumber radiusVar,MetaVarNumber angleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets all entities within the specified sphere.
	*/
	@External
	@SharedFunc
	public MetaVarTable FindInSphere(MetaVarVector originVar,MetaVarVector radiusVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a table of all existing entities.
	*/
	@External
	@SharedFunc
	public MetaVarTable GetAll(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Gets an entity by its index.
	*/
	@External
	@SharedFunc
	public MetaVarEntity GetByIndex(MetaVarNumber entIdxVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
