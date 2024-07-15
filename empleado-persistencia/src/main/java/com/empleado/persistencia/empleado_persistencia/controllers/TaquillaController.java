package com.empleado.persistencia.empleado_persistencia.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empleado.persistencia.empleado_persistencia.dto.TaquillaDTO;
import com.empleado.persistencia.empleado_persistencia.entidades.Taquillas;
import com.empleado.persistencia.empleado_persistencia.services.TaquillaServicio;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api")
public class TaquillaController {
    

    @Autowired
    private TaquillaServicio servicioTaquilla;

    @GetMapping("/listarTaquillas")
    public List<Taquillas> consultarTaquillas() {
        return servicioTaquilla.consultarTaquillas();
    }
    @GetMapping("/listarTaquillaId/{id}")
    public Optional<Taquillas> listarTaquillaId(@PathVariable Long id) {
        return servicioTaquilla.verUnaTaquilla(id);
    }
    @DeleteMapping("/borrarId/{id}")
    public void borrarIdTaquilla(@PathVariable Long id){
        servicioTaquilla.borrarTaquilla(id);
    }

    @PostMapping("/registrarTaquilla")
    public Taquillas registTaquilla(@RequestBody TaquillaDTO taquillaJson) {

        Taquillas taquilla = new Taquillas();

        taquilla.setNombreTaquilla (taquillaJson.getNombreTaquilla()) ;
        taquilla.setOcupada(taquillaJson.isOcupada());

        return servicioTaquilla.registTaquillas(taquilla);
    
    }

    @PutMapping("/actualizarTaquilla/{id}")
    public Taquillas modificarTaquillas(@PathVariable Long id, @RequestBody TaquillaDTO taquillaJson) {

        Taquillas taquilla = new Taquillas();
        taquilla.setIdTaquilla(id);
        taquilla.setNombreTaquilla(taquillaJson.getNombreTaquilla());
        taquilla.setOcupada(taquillaJson.isOcupada());
        
        return servicioTaquilla.registTaquillas(taquilla);
    }
    

}
