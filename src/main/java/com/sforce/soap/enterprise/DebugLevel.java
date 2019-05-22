package com.sforce.soap.enterprise;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum DebugLevel {


  
	/**
	 * Enumeration  : None
	 */
	None("None"),

  
	/**
	 * Enumeration  : DebugOnly
	 */
	DebugOnly("DebugOnly"),

  
	/**
	 * Enumeration  : Db
	 */
	Db("Db"),

  
	/**
	 * Enumeration  : Profiling
	 */
	Profiling("Profiling"),

  
	/**
	 * Enumeration  : Callout
	 */
	Callout("Callout"),

  
	/**
	 * Enumeration  : Detail
	 */
	Detail("Detail"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (DebugLevel e : EnumSet.allOf(DebugLevel.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private DebugLevel(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}