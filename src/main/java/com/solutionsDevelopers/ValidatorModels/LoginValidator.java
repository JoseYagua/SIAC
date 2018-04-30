/*
 * Class to implements validator Model Login
 */
package com.solutionsDevelopers.ValidatorModels;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author José Yagua
 */
public class LoginValidator implements Validator  {
 
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public void validate(Object o, Errors errors) {
      //  Usuarios usuarios = (Usuarios) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nomIdUsuario",
                "required.nomIdUsuario",
                "Debe Ingresar el Usuario."
        );

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contrasena",
                "required.contrasena",
                "Debe Ingresar la Contraseña."
        );
        
    }

    @Override
    public boolean supports(Class<?> type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
