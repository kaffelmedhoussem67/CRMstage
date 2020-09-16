package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Societe implements Serializable{
	private static final long serialVersionUID = 6191889143079517027L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String adresse;
	
	private String emailSociete;
	
	private int telephone;
	
	private int fax;
	
	@OneToOne
	private Statut statut;
	
	@ManyToOne 
	private GroupeSociete grpsociete;
	
	private String raisonsocial;
	
	
	
	public GroupeSociete getGrpsociete() {
		return grpsociete;
	}

	public void setGrpsociete(GroupeSociete grpsociete) {
		this.grpsociete = grpsociete;
	}

	public String getRaisonsocial() {
		return raisonsocial;
	}

	public void setRaisonsocial(String raisonsocial) {
		this.raisonsocial = raisonsocial;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmailSociete() {
		return emailSociete;
	}

	public void setEmailSociete(String emailSociete) {
		this.emailSociete = emailSociete;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public int getFax() {
		return fax;
	}

	public void setFax(int fax) {
		this.fax = fax;
	}
	
	
}
