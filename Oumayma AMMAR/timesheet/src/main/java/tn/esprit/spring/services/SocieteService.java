package tn.esprit.spring.services;

import java.util.List;



import tn.esprit.spring.entities.Societe;

public interface SocieteService {
	public Societe addSociete (Societe societe); 
	public Societe updateSociete (Societe societe); 
	public List<Societe> GetAllSociete(Societe societe);
	public void deleteSociete (Long id);
}
