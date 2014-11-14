package com.mayfair.hibernate.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.stereotype.Repository;

import com.mayfair.hibernate.dao.exception.DatabaseAccessException;
import com.mayfair.hibernate.dao.generic.GenericDao;

import com.mayfair.hibernate.dao.UserDAO;
import com.mayfair.hibernate.entity.User;

@Repository("userDAO")
public class UserDAOImpl extends GenericDao<User> implements UserDAO{

	public UserDAOImpl(){}

	public UserDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public void save(User User) throws DatabaseAccessException{
		 super.save(User);
	 }
	
	 public List<User> findAll() throws DatabaseAccessException
	 {
		 return super.findAll();
	 }

	@Override
	public void delete(User User) throws DatabaseAccessException {
		// TODO Auto-generated method stub
		super.delete(User);
		
	}

	@Override
	public User find(Long id) throws DatabaseAccessException {
		// TODO Auto-generated method stub
		return super.find(id);
	}

	@Override
	public void deleteAll() throws DatabaseAccessException {
		super.deleteAll();
		
	}

	@Override
	public void saveAll(List<User> item) throws DatabaseAccessException {
		super.saveAll(item);
	}
	

}
