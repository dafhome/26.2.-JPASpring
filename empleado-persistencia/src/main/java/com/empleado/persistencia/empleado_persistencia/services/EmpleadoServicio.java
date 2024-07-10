package com.empleado.persistencia.empleado_persistencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleado.persistencia.empleado_persistencia.repositorio.EmpleadoRepositorio;
import com.empleado.persistencia.empleado_persistencia.entidades.Empleados;

@Service
public class EmpleadoServicio {

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    public List<Empleados> consultarEmpleados(){
        return (List<Empleados>) empleadoRepositorio.findAll();
    }


    /*
     * @param empleado
     * @return el registro del empleado
     */

    @SuppressWarnings("null")
    public Empleados registEmpleados(Empleados empleado){
        return empleadoRepositorio.save(empleado);
    }


}
