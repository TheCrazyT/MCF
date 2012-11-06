package com.crazyt.mcf;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) 
public @interface SourceInfo {
	String folder();
	String info();
}
