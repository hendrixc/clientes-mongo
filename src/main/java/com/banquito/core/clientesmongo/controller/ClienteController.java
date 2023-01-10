package com.banquito.core.clientesmongo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banquito.core.clientesmongo.controller.dto.ClienteRS;
import com.banquito.core.clientesmongo.model.Cliente;
import com.banquito.core.clientesmongo.service.ClienteService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ClienteRS>> obtenerClientes() {
        List<Cliente> clientes = this.service.obtenerPorApellidos("a");
        List<ClienteRS> clientesRS = new ArrayList<>();
        for (Cliente cliente : clientes) {
            clientesRS.add(this.toClienteRS(cliente));
        }
    }

    public ResponseEntity<ClienteRS> obtenerCliente(String id) {
        Cliente cliente = this.service.findById(id);
        ClienteRS rs = this.toClienteRS(cliente);
    }

    ClienteRS toClienteRS(Cliente cliente) {
        return ClienteRS.builder()
        .estado(cliente.getEstado())
        .fechaCreacion(cliente.getFechaCreacion())
        .id(cliente.getId())
        .identificacion(cliente.getIdentificacion())
        .tipoIdentificacion(cliente.getTipoIdentificacion())
        .nombreCompleto(cliente.getNombreCompleto()).build();
    }

}
