
package com.portfolio.proyecto.Controller;

import com.portfolio.proyecto.Entity.Experiencia;
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
import com.portfolio.proyecto.Interface.ExperienciaInterface;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "https://portfolio-aac61.web.app")
public class ExperienciaController {
    
    @Autowired ExperienciaInterface experienciainterface;
    
    @GetMapping ("experiencia/traer")
    public List<Experiencia> getExperiencia(){
        return experienciainterface.getExperiencia();
    }
    
    @GetMapping ("experiencia/traer/{id}")
    public Experiencia findExperiencia(@PathVariable Long id){
        return experienciainterface.findExperiencia(id);
    }
    
    @PostMapping ("experiencia/crear")
    public String createExperiencia(@RequestBody Experiencia exp){
        experienciainterface.saveExperiencia(exp);
        return "La experiencia fue creada";
    }
    
    @DeleteMapping ("experiencia/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id ){
        experienciainterface.deleteExperiencia(id);
        return "La experiencia fue eliminada";
    }
    @PutMapping ("experiencia/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id, @RequestBody Experiencia expe){
        Experiencia exp = experienciainterface.findExperiencia(id);
        
        exp.setCargo(expe.getCargo());
        exp.setDescripcion(expe.getDescripcion());
        exp.setFechaInicio(expe.getFechaInicio());
        exp.setFechaFinal(expe.getFechaFinal());
        exp.setImagen(expe.getImagen());
        exp.setInstitucionLaboral(expe.getInstitucionLaboral());
        
        experienciainterface.saveExperiencia(exp);
        return exp;
    }
}
