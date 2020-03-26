package com.stackroute.datamunger.query.parser;

/*
 * This class is used for storing name of field, condition and value for 
 * each conditions
 * */
public class Restriction {
	
	private String propertyName;
	private String propertyValue;
	private String condition;
	

	// Write logic for constructor
	public Restriction(String name, String value, String condition) {
		super();
		this.propertyName=name;
		this.propertyValue=value;
		this.condition=condition;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String name) {
		this.propertyName = name;
	}

	public String getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(String value) {
		this.propertyValue = value;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	@Override
	public String toString() {
		return "Restriction [name=" + propertyName + ", value=" + propertyValue + ", condition=" + condition + "]";
	}

}
