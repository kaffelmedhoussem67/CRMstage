package tn.esprit.spring.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.Repository.UserRepository;



@Service
public class UserServiceImp implements UserService {

	
	@Autowired
	private UserRepository repo;

@Autowired
UserRepository employeRepository;


public User getEmployeByEmailAndPassword(String login, String password) {

return employeRepository.findByEmailIdAndPassword(login, password);
}

	
	
	public User saveUser(User user) {
		return repo.save(user);
	}
	
	public User fetchUserByEmailId(String email)
	{
		return repo.findEmailById(email);
	}
	
	public User fetchUserByEmailIdAndPassword(String email, String password)
	{
		return repo.findByEmailIdAndPassword(email, password);
		
	}
	
}
