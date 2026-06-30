package com.example.tienda_online.controller;

import com.example.tienda_online.dto.ProductoRequestDTO;
import com.example.tienda_online.dto.ProductoResponseDTO;
import com.example.tienda_online.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping
    public ProductoResponseDTO guardar(@RequestBody ProductoRequestDTO dto) {
        return productoService.crearProducto(dto);
    }

    @GetMapping
    public List<ProductoResponseDTO> listar() {
        return productoService.listarProductos();
    }

    @GetMapping("/{id}")
    public ProductoResponseDTO buscarPorId(@PathVariable Long id) {
        return productoService.buscarProducto(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        productoService.eliminarProducto(id);
    }
}