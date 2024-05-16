package com.ucentral.bancodao.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "USUARIOS_REL") // Cambio de nombre de tabla
@ToString
public class Usuario implements Serializable {
    @Id

    @SequenceGenerator(name="SEQ_USU_REL",sequenceName = "SEQ_USU_REL",allocationSize = 1)
    @Column(name = "cedula", nullable = false)
    private int cedula;

    @Column(name = "USU_NOMBRE", nullable = false)
    private String nombreUsuario;

    @Column(name = "USU_CORREO", nullable = false)
    private String correoUsuario;

    @Column(name = "USU_TELEFONO", nullable = false)
    private String telefonoUsuario;


    }

