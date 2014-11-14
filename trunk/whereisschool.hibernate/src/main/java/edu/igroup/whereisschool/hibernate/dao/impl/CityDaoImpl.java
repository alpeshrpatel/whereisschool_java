package edu.igroup.whereisschool.hibernate.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import edu.igroup.whereisschool.hibernate.dao.CityDao;
import edu.igroup.whereisschool.hibernate.dao.HibernateDao;
import edu.igroup.whereisschool.hibernate.entity.City;

@Repository("cityDao")
public class CityDaoImpl extends HibernateDao<City, Long> implements CityDao {

    public boolean removeCity(City city) {
        Query employeeTaskQuery = currentSession().createQuery(
                "from cities t where :id in elements(t.assignedEmployees)");
        employeeTaskQuery.setParameter("city_id", city.getCityId());

        // employee mustn't be assigned on no task
        if (!employeeTaskQuery.list().isEmpty()) {
            return false;
        }
//
//        Query employeeTimesheetQuery = currentSession().createQuery(
//                "from Timesheet t where t.who.id = :id");
//        employeeTimesheetQuery.setParameter("id", employee.getId());
//
//        // employee mustn't be assigned to any timesheet
//        if (!employeeTimesheetQuery.list().isEmpty()) {
//            return false;
 //       }

        // ok, remove as usual
        remove(city);
        return true;

    }
}
