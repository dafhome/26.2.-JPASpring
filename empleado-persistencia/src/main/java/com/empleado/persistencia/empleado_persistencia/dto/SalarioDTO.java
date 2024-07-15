package com.empleado.persistencia.empleado_persistencia.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalarioDTO {

    private Long idEmpleado;
    private int salario;
    
}