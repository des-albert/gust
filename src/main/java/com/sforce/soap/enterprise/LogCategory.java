package com.sforce.soap.enterprise;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum LogCategory {


  
	/**
	 * Enumeration  : Db
	 */
	Db("Db"),

  
	/**
	 * Enumeration  : Workflow
	 */
	Workflow("Workflow"),

  
	/**
	 * Enumeration  : Validation
	 */
	Validation("Validation"),

  
	/**
	 * Enumeration  : Callout
	 */
	Callout("Callout"),

  
	/**
	 * Enumeration  : Apex_code
	 */
	Apex_code("Apex_code"),

  
	/**
	 * Enumeration  : Apex_profiling
	 */
	Apex_profiling("Apex_profiling"),

  
	/**
	 * Enumeration  : Visualforce
	 */
	Visualforce("Visualforce"),

  
	/**
	 * Enumeration  : System
	 */
	System("System"),

  
	/**
	 * Enumeration  : All
	 */
	All("All"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (LogCategory e : EnumSet.allOf(LogCategory.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private LogCategory(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
