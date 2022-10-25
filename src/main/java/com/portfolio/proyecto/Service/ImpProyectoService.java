
package com.portfolio.proyecto.Service;

import com.portfolio.proyecto.Entity.Proyecto;
import com.portfolio.proyecto.Interface.ProyectoInterface;
import com.portfolio.proyecto.Repository.IProyectoRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpProyectoService implements ProyectoInterface {

    @Autowired IProyectoRepository iproyectorepository;
    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> proyectos = iproyectorepository.findAll();
        return proyectos;
    }

    @Override
    public void saveProyecto(Proyecto pro) {
        iproyectorepository.save(pro);
    }

    @Override
    public void deleteProyecto(Proyecto pro) {
        iproyectorepository.delete(pro);
    }

    @Override
    public void deleteProyecto(Long id) {
        iproyectorepository.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto pro = iproyectorepository.findById(id).orElse(null);
        return pro;
    }
    
}
