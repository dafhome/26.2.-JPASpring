package com.empleado.persistencia.empleado_persistencia.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaquillaDTO {

    private String nombreTaquilla;
    private boolean ocupada;
    
}
