package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;




@Entity
public class Opportunite implements Serializable {

	
	private static final long serialVersionUID = 6191889143079517027L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String Titre;
	
	private float Montantopportunite;
	
	private Date dateidop;
	
	private Date dateclose;
	
	@ManyToOne (cascade = CascadeType.MERGE)
	private User user;
	
	@ManyToOne (cascade = CascadeType.MERGE)
	private Societe societe;
	
	@ManyToOne (cascade = CascadeType.MERGE)
	private SecteurActivite secteurativite;
	
	
	@ManyToOne (cascade = CascadeType.MERGE)
	private Businessline Busunessline;
	
	
	@ManyToOne (cascade = CascadeType.MERGE)
	private EtapeDeVente etapedevente;
	
   
	@ManyToOne (cascade = CascadeType.MERGE)
	private Devises devises;
	
	
	
	

	public Opportunite() {
		super();
	}

	public Devises getDevises() {
		return devises;
	}

	public void setDevises(Devises devises) {
		this.devises = devises;
	}

	public Businessline getBusunessline() {
		return Busunessline;
	}

	public void setBusunessline(Businessline busunessline) {
		Busunessline = busunessline;
	}

	public EtapeDeVente getEtapedevente() {
		return etapedevente;
	}

	public void setEtapedevente(EtapeDeVente etapedevente) {
		this.etapedevente = etapedevente;
	}

	public float getMontantopportunite() {
		return Montantopportunite;
	}

	public void setMontantopportunite(float montantopportunite) {
		Montantopportunite = montantopportunite;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	public SecteurActivite getSecteurativite() {
		return secteurativite;
	}

	public void setSecteurativite(SecteurActivite secteurativite) {
		this.secteurativite = secteurativite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}


	public Date getDateidop() {
		return dateidop;
	}

	public void setDateidop(Date dateidop) {
		this.dateidop = dateidop;
	}

	public Date getDateclose() {
		return dateclose;
	}

	public void setDateclose(Date dateclose) {
		this.dateclose = dateclose;
	}
	
	

}
