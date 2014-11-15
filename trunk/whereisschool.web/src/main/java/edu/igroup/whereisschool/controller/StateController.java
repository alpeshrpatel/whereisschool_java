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

import edu.igroup.whereisschool.controller.exception.StateDeleteException;
import edu.igroup.whereisschool.hibernate.dao.StateDao;
import edu.igroup.whereisschool.hibernate.entity.State;

/**
 * Controller for handling States.
 */
@Controller
@RequestMapping("/states")
public class StateController {

    private StateDao stateDao;

    @Autowired
    public void setStateDao(StateDao StateDao) {
        this.stateDao = StateDao;
    }

    public StateDao getStateDao() {
        return stateDao;
    }

    /**
     * Retrieves states, puts them in the model and returns corresponding view
     * @param model Model to put states to
     * @return states/list
     */
    @RequestMapping(method = RequestMethod.GET)
    public String showStates(Model model) {
        List<State> States = stateDao.list();
        model.addAttribute("States", States);

        return "states/list";
    }

    /**
     * Deletes State with specified ID
     * @param id State's ID
     * @return redirects to States if everything was ok
     * @throws StateDeleteException When State cannot be deleted
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteState(@PathVariable("id") long id)
            throws StateDeleteException {

        State toDelete = stateDao.find(id);
        boolean wasDeleted = stateDao.removeState(toDelete);

        if (!wasDeleted) {
            throw new StateDeleteException(toDelete);
        }

        // everything OK, see remaining States
        return "redirect:/states";
    }

    /**
     * Handles StateDeleteException
     * @param e Thrown exception with State that couldn't be deleted
     * @return binds State to model and returns states/delete-error
     */
    @ExceptionHandler(StateDeleteException.class)
    public ModelAndView handleDeleteException(StateDeleteException e) {
        ModelMap model = new ModelMap();
        model.put("State", e.getState());
        return new ModelAndView("states/delete-error", model);
    }

    /**
     * Returns State with specified ID
     * @param id State's ID
     * @param model Model to put State to
     * @return states/view
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getState(@PathVariable("id") long id, Model model) {
        State State = stateDao.find(id);
        model.addAttribute("State", State);

        return "states/view";
    }

    /**
     * Updates State with specified ID
     * @param id State's ID
     * @param state State to update (bounded from HTML form)
     * @return redirects to States
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String updateState(@PathVariable("id") long id, State state) {
        state.setStateid((int)id);
        stateDao.update(state);

        return "redirect:/States";
    }

    /**
     * Creates form for new State
     * @param model Model to bind to HTML form
     * @return states/new
     */
    @RequestMapping(params = "new", method = RequestMethod.GET)
    public String createStateForm(Model model) {
        model.addAttribute("State", new State());
        return "states/new";
    }

    /**
     * Saves new State to the database
     * @param State State to save
     * @return redirects to States
     */
    @RequestMapping(method = RequestMethod.POST)
    public String addState(State State) {
        stateDao.add(State);

        return "redirect:/States";
    }
    
}
