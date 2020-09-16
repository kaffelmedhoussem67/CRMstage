package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.entity.Societe;

public interface ISociete {
	public void ajouterSociete(Societe societe) ;
	public void deleteSoc(long id);
	public List<Societe> getAllSoc() ;
}
