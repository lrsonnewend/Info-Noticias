package br.com.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name="bdnews", schema="public")
public class User {
	
	@Column
	private String email_user;
	
	@Column
	private String password_user;
	
	@Id 
	private int id_user;

	
	public String getEmail_user() {
		return email_user;
	}

	public void setEmail_user(String email_user) {
		this.email_user = email_user;
	}

	public String getPassword_user() {
		return password_user;
	}

	public void setPassword_user(String password_user) {
		this.password_user = password_user;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

}
