package com.example.tienda_online.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClienteResponseDTO {
    private Long id;
    private String nombre;
    private String correo;
}