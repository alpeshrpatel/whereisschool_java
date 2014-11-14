package edu.igroup.whereisschool.hibernate.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import edu.igroup.whereisschool.hibernate.dao.StateDao;
import edu.igroup.whereisschool.hibernate.dao.HibernateDao;
import edu.igroup.whereisschool.hibernate.entity.State;

@Repository("StateDao")
public class StateDaoImpl extends HibernateDao<State, Long> implements StateDao {

	public boolean removeState(State state) {
		// TODO Auto-generated method stub
		return false;
	}

   
}