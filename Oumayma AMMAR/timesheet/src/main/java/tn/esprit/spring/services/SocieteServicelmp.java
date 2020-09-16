package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.xml.bind.v2.model.core.ID;

import tn.esprit.spring.entities.Societe;
import tn.esprit.spring.repository.SocieteRepository;

@Service
public class SocieteServicelmp implements SocieteService {

	@Autowired
	SocieteRepository societeRepository;
	
	public Societe addSociete (Societe societe){
		return societeRepository.save(societe);
        
  	}
    public List<Societe> GetAllSociete(Societe societe){
		
		return (List<Societe>) societeRepository.findAll();
		
	}

    @Override
    public void deleteSociete (Long id){
	societeRepository.deleteById(id);
      }

    public Societe updateSociete (Societe societe){
    	return societeRepository.save(societe);
     }
	
}
