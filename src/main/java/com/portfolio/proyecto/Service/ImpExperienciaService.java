
package com.portfolio.proyecto.Service;

import com.portfolio.proyecto.Entity.Experiencia;
import com.portfolio.proyecto.Repository.IExperienciaRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.proyecto.Interface.ExperienciaInterface;

@Service
@Transactional
public class ImpExperienciaService implements ExperienciaInterface {

    @Autowired IExperienciaRepository iexperienciarepository;
    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencias = iexperienciarepository.findAll();
        return experiencias;
    }

    @Override
    public void saveExperiencia(Experiencia exp) {
        iexperienciarepository.save(exp);
    }

    @Override
    public void deleteExperiencia(Experiencia exp) {
        iexperienciarepository.delete(exp);
    }

    @Override
    public void deleteExperiencia(Long id) {
        iexperienciarepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia exp = iexperienciarepository.findById(id).orElse(null);
        return exp;
    }


}
