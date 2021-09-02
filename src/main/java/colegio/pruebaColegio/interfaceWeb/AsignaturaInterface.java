/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.pruebaColegio.interfaceWeb;

import colegio.pruebaColegio.model.Asignatura;
import colegio.pruebaColegio.model.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author ricar
 */
public class AsignaturaInterface {
    private String nombre;
    private String curso;
    private ArrayList<EstudianteInterface> estudiante;

    public AsignaturaInterface() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     

    public ArrayList<EstudianteInterface> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(ArrayList<EstudianteInterface> estudiante) {
        this.estudiante = estudiante;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    public static ArrayList<AsignaturaInterface> getAsignatura(ArrayList<Asignatura> asignaturas){
         ArrayList<AsignaturaInterface> arrayAsig = new ArrayList<AsignaturaInterface> ();
         for(int i=0; i<asignaturas.size(); i++){
         AsignaturaInterface auxAsig = new AsignaturaInterface();
         auxAsig.setNombre(asignaturas.get(i).getNombre());
         auxAsig.setCurso(asignaturas.get(i).getGrado()+asignaturas.get(i).getSalon());
         auxAsig.setEstudiante(EstudianteInterface.getEstudiante(asignaturas.get(i).getEstudiantes()));
         arrayAsig.add(auxAsig);
        }
         
         return arrayAsig;
    }
    
}
