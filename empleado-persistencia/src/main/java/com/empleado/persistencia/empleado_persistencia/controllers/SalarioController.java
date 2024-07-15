package com.empleado.persistencia.empleado_persistencia.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empleado.persistencia.empleado_persistencia.entidades.Salario;
import com.empleado.persistencia.empleado_persistencia.services.SalarioServicio;
import com.empleado.persistencia.empleado_persistencia.dto.*;


@RestController
@RequestMapping("/api")
public class SalarioController {


    @Autowired
    private SalarioServicio servicioSalario;

    @GetMapping("/listarSalarios")
    public List<Salario> consultarSalario(){
        return servicioSalario.consultarSalario();
    }


    @PostMapping("/registrarSalario")
    public Salario registrarSalario(@RequestBody SalarioDTO empleadoJson){
        
        Salario salario = new Salario();

        salario.setIdEmpleado(empleadoJson.getIdEmpleado());
        salario.setSalario(empleadoJson.getSalario());


        return servicioSalario.registEmpleados(salario);
        
    }

    @GetMapping("/listarSalarioId/{id}")
    public Optional<Salario> listarId(@PathVariable Long id){
        return servicioSalario.verUnSalario(id);
    }

    @DeleteMapping("/borrarSalarioId/{id}")
    public void borrarId(@PathVariable Long id){
        servicioSalario.borrarSalario(id);
    }

    @PutMapping("/actualizarSalario/{id}")
    public Salario modificarEmpleado(@RequestBody SalarioDTO empleadoJson, @PathVariable Long id) {
        Salario salario = new Salario();
        salario.setIdSalario(id);
        salario.setIdEmpleado(empleadoJson.getIdEmpleado());
        salario.setSalario(empleadoJson.getSalario());
        return servicioSalario.registEmpleados (salario);
    }


}
