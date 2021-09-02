/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.pruebaColegio.ServiceInterfaz;

import colegio.pruebaColegio.model.Asignatura;
import colegio.pruebaColegio.model.AsignaturaId;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author ricar
 */
public interface AignaturaServiceInterface extends JpaRepository<Asignatura, AsignaturaId>{
        @Query(value="select * from asignatura where asignatura.FK_PROFESOR  = :nombre ", nativeQuery = true)
        public List<Asignatura> finByProfesor (@Param("nombre")String name);
}
