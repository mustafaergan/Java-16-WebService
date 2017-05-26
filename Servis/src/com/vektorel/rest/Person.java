package com.vektorel.rest;

public class Person {
	
	private String id;
	private String name;
	
	
	public Person(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

}
