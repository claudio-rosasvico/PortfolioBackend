
package com.portfolio.proyecto.Service;

import com.portfolio.proyecto.Entity.Identidad;
import com.portfolio.proyecto.Interface.IdentidadInterface;
import com.portfolio.proyecto.Repository.IdentidadRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpIdentidadService implements IdentidadInterface {

    @Autowired IdentidadRepository identidadrepository;
    @Override
    public Identidad getIdentidad(Long id) {
        Identidad identidad = identidadrepository.findById(id).orElse(null);
        return identidad;
    }

    @Override
    public void saveIdentidad(Identidad ide) {
        identidadrepository.save(ide);
    }

    @Override
    public void deleteIdentidad(Long id) {
        identidadrepository.deleteById(id);
    }

    
}
