package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import tn.esprit.spring.entity.Societe;

@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class)
public class Contact implements Serializable  {
	
	private static final long serialVersionUID = 6191889143079517027L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	private int mobile;
	
	private int fix;
	
	private String pays;
	
//	@Temporal(TemporalType.DATE)
     private String date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public int getFix() {
		return fix;
	}

	public void setFix(int fix) {
		this.fix = fix;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


	@ManyToOne
	  @JsonBackReference
	private Societe societeco;
	public Societe getSocieteco() {
		return societeco;
	}
	public void setSocieteco(Societe societeco) {
		this.societeco = societeco;
	}


	public Contact() {
		super();
	}

	public Contact(String nom, String prenom, String email, int mobile, int fix, String pays, String date) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mobile = mobile;
		this.fix = fix;
		this.pays = pays;
		this.date = date;
	}

	public Contact(String nom, String prenom, String email, int mobile, int fix, String pays, String date,
			Societe societeco) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mobile = mobile;
		this.fix = fix;
		this.pays = pays;
		this.date = date;
		this.societeco = societeco;
	}

	@Override
	public String toString() {
		return "Contact [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", mobile=" + mobile + ", fix=" + fix
				+ ", pays=" + pays + ", date=" + date + "]";
	}


	

	
	
}
