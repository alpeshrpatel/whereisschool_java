package com.mayfair.hibernate.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.stereotype.Repository;

import com.mayfair.hibernate.dao.exception.DatabaseAccessException;
import com.mayfair.hibernate.dao.generic.GenericDao;

import com.mayfair.hibernate.dao.SchoolRatingDAO;
import com.mayfair.hibernate.entity.SchoolRating;

@Repository("schoolRatingDAO")
public class SchoolRatingDAOImpl extends GenericDao<SchoolRating> implements SchoolRatingDAO{

	public SchoolRatingDAOImpl(){}

	public SchoolRatingDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public void save(SchoolRating SchoolRating) throws DatabaseAccessException{
		 super.save(SchoolRating);
	 }
	
	 public List<SchoolRating> findAll() throws DatabaseAccessException
	 {
		 return super.findAll();
	 }

	@Override
	public void delete(SchoolRating SchoolRating) throws DatabaseAccessException {
		// TODO Auto-generated method stub
		super.delete(SchoolRating);
		
	}

	@Override
	public SchoolRating find(Long id) throws DatabaseAccessException {
		// TODO Auto-generated method stub
		return super.find(id);
	}

	@Override
	public void deleteAll() throws DatabaseAccessException {
		super.deleteAll();
		
	}

	@Override
	public void saveAll(List<SchoolRating> item) throws DatabaseAccessException {
		super.saveAll(item);
	}
	

}
