package com.manage.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.eclipse.jdt.internal.compiler.flow.LoopingFlowContext;


@ManagedBean
@SessionScoped
public class StudentController {
	private List<Student> students;
	private StudentDbUtil studentDbUtil;
	private Logger logger = Logger.getLogger(getClass().getName());
	
	public StudentController() throws Exception{
		students = new ArrayList<>();
		studentDbUtil = StudentDbUtil.getInstance();
	}
	
	public List<Student> getStudents(){
		return students;
	}
	public void loadStudents() {
		logger.info("Loading Students");
		students.clear();
		
		try {
			students = studentDbUtil.getStudents();
		}catch (Exception exc) {
			// send this to server logs
			logger.log(Level.SEVERE, "Error loading students", exc);
			
			// add error message for JSF page
			addErrorMessage(exc);
		}
	}
	
	
	public String loadStudent(int studentId) {
		
		logger.info("loading student: " + studentId);
		
		try {
			// get student from database
			Student theStudent = studentDbUtil.getStudent(studentId);
			
			// put in the request attribute ... so we can use it on the form page
			ExternalContext externalContext = 
						FacesContext.getCurrentInstance().getExternalContext();		

			Map<String, Object> requestMap = externalContext.getRequestMap();
			requestMap.put("student", theStudent);	
			
		} catch (Exception exc) {
			// send this to server logs
			logger.log(Level.SEVERE, "Error loading student id:" + studentId, exc);
			
			// add error message for JSF page
			addErrorMessage(exc);
			
			return null;
		}
				
		return "update-student-form.xhtml";
	}	
	
	
	private void addErrorMessage(Exception exc) {
		FacesMessage message = new FacesMessage("Error: " + exc.getMessage());
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	public String addStudent(Student student) {
		logger.info("Prepaid insert of Student");
		
		try {
			studentDbUtil.addStudent(student);
			
		}catch(Exception exc) {
			logger.log(Level.SEVERE, "Error adding student", exc);
			// add error message for JSF page
			addErrorMessage(exc);
			return null;
		}
		return "list-students?faces-redirect=true";
	}
	
	public String updateStudent(Student theStudent) {

		logger.info("updating student: " + theStudent);
		
		try {
			
			// update student in the database
			studentDbUtil.updateStudent(theStudent);
			
		} catch (Exception exc) {
			// send this to server logs
			logger.log(Level.SEVERE, "Error updating student: " + theStudent, exc);
			
			// add error message for JSF page
			addErrorMessage(exc);
			
			return null;
		}
		
		return "list-students?faces-redirect=true";		
	}
	
	public String deleteStudent(int studentId) {

		logger.info("deleting student: " + studentId);
		
		try {
			
			// update student in the database
			studentDbUtil.deleteStudent(studentId);
			
		} catch (Exception exc) {
			// send this to server logs
			logger.log(Level.SEVERE, "Error deleting student: " + studentId, exc);
			
			// add error message for JSF page
			addErrorMessage(exc);
			
			return null;
		}
		
		return "list-students?faces-redirect=true";		
	}
}
