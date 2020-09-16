package tn.esprit.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Contact;
import tn.esprit.spring.entity.Societe;
import tn.esprit.spring.Service.ISociete;
import tn.esprit.spring.Service.SocieteServiceImp;


@RestController
public class SocieteController implements ISociete {
	@Autowired 
	private SocieteServiceImp sose;
	
	@PostMapping("/addSociete")
	@ResponseBody
	@CrossOrigin(origins="http://localhost:4200")
	public void ajouterSociete(@RequestBody Societe societe)
	{
		sose.ajouterSociete(societe);
		
	}  


	//http://localhost:8082/SpringMVC/servlet/show-all-trips
	@GetMapping("/show-socall")
	@ResponseBody
	@CrossOrigin(origins="http://localhost:4200")
	public List<Societe> getAllSoc() {
		List<Societe> list = sose.getAllSoc();
		return list;
	}
	

	
  //http://localhost:8081/SpringMVC/servlet/delete-user/{trip-id}
	@DeleteMapping("/deleteSoc/{Socid}")
	@ResponseBody
	@CrossOrigin(origins="http://localhost:4200")
	public void deleteSoc(@PathVariable("Socid") long id) {
	sose.deleteSoc(id);
	}
}
