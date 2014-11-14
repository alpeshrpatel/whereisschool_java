package com.mayfair.hibernate.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.stereotype.Repository;

import com.mayfair.hibernate.dao.exception.DatabaseAccessException;
import com.mayfair.hibernate.dao.generic.GenericDao;

import com.mayfair.hibernate.dao.CurriculumDAO;
import com.mayfair.hibernate.entity.Curriculum;

@Repository("curriculumDAO")
public class CurriculumDAOImpl extends GenericDao<Curriculum> implements CurriculumDAO{

	public CurriculumDAOImpl(){}

	public CurriculumDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public void save(Curriculum Curriculum) throws DatabaseAccessException{
		 super.save(Curriculum);
	 }
	
	 public List<Curriculum> findAll() throws DatabaseAccessException
	 {
		 return super.findAll();
	 }

	@Override
	public void delete(Curriculum Curriculum) throws DatabaseAccessException {
		// TODO Auto-generated method stub
		super.delete(Curriculum);
		
	}

	@Override
	public Curriculum find(Long id) throws DatabaseAccessException {
		// TODO Auto-generated method stub
		return super.find(id);
	}

	@Override
	public void deleteAll() throws DatabaseAccessException {
		super.deleteAll();
		
	}

	@Override
	public void saveAll(List<Curriculum> item) throws DatabaseAccessException {
		super.saveAll(item);
	}
	

}
