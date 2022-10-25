
package com.portfolio.proyecto.Interface;

import com.portfolio.proyecto.Entity.Persona;
import java.util.List;


public interface PersonaInterface {
    //Traer personas
    public List<Persona> getPersona();
    
    //guardar persona
    public void savePersona (Persona pers);
    
    //eliminar persona por id
    public void deletePersona (Long id);
    
    //buscar una persona por id
    public Persona findPersona (Long id);
    
}
