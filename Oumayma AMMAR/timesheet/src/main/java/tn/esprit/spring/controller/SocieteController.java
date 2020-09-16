package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Societe;
import tn.esprit.spring.repository.SocieteRepository;
import tn.esprit.spring.services.SocieteService;

@RestController
@CrossOrigin("http://localhost:4200")
public class SocieteController {
	@Autowired
	  SocieteService societeservice;
	@Autowired
	SocieteRepository societeRepository;

	    @PostMapping("/addsociete")
	    public void SaveSociete(@RequestBody Societe societe) {
	        societeservice.addSociete(societe);
	        
	     }
	    
	    @GetMapping("/AllSociete")
		@ResponseBody
		public List<Societe> getSociete(Societe societe) {
			
			List<Societe> list = societeservice.GetAllSociete(societe);
			return list;
		}
	    
	    @DeleteMapping("/deleteSociete/{id}")
	    public void delete(@PathVariable (value = "id") Long id) {
	    	
	    	societeservice.deleteSociete(id);
	        
	    }
	    
	    @PutMapping("/updateSociete/{id}")
	    public void UpdateSoc (@RequestBody Societe societe, @PathVariable (value = "id") Long id){
	    	Societe soc= societeRepository.findById(id)
	    }
	    
	   
	    
}
