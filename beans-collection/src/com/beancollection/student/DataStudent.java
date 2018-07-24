package com.beancollection.student;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class DataStudent {
private List<Students> listStudents;
	
	public DataStudent() {
		listStudents = new ArrayList<>();
		listStudents.add(new Students("Sergio", "Cacho"));
		listStudents.add(new Students("Juancho", "Cacho"));
		listStudents.add(new Students("Elvis", "Cacho"));
		
	}

	public List<Students> getListStudents() {
		return listStudents;
	}

	public void setListStudents(List<Students> listStudents) {
		this.listStudents = listStudents;
	}
	
	
}
