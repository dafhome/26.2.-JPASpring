package com.empleado.persistencia.empleado_persistencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.empleado.persistencia.empleado_persistencia.entidades.Salario;

public interface SalarioRepositorio extends JpaRepository<Salario, Long>{

}
