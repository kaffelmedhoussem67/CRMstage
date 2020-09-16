package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.entities.Devises;
import tn.esprit.spring.entities.Opportunite;
import tn.esprit.spring.services.OpportuniteService;

@Controller
public class IControllerOpportunite {

	@Autowired
	OpportuniteService iopportuniteService;
	
	public List<Opportunite> GetAllopportunity(Opportunite opportunite){
		return iopportuniteService.GetAllopportunity(opportunite);
	}
	
	public long Addopportunite(Devises devises){
		return iopportuniteService.Addopportunite(devises);
	}

	public void Deleteopportunite (Integer id){
		 iopportuniteService.Deleteopportunite(id);
	} 
}
