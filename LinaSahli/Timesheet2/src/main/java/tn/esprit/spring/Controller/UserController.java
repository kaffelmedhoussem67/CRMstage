package tn.esprit.spring.Controller;

import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.util.RoleEnum;

import org.springframework.web.bind.annotation.CrossOrigin;

import tn.esprit.spring.Service.UserService;
import tn.esprit.spring.entity.User;


@RestController

public class UserController{

	@Autowired
	UserService uss;
	
	private String login; 
	private String password; 
	private User employe;
	private Boolean loggedIn;
	private String email;
	private Boolean isActif;
	private Integer employeIdToBeUpdated;

	

	public Boolean getLoggedIn() {
		return loggedIn;
	}


	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}


	@PostMapping("/registeruser")
	@CrossOrigin(origins="http://localhost:4200")
	@ResponseBody
	public User registerUser(@RequestBody User user) throws Exception {
		String tempEmailId=user.getEmailId();
		if(tempEmailId != null && "".equals(tempEmailId)) {
			User userobj=uss.fetchUserByEmailId(tempEmailId);
			if(userobj !=null) {
				throw new Exception("user with "+tempEmailId+" is already exist");
			}
		}
		User userObj=null;
		userObj= uss.saveUser(user);
   return userObj;
	}
	/*
	public void add(@RequestBody User user) {
		Role role = roleRepository.findByName(RoleEnum.ROLE_USER.getName());
		user.setRoles(Arrays.asList(role));
		user.setEnable(true);
		super.add(user);
	}*/
	
	
	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
  @CrossOrigin(origins="http://localhost:4200")
	@ResponseBody
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId=user.getEmailId();
		String tempPass =user.getPassword();
	//	Role ro=user.getRole();
		User userObj=null;
		if(tempEmailId !=null && tempPass !=null) {	
			userObj=uss.fetchUserByEmailIdAndPassword(tempEmailId,tempPass);
	}
		if(userObj ==null) {
			throw new Exception("Bad credentialssssss");
		}
		return userObj;
		
	}


	
	
}