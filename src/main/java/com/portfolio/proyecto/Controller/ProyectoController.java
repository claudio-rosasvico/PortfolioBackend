
package com.portfolio.proyecto.Controller;

import com.portfolio.proyecto.Entity.Proyecto;
import com.portfolio.proyecto.Interface.ProyectoInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "https://portfolio-aac61.web.app")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
    
    @Autowired ProyectoInterface proyectointerface;
    
    @GetMapping ("proyecto/traer")
    public List<Proyecto> getProyecto(){
        return proyectointerface.getProyecto();
    }
    
    @GetMapping ("proyecto/traer/{id}")
    public Proyecto findProyecto(@PathVariable Long id){
        return proyectointerface.findProyecto(id);
    }
    
    @PostMapping ("proyecto/crear")
    public String createProyecto(@RequestBody Proyecto pro){
        proyectointerface.saveProyecto(pro);
        return "El proyecto fue creado";
    }
    
    @DeleteMapping ("proyecto/borrar/{id}")
    public String deleteProyecto(@PathVariable Long id ){
        proyectointerface.deleteProyecto(id);
        return "El proyecto fue eliminado";
    }
    @PutMapping ("proyecto/editar/{id}")
    public Proyecto editProyecto(@PathVariable Long id, @RequestBody Proyecto proy){
        Proyecto pro = proyectointerface.findProyecto(id);
        
        pro.setNombre(proy.getNombre());
        pro.setDescripcion(proy.getDescripcion());
        pro.setImagen(proy.getImagen());
        pro.setUrl(proy.getUrl());
        
        proyectointerface.saveProyecto(pro);
        return pro;
    }
}
