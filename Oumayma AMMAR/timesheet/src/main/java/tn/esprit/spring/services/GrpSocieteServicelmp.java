package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.GroupeSociete;
import tn.esprit.spring.repository.GroupeSocieteRepository;


@Service
public class GrpSocieteServicelmp implements GrpSocieteService {
	@Autowired
	GroupeSocieteRepository grpsocieterepository;
	
	 public List<GroupeSociete> getAllGrp(GroupeSociete groupesociete){
			
			return (List<GroupeSociete>) grpsocieterepository.findAll();
			
		}
	 public GroupeSociete addGrpSociete (GroupeSociete groupesociete){
		 return grpsocieterepository.save(groupesociete);
	 }

}
