package edu.igroup.whereisschool.hibernate.dao;

import edu.igroup.whereisschool.hibernate.entity.SchoolReview;

/**
 * DAO of employee.
 */
public interface SchoolReviewDao extends GenericDao<SchoolReview, Long> {

    /**
     * Tries to remove employee from the system.
     * @param employee Employee to remove
     * @return {@code true} if employee is not assigned to any task
     * or timesheet. Else {@code false}.
     */
    boolean removeSchoolReview(SchoolReview schoolReview);
    
    

}
