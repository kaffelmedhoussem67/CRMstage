package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Opportunite;
import tn.esprit.spring.repository.OpportuniteRepository;


@Service
public class OpportuniteServiceImp implements OpportuniteService{

	@Autowired
	OpportuniteRepository opportuniteRepository;
	
	public List<Opportunite> GetAllopportunity(Opportunite opportunite){
		
		return (List<Opportunite>) opportuniteRepository.findAll();
		
	} 
}
