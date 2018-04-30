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
        mav.setViewName("Administrador/login");
        return mav;
    }

    /// Method Post for Login
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView Login(
    //        @ModelAttribute("Usuarios") Usuarios m,
            BindingResult result,
            SessionStatus status,
            HttpServletRequest re,
            Model model
    ) throws IOException {
      //  this.loginValidator.validate(m, result);
        if (result.hasErrors()) {
            ModelAndView mav = new ModelAndView();
            mav.setViewName("Administrador/login");
            //mav.addObject("Usuarios", new Usuarios());
            return mav;
        } else {
            ModelAndView mav = new ModelAndView();
    /*
            MetodosHql meto= new MetodosHql();
            Usuarios usu = meto.buscarUsuario(new Usuarios(m.getNomIdUsuario(), new Encriptacion().encripta(m.getContrasena())));
                Datos_pc pc = new Datos_pc().obtener();
                meto.guardarDatos(
                        new LogSession(
                                usu.getIdUsuarios(),
                                pc.getIp(),
                                pc.getMac(),
                                pc.getHost(),
                                true));
                HttpSession session = re.getSession(true);
                session.setAttribute("usuario", usu);
                mav.addObject("usuario", usu);
                meto.modificarConexion(usu.getIdUsuarios(), true);
                */
                mav.setViewName("redirect:/index_admin.htm");
            return mav;
        }
    }
}