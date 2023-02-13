package com.elkin.pruebaTecnica.persistence.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente extends Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String clienteId;
    private String contrasenia;
    private Boolean estado;
}
