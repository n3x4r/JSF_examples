package com.sergio.jsf.validate;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class Student {
	private String firstName, lastName, email, postalCode, DNI, courseCode;
	private int passes;
	
	public String getFirstName() {
		return firstName;
	}
	
	
	
	
	
	public String getDNI() {
		return DNI;
	}
	
	





	public String getCourseCode() {
		return courseCode;
	}





	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}





	public void setDNI(String dNI) {
		DNI = dNI;
	}





	public int getPasses() {
		return passes;
	}



	public void setPasses(int passes) {
		this.passes = passes;
	}



	public String getPostalCode() {
		return postalCode;
	}



	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//Custom validation 
	public void validateTheCourseCode(FacesContext contex, UIComponent component, Object value) throws ValidatorException{
		
		if(value==null) {
			return;
		}
		
		String data = value.toString();
		
		if(!data.startsWith("CODE")) {
			FacesMessage message = new FacesMessage("Course code must start with CODE");
			
			throw new ValidatorException(message);
		}
		
	}
	
	
}
