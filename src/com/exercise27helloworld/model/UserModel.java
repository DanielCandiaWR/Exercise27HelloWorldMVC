package com.exercise27helloworld.model;

public class UserModel {
	private long id;
	private byte age;
	private String name;
	
	public UserModel() {
		
	}
	public UserModel(long id,byte age,String name) {
		
	}
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public byte getAge() {
		return this.age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
