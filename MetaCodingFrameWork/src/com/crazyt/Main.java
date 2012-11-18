package com.crazyt;
import com.crazyt.gmod.GMODBuilder;
import com.crazyt.gmod.SharedFunc;
import com.crazyt.gmod.hooks.HookGAMEMODE_OnPlayerChat;
import com.crazyt.gmod.types.MetaVarBoolean;
import com.crazyt.gmod.types.MetaVarBooleanImpl;
import com.crazyt.gmod.types.MetaVarEntity;
import com.crazyt.gmod.types.MetaVarEntityImpl;
import com.crazyt.gmod.types.MetaVarNumber;
import com.crazyt.gmod.types.MetaVarNumberImpl;
import com.crazyt.gmod.types.MetaVarString;
import com.crazyt.gmod.types.MetaVarStringImpl;
import com.crazyt.gmod.types.MetaVarTable;
import com.crazyt.gmod.types.MetaVarTableImpl;
import com.crazyt.gmod.types.MetaVarVector;
import com.crazyt.gmod.types.MetaVarVectorImpl;
import com.crazyt.mcf.BuildClass;
import com.crazyt.mcf.Builder;
import com.crazyt.mcf.IDo;
import com.crazyt.mcf.IThen;
import com.crazyt.mcf.MetaCommand;
import com.crazyt.mcf.MetaVar;
import com.crazyt.mcf.SimpleName;
import com.crazyt.mcf.SourceInfo;


//manually copy out/lua/GMtest folder to garrys mod gamemodes folder for testing results
@SourceInfo(
		addonFolder = "GMtest",
		subFolder = "gamemode",
		info = "GMtest.txt")
@SimpleName("init")
public class Main extends GMODBuilder implements Builder{
	@BuildClass
	public MetaCommand metaCommand;
	
	/**
	 * @param args
	 */
	public void build() {
		super.build();


		print("Server init");
		call(AddCSLuaFile(TEXT("cl_init.lua")));
		call(AddCSLuaFile(TEXT("shared.lua")));

		MetaVarString x = new MetaVarStringImpl("x");
		x.setValue("Test");
		
		MetaVarNumber y = new MetaVarNumberImpl("y");
		y.setValue(5);
		
		call(getHook().Add(TEXT(HookGAMEMODE_OnPlayerChat.INTERNAL_HOOK_NAME), TEXT("hook2"), 
			new HookGAMEMODE_OnPlayerChat("hookFunc2") {
				@Override
				@SharedFunc
				public MetaVar GAMEMODE_OnPlayerChat(
						@SimpleName("playerVar") MetaVarEntity playerVar,
						@SimpleName("textVar") MetaVarString textVar,
						@SimpleName("teamOnlyVar") MetaVarBoolean teamOnlyVar,
						@SimpleName("playerIsDeadVar") MetaVarBoolean playerIsDeadVar) {
					call(getChat().AddText(TEXT("chatting ...")));
					final MetaVarEntity ent = new MetaVarEntityImpl("ent");
					final MetaVarNumber i = new MetaVarNumberImpl("i");
					final MetaVarNumber v1 = new MetaVarNumberImpl("v");
					cond(textVar,"test5").e().then(new IThen() {
						@Override
						public void then() {
							final MetaVarTable table = new MetaVarTableImpl("table");
							forCmd(v1,NUM(0),NUM(10)).doLoop(new IDo() {
								@Override
								public void loop() {
									/*
								  	barrel=ents.Create("prop_physics")
									barrel:SetModel("models/props_c17/oildrum001.mdl")
									barrel:SetPos(Vector(0,0,0))
									barrel:Spawn()
	
								 */
								MetaVarVector vec = new MetaVarVectorImpl("vec");
								set(ent,getEnts().Create(TEXT("prop_physics")));
								call(ent.SetPos(vec));
								call(ent.Spawn());
								}
							});
							forPair(i,ent,getEnts().FindByClass(TEXT("prop_physics*"))).doLoop(new IDo() {
								@Override
								public void loop() {
									call(getTable().insert(table, NUM(0), ent));
								}
							});
							call(getHalo().Add(table, Color(NUM(255), NUM(0), NUM(0), NUM(255)), NUM(5),NUM(5),NUM(2),BOOL(false),BOOL(false)));
					}});
					return null;
				}
			}));

	}
	
	@Override
	protected MetaCommand getMetaCommand() {
		return metaCommand;
	}
}
