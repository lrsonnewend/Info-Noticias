package br.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="News")
@Table(name="News")
public class News {
	
	@Id
	@GeneratedValue
	@Column(name="id_news")
	private int idNews;

	@Column(name="title_news")
	private String titleNews;
	
	@Column(name="body_news")
	private String bodyNews;
	
	@Column(name="data_news")
	private String dataNews;

	
	public News() {}
	
	public int getIdNews() {
		return idNews;
	}

	public void setIdNews(int idNews) {
		this.idNews = idNews;
	}

	public String getTitleNews() {
		return titleNews;
	}

	public void setTitleNews(String titleNews) {
		this.titleNews = titleNews;
	}

	public String getBodyNews() {
		return bodyNews;
	}

	public void setBodyNews(String bodyNews) {
		this.bodyNews = bodyNews;
	}

	public String getDataNews() {
		return dataNews;
	}

	public void setDataNews(String dataNews) {
		this.dataNews = dataNews;
	}

	

}
