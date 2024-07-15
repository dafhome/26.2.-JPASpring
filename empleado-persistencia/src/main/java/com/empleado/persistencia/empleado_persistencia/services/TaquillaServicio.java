package com.empleado.persistencia.empleado_persistencia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleado.persistencia.empleado_persistencia.entidades.Taquillas;
import com.empleado.persistencia.empleado_persistencia.repositorio.TaquillaRepositorio;

@Service
public class TaquillaServicio {
    

    @Autowired
    private TaquillaRepositorio taquillaRepositorio;

    public List<Taquillas> consultarTaquillas(){
        return taquillaRepositorio.findAll();
    }
    public Optional<Taquillas> verUnaTaquilla(Long id){
        return taquillaRepositorio.findById(id);
    }


    public Taquillas registTaquillas (Taquillas taquilla){
        return taquillaRepositorio.save(taquilla);
    }

    public void borrarTaquilla (Long id){
        taquillaRepositorio.deleteById(id);
        System.out.println("Taquilla Borrada Correctamente");
    }
}
