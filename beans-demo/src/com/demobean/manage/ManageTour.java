package com.demobean.manage;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ManageTour {
	private List<String> listTour;
	private String tourSelected;
	
	
	
	
	public ManageTour() {
		listTour = new ArrayList<String>();
		listTour.add("country");
		listTour.add("city");
		
	}
	public List<String> getListTour() {
		return listTour;
	}
	public void setListTour(List<String> listTour) {
		this.listTour = listTour;
	}
	public String getTourSelected() {
		return tourSelected;
	}
	public void setTourSelected(String tourSelected) {
		this.tourSelected = tourSelected;
	}
	
	
	public String onSelectedComboTour() {
		if(tourSelected != null && tourSelected.equals("city")) {
			return "city_tour";
		}else {
			return "country_tour";
		}
	}
	
	


}
