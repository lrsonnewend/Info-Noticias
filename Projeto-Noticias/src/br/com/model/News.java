package br.com.model;

public class News {

	private int id_news;

	private String title_news, body_news, data_news;

	
	public int getId_news() {
		return id_news;
	}

	public void setId_news(int id_news) {
		this.id_news = id_news;
	}

	public String getTitle_news() {
		return title_news;
	}

	public void setTitle_news(String title_news) {
		this.title_news = title_news;
	}

	public String getBody_news() {
		return body_news;
	}

	public void setBody_news(String body_news) {
		this.body_news = body_news;
	}

	public String getData_news() {
		return data_news;
	}

	public void setData_news(String data_news) {
		this.data_news = data_news;
	}
}