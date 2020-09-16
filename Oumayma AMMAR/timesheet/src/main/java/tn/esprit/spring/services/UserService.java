package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Societe;
import tn.esprit.spring.entities.User;


public interface UserService {

	public long AddUser (User user,Societe societe);
	
	public List<User> GetAllUser(User user);

}
