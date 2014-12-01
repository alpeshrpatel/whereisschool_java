package edu.igroup.whereisschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.igroup.whereisschool.controller.exception.CityDeleteException;
import edu.igroup.whereisschool.hibernate.dao.CityDao;
import edu.igroup.whereisschool.hibernate.entity.City;

/**
 * Controller for handling Citys.
 */
@Controller
@RequestMapping("/citys")
public class CityController {
	
	@Autowired(required = true)
    private CityDao cityDao;

    @Autowired
    public void setCityDao(CityDao CityDao) {
        this.cityDao = CityDao;
    }

    public CityDao getCityDao() {
        return cityDao;
    }

    /**
     * Retrieves Citys, puts them in the model and returns corresponding view
     * @param model Model to put Citys to
     * @return citys/list
     */
    @RequestMapping(method = RequestMethod.GET)
    public String showCitys(Model model) {
        List<City> Citys = cityDao.list();
        model.addAttribute("Citys", Citys);

        return "citys/list";
    }

    /**
     * Deletes City with specified ID
     * @param id City's ID
     * @return redirects to Citys if everything was ok
     * @throws CityDeleteException When City cannot be deleted
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteCity(@PathVariable("id") long id)
            throws CityDeleteException {

        City toDelete = cityDao.find(id);
        boolean wasDeleted = cityDao.removeCity(toDelete);

        if (!wasDeleted) {
            throw new CityDeleteException(toDelete);
        }

        // everything OK, see remaining Citys
        return "redirect:/citys";
    }

    /**
     * Handles CityDeleteException
     * @param e Thrown exception with City that couldn't be deleted
     * @return binds City to model and returns citys/delete-error
     */
    @ExceptionHandler(CityDeleteException.class)
    public ModelAndView handleDeleteException(CityDeleteException e) {
        ModelMap model = new ModelMap();
        model.put("city", e.getCity());
        return new ModelAndView("citys/delete-error", model);
    }

    /**
     * Returns City with specified ID
     * @param id City's ID
     * @param model Model to put City to
     * @return citys/view
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getCity(@PathVariable("id") long id, Model model) {
        City city = cityDao.find(id);
        model.addAttribute("city", city);

        return "citys/view";
    }

    /**
     * Updates City with specified ID
     * @param id City's ID
     * @param city City to update (bounded from HTML form)
     * @return redirects to Citys
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String updateCity(@PathVariable("id") long id, City city) {
        city.setCityId(id);
        cityDao.update(city);

        return "redirect:/citys";
    }

    /**
     * Creates form for new City
     * @param model Model to bind to HTML form
     * @return citys/new
     */
    @RequestMapping(params = "new", method = RequestMethod.GET)
    public String createCityForm(Model model) {
        model.addAttribute("city", new City());
        return "citys/new";
    }

    /**
     * Saves new City to the database
     * @param City City to save
     * @return redirects to Citys
     */
    @RequestMapping(method = RequestMethod.POST)
    public String addCity(City City) {
        cityDao.add(City);

        return "redirect:/citys";
    }
    
}
