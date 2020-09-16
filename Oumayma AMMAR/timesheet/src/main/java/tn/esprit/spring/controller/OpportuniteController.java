package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Opportunite;
import tn.esprit.spring.services.OpportuniteService;

@RestController
public class OpportuniteController {
	
	


	@Autowired
	OpportuniteService iopportuniteService;
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/AllOpportunity")
	@ResponseBody
	public List<Opportunite> getVisiteur(Opportunite opportunite) {
		
		List<Opportunite> list = iopportuniteService.GetAllopportunity(opportunite);
		return list;
	}
}
