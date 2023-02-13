package com.elkin.pruebaTecnica.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioInDTO {
    private String nombre;
    private String direccion;
    private Integer telefono;
    private String contrasenia;
    private Boolean estado;
}
