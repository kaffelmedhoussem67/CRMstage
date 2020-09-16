package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Societe;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.UserService;

@RestController
public class UserController {

	@Autowired
	UserService iUserService;
	
	@PostMapping("/Inscreption")
	@ResponseBody
	public User inscreption(@RequestBody User user,Societe societe) {
		iUserService.AddUser(user,societe);
		return user;}
	
	@GetMapping("/AllUsers")
	@ResponseBody
	public List<User> getVisiteur(User user) {
		List<User> list = iUserService.GetAllUser(user);
		return list;
	}
	
	
}
