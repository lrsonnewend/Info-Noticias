package infonews.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.HibernateException;
import infonews.factory.Connection;
import infonews.models.Usuario;

public class UsuarioDAO{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("info_noticias");
            
    EntityManager em = emf.createEntityManager();
    
    public UsuarioDAO() {}

    public void createUser(Usuario user){
        try{
            
            //inicia uma transação com o banco de dados
            em.getTransaction().begin();

            //salva os dados do usuário
            em.persist(user);

            //finalizando a transação
            em.getTransaction().commit();
        }catch(HibernateException e){
            System.err.println("Erro ao criar usuário: "+e);
        }finally{
            em.close();
            emf.close();
        }   
    }
    
    public List<Usuario> getAllUsers(){
        List<Usuario> usuarios = new ArrayList<>();

        usuarios =  em.createQuery("FROM " + Usuario.class.getName()).getResultList();

        em.close();
        
        emf.close();

        return usuarios;
    }
}