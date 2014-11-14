package com.mayfair.hibernate.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.stereotype.Repository;

import com.mayfair.hibernate.dao.exception.DatabaseAccessException;
import com.mayfair.hibernate.dao.generic.GenericDao;

import com.mayfair.hibernate.dao.CityDAO;
import com.mayfair.hibernate.entity.City;

@Repository("cityDAO")
public class CityDAOImpl extends GenericDao<City> implements CityDAO{

	public CityDAOImpl(){}

	public CityDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public void save(City City) throws DatabaseAccessException{
		 super.save(City);
	 }
	
	 public List<City> findAll() throws DatabaseAccessException
	 {
		 return super.findAll();
	 }

	@Override
	public void delete(City City) throws DatabaseAccessException {
		// TODO Auto-generated method stub
		super.delete(City);
		
	}

	@Override
	public City find(Long id) throws DatabaseAccessException {
		// TODO Auto-generated method stub
		return super.find(id);
	}

	@Override
	public void deleteAll() throws DatabaseAccessException {
		super.deleteAll();
		
	}

	@Override
	public void saveAll(List<City> item) throws DatabaseAccessException {
		super.saveAll(item);
	}
	

}
