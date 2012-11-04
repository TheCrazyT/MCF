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
@Library("net")
public class LibNet extends BasicFunctions{
	@BuildClass
	public MetaCommand metaCommand;
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	};
	public LibNet(MetaCommand mc){
		this.metaCommand = mc;
	}
	/**
	Sends the currently build net message to all connected players.
	*/
	@External
	@ServerFunc
	public MetaVar Broadcast(){return null;};
	/**
	Returns the size of the current message in bytes.
	*/
	@External
	@SharedFunc
	public MetaVarNumber BytesWritten(){return null;};
	/**
	Function called by the engine to tell the lua state a message arrived, you should not modify this function.
	*/
	@External
	@SharedFunc
	public MetaVar Incoming(MetaVarNumber lengthVar){return null;};
	/**
	Reads an angle from the received net message.
	*/
	@External
	@SharedFunc
	public MetaVarAngle ReadAngle(){return null;};
	/**
	Reads a boolean from the received net message.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadBit(){return null;};
	/**
	Reads pure binary data from the message..
	*/
	@External
	@SharedFunc
	public MetaVarString ReadData(MetaVarNumber lengthVar){return null;};
	/**
	Reads a double precious number from the received net message.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadDouble(){return null;};
	/**
	Reads an entity from the received net message. You should always check if the specified entity exists as it may have been removed and therefor NULL if it is outside of the players PVS or was already removed.
	*/
	@External
	@SharedFunc
	public MetaVarEntity ReadEntity(){return null;};
	/**
	Reads a floating point number from the received net message.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadFloat(){return null;};
	/**
	Returns the "header" of the message which contains a short which can be converted to the corresponding message name via <a href="http://wiki.garrysmod.com/page/Libraries/util" title="Libraries/util">util</a>.<a href="http://wiki.garrysmod.com/page/Libraries/util/NetworkIDToString" title="Libraries/util/NetworkIDToString">NetworkIDToString</a>.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadHeader(){return null;};
	/**
	Reads an integer from the received net message.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadInt(MetaVarNumber bitCountVar){return null;};
	/**
	Reads a normal vector from the net message.
	*/
	@External
	@SharedFunc
	public MetaVarVector ReadNormal(){return null;};
	/**
	Reads a null terminated string from the net stream.
	*/
	@External
	@SharedFunc
	public MetaVarString ReadString(){return null;};
	/**
	Reads a table from the received net message.
	*/
	@External
	@SharedFunc
	public MetaVarTable ReadTable(){return null;};
	/**
	Reads a value from the usermessage with the specified type.
	*/
	@External
	@SharedFunc
	public com.crazyt.gmod.IMetaVarAny ReadType(MetaVarNumber TypeIDVar){return null;};
	/**
	Reads an unsigned integer with the specified number of bits from the received net message.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadUInt(MetaVarNumber numberOfBitsVar){return null;};
	/**
	Reads a vector from the received net message.
	*/
	@External
	@SharedFunc
	public MetaVarVector ReadVector(){return null;};
	/**
	Adds a net message handler.
	*/
	@External
	@SharedFunc
	public MetaVar Receive(MetaVarString messageNameVar,MetaVarFunction callbackVar){return null;};
	/**
	Sends the current message to the specified player, or to all players listed in the table.
	*/
	@External
	@ServerFunc
	public MetaVar Send(){return null;};
	/**
	Sends the current message to all except the specified, or to all except all players in the table.
	*/
	@External
	@ServerFunc
	public MetaVar SendOmit(){return null;};
	/**
	Sends the message to all players that are in the same potentially audible set(PAS) as the position, or simply said, it adds all players that can potentially hear sounds from this position.
	*/
	@External
	@ServerFunc
	public MetaVar SendPAS(MetaVarVector positionVar){return null;};
	/**
	Sends the message to all players that are in the same potentially visibility set(PVS) as the position, or simply said, it adds all players that can potentially be seen from this position.
	*/
	@External
	@ServerFunc
	public MetaVar SendPVS(MetaVarVector positionVar){return null;};
	/**
	Sends the current message to the server.
	*/
	@External
	@ClientFunc
	public MetaVar SendToServer(){return null;};
	/**
	Begins a new net message.
	*/
	@External
	@SharedFunc
	public MetaVar Start(MetaVarString messageNameVar){return null;};
	/**
	Writes an angle to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteAngle(MetaVarAngle angleVar){return null;};
	/**
	Appends a boolean to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteBit(MetaVarBoolean booleanVar){return null;};
	/**
	Writes a chunk of binary data to the message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteData(MetaVarString binaryDataVar,MetaVarNumber lengthVar){return null;};
	/**
	Appends a double (a big number) to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteDouble(MetaVarNumber doubleVar){return null;};
	/**
	Appends an entity to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteEntity(MetaVarEntity entityVar){return null;};
	/**
	Appends a float (number with decimals) to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteFloat(MetaVarNumber floatVar){return null;};
	/**
	Appends an integer (number without decimals) to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteInt(MetaVarNumber integerVar,MetaVarNumber bitCountVar){return null;};
	/**
	Writes a normal vector to the net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteNormal(MetaVarVector normalVar){return null;};
	/**
	Appends a string to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteString(MetaVarString stringVar){return null;};
	/**
	Appends a table to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteTable(MetaVarTable tableVar){return null;};
	/**
	Appends any type of value to the usermessage.
	*/
	@External
	@SharedFunc
	public MetaVar WriteType(com.crazyt.gmod.IMetaVarAny DataVar){return null;};
	/**
	Appends an unsigned integer with the specified number of bits to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteUInt(MetaVarNumber unsignedIntegerVar,MetaVarNumber numberOfBitsVar){return null;};
	/**
	Appends a vector to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteVector(MetaVarVector vectorVar){return null;};
}
