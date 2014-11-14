package edu.igroup.whereisschool.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.igroup.whereisschool.hibernate.dao.CityDao;
import edu.igroup.whereisschool.hibernate.dao.StateDao;
import edu.igroup.whereisschool.hibernate.entity.City;
import edu.igroup.whereisschool.hibernate.entity.State;

public class Main_City {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("persistence-beans.xml");
		CityDao cityDAO = context.getBean(CityDao.class);
		
		
			City city = new City();
			city.setCityId(new Long(31));
			System.out.println(cityDAO.find(new Long(31)).getCityName());
			
			City newCity = new City();
			//newCity.setCityId(new Long(10000));
			newCity.setCityName("AAAAAA");
			newCity.setStateid("GJ");
			cityDAO.add(newCity);
		
		StateDao stateDao =  context.getBean(StateDao.class);
		State state = new State();
		state.setStatename("new state");
		stateDao.add(state);
		
	}

}
