/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Types;

import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author sabat
 */
@Named(value = "typesController")
@ViewScoped
public class TypesController {

    @EJB
    private TypesDAO typesDAO;
    
    public TypesController() {
    }
    
}
