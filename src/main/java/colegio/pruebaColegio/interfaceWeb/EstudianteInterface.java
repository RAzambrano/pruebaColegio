/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.pruebaColegio.interfaceWeb;

import colegio.pruebaColegio.model.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricar
 */
public class EstudianteInterface {
    private String nombre;

    public EstudianteInterface() {
    }

    public EstudianteInterface(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static ArrayList<EstudianteInterface> getEstudiante(List<Estudiante> estudiante){
        ArrayList<EstudianteInterface> arrrayEstu = new ArrayList<EstudianteInterface>();
         for(int i=0; i<estudiante.size(); i++){
         EstudianteInterface auxEstu = new EstudianteInterface();
         auxEstu.setNombre(estudiante.get(i).getNombre());
         arrrayEstu.add(auxEstu);
        }
        return arrrayEstu;
    }
}
