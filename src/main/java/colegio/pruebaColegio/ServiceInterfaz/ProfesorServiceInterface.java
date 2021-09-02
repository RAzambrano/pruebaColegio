/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.pruebaColegio.ServiceInterfaz;

import colegio.pruebaColegio.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ricar
 */
public interface ProfesorServiceInterface extends JpaRepository<Profesor, String>  {
    
}
