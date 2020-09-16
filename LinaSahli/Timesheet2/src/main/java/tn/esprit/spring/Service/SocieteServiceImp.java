package tn.esprit.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Contact;
import tn.esprit.spring.entity.Societe;

import tn.esprit.spring.Repository.SocieteRepository;


@Service
public class SocieteServiceImp implements ISociete{
	
	
	@Autowired 
	private SocieteRepository socrep;
	
	public void ajouterSociete(Societe societe) {
		 socrep.save(societe);
	
	}

	
	public void deleteSoc(long id) {
		
		socrep.deleteById(id);
		
	}
	

	public List<Societe> getAllSoc() {
		return (List<Societe>)socrep.findAll();
	}

	
	
}
