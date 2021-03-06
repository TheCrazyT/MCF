package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum EFL implements MetaVar {
EFL_BOT_FROZEN("EFL_BOT_FROZEN"),
EFL_CHECK_UNTOUCH("EFL_CHECK_UNTOUCH"),
EFL_DIRTY_ABSANGVELOCITY("EFL_DIRTY_ABSANGVELOCITY"),
EFL_DIRTY_ABSTRANSFORM("EFL_DIRTY_ABSTRANSFORM"),
EFL_DIRTY_ABSVELOCITY("EFL_DIRTY_ABSVELOCITY"),
EFL_DIRTY_SHADOWUPDATE("EFL_DIRTY_SHADOWUPDATE"),
EFL_DIRTY_SPATIAL_PARTITION("EFL_DIRTY_SPATIAL_PARTITION"),
EFL_DIRTY_SURROUNDING_COLLISION_BOUNDS("EFL_DIRTY_SURROUNDING_COLLISION_BOUNDS"),
EFL_DONTBLOCKLOS("EFL_DONTBLOCKLOS"),
EFL_DONTWALKON("EFL_DONTWALKON"),
EFL_DORMANT("EFL_DORMANT"),
EFL_FORCE_CHECK_TRANSMIT("EFL_FORCE_CHECK_TRANSMIT"),
EFL_HAS_PLAYER_CHILD("EFL_HAS_PLAYER_CHILD"),
EFL_IN_SKYBOX("EFL_IN_SKYBOX"),
EFL_IS_BEING_LIFTED_BY_BARNACLE("EFL_IS_BEING_LIFTED_BY_BARNACLE"),
EFL_KEEP_ON_RECREATE_ENTITIES("EFL_KEEP_ON_RECREATE_ENTITIES"),
EFL_KILLME("EFL_KILLME"),
EFL_NOCLIP_ACTIVE("EFL_NOCLIP_ACTIVE"),
EFL_NOTIFY("EFL_NOTIFY"),
EFL_NO_AUTO_EDICT_ATTACH("EFL_NO_AUTO_EDICT_ATTACH"),
EFL_NO_DAMAGE_FORCES("EFL_NO_DAMAGE_FORCES"),
EFL_NO_DISSOLVE("EFL_NO_DISSOLVE"),
EFL_NO_GAME_PHYSICS_SIMULATION("EFL_NO_GAME_PHYSICS_SIMULATION"),
EFL_NO_MEGAPHYSCANNON_RAGDOLL("EFL_NO_MEGAPHYSCANNON_RAGDOLL"),
EFL_NO_PHYSCANNON_INTERACTION("EFL_NO_PHYSCANNON_INTERACTION"),
EFL_NO_ROTORWASH_PUSH("EFL_NO_ROTORWASH_PUSH"),
EFL_NO_THINK_FUNCTION("EFL_NO_THINK_FUNCTION"),
EFL_NO_WATER_VELOCITY_CHANGE("EFL_NO_WATER_VELOCITY_CHANGE"),
EFL_SERVER_ONLY("EFL_SERVER_ONLY"),
EFL_SETTING_UP_BONES("EFL_SETTING_UP_BONES"),
EFL_TOUCHING_FLUID("EFL_TOUCHING_FLUID"),
EFL_USE_PARTITION_WHEN_NOT_SOLID("EFL_USE_PARTITION_WHEN_NOT_SOLID"),
;
	private String name;
	private EFL(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
