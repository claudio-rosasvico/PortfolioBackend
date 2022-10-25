
package com.portfolio.proyecto.Controller;

import com.portfolio.proyecto.Entity.Habilidad;
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
import com.portfolio.proyecto.Interface.HabilidadInterface;

@RestController
@CrossOrigin(origins = "https://portfolio-aac61.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class HabilidadController {
    
    @Autowired HabilidadInterface habilidadinterface;
    
    @GetMapping ("habilidad/traer")
    public List<Habilidad> getHabilidad(){
        return habilidadinterface.getHabilidad();
    }
    
    @GetMapping ("habilidad/traer/{id}")
    public Habilidad findHabilidad(@PathVariable Long id){
        return habilidadinterface.findHabilidad(id);
    }
    
    @PostMapping ("habilidad/crear")
    public String createHabilidad(@RequestBody Habilidad hab){
        habilidadinterface.saveHabilidad(hab);
        return "La Habilidad fue creada";
    }
    
    @DeleteMapping ("habilidad/borrar/{id}")
    public String deleteHabilidad(@PathVariable Long id ){
        habilidadinterface.deleteHabilidad(id);
        return "La Habilidad fue eliminada";
    }
    @PutMapping ("habilidad/editar/{id}")
    public Habilidad editHabilidad(@PathVariable Long id, @RequestBody Habilidad habi){
        Habilidad hab = habilidadinterface.findHabilidad(id);
        
        hab.setNombre(habi.getNombre());
        hab.setPorcentaje(habi.getPorcentaje());
        hab.setImagen(habi.getImagen());
        
        
        habilidadinterface.saveHabilidad(hab);
        return hab;
    }
}
