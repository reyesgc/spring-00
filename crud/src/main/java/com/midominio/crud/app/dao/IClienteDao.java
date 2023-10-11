package com.midominio.crud.app.dao;

import java.util.List;

import com.midominio.crud.app.entity.Cliente;

public interface IClienteDao {
	List<Cliente> findAll();
	void save(Cliente cliente);
	
}
