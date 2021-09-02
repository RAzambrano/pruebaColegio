/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.pruebaColegio.service;

import colegio.pruebaColegio.ServiceInterfaz.AignaturaServiceInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ricar
 */
@Service
public class AsignaturaService {
    
    @Autowired
    private AignaturaServiceInterface repository;
    
    public List findByProfesor(String profesor){
           return this.repository.finByProfesor(profesor);
    }
    
}
