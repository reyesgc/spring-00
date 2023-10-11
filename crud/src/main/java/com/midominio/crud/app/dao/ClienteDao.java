package com.midominio.crud.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.midominio.crud.app.entity.Cliente;

import jakarta.persistence.EntityManager;



@Repository
public class ClienteDao {
	
	@Autowired
	private EntityManager em;
	
	@Transactional(readOnly = true)
	public List<Cliente> findAll(){
		return em.createQuery("from Cliente", Cliente.class).getResultList();
	}
	
	@Transactional
	public void save(Cliente cliente) {
		em.persist(cliente);
	}
}
