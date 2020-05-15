package infonews.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "senha", nullable = false)
    private String senha;


    @Column(name = "isAdmin", nullable = false)
    private Boolean isAdmin;

    public Usuario() {
    
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }


    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }


    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }


    /**
     * @return the isAdmin
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }


    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }


    /**
     * @param isAdmin the isAdmin to set
     */
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}