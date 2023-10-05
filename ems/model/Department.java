package com.vodafone.ems.model;

public class Department {
	private static long lastId;
	
	private long 	id;
	private String 	name;
	private String 	location;
	
	public long 	getId() 						{ return id; }
	
	public String 	getName() 						{ return name; }
	public void 	setName(String name) 			{ this.name = name; }
	
	public String 	getLocation() 					{ return location; }
	public void 	setLocation(String location) 	{ this.location = location; }
	
	public Department(String name, String location) {
		id 				= ++lastId;
		this.name 		= name;
		this.location 	= location;
	}
	
	public Department() {}
	
	@Override public String toString() {
		return "Department [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
}