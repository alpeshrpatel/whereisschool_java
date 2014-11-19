package edu.igroup.whereisschool.controller.exception;

import edu.igroup.whereisschool.hibernate.entity.State;

public class StateDeleteException extends Exception{
	
	 private State state;
	
	   public StateDeleteException(State state) {
	        this.state = state;
	    }

	    public State getState() {
	        return state;
	    }
}
