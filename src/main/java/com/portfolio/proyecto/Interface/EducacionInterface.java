
package com.portfolio.proyecto.Interface;

import com.portfolio.proyecto.Entity.Educacion;
import java.util.List;


public interface EducacionInterface {
    
    public List<Educacion> getEducacion();
    
    public void saveEducacion (Educacion edu);
    
    public void deleteEducacion (Educacion edu);
    
    public void deleteEducacion (Long id);
    
    public Educacion findEducacion (Long id);
}
