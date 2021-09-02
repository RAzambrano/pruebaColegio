/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.pruebaColegio.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import colegio.pruebaColegio.ServiceInterfaz.CollegioServiceInterface;

/**
 *
 * @author ricar
 */
@Service
public class CollegioService  {
    @Autowired
    private CollegioServiceInterface repository;
    
    public List getColeggio() {
        
        return repository.findAll();
    }
}
