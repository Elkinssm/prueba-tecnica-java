package com.elkin.pruebaTecnica.service;

import com.elkin.pruebaTecnica.persistence.entity.Cliente;
import com.elkin.pruebaTecnica.persistence.repository.ClienteRepository;
import com.elkin.pruebaTecnica.service.dto.UsuarioInDTO;
import org.springframework.stereotype.Service;

//Logica de negocio
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente crearCliente(UsuarioInDTO usuarioInDTO) {
        this.clienteRepository.save()

    }
}
