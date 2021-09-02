/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.pruebaColegio.interfaceWeb;

import colegio.pruebaColegio.model.Colegio;
import java.util.ArrayList;

/**
 *
 * @author ricar
 */
public class ColegioInterface {
    
    private String nombre;

    public ColegioInterface() {
    }

    public ColegioInterface(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
  
    public static ArrayList<ColegioInterface> getColegio (ArrayList<Colegio> colegio){
        ArrayList<ColegioInterface> arrayColls = new  ArrayList<ColegioInterface>();
        for(int i = 0; i<colegio.size();i++){
            ColegioInterface colAux = new ColegioInterface();
            colAux.setNombre(colegio.get(i).getNombre());
            arrayColls.add(colAux);
        }
        return arrayColls;
    }
      
}
