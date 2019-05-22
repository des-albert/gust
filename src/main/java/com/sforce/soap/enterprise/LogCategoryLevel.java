package com.sforce.soap.enterprise;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum LogCategoryLevel {


  
	/**
	 * Enumeration  : None
	 */
	None("None"),

  
	/**
	 * Enumeration  : Finest
	 */
	Finest("Finest"),

  
	/**
	 * Enumeration  : Finer
	 */
	Finer("Finer"),

  
	/**
	 * Enumeration  : Fine
	 */
	Fine("Fine"),

  
	/**
	 * Enumeration  : Debug
	 */
	Debug("Debug"),

  
	/**
	 * Enumeration  : Info
	 */
	Info("Info"),

  
	/**
	 * Enumeration  : Warn
	 */
	Warn("Warn"),

  
	/**
	 * Enumeration  : Error
	 */
	Error("Error"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (LogCategoryLevel e : EnumSet.allOf(LogCategoryLevel.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private LogCategoryLevel(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
