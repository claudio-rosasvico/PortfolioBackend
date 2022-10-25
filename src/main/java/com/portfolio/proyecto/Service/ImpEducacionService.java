
package com.portfolio.proyecto.Service;

import com.portfolio.proyecto.Entity.Educacion;
import com.portfolio.proyecto.Repository.IEducacionRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.proyecto.Interface.EducacionInterface;

@Service
@Transactional
public class ImpEducacionService implements EducacionInterface {

    @Autowired IEducacionRepository ieducacionrepository;
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educaciones = ieducacionrepository.findAll();
        return educaciones;
    }

    @Override
    public void saveEducacion(Educacion edu) {
        ieducacionrepository.save(edu);
    }

    @Override
    public void deleteEducacion(Educacion edu) {
        ieducacionrepository.delete(edu);
    }

    @Override
    public void deleteEducacion(Long id) {
        ieducacionrepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion exp = ieducacionrepository.findById(id).orElse(null);
        return exp;
    }
    
    
}
