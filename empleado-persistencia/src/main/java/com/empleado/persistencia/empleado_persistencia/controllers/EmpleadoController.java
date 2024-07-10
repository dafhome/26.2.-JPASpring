package com.empleado.persistencia.empleado_persistencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empleado.persistencia.empleado_persistencia.entidades.Empleados;
import com.empleado.persistencia.empleado_persistencia.services.EmpleadoServicio;
import com.empleado.persistencia.empleado_persistencia.dto.*;

@RestController
@RequestMapping("/api")
public class EmpleadoController {


    @Autowired
    private EmpleadoServicio servicioEmpleado;

    @GetMapping("/listarEmpleados")
    public List<Empleados> consultarEmpleados(){
        return servicioEmpleado.consultarEmpleados();
    }


    @PostMapping("/registrarEmpleado")
    public Empleados registrarEmpleados(@RequestBody EmpleadoDTO empleadoJson){
        
        Empleados empleado = new Empleados();
        empleado.setDireccion(empleadoJson.getDireccion());
        empleado.setEdad(empleadoJson.getEdad());
        empleado.setPuesto(empleadoJson.getPuesto());

        return servicioEmpleado.registEmpleados(empleado);
        
    }
 

}
