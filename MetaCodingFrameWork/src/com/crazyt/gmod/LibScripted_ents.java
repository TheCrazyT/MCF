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
@Library("scripted_ents")
public class LibScripted_ents extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibScripted_ents(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Defines an alias string that can be used to refer to another classname
	*/
	@External
	@SharedFunc
	public MetaVar Alias(MetaVarString aliasVar,MetaVarString classnameVar){return null;};
	/**
	Returns a copy of the ENT table for a class, including functions defined by the base class
	*/
	@External
	@SharedFunc
	public MetaVarTable Get(MetaVarString classnameVar){return null;};
	/**
	Returns a copy of the list of all ENT tables registered
	*/
	@External
	@SharedFunc
	public MetaVarTable GetList(){return null;};
	/**
	Returns a list of all ENT tables which contain either ENT.Spawnable or ENT.AdminSpawnable
	*/
	@External
	@SharedFunc
	public MetaVarTable GetSpawnable(){return null;};
	/**
	Returns the actual ENT table for a class. Modifying functions/variables in this table will change newly spawned entities
	*/
	@External
	@SharedFunc
	public MetaVarTable GetStored(MetaVarString classnameVar){return null;};
	/**
	Returns the 'type' of a class, this will one of the following: 'anim', 'ai', 'brush', 'point'.
	*/
	@External
	@SharedFunc
	public MetaVarString GetType(MetaVarString classnameVar){return null;};
	/**
	Runs <a href="http://wiki.garrysmod.com/page/Libraries/baseclass" title="Libraries/baseclass">baseclass</a>.<a href="/index.php?title=Libraries/baseclass/Set&amp;action=edit&amp;redlink=1" class="new" title="Libraries/baseclass/Set (page does not exist)">Set</a> on every ENT in <a href="http://wiki.garrysmod.com/page/Libraries/scripted_ents" title="Libraries/scripted ents">scripted_ents</a>.<a href="http://wiki.garrysmod.com/page/Libraries/scripted_ents/GetList" title="Libraries/scripted ents/GetList">GetList</a>. This is called only by the engine.
	*/
	@External
	@SharedFunc
	public MetaVar OnLoaded(){return null;};
	/**
	Registers an ENT table with a classname. Reregistering an existing classname will automatically update the functions of all existing entities of that class.
	*/
	@External
	@SharedFunc
	public MetaVar Register(MetaVarTable ENTVar,MetaVarString classnameVar){return null;};
}
