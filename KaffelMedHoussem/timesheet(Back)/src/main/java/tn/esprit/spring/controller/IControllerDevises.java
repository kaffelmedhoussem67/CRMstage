package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.entities.Devises;
import tn.esprit.spring.services.DevicesService;

@Controller
public class IControllerDevises {
	
	@Autowired
	DevicesService idevicesService;
	
	public List<Devises> GetAllDevises(Devises devises){
		return idevicesService.GetAlldevices(devises);
	}

}
