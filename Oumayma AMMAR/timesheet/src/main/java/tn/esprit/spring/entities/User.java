package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User implements Serializable{
	private static final long serialVersionUID = 6191889143079517027L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String Nom;
	
	private String Prenom;
	
	private String Email;
	
	private String password; 
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}



	private int telephone;
	
	@ManyToOne (cascade = CascadeType.MERGE)
	Societe societe;
	
	@ManyToOne (cascade = CascadeType.MERGE)
	private Role role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}



	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	

}
