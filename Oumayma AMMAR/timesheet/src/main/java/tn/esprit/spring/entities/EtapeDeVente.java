package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EtapeDeVente implements Serializable {
	private static final long serialVersionUID = 6191889143079517027L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String Etapedevente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEtapedevente() {
		return Etapedevente;
	}

	public void setEtapedevente(String etapedevente) {
		Etapedevente = etapedevente;
	}



}
