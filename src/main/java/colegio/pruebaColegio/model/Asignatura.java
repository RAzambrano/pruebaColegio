/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.pruebaColegio.model;


import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author ricar
 */
@Entity
@IdClass(AsignaturaId.class)
public class Asignatura implements Serializable {
    @Id
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Id
    @Column(name = "grado", nullable = false)
    private int grado;
    
    @Id
    @Column(name = "salon", nullable = false)
    private String salon;
    
    @ManyToOne
    @JoinColumns({
	@JoinColumn(name = "grado", referencedColumnName = "grado", 
				insertable=false, updatable=false),
	@JoinColumn(name = "salon", referencedColumnName = "salon",
				insertable=false, updatable=false)
                 })
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "FK_PROFESOR", nullable = false, updatable = false)
    private Profesor profesor;
    
    @JoinTable(
        name = "rel_asig_estu",
        joinColumns ={@JoinColumn(name = "nombre", nullable = false,  referencedColumnName = "nombre"),@JoinColumn(name = "grado", nullable = false, referencedColumnName = "grado"),@JoinColumn(name = "salon", nullable = false, referencedColumnName = "salon")},
        inverseJoinColumns = @JoinColumn(name="FK_ESTUDIANTE", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Estudiante> estudiantes;
     
    public Asignatura() {
    }

    public Asignatura(String nombre, int grado, String salon, Curso curso, Profesor profesor) {
        this.nombre = nombre;
        this.grado = grado;
        this.salon = salon;
        this.curso = curso;
        this.profesor = profesor;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }
    
      
    
}
