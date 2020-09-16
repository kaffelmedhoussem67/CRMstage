package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.entities.Societe;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.UserService;

@Controller
public class IControllerUser {

	@Autowired
	UserService iUserService;
	
	public long AddUser (User user,Societe societe){
		
		return iUserService.AddUser(user,societe);
	}
	
	public List<User> GetAllUser(User user){
		return iUserService.GetAllUser(user);
	}

}
