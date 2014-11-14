package edu.igroup.whereisschool.hibernate.exception;

import org.hibernate.HibernateException;


public class DatabaseAccessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public DatabaseAccessException(HibernateException e) {
		super(e);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
