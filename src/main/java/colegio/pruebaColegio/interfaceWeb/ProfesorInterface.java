/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.pruebaColegio.interfaceWeb;

import colegio.pruebaColegio.model.Profesor;
import java.util.ArrayList;

/**
 *
 * @author ricar
 */
public class ProfesorInterface {
    private String nombre ;

    public ProfesorInterface() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public static ArrayList<ProfesorInterface> getProfesor(ArrayList<Profesor> profesor){
        ArrayList<ProfesorInterface> arrayCurso= new  ArrayList<ProfesorInterface>();
        for(int i = 0; i<profesor.size();i++){
            ProfesorInterface proAux = new ProfesorInterface();
            proAux.setNombre(profesor.get(i).getNombre());
            arrayCurso.add(proAux);
        }
        return arrayCurso;
    }
}
