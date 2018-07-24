package com.demobean.manage;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
//@ApplicationScoped // all the users share the session
//@SessionScoped // all the users have the own session
// @RequestScoped // if the default scoped only work one time 
public class CounterBean {
	
	private int counter = 0;
	
	public CounterBean() {
		
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public void incrementCounter() {
		this.counter++;
	}
}
