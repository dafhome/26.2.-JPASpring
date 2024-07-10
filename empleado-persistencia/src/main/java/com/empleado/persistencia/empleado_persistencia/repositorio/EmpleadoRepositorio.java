package com.empleado.persistencia.empleado_persistencia.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.empleado.persistencia.empleado_persistencia.entidades.Empleados;

public interface EmpleadoRepositorio extends CrudRepository<Empleados, Long>{

}
