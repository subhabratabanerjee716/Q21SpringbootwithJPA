package ineuron.assessment.Q21.question21.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ineuron.assessment.Q21.question21.Entity.Contact;
import ineuron.assessment.Q21.question21.dao.ContactRepository;

@Component
public class ContactService {
	
	@Autowired
	ContactRepository contactRepository ;
	
	public List<Contact> getAll(){
		
	List<Contact> contacts=	contactRepository.findAll();
	
	return contacts;
		
	}
	
	public Contact post(Contact c){
		
		Contact savedContact=contactRepository.save(c);
		
		return savedContact;
		
	}

}
