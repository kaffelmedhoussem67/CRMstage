package tn.esprit.spring.controller;

import java.security.Principal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import tn.esprit.spring.entities.Devises;
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
	
	@CrossOrigin("http://localhost:4200")
	@PostMapping("/Addopportunite")
	@ResponseBody
	public Opportunite saveVisiteur(@RequestBody Opportunite opportunite,Map<String, Object> mapper) {
		ObjectMapper objectMapper = new ObjectMapper();
		Devises devises = objectMapper.convertValue(mapper.get("devises"), Devises.class);
		System.out.println("shippingAddress" + devises.getId());
		iopportuniteService.Addopportunite(devises);
		return opportunite;
}
	
	@CrossOrigin("http://localhost:4200")
    @DeleteMapping("/deleteOpportunitebyid/{id}") 
			@ResponseBody 
			public void deleteOpportuniteById(@PathVariable("id")Integer id) {
		    iopportuniteService.Deleteopportunite(id);
	  
	  }
	/*@CrossOrigin("http://localhost:4200")
	@PostMapping("/Addopportunity")
	@ResponseBody
	public Opportunite saveopportunity(@RequestBody Map<String, Object> mapper,
            Principal principal) {
		iopportuniteService.Addopportunite(opportunite);
		return opportunite;
}*/
}
