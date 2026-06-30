package com.example.tienda_online.service;

import com.example.tienda_online.dto.ClienteRequestDTO;
import com.example.tienda_online.dto.ClienteResponseDTO;
import com.example.tienda_online.mapper.ClienteMapper;
import com.example.tienda_online.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteResponseDTO crearCliente(ClienteRequestDTO dto) {
        var cliente = ClienteMapper.toEntity(dto);
        var guardado = repository.save(cliente);
        return ClienteMapper.toResponse(guardado);
    }

    public List<ClienteResponseDTO> listarClientes() {
        return repository.findAll().stream()
                .map(ClienteMapper::toResponse)
                .collect(Collectors.toList());
    }

    public ClienteResponseDTO buscarCliente(Long id) {
        return repository.findById(id)
                .map(ClienteMapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }
}