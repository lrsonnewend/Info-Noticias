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
        
        /* NoticiaDAO dao = new NoticiaDAO();
        
        Noticia news2 = new Noticia();

        news2.setTitulo("ITA desenvolve equipamento para detectar coronavírus no ar");
        news2.setCorpo("A intenção dos idealizadores é que, por meio deste aparelho, seja"+
        "possível monitorar as áreas com grande circulação de pessoas e, consequentemente,"+
        "indicar possíveis riscos de contaminação do vírus nestes espaços.");
        news2.setDataCriacao("25/05/2020");
        news2.setLinkImg("https://lh3.googleusercontent.com/proxy/IG3vDD2mjPK7j_fuOywg6Vc-PBV5XujGxCnsEG2kNz9HhPt3DbT4IXIfsc7yYKso5Eyxwy6ObxuSJwTG6y_P0NXLBNpEn5gqQM0PPHvq8Cxd10UA0jpNV_QOglqQAd7CsObW0SqHVqCxCNfGngkcj4RpQPfHfXzyIG9-GXLnefZtKD05pkV5uAI");
        
        dao.createNews(news2); */

        /* Usuario user = new Usuario();

        user.setEmail("testando@email.com");
        user.setSenha("testando4321");
        user.setIsAdmin(false);

        dao.createUser(user); */

        /* Noticia news = new Noticia();
        news.setTitulo("Governo libera auxílio emergencial de R$600,00");
        news.setCorpo("O governo liberou a verba para auxílio de pessoas desempregadas para"+
        "poderem ter uma renda extra para as coisas básicas: alimentos e pagar contas.");
        news.setDataCriacao("07/04/2020");

        dao.createNews(news); */
        

        
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