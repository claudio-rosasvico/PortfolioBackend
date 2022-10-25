
package com.portfolio.proyecto.Controller;

import com.portfolio.proyecto.Entity.Identidad;
import com.portfolio.proyecto.Interface.IdentidadInterface;
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
@CrossOrigin(origins = "https://portfolio-aac61.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class IdentidadController {
    
    @Autowired IdentidadInterface identidadinterface;
    
    @GetMapping ("identidad/traer/{id}")
    public Identidad findIdentidad (@PathVariable Long id){
        return identidadinterface.getIdentidad(id);
    }
    
    @PostMapping ("identidad/crear")
    public String createIdentidad (@RequestBody Identidad ide){
        identidadinterface.saveIdentidad(ide);
        return "Identidad creada";
    }
    
    @DeleteMapping ("identidad/borrar/{id}")
    public String deleteIdentidad (@PathVariable Long id){
        identidadinterface.deleteIdentidad(id);
        return "Identidad borrada";
    }
    
    @PutMapping("identidad/editar/{id}")
    public Identidad editIdentidad (@PathVariable Long id, @RequestBody Identidad ide){
        Identidad iden = identidadinterface.getIdentidad(id);
        
        iden.setNombre(ide.getNombre());
        iden.setApellido(ide.getApellido());
        iden.setAcercaDe(ide.getAcercaDe());
        iden.setProfesion(ide.getProfesion());
        iden.setImgPerfil(ide.getImgPerfil());
        iden.setImgPortada(ide.getImgPortada());
        iden.setMail(ide.getMail());
        iden.setTelefono(ide.getTelefono());
        
        identidadinterface.saveIdentidad(iden);
        return iden;
    }
}
