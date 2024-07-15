package com.empleado.persistencia.empleado_persistencia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleado.persistencia.empleado_persistencia.repositorio.SalarioRepositorio;
import com.empleado.persistencia.empleado_persistencia.entidades.Salario;

@Service
public class SalarioServicio {

    @Autowired
    private SalarioRepositorio salarioRepositorio;

    public List<Salario> consultarSalario(){
        return salarioRepositorio.findAll();
    }
    
    public Optional<Salario> verUnSalario(Long id){
        return salarioRepositorio.findById(id);
    }

    /*
     * @param empleado
     * @return el registro del empleado
     */
    @SuppressWarnings("null")
    public Salario registEmpleados(Salario salario){
        return salarioRepositorio.save(salario);
    }

    public void borrarSalario (Long id){
        salarioRepositorio.deleteById(id);
    }

}
