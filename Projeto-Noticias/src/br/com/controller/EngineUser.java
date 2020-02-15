package br.com.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.model.User;

public class EngineUser {
	EntityManagerFactory emf;
	EntityManager em;
	
	public EngineUser() {
		emf = Persistence.createEntityManagerFactory("Users");
		em = emf.createEntityManager();
	}
	
	public void CreateUser(User user) {
		em.getTransaction().begin();
		em.merge(user);
		em.getTransaction().commit();
		emf.close();		
	}
}
