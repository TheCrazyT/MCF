package com.crazyt.gmod;
import com.crazyt.mcf.MetaVar;
public enum CAP implements MetaVar {
CAP_AIM_GUN("CAP_AIM_GUN"),
CAP_ANIMATEDFACE("CAP_ANIMATEDFACE"),
CAP_AUTO_DOORS("CAP_AUTO_DOORS"),
CAP_DUCK("CAP_DUCK"),
CAP_FRIENDLY_DMG_IMMUNE("CAP_FRIENDLY_DMG_IMMUNE"),
CAP_INNATE_MELEE_ATTACK1("CAP_INNATE_MELEE_ATTACK1"),
CAP_INNATE_MELEE_ATTACK2("CAP_INNATE_MELEE_ATTACK2"),
CAP_INNATE_RANGE_ATTACK1("CAP_INNATE_RANGE_ATTACK1"),
CAP_INNATE_RANGE_ATTACK2("CAP_INNATE_RANGE_ATTACK2"),
CAP_MOVE_CLIMB("CAP_MOVE_CLIMB"),
CAP_MOVE_CRAWL("CAP_MOVE_CRAWL"),
CAP_MOVE_FLY("CAP_MOVE_FLY"),
CAP_MOVE_GROUND("CAP_MOVE_GROUND"),
CAP_MOVE_JUMP("CAP_MOVE_JUMP"),
CAP_MOVE_SHOOT("CAP_MOVE_SHOOT"),
CAP_MOVE_SWIM("CAP_MOVE_SWIM"),
CAP_NO_HIT_PLAYER("CAP_NO_HIT_PLAYER"),
CAP_NO_HIT_SQUADMATES("CAP_NO_HIT_SQUADMATES"),
CAP_OPEN_DOORS("CAP_OPEN_DOORS"),
CAP_SIMPLE_RADIUS_DAMAGE("CAP_SIMPLE_RADIUS_DAMAGE"),
CAP_SKIP_NAV_GROUND_CHECK("CAP_SKIP_NAV_GROUND_CHECK"),
CAP_SQUAD("CAP_SQUAD"),
CAP_TURN_HEAD("CAP_TURN_HEAD"),
CAP_USE("CAP_USE"),
CAP_USE_SHOT_REGULATOR("CAP_USE_SHOT_REGULATOR"),
CAP_USE_WEAPONS("CAP_USE_WEAPONS"),
CAP_WEAPON_MELEE_ATTACK1("CAP_WEAPON_MELEE_ATTACK1"),
CAP_WEAPON_MELEE_ATTACK2("CAP_WEAPON_MELEE_ATTACK2"),
CAP_WEAPON_RANGE_ATTACK1("CAP_WEAPON_RANGE_ATTACK1"),
CAP_WEAPON_RANGE_ATTACK2("CAP_WEAPON_RANGE_ATTACK2"),
;
	private String name;
	private CAP(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
