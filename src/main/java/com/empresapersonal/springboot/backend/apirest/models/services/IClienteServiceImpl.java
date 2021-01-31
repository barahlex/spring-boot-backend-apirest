package com.empresapersonal.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.empresapersonal.springboot.backend.apirest.models.dao.IClienteDao;
import com.empresapersonal.springboot.backend.apirest.models.entity.Cliente;

public class IClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}

}
