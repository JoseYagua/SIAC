package com.solutionsDevelopers.Controller;

import com.solutionsDevelopers.ValidatorModels.LoginValidator;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;


/**
 *
 * @author José Yagua
 */

@Controller
public class LoginController {

    private final LoginValidator loginValidator;
    private final ModelAndView mav;
    /// Builder for class LoginController
    public LoginController() {
    this.loginValidator = new LoginValidator();
    this.mav = new ModelAndView();
    }
    
    
    /// Method Get for Login
    @RequestMapping(value = "Login.htm", method = RequestMethod.GET)
    public ModelAndView Login(HttpServletRequest re) {
        mav.addObject("Usuarios", "Jose");
        mav.setViewName("Login/Login");
        return mav;
    }

    
    @RequestMapping(value = "Bienvenida.htm", method = RequestMethod.GET)
    public ModelAndView Bienvenida(HttpServletRequest re) {
        mav.addObject("Usuarios", "Jose");
        mav.setViewName("Pages/Login/Bienvenida");
        return mav;
    }
    
}