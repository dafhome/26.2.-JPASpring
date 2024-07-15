package com.empleado.persistencia.empleado_persistencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empleado.persistencia.empleado_persistencia.entidades.Taquillas;

public interface TaquillaRepositorio extends JpaRepository<Taquillas, Long>{
    
}
