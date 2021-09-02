/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.pruebaColegio.model;


import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 *
 * @author ricar
 */
@Entity 
public class Colegio implements Serializable {
    @Id
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "colegio")
    private List<Curso> curso;

    public Colegio() {
    }

    public Colegio(String nombre, List<Curso> curso) {
        this.nombre = nombre;
        this.curso = curso;
    }

    
    public Colegio(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Curso> getCurso() {
        return curso;
    }

    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }

 
    
    
    
}
