package infonews.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "noticias")
public class Noticia {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "corpo", nullable = false)
    private String corpo;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "data_criacao", nullable = false)
    private String dataCriacao;

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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }


    /**
     * @return the dataCriacao
     */
    public String getDataCriacao() {
        return dataCriacao;
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
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    /**
     * @param dataCriacao the dataCriacao to set
     */
    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }



    




}