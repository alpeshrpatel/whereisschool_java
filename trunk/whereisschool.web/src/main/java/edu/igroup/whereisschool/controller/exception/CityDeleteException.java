package edu.igroup.whereisschool.controller.exception;

import edu.igroup.whereisschool.hibernate.entity.City;

public class CityDeleteException extends Exception{
	
	 private City city;
	
	   public CityDeleteException(City city) {
	        this.city = city;
	    }

	    public City getCity() {
	        return city;
	    }
}
