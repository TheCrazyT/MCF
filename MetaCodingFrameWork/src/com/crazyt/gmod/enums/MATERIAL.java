package com.crazyt.gmod.enums;
import com.crazyt.mcf.MetaVar;
public enum MATERIAL implements MetaVar {
MATERIAL_LINES("MATERIAL_LINES"),
MATERIAL_LINE_LOOP("MATERIAL_LINE_LOOP"),
MATERIAL_LINE_STRIP("MATERIAL_LINE_STRIP"),
MATERIAL_POINTS("MATERIAL_POINTS"),
MATERIAL_POLYGON("MATERIAL_POLYGON"),
MATERIAL_QUADS("MATERIAL_QUADS"),
MATERIAL_TRIANGLES("MATERIAL_TRIANGLES"),
MATERIAL_TRIANGLE_STRIP("MATERIAL_TRIANGLE_STRIP"),
;
	private String name;
	private MATERIAL(String name){
		this.name = name;
	}
	@Override
	public String _getName() {
		return name;
	}
	@Override
	public void _setName(String name) {}
}
