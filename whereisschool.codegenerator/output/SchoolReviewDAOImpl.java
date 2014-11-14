package com.mayfair.hibernate.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.stereotype.Repository;

import com.mayfair.hibernate.dao.exception.DatabaseAccessException;
import com.mayfair.hibernate.dao.generic.GenericDao;

import com.mayfair.hibernate.dao.SchoolReviewDAO;
import com.mayfair.hibernate.entity.SchoolReview;

@Repository("schoolReviewDAO")
public class SchoolReviewDAOImpl extends GenericDao<SchoolReview> implements SchoolReviewDAO{

	public SchoolReviewDAOImpl(){}

	public SchoolReviewDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public void save(SchoolReview SchoolReview) throws DatabaseAccessException{
		 super.save(SchoolReview);
	 }
	
	 public List<SchoolReview> findAll() throws DatabaseAccessException
	 {
		 return super.findAll();
	 }

	@Override
	public void delete(SchoolReview SchoolReview) throws DatabaseAccessException {
		// TODO Auto-generated method stub
		super.delete(SchoolReview);
		
	}

	@Override
	public SchoolReview find(Long id) throws DatabaseAccessException {
		// TODO Auto-generated method stub
		return super.find(id);
	}

	@Override
	public void deleteAll() throws DatabaseAccessException {
		super.deleteAll();
		
	}

	@Override
	public void saveAll(List<SchoolReview> item) throws DatabaseAccessException {
		super.saveAll(item);
	}
	

}
