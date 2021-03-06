package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum SF implements MetaVar {
SF_CITIZEN_AMMORESUPPLIER("SF_CITIZEN_AMMORESUPPLIER"),
SF_CITIZEN_FOLLOW("SF_CITIZEN_FOLLOW"),
SF_CITIZEN_IGNORE_SEMAPHORE("SF_CITIZEN_IGNORE_SEMAPHORE"),
SF_CITIZEN_MEDIC("SF_CITIZEN_MEDIC"),
SF_CITIZEN_NOT_COMMANDABLE("SF_CITIZEN_NOT_COMMANDABLE"),
SF_CITIZEN_RANDOM_HEAD("SF_CITIZEN_RANDOM_HEAD"),
SF_CITIZEN_RANDOM_HEAD_FEMALE("SF_CITIZEN_RANDOM_HEAD_FEMALE"),
SF_CITIZEN_RANDOM_HEAD_MALE("SF_CITIZEN_RANDOM_HEAD_MALE"),
SF_CITIZEN_USE_RENDER_BOUNDS("SF_CITIZEN_USE_RENDER_BOUNDS"),
SF_FLOOR_TURRET_CITIZEN("SF_FLOOR_TURRET_CITIZEN"),
SF_NPC_ALTCOLLISION("SF_NPC_ALTCOLLISION"),
SF_NPC_ALWAYSTHINK("SF_NPC_ALWAYSTHINK"),
SF_NPC_DROP_HEALTHKIT("SF_NPC_DROP_HEALTHKIT"),
SF_NPC_FADE_CORPSE("SF_NPC_FADE_CORPSE"),
SF_NPC_FALL_TO_GROUND("SF_NPC_FALL_TO_GROUND"),
SF_NPC_GAG("SF_NPC_GAG"),
SF_NPC_LONG_RANGE("SF_NPC_LONG_RANGE"),
SF_NPC_NO_PLAYER_PUSHAWAY("SF_NPC_NO_PLAYER_PUSHAWAY"),
SF_NPC_NO_WEAPON_DROP("SF_NPC_NO_WEAPON_DROP"),
SF_NPC_START_EFFICIENT("SF_NPC_START_EFFICIENT"),
SF_NPC_TEMPLATE("SF_NPC_TEMPLATE"),
SF_NPC_WAIT_FOR_SCRIPT("SF_NPC_WAIT_FOR_SCRIPT"),
SF_NPC_WAIT_TILL_SEEN("SF_NPC_WAIT_TILL_SEEN"),
SF_PHYSBOX_MOTIONDISABLED("SF_PHYSBOX_MOTIONDISABLED"),
SF_PHYSBOX_NEVER_PICK_UP("SF_PHYSBOX_NEVER_PICK_UP"),
SF_PHYSPROP_MOTIONDISABLED("SF_PHYSPROP_MOTIONDISABLED"),
SF_PHYSPROP_PREVENT_PICKUP("SF_PHYSPROP_PREVENT_PICKUP"),
SF_ROLLERMINE_FRIENDLY("SF_ROLLERMINE_FRIENDLY"),
;
	private String name;
	private SF(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
