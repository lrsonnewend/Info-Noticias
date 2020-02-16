package br.com.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.dao.UserDAO;
import br.com.model.User;

public class EngineUser {
	private final UserDAO userDao = new UserDAO();
	
	public int saveUser(User user) {
		return this.userDao.saveUser(user);
	}
	
}
