
package com.portfolio.proyecto.Service;

import com.portfolio.proyecto.Entity.Habilidad;
import com.portfolio.proyecto.Repository.IHabilidadRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.proyecto.Interface.HabilidadInterface;

@Service
@Transactional
public class ImpHabilidadService implements HabilidadInterface {

    @Autowired IHabilidadRepository ihabilidadrepository;
    @Override
    public List<Habilidad> getHabilidad() {
        List<Habilidad> habilidad = ihabilidadrepository.findAll();
        return habilidad;
    }

    @Override
    public void saveHabilidad(Habilidad hab) {
        ihabilidadrepository.save(hab);
    }

    @Override
    public void deleteHabilidad(Habilidad hab) {
        ihabilidadrepository.delete(hab);
    }

    @Override
    public void deleteHabilidad(Long id) {
        ihabilidadrepository.deleteById(id);
    }

    @Override
    public Habilidad findHabilidad(Long id) {
        Habilidad hab = ihabilidadrepository.findById(id).orElse(null);
        return hab;
    }
    
}
