package br.com.controller;

import org.hibernate.Session;
import br.com.connection.HibernateUtil;
import br.com.model.User;

public class Main {

	public static void main(String[] args) {
		
		EngineUser euser = new EngineUser();
		
		User user = new User();
		user.setEmailUser("email.teste@email.com");
		user.setPasswordUser("1x2x3x4");
		
		int idUser = euser.saveUser(user);
		
		System.out.println("Usuario "+idUser+" salvo!");
		
		/*Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		String sql = "select version()";
		
		String result = (String) session.createNativeQuery(sql).getSingleResult();
		
		System.out.println(result);
		
		session.getTransaction().commit();
		
		session.close();*/
		
		
	}

}
