package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Devises;
import tn.esprit.spring.services.DevicesService;



@RestController
public class DevisesController {
	
	@Autowired
	DevicesService idevicesService;
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/devises")
	@ResponseBody
	public List<Devises> getVisiteur(Devises devises) {
		List<Devises> list = idevicesService.GetAlldevices(devises);
		return list;
	}

}
