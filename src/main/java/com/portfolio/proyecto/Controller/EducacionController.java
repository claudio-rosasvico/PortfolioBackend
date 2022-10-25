
package com.portfolio.proyecto.Controller;

import com.portfolio.proyecto.Entity.Educacion;
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
import com.portfolio.proyecto.Interface.EducacionInterface;

@RestController
@CrossOrigin(origins = "https://portfolio-aac61.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    
    @Autowired EducacionInterface educacioninterface;
    
    @GetMapping ("educacion/traer")
    public List<Educacion> getEducacion(){
        return educacioninterface.getEducacion();
    }
    
    @GetMapping ("educacion/traer/{id}")
    public Educacion findEducacion(@PathVariable Long id){
        return educacioninterface.findEducacion(id);
    }
    
    @PostMapping ("educacion/crear")
    public String createEducacion(@RequestBody Educacion edu){
        educacioninterface.saveEducacion(edu);
        return "La formación fue creada";
    }
    
    @DeleteMapping ("educacion/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id ){
        educacioninterface.deleteEducacion(id);
        return "La formación fue eliminada";
    }
    @PutMapping ("educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id, @RequestBody Educacion edu){
        Educacion educ = educacioninterface.findEducacion(id);
        
        educ.setNivel(edu.getNivel());
        educ.setInstitucion(edu.getInstitucion());
        educ.setLocalidad(edu.getLocalidad());
        educ.setTitulo(edu.getTitulo());
        educ.setImagen(edu.getImagen());
        
        educacioninterface.saveEducacion(educ);
        return educ;
    }
}

