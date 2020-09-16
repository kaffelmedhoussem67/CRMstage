package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class GroupeSociete implements Serializable {

	
	private static final long serialVersionUID = 6191889143079517027L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String grpsociete;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGrpsociete() {
		return grpsociete;
	}

	public void setGrpsociete(String grpsociete) {
		this.grpsociete = grpsociete;
	}
	
	
}
