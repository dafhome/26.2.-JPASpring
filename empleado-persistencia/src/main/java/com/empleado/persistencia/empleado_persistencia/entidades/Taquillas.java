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
@Table(name = "taquilla")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Taquillas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_taquilla")
    private Long idTaquilla; 
    
    @Column(name = "nombre_taquilla")
    private String nombreTaquilla;
    
    private boolean ocupada;

}
