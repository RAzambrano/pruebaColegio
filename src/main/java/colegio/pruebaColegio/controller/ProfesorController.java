/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.pruebaColegio.controller;

import colegio.pruebaColegio.interfaceWeb.ProfesorInterface;
import colegio.pruebaColegio.model.Profesor;
import colegio.pruebaColegio.service.ProfesorService;
import colegio.pruebaColegio.until.Data;
import colegio.pruebaColegio.until.Estructure;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
public class ProfesorController {
    @Autowired
    private ProfesorService service;    
    
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/profesor")
    @ResponseBody
    public Estructure getProfesor() {
    
        try {
            ArrayList<ProfesorInterface> profesor =  ProfesorInterface.getProfesor((ArrayList<Profesor>) service.findall());
            ArrayList<Data> listdata  = new ArrayList<Data>();
            Data data = new Data();
            data.setRows(profesor);
            data.setTotal(profesor.size());
            listdata.add(data);
            return new Estructure(true,"Conexion con exito",HttpStatus.OK.value(),data);
        }catch (Exception ex) {
            return new Estructure(false,ex.getMessage(),HttpStatus.NOT_ACCEPTABLE.value(),new Data());
        }
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @ResponseBody
    @RequestMapping("/profesor/find")
    public Estructure getInfoProfesro(@RequestParam  String nombre) {
    
        try {
            Optional<Profesor> profesor =  service.findById(nombre);
            if(profesor != null){
                ArrayList<Profesor> profesores = new ArrayList<Profesor>();
                profesores.add(profesor.get());
                ArrayList<Data> listdata  = new ArrayList<Data>();
                Data data = new Data();
                data.setRows(profesores);
                data.setTotal(profesores.size());
                listdata.add(data);
            return new Estructure(true,"Conexion con exito",HttpStatus.OK.value(),data);
            }throw new Exception("Por favor valaidar la informacion del porfesor");

        }catch (Exception ex) {
            return new Estructure(false,ex.getMessage(),HttpStatus.NOT_ACCEPTABLE.value(),new Data());
        }
    }
}
