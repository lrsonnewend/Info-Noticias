package br.com.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "Users") //declarando entidade do bd
@Table(name="Users")
public class User {

	@Id  //informando chave primaria
	@GeneratedValue //declarando como auto incremento no bd
	@Column(name = "id_user") //renomeando coluna para o bd
	private int idUser;
	
	@Column(name = "email_user")
	private String emailUser;
	
	@Column(name = "password_user")
	private String passwordUser;
	
	
	public User() {}
	

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getPasswordUser() {
		return passwordUser;
	}

	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}	
	
}
