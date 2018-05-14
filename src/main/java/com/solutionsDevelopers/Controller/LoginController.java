/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solutionsDevelopers.Controller;

import com.solutionsDevelopers.ValidatorModels.LoginValidator;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author José Yagua
 */
public class LoginController {

    private final LoginValidator loginValidator;

    /// Builder for class LoginController
    public LoginController() {
    this.loginValidator = new LoginValidator();
    }
    
    /// Method Get for Login
       @RequestMapping(method = RequestMethod.GET)
    public ModelAndView Login() {
        ModelAndView mav = new ModelAndView();
//        mav.addObject("Usuarios", new Usuarios());
        mav.setViewName("Login/Login");
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView Bienvenida() {
        ModelAndView mav = new ModelAndView();
//        mav.addObject("Usuarios", new Usuarios());
        mav.setViewName("Login/Bienvenida");
        return mav;
    }
    
}