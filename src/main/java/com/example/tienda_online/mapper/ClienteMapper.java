package com.example.tienda_online.mapper;

import com.example.tienda_online.model.Cliente;
import com.example.tienda_online.dto.ClienteRequestDTO;
import com.example.tienda_online.dto.ClienteResponseDTO;

public class ClienteMapper {

    public static Cliente toEntity(ClienteRequestDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setNombre(dto.getNombre());
        cliente.setApellido(dto.getApellido());
        cliente.setCorreo(dto.getCorreo());
        cliente.setTelefono(dto.getTelefono());
        cliente.setDireccion(dto.getDireccion());
        return cliente;
    }

    public static ClienteResponseDTO toResponse(Cliente entity) {
        return new ClienteResponseDTO(
                entity.getId(),
                entity.getNombre(),
                entity.getCorreo()
        );
    }
}