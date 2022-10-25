
package com.portfolio.proyecto.Repository;

import com.portfolio.proyecto.Entity.Identidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentidadRepository extends JpaRepository <Identidad, Long> {
    
}
