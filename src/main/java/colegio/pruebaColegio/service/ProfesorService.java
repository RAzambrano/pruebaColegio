/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.pruebaColegio.service;

import colegio.pruebaColegio.ServiceInterfaz.ProfesorServiceInterface;
import colegio.pruebaColegio.model.Profesor;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ricar
 */
@Service
public class ProfesorService {
    @Autowired
    private ProfesorServiceInterface repository;
    
    public List findall() {
        
        return repository.findAll();
    }
    
    public Optional<Profesor> findById (String nombre){
       return repository.findById(nombre);
    }
}
