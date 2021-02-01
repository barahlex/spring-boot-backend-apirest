package com.empresapersonal.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresapersonal.springboot.backend.apirest.models.entity.Cliente;
import com.empresapersonal.springboot.backend.apirest.models.services.IClienteService;

@RestController
@RequestMapping
public class ClienteRestcontroller {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> index(){
		return clienteService.findAll();
	}
}
