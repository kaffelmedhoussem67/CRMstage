package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.entity.User;


public interface UserService {

	

	public User saveUser(User user);

	public User fetchUserByEmailId(String tempEmailId);

public User fetchUserByEmailIdAndPassword(String tempEmailId, String tempPass);
public User getEmployeByEmailAndPassword(String login, String password);

}
