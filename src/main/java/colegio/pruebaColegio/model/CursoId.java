/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.pruebaColegio.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ricar
 */
public class CursoId implements Serializable {
        private int grado;
        private String salon;

        
         @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.grado);
        hash = 59 * hash + Objects.hashCode(this.salon);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CursoId other = (CursoId) obj;
        if (!Objects.equals(this.grado, other.grado)) {
            return false;
        }
        if (!Objects.equals(this.salon, other.salon)) {
            return false;
        }
        return true;
    }
    
    public CursoId() {
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
