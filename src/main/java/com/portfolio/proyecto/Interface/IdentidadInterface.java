
package com.portfolio.proyecto.Interface;

import com.portfolio.proyecto.Entity.Identidad;


public interface IdentidadInterface {
    
    public Identidad getIdentidad(Long id);
    
    public void saveIdentidad (Identidad ide);
    
    public void deleteIdentidad (Long id);
    
    
}
