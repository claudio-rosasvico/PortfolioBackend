
package com.portfolio.proyecto.Interface;

import com.portfolio.proyecto.Entity.Proyecto;
import java.util.List;


public interface ProyectoInterface {
    
    public List<Proyecto> getProyecto();
    
    public void saveProyecto (Proyecto pro);
    
    public void deleteProyecto (Proyecto pro);
    
    public void deleteProyecto (Long id);
    
    public Proyecto findProyecto (Long id);
}
