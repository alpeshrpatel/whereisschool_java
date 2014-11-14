package com.mayfair.hibernate.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.stereotype.Repository;

import com.mayfair.hibernate.dao.exception.DatabaseAccessException;
import com.mayfair.hibernate.dao.generic.GenericDao;

import com.mayfair.hibernate.dao.SchoolDAO;
import com.mayfair.hibernate.entity.School;

@Repository("schoolDAO")
public class SchoolDAOImpl extends GenericDao<School> implements SchoolDAO{

	public SchoolDAOImpl(){}

	public SchoolDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public void save(School School) throws DatabaseAccessException{
		 super.save(School);
	 }
	
	 public List<School> findAll() throws DatabaseAccessException
	 {
		 return super.findAll();
	 }

	@Override
	public void delete(School School) throws DatabaseAccessException {
		// TODO Auto-generated method stub
		super.delete(School);
		
	}

	@Override
	public School find(Long id) throws DatabaseAccessException {
		// TODO Auto-generated method stub
		return super.find(id);
	}

	@Override
	public void deleteAll() throws DatabaseAccessException {
		super.deleteAll();
		
	}

	@Override
	public void saveAll(List<School> item) throws DatabaseAccessException {
		super.saveAll(item);
	}
	

}
