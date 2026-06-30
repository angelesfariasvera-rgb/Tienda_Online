package com.example.tienda_online.mapper;

import com.example.tienda_online.model.Producto;
import com.example.tienda_online.dto.ProductoRequestDTO;
import com.example.tienda_online.dto.ProductoResponseDTO;

public class ProductoMapper {

    public static Producto toEntity(ProductoRequestDTO dto) {
        Producto producto = new Producto();
        producto.setNombre(dto.getNombre());
        producto.setDescripcion(dto.getDescripcion());
        producto.setPrecio(dto.getPrecio());
        producto.setStock(dto.getStock());
        producto.setCategoria(dto.getCategoria());
        return producto;
    }

    public static ProductoResponseDTO toResponse(Producto entity) {
        return new ProductoResponseDTO(
                entity.getId(),
                entity.getNombre(),
                entity.getStock()
        );
    }
}