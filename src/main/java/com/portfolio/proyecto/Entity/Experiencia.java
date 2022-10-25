
package com.portfolio.proyecto.Entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    
    @NotNull (message = "error en cargo")
    public String cargo;
    
    @NotNull (message = "error en institucion")
    public String institucionLaboral;
    
    @NotNull (message = "error en descripcion")
    public String descripcion;
    
    @NotNull (message = "error en fechaInicio")
    public Date fechaInicio;
    
    public Date fechaFinal;
    
    public String imagen;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getInstitucionLaboral() {
        return institucionLaboral;
    }

    public void setInstitucionLaboral(String institucionLaboral) {
        this.institucionLaboral = institucionLaboral;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    
}
