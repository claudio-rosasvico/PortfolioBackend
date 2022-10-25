
package com.portfolio.proyecto.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Educacion {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    public Long id;
    
    @NotNull
    public String nivel;
    
    @NotNull
    public String institucion;
    
    @NotNull
    public String localidad;
    
    
    public String titulo;
    
    public String imagen;

    public Educacion() {
    }

    public Educacion(Long id, String nivel, String institucion, String localidad, String titulo) {
        this.id = id;
        this.nivel = nivel;
        this.institucion = institucion;
        this.localidad = localidad;
        this.titulo = titulo;
        this.imagen = imagen;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
}
