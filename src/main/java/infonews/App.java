/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package infonews;

import java.util.ArrayList;
import java.util.List;

import infonews.dao.NoticiaDAO;
import infonews.dao.UsuarioDAO;
import infonews.models.*;


public class App{
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        NoticiaDAO dao = new NoticiaDAO();

        /* Usuario user = new Usuario();

        user.setEmail("testando@email.com");
        user.setSenha("testando4321");
        user.setIsAdmin(false);

        dao.createUser(user); */

        Noticia news = new Noticia();
        news.setTitulo("Governo libera auxílio emergencial de R$600,00");
        news.setCorpo("O governo liberou a verba para auxílio de pessoas desempregadas para"+
        "poderem ter uma renda extra para as coisas básicas: alimentos e pagar contas.");
        news.setDataCriacao("07/04/2020");

        dao.createNews(news);
        

        
        /* EntityManagerFactory emf = Persistence.createEntityManagerFactory("info_noticias");
        EntityManager em = emf.createEntityManager();

        Usuario user = new Usuario();
        user.setEmail("lucas@email.com");
        user.setSenha("4321");
        user.setIsAdmin(false);
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        //fechando conexões
        em.close();
        emf.close();  */ 
    }
}