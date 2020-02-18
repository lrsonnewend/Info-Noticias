package br.com.dao;

import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import br.com.connection.HibernateUtil;
import br.com.model.User;

public class UserDAO {
	
	public int saveUser(User user) {
		
		Session session = null;
		
		Integer insertUser = 0;
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); 
		
		try {
			session = sessionFactory.openSession();
			
			Transaction transaction = session.beginTransaction();
			
			insertUser = (Integer) session.save(user);
			
			transaction.commit();
		}catch(HibernateException e) {
			System.err.println("erro ao inserir usuario: "+e);
		}finally{
			if(session != null)
				session.close();
		}		
		return insertUser;
	}
}