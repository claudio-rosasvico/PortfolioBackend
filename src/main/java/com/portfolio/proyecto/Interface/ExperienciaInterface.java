
package com.portfolio.proyecto.Interface;

import com.portfolio.proyecto.Entity.Experiencia;
import java.util.List;


public interface ExperienciaInterface {
    
    public List<Experiencia> getExperiencia();
    
    public void saveExperiencia (Experiencia exp);
    
    public void deleteExperiencia (Experiencia exp);
    
    public void deleteExperiencia (Long id);
    
    public Experiencia findExperiencia (Long id);
    
    

    

    
}
