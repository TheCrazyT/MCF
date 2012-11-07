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
@Library("constraint")
public class LibConstraint extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibConstraint(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Basic checks to make sure that the specified entity and bone are valid.
	*/
	@External
	@ServerFunc
	public MetaVarBoolean CanConstrain(MetaVarEntity entVar,MetaVarNumber boneVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates an invisible, non-moveable anchor point in the world to which things can be attached.
	*/
	@External
	@ServerFunc
	public MetaVarEntity CreateStaticAnchorPoint(MetaVarVector posVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the constraint of a specified type between two entities, if it exists
	*/
	@External
	@ServerFunc
	public MetaVarEntity Find(MetaVarEntity ent1Var,MetaVarEntity ent2Var,MetaVarString typeVar,MetaVarNumber bone1Var,MetaVarNumber bone2Var){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the first constraint of a specific type directly connected to the entity found
	*/
	@External
	@ServerFunc
	public MetaVarEntity FindConstraint(MetaVarEntity entVar,MetaVarString typeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the other entity involved in the first constraint of a specific type directly connected to the entity
	*/
	@External
	@ServerFunc
	public MetaVarEntity FindConstraintEntity(MetaVarEntity entVar,MetaVarString typeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a table of all constraints of a specific type directly connected to the entity
	*/
	@External
	@ServerFunc
	public MetaVarTable FindConstraints(MetaVarEntity entVar,MetaVarString typeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Make this entity forget any constraints it knows about
	*/
	@External
	@ServerFunc
	public MetaVar ForgetConstraints(MetaVarEntity entVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a table of all entities recursively constrained to an entitiy.
	*/
	@External
	@ServerFunc
	public MetaVarTable GetAllConstrainedEntities(MetaVarEntity entVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a table of all constraints directly connected to the entity
	*/
	@External
	@ServerFunc
	public MetaVarTable GetTable(MetaVarEntity entVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns true if the entity has constraints attached to it
	*/
	@External
	@ServerFunc
	public MetaVarBoolean HasConstraints(MetaVarEntity entVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a keep upright constraint.
	*/
	@External
	@ServerFunc
	public MetaVarEntity Keepupright(MetaVarEntity entVar,MetaVarAngle angVar,MetaVarNumber boneVar,MetaVarNumber angularLimitVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Attempts to remove all constraints associated with an entity
	*/
	@External
	@ServerFunc
	public MetaVarBoolean RemoveAll(MetaVarEntity entVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Attempts to remove all constraints of a specified type associated with an entity
	*/
	@External
	@ServerFunc
	public MetaVarBoolean RemoveConstraints(MetaVarEntity entVar,MetaVarString typeVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Creates a weld constraint
	*/
	@External
	@ServerFunc
	public MetaVarEntity Weld(MetaVarEntity ent1Var,MetaVarEntity ent2Var,MetaVarNumber bone1Var,MetaVarNumber bone2Var,MetaVarNumber forcelimitVar,MetaVarBoolean nocollideVar,MetaVarBoolean deleteent1onbreakVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
