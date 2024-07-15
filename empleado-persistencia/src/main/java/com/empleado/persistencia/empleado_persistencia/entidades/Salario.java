package com.empleado.persistencia.empleado_persistencia.entidades;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "salario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSalario;

    @Column(name = "id_Empleado")
    private Long idEmpleado;

    private int salario;

    @JsonProperty(access = Access.READ_ONLY)
    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;


    @PrePersist
    protected void onCreate() {
        fechaActualizacion = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        fechaActualizacion = LocalDateTime.now();
    }
}
