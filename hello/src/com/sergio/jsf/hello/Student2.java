package com.sergio.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student2 {
	
	private String firstName = "Juan";
	private String lastName;
	private String country, favouriteLanguage;
	private List<String> countryOptions, languageOptions, hobbieOptions; 
	private List<String> favouriteHobby;
	
	public Student2() {
		
		countryOptions = new ArrayList<>();
		countryOptions.add("Brazil");
		countryOptions.add("Peru");
		countryOptions.add("España");
		countryOptions.add("Holanda");
		
		languageOptions = new ArrayList<>();
		languageOptions.add("Java");
		languageOptions.add(".Net");
		languageOptions.add("Cobol");
		languageOptions.add("C++");
		
		hobbieOptions = new ArrayList<>();
		hobbieOptions.add("Guitar");
		hobbieOptions.add("Football");
		hobbieOptions.add("Basketball");
		
		favouriteHobby = new ArrayList<>();
		favouriteHobby.add("Guitar");
		
	}
	


	public List<String> getFavouriteHobby() {
		return favouriteHobby;
	}


	public void setFavouriteHobby(List<String> favouriteHobby) {
		this.favouriteHobby = favouriteHobby;
	}




	public List<String> getHobbieOptions() {
		return hobbieOptions;
	}




	public List<String> getLanguageOptions() {
		return languageOptions;
	}


	public void setCountryOptions(List<String> countryOptions) {
		this.countryOptions = countryOptions;
	}


	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}
	
	

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}


	public List<String> getCountryOptions() {
		return countryOptions;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
