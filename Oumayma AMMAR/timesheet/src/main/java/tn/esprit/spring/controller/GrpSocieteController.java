package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.GroupeSociete;
import tn.esprit.spring.entities.Societe;
import tn.esprit.spring.services.GrpSocieteService;

@RestController
@CrossOrigin("http://localhost:4200")
public class GrpSocieteController {

	@Autowired
	GrpSocieteService grpsocieteservice;
	
	@GetMapping("/AllgrpSociete")
	@ResponseBody
	public List<GroupeSociete> getAllGroupe(GroupeSociete groupesociete) {
		
		List<GroupeSociete> list = grpsocieteservice.getAllGrp(groupesociete);
		return list;
	}
	@PostMapping("/addgrpsociete")
    void SaveGrpSociete(@RequestBody GroupeSociete groupesociete) {
		grpsocieteservice.addGrpSociete(groupesociete);
        
     }
}
