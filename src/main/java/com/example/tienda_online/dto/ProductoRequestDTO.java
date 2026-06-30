package com.example.tienda_online.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class ProductoRequestDTO {
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private Integer stock;
    private String categoria;
}