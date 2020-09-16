package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Devises;
import tn.esprit.spring.repository.DevicesRepostirory;

@Service
public class DevicesServiceImp implements DevicesService {

	@Autowired
	DevicesRepostirory devicesRepository;
	
	public List<Devises> GetAlldevices(Devises devises){
		
		return (List<Devises>) devicesRepository.findAll();
		
	} 	
}
