
package com.portfolio.proyecto.Service;

import com.portfolio.proyecto.Entity.Persona;
import com.portfolio.proyecto.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.proyecto.Interface.PersonaInterface;
import javax.transaction.Transactional;

@Service
@Transactional
public class ImpPersonaService implements PersonaInterface {

    @Autowired IPersonaRepository ipersonarepository; 
    @Override
    public List<Persona> getPersona() {
        List<Persona> personas = ipersonarepository.findAll();
        return personas;
    }

    @Override
    public void savePersona(Persona pers) {
        ipersonarepository.save(pers);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonarepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona pers = ipersonarepository.findById(id).orElse(null);
        return pers;
    }
    
}
