package infonews.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "noticias")
public class Noticia {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "corpo", nullable = false)
    private String corpo;

    @Column(name = "cabecalho", nullable = false)
    private String cabecalho;

    public Noticia() {

    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the corpo
     */
    public String getCorpo() {
        return corpo;
    }

    /**
     * @return the cabecalho
     */
    public String getCabecalho() {
        return cabecalho;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param corpo the corpo to set
     */
    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    /**
     * @param cabecalho the cabecalho to set
     */
    public void setCabecalho(String cabecalho) {
        this.cabecalho = cabecalho;
    }



}