
package com.portfolio.proyecto.Controller;

import com.portfolio.proyecto.Entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.proyecto.Interface.PersonaInterface;

@RestController
@CrossOrigin(origins = "https://portfolio-aac61.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
    @Autowired PersonaInterface personainterface;
    
    @GetMapping ("persona/traer")
    public List<Persona> getPersona(){
        return personainterface.getPersona();
    }
    
    //@GetMapping ("persona/traer/perfil")
    //public Persona findPersona(){
    @GetMapping ("persona/traer/{id}")
    public Persona findPersona(@PathVariable Long id){
        return personainterface.findPersona(id);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("persona/crear")
    public String createPersona(@RequestBody Persona pers){
        personainterface.savePersona(pers);
        return "La persona fue creada";
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("persona/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        personainterface.deletePersona(id);
        return "La persoa fue elimiada";
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    //URL:PUERTo/persona/editar/{id}?nombre & apellido & img
    //@PutMapping ("persona/editar/{id}")
    //public Persona editPersona(@PathVariable Long id, @RequestBody Persona per) {
    @PutMapping ("persona/editar")
    public Persona editPersona( @RequestBody Persona per) {
        Persona pers = personainterface.findPersona((long)1);
        
        pers.setAcercaDe(per.getAcercaDe());
        pers.setApellido(per.getApellido());
        pers.setImg(per.getImg());
        pers.setNombre(per.getNombre());
        pers.setProfesion(per.getProfesion());
        
        
        personainterface.savePersona(pers);
        return pers;
        };
};
