package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum CLASS implements MetaVar {
CLASS_ANTLION("CLASS_ANTLION"),
CLASS_BARNACLE("CLASS_BARNACLE"),
CLASS_BULLSEYE("CLASS_BULLSEYE"),
CLASS_CITIZEN_PASSIVE("CLASS_CITIZEN_PASSIVE"),
CLASS_CITIZEN_REBEL("CLASS_CITIZEN_REBEL"),
CLASS_COMBINE("CLASS_COMBINE"),
CLASS_COMBINE_GUNSHIP("CLASS_COMBINE_GUNSHIP"),
CLASS_COMBINE_HUNTER("CLASS_COMBINE_HUNTER"),
CLASS_CONSCRIPT("CLASS_CONSCRIPT"),
CLASS_EARTH_FAUNA("CLASS_EARTH_FAUNA"),
CLASS_FLARE("CLASS_FLARE"),
CLASS_HACKED_ROLLERMINE("CLASS_HACKED_ROLLERMINE"),
CLASS_HEADCRAB("CLASS_HEADCRAB"),
CLASS_MANHACK("CLASS_MANHACK"),
CLASS_METROPOLICE("CLASS_METROPOLICE"),
CLASS_MILITARY("CLASS_MILITARY"),
CLASS_MISSILE("CLASS_MISSILE"),
CLASS_NONE("CLASS_NONE"),
CLASS_PLAYER("CLASS_PLAYER"),
CLASS_PLAYER_ALLY("CLASS_PLAYER_ALLY"),
CLASS_PLAYER_ALLY_VITAL("CLASS_PLAYER_ALLY_VITAL"),
CLASS_PROTOSNIPER("CLASS_PROTOSNIPER"),
CLASS_SCANNER("CLASS_SCANNER"),
CLASS_STALKER("CLASS_STALKER"),
CLASS_VORTIGAUNT("CLASS_VORTIGAUNT"),
CLASS_ZOMBIE("CLASS_ZOMBIE"),
;
	private String name;
	private CLASS(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
