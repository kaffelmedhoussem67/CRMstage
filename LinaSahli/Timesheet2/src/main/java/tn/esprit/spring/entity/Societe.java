package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import tn.esprit.spring.entity.Contact;


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
	
	private String raisonsocial;
	
	public String getRaisonsocial() {
		return raisonsocial;
	}

	public void setRaisonsocial(String raisonsocial) {
		this.raisonsocial = raisonsocial;
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
	@OneToMany(mappedBy="societeco")
	@LazyCollection(LazyCollectionOption.FALSE)
	@JsonManagedReference
	 @JsonBackReference
		private List<Contact> cont = new ArrayList<>();
	public List<Contact> getCont() {
		return cont;
	}
	public void setCont(List<Contact> cont) {
		this.cont = cont;
	}
	
	public Societe() {
		super();
	}

	public Societe(String adresse, String emailSociete, int telephone, int fax, String raisonsocial) {
		super();
		this.adresse = adresse;
		this.emailSociete = emailSociete;
		this.telephone = telephone;
		this.fax = fax;
		this.raisonsocial = raisonsocial;
	}
	
	@Override
	public String toString() {
		return "Societe [adresse=" + adresse + ", emailSociete=" + emailSociete + ", telephone=" + telephone + ", fax="
				+ fax + ", raisonsocial=" + raisonsocial + "]";
	}

	public Societe(String adresse, String emailSociete, int telephone, int fax, String raisonsocial,
			List<Contact> cont) {
		super();
		this.adresse = adresse;
		this.emailSociete = emailSociete;
		this.telephone = telephone;
		this.fax = fax;
		this.raisonsocial = raisonsocial;
		this.cont = cont;
	}
	
	
}
