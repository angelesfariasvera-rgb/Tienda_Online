package com.example.tienda_online.controller;

import com.example.tienda_online.dto.ClienteRequestDTO;
import com.example.tienda_online.dto.ClienteResponseDTO;
import com.example.tienda_online.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ClienteResponseDTO guardar(@RequestBody ClienteRequestDTO dto) {
        return clienteService.crearCliente(dto);
    }

    @GetMapping
    public List<ClienteResponseDTO> listar() {
        return clienteService.listarClientes();
    }

    @GetMapping("/{id}")
    public ClienteResponseDTO buscarPorId(@PathVariable Long id) {
        return clienteService.buscarCliente(id);
    }
}