package com.empleado.persistencia.empleado_persistencia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table (name = "empleado")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleados {

    @Id
    @Column(name = "id_Empleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;

    @Column(name = "nombre_empleado")
    private String nombreEmpleado;

    private String direccion;
    private int edad;
    private String puesto;
    
}
