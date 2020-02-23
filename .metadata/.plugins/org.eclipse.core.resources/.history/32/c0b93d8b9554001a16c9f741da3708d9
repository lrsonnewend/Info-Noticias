package br.com.controller;

import org.hibernate.Session;
import br.com.connection.HibernateUtil;
import br.com.model.News;
import br.com.model.User;

public class Main {

	public static void main(String[] args) {
		
		EngineNews eNews = new EngineNews();
		
		News news = new News();
		news.setTitleNews("titulo teste");
		news.setBodyNews("corpo teste da noticia!");
		news.setDataNews("18/02/2020");
		
		int idNews = eNews.saveNews(news);
		
		System.out.println("Noticia "+idNews+" salva!");
		
		/*Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		String sql = "select version()";
		
		String result = (String) session.createNativeQuery(sql).getSingleResult();
		
		System.out.println(result);
		
		session.getTransaction().commit();
		
		session.close();*/
		
		
	}

}
