/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.pruebaColegio.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 *
 * @author ricar
 */
@Entity 
@Table(name = "CURSO")
@IdClass(CursoId.class)
public class Curso implements Serializable {
    @Id
    @Column(name = "grado", nullable = false)
    private int grado;
    @Id
    @Column(name = "salon", nullable = false)
    private String salon;
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "curso")
    //private List<Asignatura> asignaturas;
    @ManyToOne
    @JoinColumn(name = "FK_COLEGIO", nullable = false, updatable = false)
    private Colegio colegio;

    public Curso() {
    }

    public Curso(int grado, String salon, List<Asignatura> asignaturas) {
        this.grado = grado;
        this.salon = salon;
      //  this.asignaturas = asignaturas;
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
/*
    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
*/
    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }
    
   
    
}

