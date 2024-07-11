package com.empleado.persistencia.empleado_persistencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.empleado.persistencia.empleado_persistencia.entidades.Empleados;

public interface EmpleadoRepositorio extends JpaRepository<Empleados, Long>{

}
