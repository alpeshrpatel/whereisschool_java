package edu.igroup.whereisschool.hibernate.dao;

import edu.igroup.whereisschool.hibernate.entity.*;

/**
 * DAO of employee.
 */
public interface StateDao extends GenericDao<State, Long> {

    /**
     * Tries to remove employee from the system.
     * @param employee Employee to remove
     * @return {@code true} if employee is not assigned to any task
     * or timesheet. Else {@code false}.
     */
    boolean removeState(State state);
    
    

}
