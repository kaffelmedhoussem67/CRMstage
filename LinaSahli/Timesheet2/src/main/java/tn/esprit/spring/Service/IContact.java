package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.entity.Contact;

public interface IContact {
	public void ajouterContact(Contact contact);
	public void deleteCon(long id);
	public List<Contact> getAllCon();
	public Contact update(Contact contact);
}
