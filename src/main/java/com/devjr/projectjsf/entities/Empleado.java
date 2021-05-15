package com.devjr.projectjsf.entities;

public class Empleado {
	
	private String name;
	private String firstName;
	private String lastName;
	private String post;
	private boolean status;
	
	public Empleado() {
		
	}
	public Empleado(String name, String firstName, String lastName, String post, boolean status) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.lastName = lastName;
		this.post = post;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
