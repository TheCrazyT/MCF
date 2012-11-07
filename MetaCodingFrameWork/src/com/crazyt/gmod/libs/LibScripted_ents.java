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
@Library("scripted_ents")
public class LibScripted_ents{
	/**
	Defines an alias string that can be used to refer to another classname
	*/
	@External
	@SharedFunc
	public MetaVar Alias(MetaVarString aliasVar,MetaVarString classnameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a copy of the ENT table for a class, including functions defined by the base class
	*/
	@External
	@SharedFunc
	public MetaVarTable Get(MetaVarString classnameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a copy of the list of all ENT tables registered
	*/
	@External
	@SharedFunc
	public MetaVarTable GetList(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns a list of all ENT tables which contain either ENT.Spawnable or ENT.AdminSpawnable
	*/
	@External
	@SharedFunc
	public MetaVarTable GetSpawnable(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the actual ENT table for a class. Modifying functions/variables in this table will change newly spawned entities
	*/
	@External
	@SharedFunc
	public MetaVarTable GetStored(MetaVarString classnameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the 'type' of a class, this will one of the following: 'anim', 'ai', 'brush', 'point'.
	*/
	@External
	@SharedFunc
	public MetaVarString GetType(MetaVarString classnameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Runs <a href="http://wiki.garrysmod.com/page/Libraries/baseclass" title="Libraries/baseclass">baseclass</a>.<a href="/index.php?title=Libraries/baseclass/Set&amp;action=edit&amp;redlink=1" class="new" title="Libraries/baseclass/Set (page does not exist)">Set</a> on every ENT in <a href="http://wiki.garrysmod.com/page/Libraries/scripted_ents" title="Libraries/scripted ents">scripted_ents</a>.<a href="http://wiki.garrysmod.com/page/Libraries/scripted_ents/GetList" title="Libraries/scripted ents/GetList">GetList</a>. This is called only by the engine.
	*/
	@External
	@SharedFunc
	public MetaVar OnLoaded(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Registers an ENT table with a classname. Reregistering an existing classname will automatically update the functions of all existing entities of that class.
	*/
	@External
	@SharedFunc
	public MetaVar Register(MetaVarTable ENTVar,MetaVarString classnameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
