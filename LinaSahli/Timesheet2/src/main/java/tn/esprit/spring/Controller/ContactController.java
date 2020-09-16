package tn.esprit.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Contact;

import tn.esprit.spring.Service.ContactService;


@RestController
public class ContactController  {
@Autowired 
private ContactService conse;

@PostMapping("/addContact")
@ResponseBody
@CrossOrigin(origins="http://localhost:4200")
public void ajouterContact(@RequestBody Contact contact)
{
	conse.ajouterContact(contact);
	
}  

//http://localhost:8081/SpringMVC/servlet/delete-user/{trip-id}
@DeleteMapping("/Cancel/{id}")
@ResponseBody
@CrossOrigin(origins="http://localhost:4200")
public void deleteCon(@PathVariable("id") long id) {
conse.deleteCon(id);
}
@GetMapping("/showall")
@ResponseBody
@CrossOrigin(origins="http://localhost:4200")

public List<Contact> getCon() {
	List<Contact> list = conse.getAllCon();
	return list;
}
@PutMapping("/modify")
@ResponseBody 
@CrossOrigin(origins="http://localhost:4200", allowedHeaders = "*")
public Contact update(@RequestBody Contact contact) 
{ 
	return conse.update(contact);
	
	}

}


