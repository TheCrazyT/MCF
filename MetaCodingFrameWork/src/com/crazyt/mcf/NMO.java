package com.crazyt.mcf;

import java.lang.reflect.Method;

public class NMO {
	private String name;
	private Method method;
	private Object object;
	public NMO(String name,Method method,Object object){
		this.name = name;
		this.method = method;
		this.object = object;
	}
	public String getName() {
		return name;
	}
	public Method getMethod() {
		return method;
	}
	public Object getObject() {
		return object;
	}
}
