package infonews.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.HibernateException;
import infonews.models.Usuario;

public class UsuarioDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("info_noticias");

    EntityManager em = emf.createEntityManager();

    public UsuarioDAO() {
    }

    public void createUser(Usuario user) {
        try {

            // inicia uma transação com o banco de dados
            em.getTransaction().begin();

            // salva os dados do usuário
            em.persist(user);

            // finalizando a transação
            em.getTransaction().commit();
        } catch (HibernateException e) {
            System.err.println("Erro ao criar usuário: " + e);
        } finally {
            em.close();
            emf.close();
        }
    }

    public List<Usuario> userExists(String email, String pass) {
        boolean state = false;
        List<Usuario> usuarios = getAllUsers();
        List<Usuario> usuarioFind = new ArrayList<>();

        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().toLowerCase().equals(email.toLowerCase()) && usuario.getSenha().equals(pass)) {
                state = true;
                usuarioFind.add(usuario);
            }

            else {
                state = false;
            }
        }
        return usuarioFind;
    }

    public List<Usuario> findById(int id) {
        List<Usuario> usuarioList = new ArrayList<>();
        Usuario usuario= em.find(Usuario.class, id);
        usuarioList.add(usuario);

        return usuarioList;
    }

    public Usuario findByEmail(final String email) {
        Usuario usuario = null;
        
        Query query = em.createQuery("FROM " + Usuario.class.getName()+ " U WHERE U.email = :email").setParameter("email", email);
        
        usuario = (Usuario) query.getResultList().get(0);
        
        return usuario;
    }

    public List<Usuario> getAllUsers() {
        List<Usuario> usuarios = new ArrayList<>();

        usuarios = em.createQuery("FROM " + Usuario.class.getName()).getResultList();

        em.close();

        emf.close();

        return usuarios;
    }

    public void remove(int idUsuario) {
        try {
            Usuario usuario = em.find(Usuario.class, idUsuario);

            em.getTransaction().begin();

            em.remove(usuario);

            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println("Erro ao deletar usuário: " + e);
        }
    }

    public void updateUsers(Usuario usuario){
        try {
            em.getTransaction().begin();
            em.merge(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println("Erro ao alterar usuário: " + e);
        }
    }
}