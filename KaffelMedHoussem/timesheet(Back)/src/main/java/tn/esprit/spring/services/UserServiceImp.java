package tn.esprit.spring.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Societe;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.SocieteRepository;
import tn.esprit.spring.repository.UserRepository;



@Service
public class UserServiceImp implements UserService {

	@Autowired
	SocieteRepository societeRepository;
	
	@Autowired
	UserRepository userRepisotory;
	
	public long AddUser(User user,Societe societe) {
		userRepisotory.save(user);
		return user.getId();
	}

	public List<User> GetAllUser(User user){
		
		return (List<User>) userRepisotory.findAll();
		
	} 
}
