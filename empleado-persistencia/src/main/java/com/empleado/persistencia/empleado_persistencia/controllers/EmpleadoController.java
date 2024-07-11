package com.empleado.persistencia.empleado_persistencia.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empleado.persistencia.empleado_persistencia.entidades.Empleados;
import com.empleado.persistencia.empleado_persistencia.services.EmpleadoServicio;
import com.empleado.persistencia.empleado_persistencia.dto.*;
import org.springframework.web.bind.annotation.RequestParam;


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

        empleado.setNombreEmpleado(empleadoJson.getNombreEmpleado());
        empleado.setDireccion(empleadoJson.getDireccion());
        empleado.setEdad(empleadoJson.getEdad());
        empleado.setPuesto(empleadoJson.getPuesto());

        return servicioEmpleado.registEmpleados(empleado);
        
    }

    @GetMapping("/listarId/{id}")
    public Empleados listarId(@PathVariable Long id){
        return servicioEmpleado.verUnEmpleado(id);
    }

    @DeleteMapping("/borrarId/{id}")
    public void borrarId(@PathVariable Long id){
        servicioEmpleado.borrarEmpleado(id);
    }

    @PutMapping("/actualizarEmpleado/{id}")
    public Empleados modificarEmpleado(@RequestBody EmpleadoDTO empleadoJson, @PathVariable Long id) {
        Empleados empleado = new Empleados ();
        empleado.setIdEmpleado(id);
        empleado.setNombreEmpleado (empleadoJson.getNombreEmpleado()) ;
        empleado.setDireccion (empleadoJson.getDireccion());
        empleado.setEdad (empleadoJson.getEdad());
        empleado.setPuesto (empleadoJson.getPuesto());
        return servicioEmpleado.registEmpleados (empleado);
    }

    @PatchMapping("/actualizarNombreEmpleado/{id}")
    public Empleados modificarUnEmpleado(@RequestBody EmpleadoDTO empleadoJson, @PathVariable Long id) {
        Empleados empleado = new Empleados ();
        empleado.setIdEmpleado(id);
        empleado.setNombreEmpleado (empleadoJson.getNombreEmpleado()) ;
        empleado.setDireccion (empleadoJson.getDireccion());
        empleado.setEdad (empleadoJson.getEdad());
        empleado.setPuesto (empleadoJson.getPuesto());
        return servicioEmpleado.registEmpleados (empleado);
    }

}
