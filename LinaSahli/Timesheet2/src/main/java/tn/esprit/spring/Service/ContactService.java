package tn.esprit.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Contact;
import tn.esprit.spring.Repository.ContactRepository;

@Service
public class ContactService implements IContact {
	@Autowired 
	private ContactRepository conrep;
	
	

	public void ajouterContact(Contact contact) {
		 conrep.save(contact);
	
	}



	@Override
	public List<Contact> getAllCon() {
		return (List<Contact>)conrep.findAll();
	}


	@Override
	public void deleteCon(long id) {
	conrep.deleteById(id);
		
	}
	
	
	public Contact update(Contact contact) {
		Contact cont =conrep.getConById(contact.getId());
		cont.setId(contact.getId());
		cont.setNom(contact.getNom());
		cont.setPrenom(contact.getPrenom());
		cont.setEmail(contact.getEmail());
		cont.setMobile(contact.getMobile());
		cont.setFix(contact.getFix());
		cont.setPays(contact.getPays());
		cont.setDate(contact.getDate());
	//	trip1.setEmployeIdToBeUpdated(trip.getId());
		//trip1.setBusCode(trip.getBusCode());
		
		
		return conrep.save(cont);
}
}