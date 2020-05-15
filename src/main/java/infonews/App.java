/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package infonews;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import infonews.dao.Entity;
import infonews.models.*;


/* import infonews.connection.HibernateUtil;
import org.hibernate.Session; */

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("info_noticias");
        EntityManager em = emf.createEntityManager();

        Usuario user = new Usuario();
        user.setEmail("email@teste.com");
        user.setSenha("1234");
        user.setIsAdmin(true);
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        //fechando conexões
        em.close();
        emf.close();  
    }
}