package com.example.tienda_online.service;

import com.example.tienda_online.dto.ProductoRequestDTO;
import com.example.tienda_online.dto.ProductoResponseDTO;
import com.example.tienda_online.mapper.ProductoMapper;
import com.example.tienda_online.repository.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductoService {

    private final ProductoRepository repository;

    public ProductoResponseDTO crearProducto(ProductoRequestDTO dto) {
        var producto = ProductoMapper.toEntity(dto);
        var guardado = repository.save(producto);
        return ProductoMapper.toResponse(guardado);
    }

    public List<ProductoResponseDTO> listarProductos() {
        return repository.findAll().stream()
                .map(ProductoMapper::toResponse)
                .collect(Collectors.toList());
    }

    public ProductoResponseDTO buscarProducto(Long id) {
        return repository.findById(id)
                .map(ProductoMapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    public void eliminarProducto(Long id) {
        repository.deleteById(id);
    }
}