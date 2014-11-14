package com.mayfair.hibernate.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.stereotype.Repository;

import com.mayfair.hibernate.dao.exception.DatabaseAccessException;
import com.mayfair.hibernate.dao.generic.GenericDao;

import com.mayfair.hibernate.dao.LikedEntityDAO;
import com.mayfair.hibernate.entity.LikedEntity;

@Repository("likedEntityDAO")
public class LikedEntityDAOImpl extends GenericDao<LikedEntity> implements LikedEntityDAO{

	public LikedEntityDAOImpl(){}

	public LikedEntityDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public void save(LikedEntity LikedEntity) throws DatabaseAccessException{
		 super.save(LikedEntity);
	 }
	
	 public List<LikedEntity> findAll() throws DatabaseAccessException
	 {
		 return super.findAll();
	 }

	@Override
	public void delete(LikedEntity LikedEntity) throws DatabaseAccessException {
		// TODO Auto-generated method stub
		super.delete(LikedEntity);
		
	}

	@Override
	public LikedEntity find(Long id) throws DatabaseAccessException {
		// TODO Auto-generated method stub
		return super.find(id);
	}

	@Override
	public void deleteAll() throws DatabaseAccessException {
		super.deleteAll();
		
	}

	@Override
	public void saveAll(List<LikedEntity> item) throws DatabaseAccessException {
		super.saveAll(item);
	}
	

}
