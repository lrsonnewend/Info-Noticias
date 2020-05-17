package infonews.dao;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.HibernateException;
import infonews.models.Noticia;


public class NoticiaDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("info_noticias");
            
    EntityManager em = emf.createEntityManager();
    
    public NoticiaDAO() {}

    public void createNews(Noticia noticia){
        try{
            
            //inicia uma transação com o banco de dados
            em.getTransaction().begin();

            //salva os dados do usuário
            em.persist(noticia);

            //finalizando a transação
            em.getTransaction().commit();
        }catch(HibernateException e){
            System.err.println("Erro ao criar usuário: "+e);
        }finally{
            em.close();
            emf.close();
        }   
    }
    
    public List<Noticia> getAllNews(){
        List<Noticia> noticias = new ArrayList<>();

        noticias =  em.createQuery("FROM " + Noticia.class.getName()).getResultList();

        em.close();
        
        emf.close();

        return noticias;
    }
}