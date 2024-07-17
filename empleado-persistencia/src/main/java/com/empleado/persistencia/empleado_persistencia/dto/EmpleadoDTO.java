package com.empleado.persistencia.empleado_persistencia.dto;

import com.empleado.persistencia.empleado_persistencia.entidades.Taquillas;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmpleadoDTO {
    
    private String nombreEmpleado;
    private String direccion;
    private int edad;
    private String puesto;
    private Long idTaquilla;
}