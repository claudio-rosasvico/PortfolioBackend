
package com.portfolio.proyecto.Repository;

import com.portfolio.proyecto.Entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadRepository extends JpaRepository <Habilidad, Long>  {
    
}
