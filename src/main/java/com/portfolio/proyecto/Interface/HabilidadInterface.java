
package com.portfolio.proyecto.Interface;

import com.portfolio.proyecto.Entity.Habilidad;
import java.util.List;


public interface HabilidadInterface {
    
    public List<Habilidad> getHabilidad();
    
    public void saveHabilidad (Habilidad hab);
    
    public void deleteHabilidad (Habilidad hab);
    
    public void deleteHabilidad (Long id);
    
    public Habilidad findHabilidad (Long id);
}
