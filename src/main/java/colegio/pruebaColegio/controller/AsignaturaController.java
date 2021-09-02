/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.pruebaColegio.controller;

import colegio.pruebaColegio.interfaceWeb.AsignaturaInterface;
import colegio.pruebaColegio.model.Asignatura;
import colegio.pruebaColegio.service.AsignaturaService;
import colegio.pruebaColegio.until.Data;
import colegio.pruebaColegio.until.Estructure;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ricar
 */
@RestController
@RequestMapping("api")
public class AsignaturaController {
    @Autowired
    private AsignaturaService service;
    
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/Asignatura")
    @ResponseBody
    public Estructure getColegio(@RequestParam  String nombre) {
    
        try {
            ArrayList<AsignaturaInterface> asignatura =  AsignaturaInterface.getAsignatura((ArrayList<Asignatura>) service.findByProfesor(nombre));
            ArrayList<Data> listdata  = new ArrayList<Data>();
            Data data = new Data();
            data.setRows(asignatura);
            data.setTotal(asignatura.size());
            listdata.add(data);
            return new Estructure(true,"Conexion con exito",HttpStatus.OK.value(),data);
        }catch (Exception ex) {
            return new Estructure(false,ex.getMessage(),HttpStatus.NOT_ACCEPTABLE.value(),new Data());
        }
    }
}
