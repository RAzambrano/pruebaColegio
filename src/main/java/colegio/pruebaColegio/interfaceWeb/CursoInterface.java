/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.pruebaColegio.interfaceWeb;

import colegio.pruebaColegio.model.Curso;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ricar
 */
public class CursoInterface implements  Serializable{
    private int grado;
    private String salon;

    public CursoInterface() {
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
    
     public static ArrayList<CursoInterface> getCurso (ArrayList<Curso> curso){
        ArrayList<CursoInterface> arrayCurso= new  ArrayList<CursoInterface>();
        for(int i = 0; i<curso.size();i++){
            CursoInterface curAux = new CursoInterface();
            curAux.setSalon(curso.get(i).getSalon());
            curAux.setGrado(curso.get(i).getGrado());
            arrayCurso.add(curAux);
        }
        return arrayCurso;
    }
}
