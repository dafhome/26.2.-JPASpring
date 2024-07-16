package com.empleado.persistencia.empleado_persistencia.entidades;

import java.time.LocalDateTime;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "empleado")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleados {

    @Id
    @Column(name = "id_Empleado")
    /*
     * GenerationType.AUTO detecta y utiliza la estrategia en base a mi bd. con auto
     * genera tabla index
     */
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmpleado;

    @Column(name = "nombre_empleado")
    private String nombreEmpleado;

    private String direccion;
    private int edad;
    private String puesto;
    
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

    @OneToOne(mappedBy = "empleadomap", cascade = CascadeType.ALL, orphanRemoval = true)
    private Taquillas taquilla;
}
