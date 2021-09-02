/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.pruebaColegio.ServiceInterfaz;

import colegio.pruebaColegio.model.Curso;
import colegio.pruebaColegio.model.CursoId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ricar
 */
public interface CursoServiceInterface  extends JpaRepository<Curso, CursoId> {
    
}
