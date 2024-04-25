package com.ucentral.bancodao.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USUARIOS") // Cambio de nombre de tabla
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USUARIO")
    @SequenceGenerator(name = "SEQ_USUARIO", sequenceName = "SEQ_USUARIO", allocationSize = 1)
    @Column(name = "ID_USUARIO") // Cambio de nombre de columna y eliminación de nullable
    private long idUsuario;

    @Column(name = "NOMBRE_USUARIO", nullable = false) // Cambio de nombre de columna y eliminación de nullable
    private String nombreUsuario;

    @Column(name = "CONTRASENA", nullable = false) // Cambio de nombre de columna y eliminación de nullable
    private String contrasena;
}
