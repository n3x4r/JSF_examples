package com.sergio.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	private String firstName, lastName;

	public Student() {
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
	
	
	

}
