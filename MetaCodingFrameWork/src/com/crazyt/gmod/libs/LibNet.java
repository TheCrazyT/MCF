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
	public MetaVar Broadcast(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the size of the current message in bytes.
	*/
	@External
	@SharedFunc
	public MetaVarNumber BytesWritten(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Function called by the engine to tell the lua state a message arrived, you should not modify this function.
	*/
	@External
	@SharedFunc
	public MetaVar Incoming(MetaVarNumber lengthVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads an angle from the received net message.
	*/
	@External
	@SharedFunc
	public MetaVarAngle ReadAngle(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads a boolean from the received net message.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadBit(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads pure binary data from the message..
	*/
	@External
	@SharedFunc
	public MetaVarString ReadData(MetaVarNumber lengthVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads a double precious number from the received net message.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadDouble(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads an entity from the received net message. You should always check if the specified entity exists as it may have been removed and therefor NULL if it is outside of the players PVS or was already removed.
	*/
	@External
	@SharedFunc
	public MetaVarEntity ReadEntity(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads a floating point number from the received net message.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadFloat(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Returns the "header" of the message which contains a short which can be converted to the corresponding message name via <a href="http://wiki.garrysmod.com/page/Libraries/util" title="Libraries/util">util</a>.<a href="http://wiki.garrysmod.com/page/Libraries/util/NetworkIDToString" title="Libraries/util/NetworkIDToString">NetworkIDToString</a>.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadHeader(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads an integer from the received net message.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadInt(MetaVarNumber bitCountVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads a normal vector from the net message.
	*/
	@External
	@SharedFunc
	public MetaVarVector ReadNormal(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads a null terminated string from the net stream.
	*/
	@External
	@SharedFunc
	public MetaVarString ReadString(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads a table from the received net message.
	*/
	@External
	@SharedFunc
	public MetaVarTable ReadTable(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads a value from the usermessage with the specified type.
	*/
	@External
	@SharedFunc
	public com.crazyt.gmod.IMetaVarAny ReadType(MetaVarNumber TypeIDVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads an unsigned integer with the specified number of bits from the received net message.
	*/
	@External
	@SharedFunc
	public MetaVarNumber ReadUInt(MetaVarNumber numberOfBitsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Reads a vector from the received net message.
	*/
	@External
	@SharedFunc
	public MetaVarVector ReadVector(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Adds a net message handler.
	*/
	@External
	@SharedFunc
	public MetaVar Receive(MetaVarString messageNameVar,MetaVarFunction callbackVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sends the current message to the specified player, or to all players listed in the table.
	*/
	@External
	@ServerFunc
	public MetaVar Send(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sends the current message to all except the specified, or to all except all players in the table.
	*/
	@External
	@ServerFunc
	public MetaVar SendOmit(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sends the message to all players that are in the same potentially audible set(PAS) as the position, or simply said, it adds all players that can potentially hear sounds from this position.
	*/
	@External
	@ServerFunc
	public MetaVar SendPAS(MetaVarVector positionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sends the message to all players that are in the same potentially visibility set(PVS) as the position, or simply said, it adds all players that can potentially be seen from this position.
	*/
	@External
	@ServerFunc
	public MetaVar SendPVS(MetaVarVector positionVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Sends the current message to the server.
	*/
	@External
	@ClientFunc
	public MetaVar SendToServer(){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Begins a new net message.
	*/
	@External
	@SharedFunc
	public MetaVar Start(MetaVarString messageNameVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes an angle to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteAngle(MetaVarAngle angleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Appends a boolean to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteBit(MetaVarBoolean booleanVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes a chunk of binary data to the message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteData(MetaVarString binaryDataVar,MetaVarNumber lengthVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Appends a double (a big number) to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteDouble(MetaVarNumber doubleVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Appends an entity to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteEntity(MetaVarEntity entityVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Appends a float (number with decimals) to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteFloat(MetaVarNumber floatVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Appends an integer (number without decimals) to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteInt(MetaVarNumber integerVar,MetaVarNumber bitCountVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Writes a normal vector to the net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteNormal(MetaVarVector normalVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Appends a string to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteString(MetaVarString stringVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Appends a table to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteTable(MetaVarTable tableVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Appends any type of value to the usermessage.
	*/
	@External
	@SharedFunc
	public MetaVar WriteType(com.crazyt.gmod.IMetaVarAny DataVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Appends an unsigned integer with the specified number of bits to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteUInt(MetaVarNumber unsignedIntegerVar,MetaVarNumber numberOfBitsVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
	/**
	Appends a vector to the current net message.
	*/
	@External
	@SharedFunc
	public MetaVar WriteVector(MetaVarVector vectorVar){throw new RuntimeException("Should never be executed directly, there is probably an error in the Aspect-coding.");};
}
